package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmk {
    private static final fcmk c = new fcmk();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(fcmj fcmjVar) {
        return c.b(fcmjVar);
    }

    public static void d(fcmj fcmjVar, Object obj) {
        c.e(fcmjVar, obj);
    }

    final synchronized Object b(fcmj fcmjVar) {
        fcmi fcmiVar;
        IdentityHashMap identityHashMap = this.a;
        fcmiVar = (fcmi) identityHashMap.get(fcmjVar);
        if (fcmiVar == null) {
            fcmiVar = new fcmi(fcmjVar.a());
            identityHashMap.put(fcmjVar, fcmiVar);
        }
        ScheduledFuture scheduledFuture = fcmiVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            fcmiVar.c = null;
        }
        fcmiVar.b++;
        return fcmiVar.a;
    }

    final synchronized void e(fcmj fcmjVar, Object obj) {
        fcmi fcmiVar = (fcmi) this.a.get(fcmjVar);
        if (fcmiVar == null) {
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(fcmjVar))));
        }
        boolean z = true;
        ejwl.b(obj == fcmiVar.a, "Releasing the wrong instance");
        ejwl.m(fcmiVar.b > 0, "Refcount has already reached zero");
        int i = fcmiVar.b - 1;
        fcmiVar.b = i;
        if (i == 0) {
            if (fcmiVar.c != null) {
                z = false;
            }
            ejwl.m(z, "Destroy task already scheduled");
            if (this.b == null) {
                this.b = Executors.newSingleThreadScheduledExecutor(fcdy.k("grpc-shared-destroyer-%d"));
            }
            fcmiVar.c = this.b.schedule(new fcfl(new fcmh(this, fcmiVar, fcmjVar, obj)), 1L, TimeUnit.SECONDS);
        }
    }
}
