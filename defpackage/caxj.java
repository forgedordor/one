package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.EnumSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxj implements caxe {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    private final egoc c;
    private final eosc d;

    public caxj(egoc egocVar, fcsu fcsuVar, eosc eoscVar) {
        this.c = egocVar;
        this.b = fcsuVar;
        this.d = eoscVar;
    }

    @Override // defpackage.caxe
    public final void a(eiju eijuVar) {
        this.c.e(eijuVar, eiiy.d());
    }

    @Override // defpackage.caxe
    public final void b(eiju eijuVar) throws PackageManager.NameNotFoundException {
        this.c.g(eijuVar);
    }

    @Override // defpackage.caxe
    public final void c(eiju eijuVar) {
        this.c.h(eijuVar);
    }

    @Override // defpackage.caxe
    public final int d(EnumSet enumSet, eiju eijuVar, Supplier supplier) {
        if (enumSet.contains(caxd.WAKELOCK)) {
            try {
                c(eijuVar);
            } catch (Throwable th) {
                ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", (char) 148, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attach wakelock request failed.");
            }
        }
        if (enumSet.contains(caxd.BACKGROUND_SERVICE)) {
            try {
                a(eijuVar);
                return 2;
            } catch (Throwable th2) {
                ((eksl) ((eksl) a.n().g(th2)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 157, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching background service request failed.");
            }
        }
        if (!enumSet.contains(caxd.FOREGROUND_SERVICE)) {
            return 1;
        }
        try {
            Notification notification = (Notification) supplier.get();
            if (notification == null) {
                return 1;
            }
            e(eijuVar, notification, 11);
            return 3;
        } catch (Throwable th3) {
            ((eksl) ((eksl) a.n().g(th3)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 170, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching foreground service request failed.");
            return 1;
        }
    }

    @Override // defpackage.caxe
    public final void e(eiju eijuVar, Notification notification, final int i) {
        this.c.i(eijuVar, notification);
        auvh.h(eijuVar.h(new ejvr() { // from class: caxh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = caxj.a;
                return null;
            }
        }, eoqg.a).e(Exception.class, new ejvr() { // from class: caxi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                int i2 = i;
                caxj caxjVar = this.a;
                ((eksl) ((eksl) ((eksl) caxj.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'Z', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((ains) caxjVar.b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", caxc.a(i2));
                return null;
            }
        }, this.d));
    }

    @Override // defpackage.caxe
    public final void f(String str, int i) {
        ((ains) this.b.b()).e(str, i - 1);
    }

    @Override // defpackage.caxe
    public final void g(eiju eijuVar, Notification notification, Class cls, int i) throws PackageManager.NameNotFoundException {
        egoc egocVar = this.c;
        Context context = egocVar.c;
        boolean z = false;
        try {
            context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) cls), 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ejwl.f(z, "Unable to find serviceClass \"%s\".", cls.getName());
        egocVar.d.a(cls).f(eijuVar, notification, i);
        auvh.h(eijuVar.h(new ejvr() { // from class: caxf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = caxj.a;
                return null;
            }
        }, eoqg.a).e(Exception.class, new ejvr() { // from class: caxg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                caxj caxjVar = this.a;
                ((eksl) ((eksl) ((eksl) caxj.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'x', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((ains) caxjVar.b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", caxc.a(13));
                return null;
            }
        }, this.d));
    }
}
