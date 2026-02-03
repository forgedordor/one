package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eona implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final eona b = new eona(new int[0]);
    private final int[] c;
    private final int d;

    public eona(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.d = length;
    }

    public static eona b(int i, int i2) {
        return new eona(new int[]{i, i2});
    }

    public static eona c(int i, int i2, int i3, int i4, int i5) {
        return new eona(new int[]{i, i2, i3, i4, i5});
    }

    public final int a(int i) {
        ejwl.v(i, this.d);
        return this.c[i];
    }

    public final boolean d() {
        return this.d == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eona)) {
            return false;
        }
        eona eonaVar = (eona) obj;
        int i = this.d;
        if (i != eonaVar.d) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2) != eonaVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return d() ? b : this;
    }

    public final String toString() {
        if (d()) {
            return "[]";
        }
        int i = this.d;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.c;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int[] iArr = this.c;
        int i = this.d;
        return i < iArr.length ? new eona(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
