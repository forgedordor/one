package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nng implements noq {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public nng(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        long[] jArr = this.e;
        int iAl = mgb.al(jArr, j, true);
        long j2 = jArr[iAl];
        long[] jArr2 = this.c;
        nor norVar = new nor(j2, jArr2[iAl]);
        if (norVar.b >= j || iAl == this.a - 1) {
            return new noo(norVar, norVar);
        }
        int i = iAl + 1;
        return new noo(norVar, new nor(jArr[i], jArr2[i]));
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // defpackage.noq
    public final long w() {
        return this.f;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
