package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eed extends icr implements jcd {
    public float a;
    public int b;

    public eed(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        int iD;
        int iB;
        int iA;
        int iA2;
        if (!kil.i(j) || this.b == 1) {
            iD = kil.d(j);
            iB = kil.b(j);
        } else {
            float fB = kil.b(j) * this.a;
            int iD2 = kil.d(j);
            iD = kil.b(j);
            int iRound = Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!kil.h(j) || this.b == 2) {
            int iC = kil.c(j);
            iA = kil.a(j);
            iA2 = iC;
        } else {
            float fA = kil.a(j) * this.a;
            int iC2 = kil.c(j);
            iA2 = kil.a(j);
            int iRound2 = Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA2) {
                iA2 = iC2;
            }
            iA = iA2;
        }
        final iyl iylVarE = ixkVar.e(kim.d(iD, iB, iA2, iA));
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: eec
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk.A((iyk) obj, iylVarE, 0, 0);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
