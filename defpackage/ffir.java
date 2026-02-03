package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffir extends ffio implements ffil {
    static final int[] d = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final int[] m = new int[64];
    private int n;

    public ffir() {
        ffix.a(this);
        ffij.b();
        h();
    }

    private static int i(int i, int i2, int i3) {
        return (i & i2) ^ ((~i) & i3);
    }

    private static int j(int i, int i2, int i3) {
        return (i & i2) | (i3 & (i ^ i2));
    }

    private static int k(int i) {
        return (((i << 30) | (i >>> 2)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    private static int l(int i) {
        return (((i << 26) | (i >>> 6)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    @Override // defpackage.ffil
    public final int a(byte[] bArr, int i) {
        long j = this.c << 3;
        d((byte) -128);
        while (this.b != 0) {
            d((byte) 0);
        }
        if (this.n > 14) {
            f();
        }
        int[] iArr = this.m;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        f();
        ffwp.e(this.e, bArr, i);
        ffwp.e(this.f, bArr, i + 4);
        ffwp.e(this.g, bArr, i + 8);
        ffwp.e(this.h, bArr, i + 12);
        ffwp.e(this.i, bArr, i + 16);
        ffwp.e(this.j, bArr, i + 20);
        ffwp.e(this.k, bArr, i + 24);
        ffwp.e(this.l, bArr, i + 28);
        h();
        return 32;
    }

    @Override // defpackage.ffil
    public final int b() {
        return 32;
    }

    @Override // defpackage.ffil
    public final String c() {
        return "SHA-256";
    }

    @Override // defpackage.ffio
    protected final void f() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.m;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int iK = this.e;
        int iK2 = this.f;
        int iK3 = this.g;
        int iK4 = this.h;
        int i5 = this.i;
        int i6 = this.j;
        int i7 = this.k;
        int i8 = this.l;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 8) {
            int iL = l(i5);
            int i11 = i(i5, i6, i7);
            int[] iArr2 = d;
            int i12 = iL + i11 + iArr2[i10];
            int[] iArr3 = this.m;
            int i13 = i8 + i12 + iArr3[i10];
            int i14 = iK4 + i13;
            int iK5 = k(iK);
            int iJ = j(iK, iK2, iK3);
            int i15 = i10 + 1;
            int iL2 = i7 + l(i14) + i(i14, i5, i6) + iArr2[i15] + iArr3[i15];
            int i16 = iK3 + iL2;
            int i17 = i13 + iK5 + iJ;
            int iJ2 = j(i17, iK, iK2);
            int i18 = i10 + 2;
            int iL3 = i6 + l(i16) + i(i16, i14, i5) + iArr2[i18] + iArr3[i18];
            int i19 = iK2 + iL3;
            int iK6 = iL2 + k(i17) + iJ2;
            int iJ3 = j(iK6, i17, iK);
            int i20 = i10 + 3;
            int iL4 = i5 + l(i19) + i(i19, i16, i14) + iArr2[i20] + iArr3[i20];
            int i21 = iK + iL4;
            int i22 = i10 + 4;
            int iL5 = l(i21) + i(i21, i19, i16) + iArr2[i22] + iArr3[i22];
            int i23 = i10 + 5;
            int i24 = i14 + iL5;
            int i25 = i17 + i24;
            int iL6 = l(i25) + i(i25, i21, i19) + iArr2[i23] + iArr3[i23];
            int i26 = i10 + 6;
            int i27 = i16 + iL6;
            int i28 = iK6 + i27;
            int iL7 = l(i28) + i(i28, i25, i21) + iArr2[i26] + iArr3[i26];
            int i29 = i10 + 7;
            int i30 = iArr2[i29];
            int iK7 = iL3 + k(iK6) + iJ3;
            int i31 = i19 + iL7;
            int i32 = iK7 + i31;
            int iL8 = l(i32) + i(i32, i28, i25) + i30 + iArr3[i29];
            i10 += 8;
            int iK8 = iL4 + k(iK7) + j(iK7, iK6, i17);
            iK4 = i24 + k(iK8) + j(iK8, iK7, iK6);
            iK3 = i27 + k(iK4) + j(iK4, iK8, iK7);
            int i33 = i21 + iL8;
            iK2 = i31 + k(iK3) + j(iK3, iK4, iK8);
            i5 = iK8 + i33;
            i9++;
            i7 = i28;
            iK = k(iK2) + j(iK2, iK3, iK4) + i33;
            i8 = i25;
            i6 = i32;
        }
        this.e += iK;
        this.f += iK2;
        this.g += iK3;
        this.h += iK4;
        this.i += i5;
        this.j += i6;
        this.k += i7;
        this.l += i8;
        this.n = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            this.m[i34] = 0;
        }
    }

    @Override // defpackage.ffio
    protected final void g(byte[] bArr, int i) {
        this.m[this.n] = ffwp.a(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            f();
        }
    }

    public final void h() {
        this.c = 0L;
        this.b = 0;
        for (int i = 0; i < 4; i++) {
            this.a[i] = 0;
        }
        this.e = 1779033703;
        this.f = -1150833019;
        this.g = 1013904242;
        this.h = -1521486534;
        this.i = 1359893119;
        this.j = -1694144372;
        this.k = 528734635;
        this.l = 1541459225;
        this.n = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.m;
            if (i2 == 64) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }
}
