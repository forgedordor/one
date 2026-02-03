package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cup extends ctx {
    public int e;

    public cup() {
        this(6);
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c() {
        this.e = cvp.a(this.c) - this.d;
    }

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, cvp.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = cvp.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            fcur.t(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        long[] jArr2 = this.a;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr2[i2] = (jArr2[i2] & (~j)) | j;
        c();
        this.b = new long[iMax];
    }

    public cup(int i) {
        d(cvp.d(i));
    }
}
