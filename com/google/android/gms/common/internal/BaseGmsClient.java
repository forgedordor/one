package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.dcdu;
import defpackage.dchj;
import defpackage.dchk;
import defpackage.dcju;
import defpackage.dcjv;
import defpackage.dcjw;
import defpackage.dcjx;
import defpackage.dcjy;
import defpackage.dcjz;
import defpackage.dcka;
import defpackage.dckm;
import defpackage.dckn;
import defpackage.dckp;
import defpackage.dckq;
import defpackage.dckw;
import defpackage.dclh;
import defpackage.dcll;
import defpackage.dcns;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    private static final Feature[] sC = new Feature[0];
    dckw b;
    public final Context c;
    public final Looper d;
    public final Handler e;
    public IGmsServiceBroker h;
    public dcjw i;
    public final int l;
    public volatile String m;
    public volatile dcns n;
    public final dckm s;
    private final dckq sD;
    private final dcdu sE;
    public final dckn t;
    private IInterface x;
    private dcjx y;
    private final String z;
    private volatile String u = null;
    public final Object f = new Object();
    public final Object g = new Object();
    public final ArrayList j = new ArrayList();
    public int k = 1;
    public ConnectionResult o = null;
    public boolean p = false;
    public volatile ConnectionInfo q = null;
    public final AtomicInteger r = new AtomicInteger(0);

    /* compiled from: PG */
    public static final class GmsCallbacks extends IGmsCallbacks.Stub {
        private BaseGmsClient a;
        private final int b;

        public GmsCallbacks(BaseGmsClient baseGmsClient, int i) {
            this.a = baseGmsClient;
            this.b = i;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onAccountValidationComplete(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            dclh.n(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.C(i, iBinder, bundle, this.b);
            this.a = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
            BaseGmsClient baseGmsClient = this.a;
            dclh.n(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            dclh.m(connectionInfo);
            baseGmsClient.q = connectionInfo;
            if (baseGmsClient.gq()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                dcll.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            onPostInitComplete(i, iBinder, connectionInfo.a);
        }
    }

    protected BaseGmsClient(Context context, Looper looper, dckq dckqVar, dcdu dcduVar, int i, dckm dckmVar, dckn dcknVar, String str) {
        dclh.n(context, "Context must not be null");
        this.c = context;
        dclh.n(looper, "Looper must not be null");
        this.d = looper;
        dclh.n(dckqVar, "Supervisor must not be null");
        this.sD = dckqVar;
        dclh.n(dcduVar, "API availability must not be null");
        this.sE = dcduVar;
        this.e = new dcju(this, looper);
        this.l = i;
        this.s = dckmVar;
        this.t = dcknVar;
        this.z = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gp(int i, IInterface iInterface) {
        dckw dckwVar;
        dclh.a((i == 4) == (iInterface != null));
        synchronized (this.f) {
            this.k = i;
            this.x = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                dcjx dcjxVar = this.y;
                if (dcjxVar != null) {
                    dckq dckqVar = this.sD;
                    dckw dckwVar2 = this.b;
                    String str = dckwVar2.a;
                    String str2 = dckwVar2.b;
                    int i2 = dckwVar2.c;
                    x();
                    dckqVar.e(str, str2, i2, dcjxVar, this.b.d);
                    this.y = null;
                }
            } else if (i == 2 || i == 3) {
                dcjx dcjxVar2 = this.y;
                if (dcjxVar2 != null && (dckwVar = this.b) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + dckwVar.a + " on " + dckwVar.b);
                    dckq dckqVar2 = this.sD;
                    dckw dckwVar3 = this.b;
                    String str3 = dckwVar3.a;
                    String str4 = dckwVar3.b;
                    int i3 = dckwVar3.c;
                    x();
                    dckqVar2.e(str3, str4, i3, dcjxVar2, this.b.d);
                    this.r.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.r;
                dcjx dcjxVar3 = new dcjx(this, atomicInteger.get());
                this.y = dcjxVar3;
                dckw dckwVar4 = new dckw(y(), d(), dckq.a, i());
                this.b = dckwVar4;
                if (dckwVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(dckwVar4.a));
                }
                dckq dckqVar3 = this.sD;
                String str5 = dckwVar4.a;
                String str6 = dckwVar4.b;
                int i4 = dckwVar4.c;
                String strX = x();
                boolean z = this.b.d;
                L();
                ConnectionResult connectionResultD = dckqVar3.d(new dckp(str5, str6, i4, z), dcjxVar3, strX);
                if (!connectionResultD.c()) {
                    dckw dckwVar5 = this.b;
                    Log.w("GmsClient", "unable to connect to service: " + dckwVar5.a + " on " + dckwVar5.b);
                    int i5 = connectionResultD.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    PendingIntent pendingIntent = connectionResultD.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable(RcsIntents.EXTRA_PENDING_INTENT, pendingIntent);
                    }
                    D(i5, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                dclh.m(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final void A() {
        int iH = this.sE.h(this.c, a());
        if (iH == 0) {
            l(new dcjy(this));
        } else {
            gp(1, null);
            E(new dcjy(this), iH, null);
        }
    }

    protected final void B() {
        if (!p()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected void C(int i, IBinder iBinder, Bundle bundle, int i2) {
        dcjz dcjzVar = new dcjz(this, i, iBinder, bundle);
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, dcjzVar));
    }

    public final void D(int i, Bundle bundle, int i2) {
        dcka dckaVar = new dcka(this, i, bundle);
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, dckaVar));
    }

    protected final void E(dcjw dcjwVar, int i, PendingIntent pendingIntent) {
        this.i = dcjwVar;
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.r.get(), i, pendingIntent));
    }

    public final boolean F(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            if (this.k != i) {
                return false;
            }
            gp(i2, iInterface);
            return true;
        }
    }

    public final boolean G() {
        return this.q != null;
    }

    public boolean H() {
        return false;
    }

    public Feature[] I() {
        throw null;
    }

    public void K() {
        System.currentTimeMillis();
    }

    protected void L() {
        throw null;
    }

    public int a() {
        throw null;
    }

    public abstract IInterface b(IBinder iBinder);

    public abstract String c();

    protected abstract String d();

    protected Bundle g() {
        return new Bundle();
    }

    public boolean gq() {
        return false;
    }

    public Feature[] gr() {
        return sC;
    }

    public boolean h() {
        return false;
    }

    protected boolean i() {
        return a() >= 211700000;
    }

    public final String j() {
        return this.u;
    }

    public void l(dcjw dcjwVar) {
        this.i = dcjwVar;
        gp(2, null);
    }

    public void m() {
        this.r.incrementAndGet();
        ArrayList arrayList = this.j;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dcjv) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.g) {
            this.h = null;
        }
        gp(1, null);
    }

    public final void n(String str) {
        this.u = str;
        m();
    }

    public final void o(IAccountAccessor iAccountAccessor, Set set) {
        AttributionSource attributionSource;
        Bundle bundleG = g();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.n == null || (attributionSource = this.n.a) == null || attributionSource.getAttributionTag() == null) ? this.m : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.l;
        int i2 = dcdu.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.c.getPackageName();
        getServiceRequest.i = bundleG;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (h()) {
            Account accountV = v();
            if (accountV == null) {
                accountV = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = accountV;
            if (iAccountAccessor != null) {
                getServiceRequest.g = iAccountAccessor.asBinder();
            }
        } else if (H()) {
            getServiceRequest.j = v();
        }
        getServiceRequest.k = I();
        getServiceRequest.l = gr();
        if (gq()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.g) {
                IGmsServiceBroker iGmsServiceBroker = this.h;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new GmsCallbacks(this, this.r.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.r.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.r.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.r.get());
        }
    }

    public final boolean p() {
        boolean z;
        synchronized (this.f) {
            z = this.k == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.f) {
            int i = this.k;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return true;
    }

    public final Feature[] s() {
        ConnectionInfo connectionInfo = this.q;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void t(dchk dchkVar) {
        dchkVar.a.i.o.post(new dchj(dchkVar));
    }

    public final void u() {
        if (!p() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public Account v() {
        throw null;
    }

    public final IInterface w() {
        IInterface iInterface;
        synchronized (this.f) {
            if (this.k == 5) {
                throw new DeadObjectException();
            }
            B();
            iInterface = this.x;
            dclh.n(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String x() {
        String str = this.z;
        return str == null ? this.c.getClass().getName() : str;
    }

    protected String y() {
        return "com.google.android.gms";
    }

    public Set z() {
        throw null;
    }
}
