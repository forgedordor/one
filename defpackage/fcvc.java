package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcvc extends fcvb {
    public static final int e(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final ArrayList f(Object... objArr) {
        return new ArrayList(new fcup(objArr, true));
    }

    public static final List g(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? fcur.c(objArr) : fcvo.a;
    }

    public static final List h(Object obj) {
        return obj != null ? fcva.b(obj) : fcvo.a;
    }

    public static final List i(Object... objArr) {
        return new ArrayList(new fcup(objArr, true));
    }

    public static final List j(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : fcva.b(list.get(0)) : fcvo.a;
    }

    public static final fddq k(Collection collection) {
        return new fddq(0, collection.size() - 1);
    }

    public static final void l() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final int n(List list, int i, fdap fdapVar) {
        p(list.size(), i);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iIntValue = ((Number) fdapVar.invoke(list.get(i4))).intValue();
            if (iIntValue < 0) {
                i3 = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static /* synthetic */ int o(List list, Comparable comparable) {
        int size = list.size();
        p(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iA = fcxl.a((Comparable) list.get(i3), comparable);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private static final void p(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(a.z(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
