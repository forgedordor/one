package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyi {
    public static final void a(final cvyy cvyyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1692652074);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cvyyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfr.a(cvyc.a, null, null, null, hxe.d(48340744, new cvye(cvyyVar.b), hmlVarC), hxe.d(-296575001, new cvyh(cvyyVar.e, cvyyVar), hmlVarC), dtfp.a(glz.a(hmlVarC).D, hmlVarC, 510), hmlVarC, 221190, 398);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvyd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvyi.a(cvyyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
