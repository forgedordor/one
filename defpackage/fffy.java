package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffy extends fffd {
    public final transient byte[][] e;
    public final transient int[] f;

    public fffy(byte[][] bArr, int[] iArr) {
        super(fffd.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final fffd n() {
        return new fffd(k());
    }

    private final Object writeReplace() {
        return n();
    }

    @Override // defpackage.fffd
    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        ffes.b(iArr[length - 1], i, 1L);
        int iA = ffgh.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[length + iA]];
    }

    @Override // defpackage.fffd
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.fffd
    public final String d() {
        return n().d();
    }

    @Override // defpackage.fffd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fffd) {
            fffd fffdVar = (fffd) obj;
            return fffdVar.b() == b() && l(fffdVar, b());
        }
        return false;
    }

    @Override // defpackage.fffd
    public final fffd g() {
        return n().g();
    }

    @Override // defpackage.fffd
    public final boolean h(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iA = ffgh.a(this, i);
        while (i < i5) {
            if (iA == 0) {
                iA = 0;
                i4 = 0;
            } else {
                i4 = this.f[iA - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iA] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iA];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!ffes.c(bArr2[iA], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.fffd
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.fffd
    public final byte[] j() {
        return k();
    }

    @Override // defpackage.fffd
    public final byte[] k() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            fcur.i(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.fffd
    public final boolean l(fffd fffdVar, int i) {
        int i2;
        fffdVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int iA = ffgh.a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.f[iA - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[iA] - i2;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!fffdVar.h(i4, bArr[iA], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.fffd
    public final void m(ffez ffezVar, int i) {
        int i2;
        int iA = ffgh.a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.f[iA - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[iA] - i2;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            fffw fffwVar = new fffw(bArr[iA], i6, i6 + iMin, true);
            fffw fffwVar2 = ffezVar.a;
            if (fffwVar2 == null) {
                fffwVar.g = fffwVar;
                fffwVar.f = fffwVar.g;
                ffezVar.a = fffwVar.f;
            } else {
                fffw fffwVar3 = fffwVar2.g;
                fffwVar3.getClass();
                fffwVar3.d(fffwVar);
            }
            i3 += iMin;
            iA++;
        }
        ffezVar.b += i;
    }

    @Override // defpackage.fffd
    public final String toString() {
        return n().toString();
    }
}
