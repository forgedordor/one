package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egz extends icr implements jcd {
    public float a;
    public float b;

    public egz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        int iD;
        int iC;
        if (Float.isNaN(this.a) || kil.d(j) != 0) {
            iD = kil.d(j);
        } else {
            int iEp = ixpVar.ep(this.a);
            iD = kil.b(j);
            if (iEp < 0) {
                iEp = 0;
            }
            if (iEp <= iD) {
                iD = iEp;
            }
        }
        int iB = kil.b(j);
        if (Float.isNaN(this.b) || kil.c(j) != 0) {
            iC = kil.c(j);
        } else {
            int iEp2 = ixpVar.ep(this.b);
            iC = kil.a(j);
            int i = iEp2 >= 0 ? iEp2 : 0;
            if (i <= iC) {
                iC = i;
            }
        }
        final iyl iylVarE = ixkVar.e(kim.d(iD, iB, iC, kil.a(j)));
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: egy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk.A((iyk) obj, iylVarE, 0, 0);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        int iA = ivtVar.a(i);
        int iEp = !Float.isNaN(this.b) ? ivuVar.ep(this.b) : 0;
        return iA < iEp ? iEp : iA;
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        int iB = ivtVar.b(i);
        int iEp = !Float.isNaN(this.a) ? ivuVar.ep(this.a) : 0;
        return iB < iEp ? iEp : iB;
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        int iC = ivtVar.c(i);
        int iEp = !Float.isNaN(this.b) ? ivuVar.ep(this.b) : 0;
        return iC < iEp ? iEp : iC;
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        int iD = ivtVar.d(i);
        int iEp = !Float.isNaN(this.a) ? ivuVar.ep(this.a) : 0;
        return iD < iEp ? iEp : iD;
    }
}
