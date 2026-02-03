package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixk {
    public static final cqce a = cqce.g("Bugle", "RcsLimboMessagesResolver");
    public static final Duration b = Duration.ofDays(2);
    public static final ekgb c = ekgb.s(1, 14);
    public final eoqr d = new eoqr();
    public final cogw e;
    public final eosc f;
    public final eosc g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final axga l;
    public final aqmq m;
    public final fcsu n;
    private final fcsu o;
    private final fcsu p;

    public cixk(cogw cogwVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, axga axgaVar, fcsu fcsuVar6, fcsu fcsuVar7, aqmq aqmqVar) {
        this.e = cogwVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.o = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = axgaVar;
        this.n = fcsuVar6;
        this.p = fcsuVar7;
        this.m = aqmqVar;
    }

    public final eiju a() {
        return eiju.g(((dggw) this.p.b()).g());
    }

    public final void b(int i) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Found");
        cqbdVarA.G(i);
        cqbdVarA.I("message(s) in limbo.");
        cqbdVarA.r();
        ((cggg) this.o.b()).d();
    }
}
