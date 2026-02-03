package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class efo extends icr implements jcd {
    public abstract boolean a();

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        long jI = i(ixkVar, j);
        if (a()) {
            jI = kim.f(j, jI);
        }
        final iyl iylVarE = ixkVar.e(jI);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: efn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk.G((iyk) obj, iylVarE);
                return fctx.a;
            }
        });
    }

    public int e(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.a(i);
    }

    @Override // defpackage.jcd
    public int f(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.b(i);
    }

    public int g(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.c(i);
    }

    @Override // defpackage.jcd
    public int h(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.d(i);
    }

    public abstract long i(ixk ixkVar, long j);
}
