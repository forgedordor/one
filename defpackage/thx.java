package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thx {
    public static final void a(final tip tipVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(1308759374);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(tipVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ftn();
                hmwVar.af(objS);
            }
            ftn ftnVar = (ftn) objS;
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            fst.a(null, fst.d(ftnVar, hmlVarC, 1), null, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hxe.d(-444034992, new thw(tipVar, ftnVar), hmlVarC), hmlVar2, 0, 12582912, 131069);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: thu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    thx.a(tipVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
