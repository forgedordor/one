package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kww implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public kww(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(kwv kwvVar) {
        if (kwvVar.b) {
            this.b.unbindService(this);
            kwvVar.b = false;
        }
        kwvVar.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.kwv r9) {
        /*
            r8 = this;
            java.lang.String r0 = "NotifManCompat"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Processing component "
            r2.<init>(r3)
            android.content.ComponentName r3 = r9.a
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.util.ArrayDeque r3 = r9.d
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " queued tasks"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L2f:
            java.util.ArrayDeque r2 = r9.d
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L39
            goto Ld6
        L39:
            boolean r3 = r9.b
            if (r3 == 0) goto L3e
            goto L72
        L3e:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r3.<init>(r4)
            android.content.ComponentName r4 = r9.a
            android.content.Intent r3 = r3.setComponent(r4)
            android.content.Context r5 = r8.b
            r6 = 33
            boolean r3 = r5.bindService(r3, r8, r6)
            r9.b = r3
            if (r3 == 0) goto L5b
            r3 = 0
            r9.e = r3
            goto L6e
        L5b:
            java.util.Objects.toString(r4)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Unable to bind to listener "
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.w(r0, r3)
            r5.unbindService(r8)
        L6e:
            boolean r3 = r9.b
            if (r3 == 0) goto Ld7
        L72:
            android.support.v4.app.INotificationSideChannel r3 = r9.c
            if (r3 == 0) goto Ld7
        L76:
            java.lang.Object r3 = r2.peek()
            kwt r3 = (defpackage.kwt) r3
            if (r3 != 0) goto L7f
            goto Lcb
        L7f:
            boolean r4 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            if (r4 == 0) goto L8e
            java.lang.String r4 = "Sending task "
            java.lang.String r4 = defpackage.a.l(r3, r4)     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            android.util.Log.d(r0, r4)     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
        L8e:
            android.support.v4.app.INotificationSideChannel r4 = r9.c     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            android.app.Notification r5 = r3.d     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            java.lang.String r6 = r3.c     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            int r7 = r3.b     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            java.lang.String r3 = r3.a     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            r4.notify(r3, r7, r6, r5)     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            r2.remove()     // Catch: android.os.RemoteException -> L9f android.os.DeadObjectException -> Lb3
            goto L76
        L9f:
            r1 = move-exception
            android.content.ComponentName r2 = r9.a
            java.util.Objects.toString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "RemoteException communicating with "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r0, r2, r1)
            goto Lcb
        Lb3:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Lcb
            android.content.ComponentName r1 = r9.a
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Remote service has died: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
        Lcb:
            java.util.ArrayDeque r0 = r9.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld6
            r8.c(r9)
        Ld6:
            return
        Ld7:
            r8.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kww.b(kwv):void");
    }

    private final void c(kwv kwvVar) {
        ComponentName componentName = kwvVar.a;
        Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = kwvVar.e;
        int i2 = i + 1;
        kwvVar.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", a.e(i3, "Scheduling retry for ", " ms"));
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = kwvVar.d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(kwvVar.e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                kwu kwuVar = (kwu) message.obj;
                ComponentName componentName = kwuVar.a;
                IBinder iBinder = kwuVar.b;
                kwv kwvVar = (kwv) this.d.get(componentName);
                if (kwvVar != null) {
                    kwvVar.c = INotificationSideChannel.Stub.asInterface(iBinder);
                    kwvVar.e = 0;
                    b(kwvVar);
                }
                return true;
            }
            if (i == 2) {
                kwv kwvVar2 = (kwv) this.d.get((ComponentName) message.obj);
                if (kwvVar2 != null) {
                    a(kwvVar2);
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            kwv kwvVar3 = (kwv) this.d.get((ComponentName) message.obj);
            if (kwvVar3 != null) {
                b(kwvVar3);
            }
            return true;
        }
        kwt kwtVar = (kwt) message.obj;
        Context context = this.b;
        Object obj = kwx.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (kwx.a) {
            if (string != null) {
                if (!string.equals(kwx.b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    kwx.c = hashSet;
                    kwx.b = string;
                }
                set = kwx.c;
            } else {
                set = kwx.c;
            }
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName2 = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.h(componentName2, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet2) {
                Map map = this.d;
                if (!map.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                        Log.d("NotifManCompat", "Adding listener record for ".concat(String.valueOf(componentName3)));
                    }
                    map.put(componentName3, new kwv(componentName3));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Object key = entry.getKey();
                        Objects.toString(key);
                        Log.d("NotifManCompat", "Removing listener record for ".concat(String.valueOf(key)));
                    }
                    a((kwv) entry.getValue());
                    it.remove();
                }
            }
        }
        for (kwv kwvVar4 : this.d.values()) {
            kwvVar4.d.add(kwtVar);
            b(kwvVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Connected to service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(1, new kwu(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Disconnected from service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
