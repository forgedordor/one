package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntz {
    public final ntw a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ntz(ntw ntwVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        mee.a(length == length2);
        int length3 = jArr.length;
        mee.a(length3 == length2);
        int length4 = iArr2.length;
        mee.a(length4 == length2);
        this.a = ntwVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int iAl = mgb.al(this.f, j, false); iAl >= 0; iAl--) {
            if ((this.g[iAl] & 1) != 0) {
                return iAl;
            }
        }
        return -1;
    }

    public final int b(long j) {
        long[] jArr = this.f;
        for (int iAk = mgb.ak(jArr, j, true); iAk < jArr.length; iAk++) {
            if ((this.g[iAk] & 1) != 0) {
                return iAk;
            }
        }
        return -1;
    }
}
