package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvz extends ffwe {
    private int[][] c;
    private int d;

    public ffvz(int i, int[][] iArr) {
        int length = iArr[0].length;
        if (length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.b = i;
        this.a = iArr.length;
        this.d = length;
        int i2 = (i & 31) == 0 ? -1 : (1 << r6) - 1;
        for (int i3 = 0; i3 < this.a; i3++) {
            int[] iArr2 = iArr[i3];
            int i4 = this.d - 1;
            iArr2[i4] = iArr2[i4] & i2;
        }
        this.c = iArr;
    }

    public final byte[] a() {
        int i = (this.b + 7) >>> 3;
        int i2 = this.a;
        int i3 = 8;
        byte[] bArr = new byte[(i * i2) + 8];
        ffwd.b(i2, bArr, 0);
        ffwd.b(this.b, bArr, 4);
        int i4 = this.b;
        int i5 = i4 >>> 5;
        int i6 = i4 & 31;
        for (int i7 = 0; i7 < this.a; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                ffwd.b(this.c[i7][i8], bArr, i3);
                i3 += 4;
            }
            int i9 = 0;
            while (i9 < i6) {
                bArr[i3] = (byte) ((this.c[i7][i5] >>> i9) & 255);
                i9 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffvz)) {
            return false;
        }
        ffvz ffvzVar = (ffvz) obj;
        if (this.a != ffvzVar.a || this.b != ffvzVar.b || this.d != ffvzVar.d) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!ffwb.a(this.c[i], ffvzVar.c[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iB = (((this.a * 31) + this.b) * 31) + this.d;
        for (int i = 0; i < this.a; i++) {
            iB = (iB * 31) + ffwk.b(this.c[i]);
        }
        return iB;
    }

    public final String toString() {
        int i = this.b & 31;
        int i2 = i == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(a.D(i3, ": "));
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public ffvz(ffvz ffvzVar) {
        this.b = ffvzVar.b;
        this.a = ffvzVar.a;
        this.d = ffvzVar.d;
        this.c = new int[ffvzVar.c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = ffwb.b(ffvzVar.c[i]);
            i++;
        }
    }

    public ffvz(byte[] bArr) {
        int length = bArr.length;
        if (length >= 9) {
            this.a = ffwd.a(bArr, 0);
            int iA = ffwd.a(bArr, 4);
            this.b = iA;
            int i = this.a;
            int i2 = ((iA + 7) >>> 3) * i;
            if (i > 0 && i2 == length - 8) {
                int i3 = (iA + 31) >>> 5;
                this.d = i3;
                this.c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i3);
                int i4 = iA >> 5;
                int i5 = iA & 31;
                int i6 = 8;
                for (int i7 = 0; i7 < this.a; i7++) {
                    for (int i8 = 0; i8 < i4; i8++) {
                        this.c[i7][i8] = ffwd.a(bArr, i6);
                        i6 += 4;
                    }
                    int i9 = 0;
                    while (i9 < i5) {
                        int[] iArr = this.c[i7];
                        iArr[i4] = ((bArr[i6] & 255) << i9) ^ iArr[i4];
                        i9 += 8;
                        i6++;
                    }
                }
                return;
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
