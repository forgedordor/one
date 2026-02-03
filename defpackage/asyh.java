package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asyh {
    public static final Duration a;
    private static final aszw f;
    public final asxy b;
    public final cogw c;
    public final ahkj d;
    public final ahkp e;
    private final asyq g;
    private final asxt h;
    private final aszi i;
    private final assu j;
    private final assu k;
    private final asxy l;
    private final asxy m;
    private final aszv n;
    private final aszw o;
    private final eosc p;
    private final aprv q;
    private final ahki r;

    static {
        long j = fdhi.a;
        Duration durationOfSeconds = Duration.ofSeconds(fdhi.h(fdhk.f(36500, fdhl.g)), fdhi.d(r0));
        durationOfSeconds.getClass();
        a = durationOfSeconds;
        aszs aszsVar = new aszs();
        aszsVar.c(durationOfSeconds);
        aszsVar.b(durationOfSeconds);
        f = aszsVar.a();
    }

    public asyh(ahki ahkiVar, asyq asyqVar, ahkj ahkjVar, asxt asxtVar, aszi asziVar, ahkp ahkpVar, assu assuVar, assu assuVar2, asxy asxyVar, asxy asxyVar2, asxy asxyVar3, aszv aszvVar, aszw aszwVar, eosc eoscVar, aprv aprvVar, cogw cogwVar) {
        ahkiVar.getClass();
        ahkjVar.getClass();
        ahkpVar.getClass();
        asxyVar3.getClass();
        eoscVar.getClass();
        cogwVar.getClass();
        this.r = ahkiVar;
        this.g = asyqVar;
        this.d = ahkjVar;
        this.h = asxtVar;
        this.i = asziVar;
        this.e = ahkpVar;
        this.j = assuVar;
        this.k = assuVar2;
        this.l = asxyVar;
        this.m = asxyVar2;
        this.b = asxyVar3;
        this.n = aszvVar;
        this.o = aszwVar;
        this.p = eoscVar;
        this.q = aprvVar;
        this.c = cogwVar;
    }

    private final asvn l() {
        return this.e.a(this.d.a(this.b, new asww(new Supplier() { // from class: asyg
            @Override // java.util.function.Supplier
            public final Object get() {
                Duration duration = asyh.a;
                return Instant.EPOCH;
            }
        })));
    }

    public final asxy a(asxy asxyVar, aszw aszwVar, aszw aszwVar2) {
        if (!this.q.a() || aszwVar2 == null) {
            aszwVar2 = new aszy(aszwVar, this.o);
        }
        aszv aszvVar = this.n;
        ahki ahkiVar = this.r;
        asyq asyqVar = this.g;
        ahkj ahkjVar = this.d;
        asxt asxtVar = this.h;
        assu assuVar = this.j;
        assu assuVar2 = this.k;
        aszu aszuVarA = aszvVar.a(aszwVar2);
        asvn asvnVarL = l();
        eosc eoscVar = this.p;
        aswf aswfVar = new aswf(assuVar, new aswf(assuVar2, asvnVarL, aszuVarA, eoscVar), aszuVarA, eoscVar);
        awlc awlcVar = (awlc) asxtVar.a.b();
        awlcVar.getClass();
        eosc eoscVar2 = (eosc) asxtVar.b.b();
        eoscVar2.getClass();
        asyc asycVarA = ahkjVar.a(new asxs(asxyVar, aswfVar, awlcVar, eoscVar2, aszuVarA), new asww(new Supplier() { // from class: asyf
            @Override // java.util.function.Supplier
            public final Object get() {
                Duration duration = asyh.a;
                return Instant.EPOCH;
            }
        }));
        chsn chsnVar = (chsn) asyqVar.a.b();
        chsnVar.getClass();
        eosc eoscVar3 = (eosc) asyqVar.c.b();
        eoscVar3.getClass();
        return new aswi(new asyp(asycVarA, chsnVar, asyqVar.b, eoscVar3), (eosc) ahkiVar.a.a.p.b());
    }

    public final asxy b(aszw aszwVar) {
        return h(aszwVar);
    }

    public final asxy c(aszw aszwVar) {
        return d(aszwVar, null);
    }

    public final asxy d(aszw aszwVar, aszw aszwVar2) {
        return a(e(this.m, aszwVar), aszwVar, aszwVar2);
    }

    public final asxy e(asxy asxyVar, aszw aszwVar) {
        aszu aszuVarA = this.n.a(aszwVar);
        assu assuVar = this.k;
        eosc eoscVar = this.p;
        return new aswf(this.j, new aswf(assuVar, asxyVar, aszuVarA, eoscVar), aszuVarA, eoscVar);
    }

    public final asxy g(aszw aszwVar, Executor executor) {
        aszv aszvVar = this.n;
        return a(new aswf(this.j, this.l, aszvVar.a(aszwVar), executor), aszwVar, null);
    }

    public final asxy h(aszw aszwVar) {
        return g(aszwVar, this.p);
    }

    public final asxy i(aszw aszwVar) {
        return k(aszwVar, l());
    }

    public final asxy j(aszw aszwVar) {
        asvn asvnVarL = l();
        aszw aszwVar2 = f;
        aszwVar2.getClass();
        asxy asxyVarE = e(this.m, aszwVar2);
        aszi asziVar = this.i;
        asse asseVar = (asse) asziVar.a.b();
        asseVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) asziVar.b.b();
        scheduledExecutorService.getClass();
        return k(aszwVar, new aszh(asvnVarL, asxyVarE, asseVar, scheduledExecutorService));
    }

    public final asxy k(aszw aszwVar, asxy asxyVar) {
        aszu aszuVarA = this.n.a(aszwVar);
        assu assuVar = this.k;
        eosc eoscVar = this.p;
        return a(new aswf(this.j, new aswf(assuVar, asxyVar, aszuVarA, eoscVar), aszuVarA, eoscVar), aszwVar, null);
    }
}
