package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwx {
    public static final int a(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String b(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void c(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static final void d(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            c(objArr, i);
            i++;
        }
    }

    public static final boolean e(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!fdbq.f(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final Object[] f(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] g(Object[] objArr, int i) {
        objArr.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }
}
