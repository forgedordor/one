package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceql implements cepf {
    private final fcsu a;
    private final apun b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final String g;

    public ceql(fcsu fcsuVar, apun apunVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, String str) {
        this.a = fcsuVar;
        this.b = apunVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = str;
        ejwl.b(!str.isEmpty(), "Tachyon host cannot be empty");
        ejwl.b(true, "Tachyon port must be between 1 and 65535");
    }

    private static esov h() {
        esop esopVar = new esop();
        esopVar.b(ekhx.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        return esopVar.c();
    }

    private final String i() {
        return this.g + ":443";
    }

    @Override // defpackage.cepf
    public final eiju a(ezho ezhoVar) {
        return eiju.g(g().b(ezhoVar));
    }

    @Override // defpackage.cepf
    public final eiju b(ezim ezimVar) {
        return eiju.g(g().c(ezimVar));
    }

    @Override // defpackage.cepf
    public final eiju c(ezkf ezkfVar) {
        return eiju.g(g().d(ezkfVar));
    }

    @Override // defpackage.cepf
    public final eiju d(ezlz ezlzVar) {
        return eiju.g(g().e(ezlzVar));
    }

    @Override // defpackage.cepf
    public final eiju e(ezjl ezjlVar) {
        return eiju.g(g().f(ezjlVar));
    }

    @Override // defpackage.cepf
    public final void f(ezkl ezklVar, fcsf fcsfVar) {
        ejwl.m(!ecem.g(), "Method must not be called on MainThread");
        (this.b.a() ? (eywd) ceqb.a((eywd) ((eywd) ((eywd) ceqb.b((eywd) this.d.b(), true)).n(esoc.a, i())).n(espr.a, new esow(h())), ((Boolean) this.a.b()).booleanValue(), 8755) : (eywd) ((eywd) ceqb.b((eywd) this.f.b(), true)).n(espr.a, new esow(h()))).b(ezklVar, fcsfVar);
    }

    final eywc g() {
        return this.b.a() ? (eywc) ceqb.a((eywc) ((eywc) ((eywc) ceqb.b((eywc) this.c.b(), false)).n(esoc.a, i())).n(espr.a, new esow(h())), ((Boolean) this.a.b()).booleanValue(), 8755) : (eywc) ((eywc) ceqb.b((eywc) this.e.b(), false)).n(espr.a, new esow(h()));
    }
}
