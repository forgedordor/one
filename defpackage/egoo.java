package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egoo {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final egog e;
    public Service h;
    public int i;
    public egol j;
    private final Context k;
    private final Executor l;
    private final NotificationManager m;
    private final egoh n;
    private final Class o;
    private final Runnable p;
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final ekfe d = new ekfe();
    public final ekni f = new ekfg();
    public egon g = egon.STOPPED;

    public egoo(Context context, egog egogVar, final eosd eosdVar, NotificationManager notificationManager, egoh egohVar, Class cls) {
        this.k = context;
        this.e = egogVar;
        this.l = new eoss(eosdVar);
        this.n = egohVar;
        this.m = notificationManager;
        this.o = cls;
        this.p = new Runnable() { // from class: egoi
            @Override // java.lang.Runnable
            public final void run() {
                final egoo egooVar = this.a;
                eosdVar.execute(new Runnable() { // from class: egok
                    @Override // java.lang.Runnable
                    public final void run() {
                        egoo egooVar2 = egooVar;
                        Object obj = egooVar2.b;
                        boolean zB = egooVar2.e.b();
                        synchronized (obj) {
                            boolean z = false;
                            if (!zB) {
                                try {
                                    if (!egooVar2.c.isEmpty()) {
                                        z = true;
                                    }
                                } finally {
                                }
                            }
                            int iOrdinal = egooVar2.g.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 2 && !z) {
                                    egooVar2.d();
                                }
                            } else if (z) {
                                egooVar2.b(egooVar2.a(null).a);
                            }
                        }
                    }
                });
            }
        };
    }

    private final int g() {
        ekni ekniVar = this.f;
        if (ekniVar.isEmpty()) {
            return this.n.a();
        }
        Iterator it = ekniVar.i().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) it.next()).intValue();
        }
        return iIntValue;
    }

    public final egol a(egol egolVar) {
        IdentityHashMap identityHashMap = this.c;
        ejwl.m(!identityHashMap.isEmpty(), "Can't select a best notification if thare are none");
        egol egolVar2 = null;
        for (egol egolVar3 : identityHashMap.values()) {
            if (egolVar2 != null) {
                int i = egolVar3.b;
                int i2 = egolVar2.b;
                if (i2 < i || (egolVar == egolVar3 && i2 == egolVar.b)) {
                }
            }
            egolVar2 = egolVar3;
        }
        return egolVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.app.Notification r5) throws java.lang.Throwable {
        /*
            r4 = this;
            egon r0 = r4.g
            egon r1 = defpackage.egon.STOPPED
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.ejwl.l(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r4.k
            java.lang.Class r2 = r4.o
            r0.<init>(r1, r2)
            java.lang.String r2 = "fallback_notification"
            r0.putExtra(r2, r5)
            egon r5 = defpackage.egon.STARTING
            r4.g = r5
            long r2 = defpackage.eiid.a
            r1.getClass()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            r0 = 0
            eihr r2 = defpackage.eiid.t(r5)     // Catch: java.lang.Throwable -> L57
            android.content.ComponentName r5 = defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r1, r5)     // Catch: java.lang.Throwable -> L4c
            defpackage.fczl.a(r2, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L46
            java.lang.String r0 = r1.getPackageName()
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = defpackage.fdbq.f(r0, r5)
            if (r5 != 0) goto L45
            goto L46
        L45:
            return
        L46:
            r2.a()
            return
        L4a:
            r3 = move-exception
            goto L5a
        L4c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r3 = move-exception
            defpackage.fczl.a(r2, r5)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L53:
            r5 = move-exception
            r3 = r5
            r5 = r0
            goto L5a
        L57:
            r3 = move-exception
            r5 = r0
            r2 = r5
        L5a:
            if (r5 == 0) goto L6a
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = defpackage.fdbq.f(r1, r5)
            if (r5 != 0) goto L76
        L6a:
            if (r2 != 0) goto L72
            java.lang.String r5 = "early"
            defpackage.fdbq.c(r5)
            goto L73
        L72:
            r0 = r2
        L73:
            r0.a()
        L76:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egoo.b(android.app.Notification):void");
    }

    public final void c(Service service, Notification notification) {
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        int iG = g();
        if (iG == 0) {
            ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 371, "ForegroundServiceTracker.java")).q("starting foregroundService with type=none");
            iG = 0;
        }
        service.startForeground(174344743, notification, iG);
    }

    public final void d() {
        egon egonVar = this.g;
        ejwl.p(egonVar == egon.STARTED, "Destroyed in wrong state %s", egonVar);
        this.g = egon.STOPPED;
        this.h.stopForeground(true);
        this.j = null;
        this.h.stopSelf(this.i);
        this.h = null;
    }

    public final void e(egol egolVar) {
        Service service;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && (service = this.h) != null && service.getForegroundServiceType() != g()) {
            z = true;
        }
        egol egolVar2 = this.j;
        egol egolVarA = a(egolVar);
        this.j = egolVarA;
        if (z || egolVar2 != egolVarA) {
            c(this.h, egolVarA.a);
        }
    }

    public final void f(final ListenableFuture listenableFuture, Notification notification, final int i) {
        if (listenableFuture.isDone()) {
            return;
        }
        NotificationManager notificationManager = this.m;
        if (!notificationManager.areNotificationsEnabled()) {
            ((ekrd) ((ekrd) a.j()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 183, "ForegroundServiceTracker.java")).q("User disabled notifications for app");
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(notification.getChannelId());
        int importance = notificationChannel.getImportance();
        if (notificationChannel.getImportance() < 2) {
            ((ekrd) ((ekrd) a.j()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 191, "ForegroundServiceTracker.java")).q("User blocked notification channel");
        }
        notification.category = "service";
        notification.flags |= 256;
        notification.flags |= 34;
        egol egolVar = new egol(notification, importance, eiiy.d());
        synchronized (this.b) {
            this.f.add(Integer.valueOf(i));
            this.d.t(listenableFuture, eiik.b());
            IdentityHashMap identityHashMap = this.c;
            egol egolVar2 = (egol) identityHashMap.get(listenableFuture);
            if (egolVar2 == null) {
                listenableFuture.b(new Runnable() { // from class: egoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture listenableFuture2 = listenableFuture;
                        int i2 = i;
                        egoo egooVar = this.a;
                        synchronized (egooVar.b) {
                            IdentityHashMap identityHashMap2 = egooVar.c;
                            egol egolVar3 = (egol) identityHashMap2.remove(listenableFuture2);
                            egooVar.d.d(listenableFuture2);
                            if (egooVar.g.ordinal() == 2 && egolVar3 == egooVar.j) {
                                if (identityHashMap2.isEmpty()) {
                                    egooVar.d();
                                } else {
                                    egooVar.f.remove(Integer.valueOf(i2));
                                    egooVar.e(null);
                                }
                            }
                        }
                    }
                }, this.l);
                identityHashMap.put(listenableFuture, egolVar);
            } else if (egolVar2.b <= egolVar.b) {
                identityHashMap.put(listenableFuture, egolVar);
            }
            egog egogVar = this.e;
            Runnable runnable = this.p;
            synchronized (egogVar.a) {
                egogVar.b.add(runnable);
            }
            if (!this.e.b()) {
                int iOrdinal = this.g.ordinal();
                if (iOrdinal == 0) {
                    b(egolVar.a);
                } else if (iOrdinal == 2) {
                    e(this.j);
                }
            }
        }
    }
}
