package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cweb {
    public static final void a(final cwem cwemVar, hml hmlVar, final int i) {
        int i2;
        cwen cwenVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(133542504);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cwemVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (cwemVar == null || (cwenVar = cwemVar.c) == cwen.a || cwenVar == cwen.e) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cwdj
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cweb.a(cwemVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: cwdk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cwemVar.e.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            kme.a((fdae) objS, new knl(false, false, 0, false, false, 39), hxe.d(1850459967, new cwdo(cwemVar), hmlVarC), hmlVarC, 432, 0);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cwdl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cweb.a(cwemVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.cwem r35, final long r36, final boolean r38, defpackage.hml r39, final int r40) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cweb.b(cwem, long, boolean, hml, int):void");
    }

    public static final /* synthetic */ long c(int i, hml hmlVar) {
        hmlVar.v(67726834);
        long jA = i == 3 ? ila.a(0.0f, 0.1f) : i == 5 ? ila.a(0.0f, 0.8f) : i == 4 ? ila.a(1.0f, 0.1f) : i == 6 ? ila.a(1.0f, 0.8f) : i == 2 ? hmlVar.e(jmh.j) == kji.a ? ila.a(0.0f, 1.0f) : ila.a(1.0f, 1.0f) : ila.a(0.5f, 0.5f);
        hmlVar.o();
        return jA;
    }

    private static final long d(hox hoxVar) {
        return ((kjg) hoxVar.a()).a;
    }

    private static final long e(hox hoxVar) {
        return ((ihs) hoxVar.a()).a;
    }
}
