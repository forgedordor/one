package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceod implements cepf {
    private final fbnd a;
    private final fbrg b;

    public ceod(fbnd fbndVar, fbrg fbrgVar) {
        this.a = fbndVar;
        this.b = fbrgVar;
    }

    private final eywc g() {
        return (eywc) ceqb.c(eywe.a(this.a), this.b, false);
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
        ((eywd) ceqb.c(eywe.b(this.a), this.b, true)).b(ezklVar, fcsfVar);
    }
}
