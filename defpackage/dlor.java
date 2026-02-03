package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlor {
    public static final ddp a(hox hoxVar) {
        return (ddp) hoxVar.a();
    }

    public static final void b(final ede edeVar, final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1259085763);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final float fEn = ((kio) hmlVarC.e(jmh.e)).en(28.0f);
            ics icsVarC = efs.c(edeVar.a(egq.d(ics.e, 1.0f), ibw.g), 0.0f, 28.0f, 1);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: dloi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ikl iklVar = (ikl) obj2;
                        iklVar.getClass();
                        iklVar.s(1);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarE = egq.e(idb.a(ijn.a(icsVarC, (fdap) objS), 1.0f), 28.0f);
            hmlVarC.v(-1633490746);
            boolean zA = hmlVarC.A(fEn) | ((i2 & 112) == 32);
            Object objS2 = hmwVar.S();
            if (zA || objS2 == obj) {
                objS2 = new fdap() { // from class: dloj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        imz imzVar = (imz) obj2;
                        imzVar.getClass();
                        imzVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                        long j2 = ije.a;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (imzVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (imzVar.b() & 4294967295L));
                        imy.o(imzVar, j2, 0L, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 + fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(fEn) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L), null, 0.0f, 114);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ecz.b(ifb.a(icsVarE, (fdap) objS2), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlok
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dlor.b(edeVar2, j, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dloh r27, defpackage.ics r28, defpackage.hcn r29, defpackage.igr r30, boolean r31, defpackage.ije r32, defpackage.hml r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlor.c(dloh, ics, hcn, igr, boolean, ije, hml, int, int):void");
    }
}
