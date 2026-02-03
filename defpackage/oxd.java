package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxd {
    public static final oxd a = new oxd(0, fcvo.a);
    public final int[] b;
    public final List c;
    public final int d;
    public final List e;

    public oxd(int i, List list) {
        this(new int[]{i}, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oxd oxdVar = (oxd) obj;
        return Arrays.equals(this.b, oxdVar.b) && fdbq.f(this.c, oxdVar.c) && this.d == oxdVar.d && fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.b) + ", data=" + this.c + ", hintOriginalPageOffset=" + this.d + ", hintOriginalIndices=null)";
    }

    public oxd(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.b = iArr;
        this.c = list;
        this.d = i;
        this.e = null;
    }
}
