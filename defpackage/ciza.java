package defpackage;

import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciza {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    private final eosd c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public ciza(eosd eosdVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.c = eosdVar;
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    public final eiju a(ciyz ciyzVar) {
        int iOrdinal = ciyzVar.ordinal();
        long jLongValue = iOrdinal != 0 ? iOrdinal != 1 ? 0L : ((Long) this.f.b()).longValue() : ((Long) this.e.b()).longValue();
        if (jLongValue == 0) {
            return eijx.e(null);
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 58, "LatencyInjector.java")).C("Reverse sonic type: %s, duration: %d ms", ciyzVar, jLongValue);
        eiju eijuVarG = eiju.g(this.c.schedule(new Callable() { // from class: ciyx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((eksl) ciza.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 63, "LatencyInjector.java")).q("Reverse sonic complete");
                return null;
            }
        }, jLongValue, TimeUnit.MILLISECONDS));
        ((caxe) this.d.b()).d(EnumSet.allOf(caxd.class), eijuVarG, new Supplier() { // from class: ciyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((cgbn) this.a.b.b()).b();
            }
        });
        return eijuVarG;
    }
}
