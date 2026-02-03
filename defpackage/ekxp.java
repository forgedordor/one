package defpackage;

import com.android.vcard.VCardConfig;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxp implements Comparable<ekxp>, Serializable, ekxz {
    public static final ekxp[] b;
    public static final ejvf c;
    public final long d;
    private static final int[] e = new int[1024];
    private static final int[] f = new int[1024];
    public static final ekxp a = new ekxp(0);

    static {
        R(0, 0, 0, 0, 0, 0);
        R(0, 0, 0, 1, 0, 1);
        R(0, 0, 0, 2, 0, 2);
        R(0, 0, 0, 3, 0, 3);
        b = new ekxp[6];
        for (int i = 0; i < 6; i++) {
            b[i] = r(i);
        }
        c = new ejuv('0');
    }

    public ekxp(long j) {
        this.d = j;
    }

    public static void A(int i, int i2, ekxe ekxeVar) {
        ekxeVar.e(ekzf.a(i, i2), ekzf.a(i + i2, i2));
    }

    public static boolean F(long j) {
        return (j & (m(0) + (-1))) == 0;
    }

    public static boolean J(long j, long j2) {
        return j + Long.MIN_VALUE >= j2 + Long.MIN_VALUE;
    }

    public static boolean K(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    public static boolean L(long j, long j2) {
        return j + Long.MIN_VALUE <= j2 + Long.MIN_VALUE;
    }

    public static boolean M(long j, long j2) {
        return j + Long.MIN_VALUE < j2 + Long.MIN_VALUE;
    }

    public static ekxp N(String str) {
        if (str != null && !str.isEmpty() && !str.equals("X")) {
            if (str.toLowerCase(Locale.ROOT).startsWith("0x")) {
                str = str.substring(2);
            }
            int length = str.length();
            if (length <= 16) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    int iDigit = Character.digit(str.charAt(i), 16);
                    if (iDigit != -1) {
                        j = (j * 16) + iDigit;
                    }
                }
                return new ekxp(j << ((16 - length) * 4));
            }
        }
        return a;
    }

    private static final int O(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return e[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    private static final int P(int i) {
        return i & 3;
    }

    private static final long Q(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((i2 >> 2) << ((i3 + i3) * 4));
    }

    private static void R(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5 << 2;
        if (i == 4) {
            int i8 = ((i2 << 4) + i3) << 2;
            e[i8 + i4] = i7 + i6;
            f[i7 + i4] = i8 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        for (int i12 = 0; i12 < 4; i12++) {
            int iA = ekxm.a(i6, i12);
            R(i9, (iA >>> 1) + i10, (iA & 1) + i11, i4, i7 + i12, i6 ^ ekxm.b(i12));
        }
    }

    public static int c(long j) {
        return (int) (j >>> 33);
    }

    public static int d(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    static int e(long j) {
        return (int) (j & 3);
    }

    static int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(int i) {
        return 1 << (30 - i);
    }

    public static long i(int i) {
        return (i << 61) + m(0);
    }

    public static long m(int i) {
        int i2 = 30 - i;
        return 1 << (i2 + i2);
    }

    static long n(long j) {
        long jLowestOneBit = Long.lowestOneBit(j) << 2;
        return (j & (-jLowestOneBit)) | jLowestOneBit;
    }

    static long o(long j) {
        return j + (Long.lowestOneBit(j) - 1);
    }

    static long p(long j) {
        return j - (Long.lowestOneBit(j) - 1);
    }

    public static ekxp r(int i) {
        return new ekxp(i(i));
    }

    public static ekxp s(int i, int i2, int i3) {
        long j = i;
        int iP = i & 1;
        long jQ = j << 28;
        for (int i4 = 7; i4 >= 4; i4--) {
            int iO = O(i2, i3, i4, iP);
            jQ = Q(jQ, i4, iO);
            iP = P(iO);
        }
        long jQ2 = 0;
        for (int i5 = 3; i5 >= 0; i5--) {
            int iO2 = O(i2, i3, i5, iP);
            jQ2 = Q(jQ2, i5, iO2);
            iP = P(iO2);
        }
        long j2 = (jQ << 32) + jQ2;
        return new ekxp(j2 + j2 + 1);
    }

    public static ekxp t(int i, int i2, int i3, boolean z) {
        if (z) {
            return s(i, i2, i3);
        }
        int iMax = Math.max(-1, Math.min(1073741824, i2));
        int iMax2 = Math.max(-1, Math.min(1073741824, i3));
        double dMax = Math.max(-1.0000000000000002d, Math.min(1.0000000000000002d, (iMax + iMax + VCardConfig.VCARD_TYPE_V30_GENERIC) * 9.313225746154785E-10d));
        double dMax2 = Math.max(-1.0000000000000002d, Math.min(1.0000000000000002d, (iMax2 + iMax2 + VCardConfig.VCARD_TYPE_V30_GENERIC) * 9.313225746154785E-10d));
        ekze ekzeVarN = ekzf.n(i);
        double dA = ekzeVarN.a(dMax, dMax2);
        double dB = ekzeVarN.b(dMax, dMax2);
        double dC = ekzeVarN.c(dMax, dMax2);
        int iG = ekzf.g(dA, dB, dC);
        ekzd ekzdVarM = ekzf.m(iG);
        return s(iG, ekzf.e((ekzdVarM.a(dA, dB, dC) + 1.0d) * 0.5d), ekzf.e((ekzdVarM.b(dA, dB, dC) + 1.0d) * 0.5d));
    }

    public static ekxp u(ekyj ekyjVar) {
        int iF = ekzf.f(ekyjVar);
        ekzd ekzdVarM = ekzf.m(iF);
        double d = ekyjVar.e;
        double d2 = ekyjVar.f;
        double d3 = ekyjVar.g;
        return s(iF, ekzf.e(ekzf.d(ekzdVarM.a(d, d2, d3))), ekzf.e(ekzf.d(ekzdVarM.b(d, d2, d3))));
    }

    public final boolean B(ekxp ekxpVar) {
        long j = this.d;
        long j2 = ekxpVar.d;
        return J(j2, p(j)) && L(j2, o(j));
    }

    public final boolean C(ekxp ekxpVar) {
        return J(this.d, ekxpVar.d);
    }

    public final boolean D(ekxp ekxpVar) {
        return K(this.d, ekxpVar.d);
    }

    public final boolean E() {
        return F(this.d);
    }

    public final boolean G() {
        return (((int) this.d) & 1) != 0;
    }

    public final boolean H() {
        return b() < 6 && (l() & 1537228672809129301L) != 0;
    }

    public final boolean I(ekxp ekxpVar) {
        return L(this.d, ekxpVar.d);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ekxp ekxpVar) {
        long j = this.d;
        long j2 = ekxpVar.d;
        if (M(j, j2)) {
            return -1;
        }
        return !K(j, j2) ? 0 : 1;
    }

    public final int b() {
        return (int) (this.d >>> 61);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ekxp) && this.d == ((ekxp) obj).d;
    }

    public final int h() {
        if (G()) {
            return 30;
        }
        return 30 - (Long.numberOfTrailingZeros(this.d) >> 1);
    }

    public final int hashCode() {
        long j = this.d;
        return (int) ((j >>> 32) + j);
    }

    public final long j() {
        long jQ = q();
        int iC = c(jQ);
        int iD = d(jQ);
        int i = G() ? 1 : (((((int) this.d) >>> 2) ^ iC) & 1) != 0 ? 2 : 0;
        return (((iC + iC) + i) << 32) | ((iD + iD + i) & 4294967295L);
    }

    @Override // defpackage.ekxz
    public final long k() {
        return this.d;
    }

    public final long l() {
        return Long.lowestOneBit(this.d);
    }

    public final long q() {
        int iB = b() & 1;
        int i = 0;
        int i2 = 7;
        int i3 = 0;
        while (i2 >= 0) {
            int i4 = i2 == 7 ? 2 : 4;
            int i5 = f[iB + ((((1 << (i4 + i4)) - 1) & ((int) (this.d >>> (((i2 + i2) * 4) + 1)))) << 2)];
            int i6 = i2 * 4;
            i += (i5 >> 6) << i6;
            i3 += ((i5 >> 2) & 15) << i6;
            iB = P(i5);
            i2--;
        }
        if ((l() & 1229782938247303440L) != 0) {
            iB ^= 1;
        }
        return (i << 33) | (i3 << 2) | iB;
    }

    public final String toString() {
        long j = this.d & 2305843009213693951L;
        return "(face=" + b() + ", pos=" + Long.toHexString(j) + ", level=" + h() + ")";
    }

    public final ekxp v() {
        long jL = l();
        return new ekxp(this.d + jL + jL);
    }

    public final ekxp w(int i) {
        long jM = m(i);
        return new ekxp(jM | (this.d & (-jM)));
    }

    public final ekxp x() {
        return new ekxp(o(this.d));
    }

    public final ekxp y() {
        return new ekxp(p(this.d));
    }

    public final ekyj z() {
        long j = j();
        return ekzf.h(b(), f(j), (int) j);
    }

    public ekxp() {
        this(0L);
    }
}
