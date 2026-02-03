package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqd implements bvpy {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleDitto");
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final awlc g;
    private final fcsu h;
    private AtomicReference i;
    private Instant j;

    public bvqd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, awlc awlcVar, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        awlcVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = awlcVar;
        this.h = fcsuVar5;
        if (fcsuVar2.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (fcsuVar3.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (fcsuVar4.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.i = new AtomicReference(bvqc.b);
        this.j = Instant.MIN;
    }

    private final void c() {
        synchronized (this) {
            this.i.set(bvqc.b);
        }
        this.g.d(new Consumer() { // from class: bvqa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bvqe bvqeVar = (bvqe) obj;
                int i = bvqd.a;
                bvqeVar.getClass();
                if (bvqeVar.b.a()) {
                    auvh.h(bvqeVar.a.f(24, ezol.a, ""));
                } else {
                    auvh.h(bvqeVar.a.f(26, ezol.a, ""));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((eksl) b.e()).q("Throttle State changed to NOT THROTTLED, notifying Ditto to exit Polling Mode");
        Duration durationBetween = Duration.between(this.j, Instant.ofEpochMilli(((cogw) this.h.b()).a()));
        fcsu fcsuVar = this.c;
        ((ains) fcsuVar.b()).c("Bugle.Ditto.Throttle.Stop.Counts");
        ((ains) fcsuVar.b()).g("Bugle.Ditto.Throttle.Duration.Minutes.Count", durationBetween.toMinutes());
    }

    private static final boolean d(avbi avbiVar) {
        if (!avbiVar.c()) {
            synchronized (avbiVar) {
                double dA = avbiVar.a();
                if (dA >= 1.0d) {
                    avbiVar.b = Math.max(0.0d, dA - 1.0d);
                    avbiVar.c = Instant.ofEpochMilli(avbiVar.a.a());
                    return false;
                }
                avbiVar.d.set(true);
                avbiVar.e = Instant.ofEpochMilli(avbiVar.a.a());
            }
        }
        return true;
    }

    @Override // defpackage.bvpy
    public final boolean a() {
        boolean z = false;
        if (this.i.get() != bvqc.b && (((avbi) this.d.b()).c() || ((avbi) this.e.b()).c() || ((avbi) this.f.b()).c())) {
            z = true;
        }
        if (this.i.get() == bvqc.a && !z) {
            c();
        }
        return z;
    }

    @Override // defpackage.bvpy
    public final boolean b() {
        Object objB = this.d.b();
        objB.getClass();
        bvqf bvqfVar = new bvqf(d((avbi) objB), "Minute Interval Throttler is throttling requests");
        Object objB2 = this.e.b();
        objB2.getClass();
        bvqf bvqfVar2 = new bvqf(d((avbi) objB2), "Five Minute Interval Throttler is throttling requests");
        Object objB3 = this.f.b();
        objB3.getClass();
        bvqf bvqfVar3 = new bvqf(d((avbi) objB3), "Twenty Minute Interval Throttler is throttling requests");
        boolean z = bvqfVar.a;
        boolean z2 = true;
        if (!z && !bvqfVar2.a && !bvqfVar3.a) {
            z2 = false;
        }
        bvqb bvqbVar = z ? bvqb.b : bvqfVar2.a ? bvqb.c : bvqfVar3.a ? bvqb.d : bvqb.a;
        if (this.i.get() != bvqc.b || !z2) {
            if (this.i.get() != bvqc.a || z2) {
                return z2;
            }
            c();
            return false;
        }
        synchronized (this) {
            this.i.set(bvqc.a);
            this.j = Instant.ofEpochMilli(((cogw) this.h.b()).a());
        }
        this.g.d(new Consumer() { // from class: bvpz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bvqe bvqeVar = (bvqe) obj;
                int i = bvqd.a;
                bvqeVar.getClass();
                if (bvqeVar.b.a()) {
                    auvh.h(bvqeVar.a.f(23, ezol.a, ""));
                } else {
                    auvh.h(bvqeVar.a.f(25, ezol.a, ""));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((eksl) b.e()).t("Throttle State changed to THROTTLED because [%s], notifying Ditto to enter Polling Mode", bvqbVar);
        ((ains) this.c.b()).e("Bugle.Ditto.Throttle.Start.Counts", bvqbVar.e);
        return z2;
    }
}
