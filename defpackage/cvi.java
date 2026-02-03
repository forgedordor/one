package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvi {
    public static final Object[] a = new Object[0];
    public static final cvh b = new cuu(0);

    public static final cuu a(Object obj, Object obj2) {
        cuu cuuVar = new cuu(2);
        cuuVar.h(obj);
        cuuVar.h(obj2);
        return cuuVar;
    }

    public static final void b(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            cwh.c(a.z(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void c(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            cwh.a(a.z(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            cwh.c(a.e(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            cwh.c("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
