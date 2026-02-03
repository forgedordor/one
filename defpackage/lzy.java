package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzy {
    public final long a;
    public final int b;

    @Deprecated
    public final Uri[] c;
    public final mbo[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final long h;
    public final boolean i;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
        mgb.O(8);
        mgb.O(9);
        mgb.O(10);
    }

    public lzy(int i, int[] iArr, mbo[] mboVarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = mboVarArr.length;
        int i2 = 0;
        mee.a(length == length2);
        this.a = 0L;
        this.b = i;
        this.e = iArr;
        this.d = mboVarArr;
        this.f = jArr;
        this.h = 0L;
        this.i = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i2 >= uriArr.length) {
                this.g = strArr;
                return;
            }
            mbo mboVar = mboVarArr[i2];
            if (mboVar == null) {
                uri = null;
            } else {
                mbl mblVar = mboVar.b;
                mee.f(mblVar);
                uri = mblVar.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean c() {
        return this.b == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lzy lzyVar = (lzy) obj;
            if (this.b == lzyVar.b && Arrays.equals(this.d, lzyVar.d) && Arrays.equals(this.e, lzyVar.e) && Arrays.equals(this.f, lzyVar.f) && Arrays.equals(this.g, lzyVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 29791) + Arrays.hashCode(this.g)) * 31;
    }
}
