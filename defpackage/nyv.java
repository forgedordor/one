package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyv {
    public static int a(mfq mfqVar, int i, int i2, int i3) {
        mee.a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        eoln.a(eoln.a(i4, i5), 1 << i3);
        if (mfqVar.a() < i) {
            return -1;
        }
        int iD = mfqVar.d(i);
        if (iD != i4) {
            return iD;
        }
        if (mfqVar.a() < i2) {
            return -1;
        }
        int iD2 = mfqVar.d(i2);
        int i6 = iD + iD2;
        if (iD2 != i5) {
            return i6;
        }
        if (mfqVar.a() < i3) {
            return -1;
        }
        return i6 + mfqVar.d(i3);
    }

    public static void b(mfq mfqVar) {
        mfqVar.n(3);
        mfqVar.n(8);
        boolean zP = mfqVar.p();
        boolean zP2 = mfqVar.p();
        if (zP) {
            mfqVar.n(5);
        }
        if (zP2) {
            mfqVar.n(6);
        }
    }

    public static void c(mfq mfqVar) {
        int iD;
        int iD2 = mfqVar.d(2);
        if (iD2 == 0) {
            mfqVar.n(6);
            return;
        }
        int iA = a(mfqVar, 5, 8, 16) + 1;
        if (iD2 == 1) {
            mfqVar.n(iA * 7);
            return;
        }
        if (iD2 == 2) {
            boolean zP = mfqVar.p();
            int i = true != zP ? 5 : 1;
            int i2 = true == zP ? 7 : 5;
            int i3 = true == zP ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (mfqVar.p()) {
                    mfqVar.n(7);
                    iD = 0;
                } else {
                    if (mfqVar.d(2) == 3 && mfqVar.d(i2) * i != 0) {
                        mfqVar.m();
                    }
                    iD = mfqVar.d(i3) * i;
                    if (iD != 0 && iD != 180) {
                        mfqVar.m();
                    }
                    mfqVar.m();
                }
                if (iD != 0 && iD != 180 && mfqVar.p()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static boolean d(mfq mfqVar) {
        mfqVar.n(3);
        boolean zP = mfqVar.p();
        if (zP) {
            mfqVar.n(13);
        }
        return zP;
    }
}
