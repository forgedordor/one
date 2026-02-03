package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbt {
    public final mbs[] a;
    public final long b;

    public mbt(long j, mbs... mbsVarArr) {
        this.b = j;
        this.a = mbsVarArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final mbs b(int i) {
        return this.a[i];
    }

    public final mbt c(mbs... mbsVarArr) {
        int length = mbsVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        mbs[] mbsVarArr2 = this.a;
        String str = mgb.a;
        int length2 = mbsVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(mbsVarArr2, length2 + length);
        System.arraycopy(mbsVarArr, 0, objArrCopyOf, length2, length);
        return new mbt(j, (mbs[]) objArrCopyOf);
    }

    public final mbt d(mbt mbtVar) {
        return mbtVar == null ? this : c(mbtVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mbt mbtVar = (mbt) obj;
            if (Arrays.equals(this.a, mbtVar.a) && this.b == mbtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + eone.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "entries=" + Arrays.toString(this.a) + (j == -9223372036854775807L ? "" : a.u(j, ", presentationTimeUs="));
    }

    public mbt(List list) {
        this((mbs[]) list.toArray(new mbs[0]));
    }

    public mbt(mbs... mbsVarArr) {
        this(-9223372036854775807L, mbsVarArr);
    }
}
