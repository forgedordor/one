package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebx extends icr implements jcd {
    public itz a;
    public float b;
    public float c;

    public ebx(itz itzVar, float f, float f2) {
        this.a = itzVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        long j2;
        long jM;
        final itz itzVar = this.a;
        boolean z = itzVar instanceof ivg;
        final float f = this.b;
        float f2 = this.c;
        if (z) {
            j2 = j;
            jM = kil.m(j2, 0, 0, 0, 0, 11);
        } else {
            j2 = j;
            jM = kil.m(j2, 0, 0, 0, 0, 14);
        }
        final iyl iylVarE = ixkVar.e(jM);
        int iEi = iylVarE.ei(itzVar);
        if (iEi == Integer.MIN_VALUE) {
            iEi = 0;
        }
        int i = z ? iylVarE.b : iylVarE.a;
        int iA = (z ? kil.a(j2) : kil.b(j2)) - i;
        final int i2 = fddu.i((!Float.isNaN(f) ? ixpVar.ep(f) : 0) - iEi, 0, iA);
        final int i3 = fddu.i(((!Float.isNaN(f2) ? ixpVar.ep(f2) : 0) - i) + iEi, 0, iA - i2);
        int iMax = z ? iylVarE.a : Math.max(iylVarE.a + i2 + i3, kil.d(j2));
        final int iMax2 = z ? Math.max(iylVarE.b + i2 + i3, kil.c(j2)) : iylVarE.b;
        final int i4 = iMax;
        return ixpVar.ej(i4, iMax2, fcvp.a, new fdap() { // from class: ebv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean z2 = itzVar instanceof ivg;
                float f3 = f;
                int i5 = i2;
                int i6 = i3;
                iyk iykVar = (iyk) obj;
                iyl iylVar = iylVarE;
                int i7 = z2 ? 0 : !kir.b(f3, Float.NaN) ? i5 : (i4 - i6) - iylVar.a;
                if (!z2) {
                    i5 = 0;
                } else if (kir.b(f3, Float.NaN)) {
                    i5 = (iMax2 - i6) - iylVar.b;
                }
                iyk.A(iykVar, iylVar, i7, i5);
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
