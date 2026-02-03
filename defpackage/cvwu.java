package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwu {
    public static final void a(final cvwp cvwpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(102138216);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(cvwpVar) : hmlVarC.F(cvwpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (cvwpVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cvwq
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cvwu.a(null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            dtdn.a(null, null, dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, hxe.d(789582262, new cvwt(cvwpVar), hmlVarC), hmlVarC, 196608, 27);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cvwr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvwu.a(cvwpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
