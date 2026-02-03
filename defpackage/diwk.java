package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diwk {
    public static final void a(final diwl diwlVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1487250617);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(diwlVar) : hmlVarC.F(diwlVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fctx fctxVar = fctx.a;
            hmlVarC.v(-1633490746);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !hmlVarC.F(diwlVar))) {
                z = false;
            }
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z || objS == hmk.a) {
                objS = new diwj(diwlVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diwe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diwk.a(diwlVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.diwa r28, defpackage.ics r29, defpackage.hml r30, final int r31) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diwk.b(diwa, ics, hml, int):void");
    }

    private static final int c(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    private static final int d(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }
}
