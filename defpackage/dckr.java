package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dckr implements ServiceConnection, dcku {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final dckp e;
    public ComponentName f;
    final /* synthetic */ dckt g;

    public dckr(dckt dcktVar, dckp dckpVar) {
        this.g = dcktVar;
        this.e = dckpVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final ConnectionResult d(String str) throws Throwable {
        dcli dcliVar;
        Context context;
        dckp dckpVar;
        String str2;
        Intent component;
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ConnectionResult connectionResult;
        try {
            context = this.g.e;
            dckpVar = this.e;
            Uri uri = dcln.a;
            str2 = dckpVar.a;
        } catch (dcli e) {
            dcliVar = e;
        }
        try {
            if (str2 == null) {
                component = new Intent().setComponent(dckpVar.c);
            } else {
                Intent intent = null;
                if (dckpVar.e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("serviceActionBundleKey", str2);
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(dcln.a);
                    } catch (RemoteException | IllegalArgumentException e2) {
                        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e2.toString()));
                        bundleCall = null;
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                    try {
                        bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        if (bundleCall != null) {
                            Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                            if (intent2 != null) {
                                intent = intent2;
                            } else {
                                PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                if (pendingIntent != null) {
                                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                    throw new dcli(new ConnectionResult(25, pendingIntent));
                                }
                            }
                        }
                        if (intent == null) {
                            Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                        }
                    } catch (Throwable th) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th;
                    }
                }
                component = intent;
                if (component == null) {
                    component = new Intent(str2).setPackage(dckpVar.b);
                }
            }
            Intent intent3 = component;
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(dcnk.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                dckt dcktVar = this.g;
                dcmt dcmtVar = dcktVar.g;
                Context context2 = dcktVar.e;
                dckp dckpVar2 = this.e;
                try {
                    boolean zD = dcmtVar.d(context2, str, intent3, this, dckpVar2.d);
                    this.c = zD;
                    if (zD) {
                        dcktVar.f.sendMessageDelayed(dcktVar.f.obtainMessage(1, dckpVar2), dcktVar.h);
                        connectionResult = ConnectionResult.a;
                    } else {
                        this.b = 2;
                        try {
                            dcmtVar.b(context2, this);
                        } catch (IllegalArgumentException unused) {
                        }
                        connectionResult = new ConnectionResult(16);
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (dcli e3) {
            dcliVar = e3;
            return dcliVar.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dckt dcktVar = this.g;
        synchronized (dcktVar.d) {
            dcktVar.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dckt dcktVar = this.g;
        synchronized (dcktVar.d) {
            dcktVar.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
