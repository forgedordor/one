package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmw {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[PHI: r6
      0x0093: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:28:0x0067, B:30:0x006b, B:46:0x008e, B:43:0x0089, B:36:0x007d, B:40:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nmv a(defpackage.mfq r9) {
        /*
            r0 = 16
            int r1 = r9.d(r0)
            int r0 = r9.d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.d(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.d(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.d(r1)
            boolean r2 = r9.p()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.d(r2)
            boolean r5 = r9.p()
            if (r5 == 0) goto L47
            int r5 = r9.d(r4)
            if (r5 <= 0) goto L47
            r9.n(r1)
        L47:
            boolean r5 = r9.p()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r6
            goto L57
        L56:
            r5 = r7
        L57:
            int r9 = r9.d(r3)
            if (r5 != r6) goto L66
            r6 = 13
            if (r9 != r6) goto L66
            int[] r9 = defpackage.nmw.b
            r9 = r9[r6]
            goto L94
        L66:
            r6 = 0
            if (r5 != r7) goto L93
            r7 = 14
            if (r9 >= r7) goto L93
            int[] r6 = defpackage.nmw.b
            r6 = r6[r9]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L80
            goto L93
        L80:
            if (r9 == r4) goto L90
            if (r9 == r7) goto L90
            if (r9 != r8) goto L93
            goto L90
        L87:
            if (r9 == r7) goto L90
            if (r9 != r8) goto L93
            goto L90
        L8c:
            if (r9 == r4) goto L90
            if (r9 != r7) goto L93
        L90:
            int r9 = r6 + 1
            goto L94
        L93:
            r9 = r6
        L94:
            nmv r1 = new nmv
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmw.a(mfq):nmv");
    }

    public static void b(int i, mfr mfrVar) {
        mfrVar.G(7);
        byte[] bArr = mfrVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void c(mfq mfqVar, nmu nmuVar) throws mby {
        int iD = mfqVar.d(5);
        mfqVar.n(2);
        if (mfqVar.p()) {
            mfqVar.n(5);
        }
        if (iD >= 7 && iD <= 10) {
            mfqVar.m();
        }
        if (mfqVar.p()) {
            int iD2 = mfqVar.d(3);
            if (nmuVar.b == -1 && iD >= 0 && iD <= 15 && (iD2 == 0 || iD2 == 1)) {
                nmuVar.b = iD;
            }
            if (mfqVar.p()) {
                f(mfqVar);
            }
        }
    }

    public static void d(mfq mfqVar, nmu nmuVar) throws mby {
        mfqVar.n(2);
        boolean zP = mfqVar.p();
        int iD = mfqVar.d(8);
        for (int i = 0; i < iD; i++) {
            mfqVar.n(2);
            if (mfqVar.p()) {
                mfqVar.n(5);
            }
            if (zP) {
                mfqVar.n(24);
            } else {
                if (mfqVar.p()) {
                    if (!mfqVar.p()) {
                        mfqVar.n(4);
                    }
                    nmuVar.c = mfqVar.d(6) + 1;
                }
                mfqVar.n(4);
            }
        }
        if (mfqVar.p()) {
            mfqVar.n(3);
            if (mfqVar.p()) {
                f(mfqVar);
            }
        }
    }

    public static boolean e(mfq mfqVar) {
        if (mfqVar.a() < 66) {
            return false;
        }
        mfqVar.n(66);
        return true;
    }

    private static void f(mfq mfqVar) throws mby {
        int iD = mfqVar.d(6);
        if (iD < 2 || iD > 42) {
            throw new mby(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iD)), null, false, 1);
        }
        mfqVar.n(iD * 8);
    }
}
