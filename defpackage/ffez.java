package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffez implements Cloneable, ByteChannel, fffb, fffa {
    public fffw a;
    public long b;

    public final short A() throws EOFException {
        short sZ = z();
        int i = sZ >>> 8;
        return (short) (((sZ & 255) << 8) | (i & 255));
    }

    public final void B() throws EOFException {
        D(this.b);
    }

    @Override // defpackage.fffb
    public final void C(long j) {
        throw null;
    }

    @Override // defpackage.fffb
    public final void D(long j) throws EOFException {
        while (j > 0) {
            fffw fffwVar = this.a;
            if (fffwVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, fffwVar.c - fffwVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = fffwVar.b + iMin;
            fffwVar.b = i;
            if (i == fffwVar.c) {
                this.a = fffwVar.a();
                fffx.b(fffwVar);
            }
        }
    }

    @Override // defpackage.fffb
    public final boolean E() {
        return this.b == 0;
    }

    @Override // defpackage.fffb
    public final boolean F(long j) {
        throw null;
    }

    @Override // defpackage.fffb
    public final byte[] G() {
        return H(this.b);
    }

    @Override // defpackage.fffb
    public final byte[] H(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.u(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void I(ffez ffezVar, long j, long j2) {
        long j3 = j;
        ffes.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        ffezVar.b += j2;
        fffw fffwVar = this.a;
        while (true) {
            fffwVar.getClass();
            long j4 = fffwVar.c - fffwVar.b;
            if (j3 < j4) {
                break;
            }
            fffwVar = fffwVar.f;
            j3 -= j4;
        }
        fffw fffwVar2 = fffwVar;
        long j5 = j2;
        while (j5 > 0) {
            fffwVar2.getClass();
            fffw fffwVarB = fffwVar2.b();
            int i = fffwVarB.b + ((int) j3);
            fffwVarB.b = i;
            fffwVarB.c = Math.min(i + ((int) j5), fffwVarB.c);
            fffw fffwVar3 = ffezVar.a;
            if (fffwVar3 == null) {
                fffwVarB.g = fffwVarB;
                fffwVarB.f = fffwVarB.g;
                ffezVar.a = fffwVarB.f;
            } else {
                fffw fffwVar4 = fffwVar3.g;
                fffwVar4.getClass();
                fffwVar4.d(fffwVarB);
            }
            j5 -= fffwVarB.c - fffwVarB.b;
            fffwVar2 = fffwVar2.f;
            j3 = 0;
        }
    }

    @Override // defpackage.fffb
    public final void J(fffz fffzVar) {
        long j = this.b;
        if (j > 0) {
            fffzVar.hO(this, j);
        }
    }

    @Override // defpackage.fffa
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void L(fffd fffdVar) {
        fffdVar.m(this, fffdVar.b());
    }

    @Override // defpackage.fffa
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void N(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ffes.b(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            fffw fffwVarY = y(1);
            int i5 = 8192 - fffwVarY.c;
            byte[] bArr2 = fffwVarY.a;
            int iMin = Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            fcur.i(bArr, bArr2, fffwVarY.c, i3, i6);
            fffwVarY.c += iMin;
            i3 = i6;
        }
    }

    public final void O(ffgb ffgbVar) {
        while (ffgbVar.b(this, 8192L) != -1) {
        }
    }

    public final void P(int i) {
        fffw fffwVarY = y(1);
        byte[] bArr = fffwVarY.a;
        int i2 = fffwVarY.c;
        fffwVarY.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.fffa
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    public final void R(int i) {
        fffw fffwVarY = y(4);
        byte[] bArr = fffwVarY.a;
        int i2 = fffwVarY.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        fffwVarY.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.fffa
    public final /* bridge */ /* synthetic */ void S(int i) {
        throw null;
    }

    @Override // defpackage.fffa
    public final /* bridge */ /* synthetic */ void T(int i) {
        throw null;
    }

    public final void U(OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        ffes.b(this.b, 0L, j);
        fffw fffwVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            fffwVar.getClass();
            int iMin = (int) Math.min(j2, fffwVar.c - fffwVar.b);
            outputStream.write(fffwVar.a, fffwVar.b, iMin);
            int i = fffwVar.b + iMin;
            fffwVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == fffwVar.c) {
                fffw fffwVarA = fffwVar.a();
                this.a = fffwVarA;
                fffx.b(fffwVar);
                fffwVar = fffwVarA;
            }
        }
    }

    public final void V(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.s(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                fffw fffwVarY = y(1);
                byte[] bArr = fffwVarY.a;
                int i4 = fffwVarY.c - i;
                int iMin = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = fffwVarY.c;
                int i6 = (i4 + i) - i5;
                fffwVarY.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt < 2048) {
                    fffw fffwVarY2 = y(2);
                    byte[] bArr2 = fffwVarY2.a;
                    int i7 = fffwVarY2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    fffwVarY2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    fffw fffwVarY3 = y(3);
                    byte[] bArr3 = fffwVarY3.a;
                    int i8 = fffwVarY3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    fffwVarY3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        P(63);
                    } else {
                        fffw fffwVarY4 = y(4);
                        byte[] bArr4 = fffwVarY4.a;
                        int i9 = fffwVarY4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        fffwVarY4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void W(int i) {
        if (i < 128) {
            P(i);
            return;
        }
        if (i < 2048) {
            fffw fffwVarY = y(2);
            byte[] bArr = fffwVarY.a;
            int i2 = fffwVarY.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            fffwVarY.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            P(63);
            return;
        }
        if (i < 65536) {
            fffw fffwVarY2 = y(3);
            byte[] bArr2 = fffwVarY2.a;
            int i3 = fffwVarY2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            fffwVarY2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(ffes.a(i)));
        }
        fffw fffwVarY3 = y(4);
        byte[] bArr3 = fffwVarY3.a;
        int i4 = fffwVarY3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        fffwVarY3.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.fffa
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void aa(byte[] bArr) {
        bArr.getClass();
        N(bArr, 0, bArr.length);
    }

    public final void Y(long j) {
        if (j == 0) {
            P(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        fffw fffwVarY = y(i);
        byte[] bArr = fffwVarY.a;
        int i2 = fffwVarY.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                fffwVarY.c += i;
                this.b += i;
                return;
            } else {
                bArr[i3] = ffgf.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    @Override // defpackage.fffa
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void ac(String str) {
        str.getClass();
        V(str, 0, str.length());
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return ffgd.j;
    }

    public final void ab(long j) {
        boolean z;
        if (j == 0) {
            P(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                ac("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = ffgf.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > ffgf.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        fffw fffwVarY = y(i);
        byte[] bArr2 = fffwVarY.a;
        int i2 = fffwVarY.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = ffgf.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        fffwVarY.c += i;
        this.b += i;
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.u(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        ffezVar.hO(this, j);
        return j;
    }

    public final byte c(long j) {
        ffes.b(this.b, j, 1L);
        fffw fffwVar = this.a;
        fffwVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                fffwVar = fffwVar.g;
                fffwVar.getClass();
                j2 -= fffwVar.c - fffwVar.b;
            }
            fffwVar.getClass();
            return fffwVar.a[(int) ((fffwVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = fffwVar.c;
            int i2 = fffwVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                fffwVar.getClass();
                return fffwVar.a[(int) ((i2 + j) - j3)];
            }
            fffwVar = fffwVar.f;
            fffwVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        ffez ffezVar = new ffez();
        if (this.b == 0) {
            return ffezVar;
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        fffw fffwVarB = fffwVar.b();
        ffezVar.a = fffwVarB;
        fffwVarB.g = fffwVarB;
        fffwVarB.f = fffwVarB.g;
        for (fffw fffwVar2 = fffwVar.f; fffwVar2 != fffwVar; fffwVar2 = fffwVar2.f) {
            fffw fffwVar3 = fffwVarB.g;
            fffwVar3.getClass();
            fffwVar2.getClass();
            fffwVar3.d(fffwVar2.b());
        }
        ffezVar.b = this.b;
        return ffezVar;
    }

    @Override // defpackage.fffb
    public final byte d() {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        int i = fffwVar.b;
        int i2 = i + 1;
        byte[] bArr = fffwVar.a;
        int i3 = fffwVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            fffwVar.b = i2;
            return b;
        }
        this.a = fffwVar.a();
        fffx.b(fffwVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ffes.b(bArr.length, i, i2);
        fffw fffwVar = this.a;
        if (fffwVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, fffwVar.c - fffwVar.b);
        int i3 = fffwVar.b;
        fcur.i(fffwVar.a, bArr, i, i3, i3 + iMin);
        int i4 = fffwVar.b + iMin;
        fffwVar.b = i4;
        this.b -= iMin;
        if (i4 != fffwVar.c) {
            return iMin;
        }
        this.a = fffwVar.a();
        fffx.b(fffwVar);
        return iMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffez)) {
            return false;
        }
        long j = this.b;
        ffez ffezVar = (ffez) obj;
        if (j != ffezVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        fffw fffwVar2 = ffezVar.a;
        fffwVar2.getClass();
        int i = fffwVar.b;
        int i2 = fffwVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(fffwVar.c - i, fffwVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (fffwVar.a[i] != fffwVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == fffwVar.c) {
                fffwVar = fffwVar.f;
                fffwVar.getClass();
                i = fffwVar.b;
            }
            if (i2 == fffwVar2.c) {
                fffwVar2 = fffwVar2.f;
                fffwVar2.getClass();
                i2 = fffwVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.fffb
    public final int f() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        int i = fffwVar.b;
        int i2 = fffwVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = fffwVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            fffwVar.b = i8;
            return i7;
        }
        this.a = fffwVar.a();
        fffx.b(fffwVar);
        return i7;
    }

    @Override // defpackage.fffb
    public final int g(fffn fffnVar) throws EOFException {
        fffnVar.getClass();
        int iA = ffgf.a(this, fffnVar, false);
        if (iA == -1) {
            return -1;
        }
        D(fffnVar.b[iA].b());
        return iA;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        fffw fffwVar2 = fffwVar.g;
        fffwVar2.getClass();
        return (fffwVar2.c >= 8192 || !fffwVar2.e) ? j : j - (r3 - fffwVar2.b);
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        fffw fffwVarB;
        ffezVar.getClass();
        if (ffezVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        ffes.b(ffezVar.b, 0L, j);
        while (j > 0) {
            fffw fffwVar = ffezVar.a;
            fffwVar.getClass();
            int i = fffwVar.c;
            fffwVar.getClass();
            int i2 = i - fffwVar.b;
            int i3 = 0;
            if (j < i2) {
                fffw fffwVar2 = this.a;
                fffw fffwVar3 = fffwVar2 != null ? fffwVar2.g : null;
                int i4 = (int) j;
                if (fffwVar3 != null && fffwVar3.e) {
                    if ((fffwVar3.c + j) - (fffwVar3.d ? 0 : fffwVar3.b) <= 8192) {
                        fffwVar.getClass();
                        fffwVar.c(fffwVar3, i4);
                        ffezVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                fffwVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    fffwVarB = fffwVar.b();
                } else {
                    byte[] bArr = fffwVar.a;
                    fffw fffwVarA = fffx.a();
                    byte[] bArr2 = fffwVarA.a;
                    int i5 = fffwVar.b;
                    fcur.i(bArr, bArr2, 0, i5, i5 + i4);
                    fffwVarB = fffwVarA;
                }
                fffwVarB.c = fffwVarB.b + i4;
                fffwVar.b += i4;
                fffw fffwVar4 = fffwVar.g;
                fffwVar4.getClass();
                fffwVar4.d(fffwVarB);
                ffezVar.a = fffwVarB;
            }
            fffw fffwVar5 = ffezVar.a;
            fffwVar5.getClass();
            int i6 = fffwVar5.c - fffwVar5.b;
            ffezVar.a = fffwVar5.a();
            fffw fffwVar6 = this.a;
            if (fffwVar6 == null) {
                this.a = fffwVar5;
                fffwVar5.g = fffwVar5;
                fffwVar5.f = fffwVar5.g;
            } else {
                fffw fffwVar7 = fffwVar6.g;
                fffwVar7.getClass();
                fffwVar7.d(fffwVar5);
                fffw fffwVar8 = fffwVar5.g;
                if (fffwVar8 == fffwVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                fffwVar8.getClass();
                if (fffwVar8.e) {
                    int i7 = fffwVar5.c - fffwVar5.b;
                    fffwVar8.getClass();
                    int i8 = 8192 - fffwVar8.c;
                    fffwVar8.getClass();
                    if (!fffwVar8.d) {
                        fffwVar8.getClass();
                        i3 = fffwVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        fffwVar8.getClass();
                        fffwVar5.c(fffwVar8, i7);
                        fffwVar5.a();
                        fffx.b(fffwVar5);
                    }
                }
            }
            long j2 = i6;
            ffezVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final int hashCode() {
        fffw fffwVar = this.a;
        if (fffwVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fffwVar.c;
            for (int i3 = fffwVar.b; i3 < i2; i3++) {
                i = (i * 31) + fffwVar.a[i3];
            }
            fffwVar = fffwVar.f;
            fffwVar.getClass();
        } while (fffwVar != this.a);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        fffw fffwVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (fffwVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                fffwVar = fffwVar.g;
                fffwVar.getClass();
                j6 -= fffwVar.c - fffwVar.b;
            }
            if (fffwVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = fffwVar.a;
                long j8 = j7;
                int iMin = (int) Math.min(fffwVar.c, (fffwVar.b + j4) - j6);
                for (int i = (int) ((fffwVar.b + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return (i - fffwVar.b) + j6;
                    }
                }
                j6 += fffwVar.c - fffwVar.b;
                fffwVar = fffwVar.f;
                fffwVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (fffwVar.c - fffwVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            fffwVar = fffwVar.f;
            fffwVar.getClass();
            j5 = j9;
        }
        if (fffwVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = fffwVar.a;
            int iMin2 = (int) Math.min(fffwVar.c, (fffwVar.b + j4) - j5);
            for (int i2 = (int) ((fffwVar.b + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - fffwVar.b) + j5;
                }
            }
            j5 += fffwVar.c - fffwVar.b;
            fffwVar = fffwVar.f;
            fffwVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.fffb
    public final long j(fffd fffdVar) {
        throw null;
    }

    @Override // defpackage.fffb
    public final InputStream k() {
        return new ffex(this);
    }

    @Override // defpackage.fffb
    public final String l(Charset charset) {
        return m(this.b, charset);
    }

    public final String m(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.u(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        int i = fffwVar.b;
        int i2 = fffwVar.c;
        if (i + j > i2) {
            return new String(H(j), charset);
        }
        int i3 = (int) j;
        String str = new String(fffwVar.a, i, i3, charset);
        int i4 = i + i3;
        fffwVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = fffwVar.a();
            fffx.b(fffwVar);
        }
        return str;
    }

    public final String n() {
        return m(this.b, fdfy.a);
    }

    public final String o(long j) {
        return m(j, fdfy.a);
    }

    @Override // defpackage.fffb
    public final String p() {
        throw null;
    }

    @Override // defpackage.fffb
    public final String q(long j) {
        throw null;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fffw fffwVar = this.a;
        if (fffwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fffwVar.c - fffwVar.b);
        byteBuffer.put(fffwVar.a, fffwVar.b, iMin);
        int i = fffwVar.b + iMin;
        fffwVar.b = i;
        this.b -= iMin;
        if (i == fffwVar.c) {
            this.a = fffwVar.a();
            fffx.b(fffwVar);
        }
        return iMin;
    }

    @Override // defpackage.fffa
    public final /* bridge */ /* synthetic */ fffa t(long j) {
        ab(j);
        return this;
    }

    public final String toString() {
        return w().toString();
    }

    public final fffd u() {
        return v(this.b);
    }

    @Override // defpackage.fffb
    public final fffd v(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.u(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new fffd(H(j));
        }
        fffd fffdVarX = x((int) j);
        D(j);
        return fffdVarX;
    }

    public final fffd w() {
        long j = this.b;
        if (j <= 2147483647L) {
            return x((int) j);
        }
        throw new IllegalStateException(a.u(j, "size > Int.MAX_VALUE: "));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            fffw fffwVarY = y(1);
            int i2 = 8192 - fffwVarY.c;
            byte[] bArr = fffwVarY.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, fffwVarY.c, iMin);
            i -= iMin;
            fffwVarY.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    public final fffd x(int i) {
        if (i == 0) {
            return fffd.a;
        }
        ffes.b(this.b, 0L, i);
        fffw fffwVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            fffwVar.getClass();
            int i5 = fffwVar.c;
            int i6 = fffwVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            fffwVar = fffwVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        fffw fffwVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            fffwVar2.getClass();
            bArr[i7] = fffwVar2.a;
            i2 += fffwVar2.c - fffwVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = fffwVar2.b;
            fffwVar2.d = true;
            i7++;
            fffwVar2 = fffwVar2.f;
        }
        return new fffy(bArr, iArr);
    }

    public final fffw y(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        fffw fffwVar = this.a;
        if (fffwVar == null) {
            fffw fffwVarA = fffx.a();
            this.a = fffwVarA;
            fffwVarA.g = fffwVarA;
            fffwVarA.f = fffwVarA;
            return fffwVarA;
        }
        fffw fffwVar2 = fffwVar.g;
        fffwVar2.getClass();
        if (fffwVar2.c + i <= 8192 && fffwVar2.e) {
            return fffwVar2;
        }
        fffw fffwVarA2 = fffx.a();
        fffwVar2.d(fffwVarA2);
        return fffwVarA2;
    }

    @Override // defpackage.fffb
    public final short z() throws EOFException {
        int iD;
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        fffw fffwVar = this.a;
        fffwVar.getClass();
        int i = fffwVar.b;
        int i2 = fffwVar.c;
        if (i2 - i < 2) {
            iD = ((d() & 255) << 8) | (d() & 255);
        } else {
            byte[] bArr = fffwVar.a;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.b = j - 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.a = fffwVar.a();
                fffx.b(fffwVar);
            } else {
                fffwVar.b = i5;
            }
            iD = i3 | i4;
        }
        return (short) iD;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ffgb
    public final void close() {
    }

    @Override // defpackage.fffa, defpackage.fffz, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fffa
    public final ffez r() {
        return this;
    }

    @Override // defpackage.fffa
    public final ffez s() {
        return this;
    }
}
