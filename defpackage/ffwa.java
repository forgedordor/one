package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwa {
    public int a;
    public int b;

    public ffwa(byte[] bArr) {
        this.a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        int iB = 2;
        int i3 = bArr[2] & 255;
        int i4 = ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
        this.b = i4;
        if (i4 != 0) {
            int iA = ffwh.a(i4) >>> 1;
            for (int i5 = 0; i5 < iA; i5++) {
                iB = ffwh.b(iB, iB, i4);
                int i6 = iB ^ 2;
                int i7 = i4;
                while (i7 != 0) {
                    int iC = ffwh.c(i6, i7);
                    i6 = i7;
                    i7 = iC;
                }
                if (i6 == 1) {
                }
            }
            this.a = ffwh.a(this.b);
            return;
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public final int a(int i) {
        int i2 = (1 << this.a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = a(i);
            i2 = -i2;
        }
        int iB = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                iB = b(iB, i);
            }
            i = b(i, i);
            i2 >>>= 1;
        }
        return iB;
    }

    public final int b(int i, int i2) {
        return ffwh.b(i, i2, this.b);
    }

    public final boolean c(int i) {
        int i2 = this.a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ffwa)) {
            ffwa ffwaVar = (ffwa) obj;
            if (this.a == ffwaVar.a && this.b == ffwaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String str;
        int i = this.a;
        int i2 = this.b;
        if (i2 == 0) {
            str = "0";
        } else {
            int i3 = i2 & 1;
            int i4 = i2 >>> 1;
            String strF = 1 != i3 ? "" : "1";
            int i5 = 1;
            while (i4 != 0) {
                if ((i4 & 1) == 1) {
                    strF = a.f(i5, strF, "+x^");
                }
                i4 >>>= 1;
                i5++;
            }
            str = strF;
        }
        return "Finite Field GF(2^" + i + ") = GF(2)[X]/<" + str + "> ";
    }
}
