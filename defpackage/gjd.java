package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjd {
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ics r14, float r15, final long r16, defpackage.hml r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjd.a(ics, float, long, hml, int, int):void");
    }

    public static final void b(final ics icsVar, final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1534852205);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            ics icsVarO = egq.o(egq.b(icsVar, 1.0f), 1.0f);
            boolean z2 = (i2 & 112) == 32;
            if ((((i2 & 896) ^ 384) <= 256 || !hmlVarC.C(j)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z3 || objS == hmk.a) {
                objS = new fdap() { // from class: giz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imz imzVar = (imz) obj;
                        float fEn = imzVar.en(1.0f);
                        long jFloatToRawIntBits = Float.floatToRawIntBits(imzVar.en(1.0f) / 2.0f);
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                        float fEn2 = imzVar.en(1.0f) / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (imzVar.b() & 4294967295L));
                        imy.l(imzVar, j, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fEn2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), fEn, 0, 496);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            dlb.a(icsVarO, (fdap) objS, hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gja
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    gjd.b(icsVar2, j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
