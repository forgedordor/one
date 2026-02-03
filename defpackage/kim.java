package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kim {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final int b(long j, int i) {
        int iC = kil.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = kil.a(j);
        return i > iA ? iA : i;
    }

    public static final int c(long j, int i) {
        int iD = kil.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = kil.b(j);
        return i > iB ? iB : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            kiz.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = kil.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = kil.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = i << 32;
        int iA = kil.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = kil.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return iA | j3;
    }

    public static final long f(long j, long j2) {
        int iD = kil.d(j2);
        int iD2 = kil.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = kil.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = kil.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = kil.c(j2);
        int iC2 = kil.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = kil.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = kil.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return d(iD, iB, iC, iA);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return (((~(i7 >> 31)) & i7) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (iA2 + 2)) | (((~(i8 >> 31)) & i8) << (iA2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int iB = kil.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = kil.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = kil.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = kil.d(j) + i;
        return d(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.e(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.z(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long k(int i, int i2, int i3, int i4) {
        if (1 == (i4 & 1)) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return d(i, i2, 0, i3);
    }

    public static /* synthetic */ long l(long j, int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return h(j, i, i2);
    }
}
