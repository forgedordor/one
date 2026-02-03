package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euo extends icr implements jqi, jcb {
    public final eui a;
    private boolean b;

    public euo(eui euiVar) {
        this.a = euiVar;
    }

    public static final ihu a(euo euoVar, ivy ivyVar, fdae fdaeVar) {
        Object objInvoke;
        if (euoVar.C && euoVar.b) {
            ivy ivyVarB = jbg.b(euoVar);
            if (true != ivyVar.u()) {
                ivyVar = null;
            }
            if (ivyVar != null && (objInvoke = fdaeVar.invoke()) != null) {
                return ((ihu) objInvoke).f(ivyVarB.o(ivyVar, false).c());
            }
        }
        return null;
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jqi
    public final Object e(final ivy ivyVar, final fdae fdaeVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new eun(this, ivyVar, fdaeVar, new fdae() { // from class: euj
            @Override // defpackage.fdae
            public final Object invoke() {
                euo euoVar = this.a;
                ihu ihuVarA = euo.a(euoVar, ivyVar, fdaeVar);
                if (ihuVarA == null) {
                    return null;
                }
                dss dssVar = (dss) euoVar.a;
                if (kjg.e(dssVar.i, 0L)) {
                    ebs.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return ihuVarA.f(dssVar.e(ihuVarA, dssVar.i) ^ (-9223372034707292160L));
            }
        }, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.jcb
    public final void ea(ivy ivyVar) {
        this.b = true;
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void i(long j) {
    }
}
