package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpl {
    public static int a(List list, ejvr ejvrVar, Comparable comparable, int i, int i2) {
        return b(list, ejvrVar, comparable, ekno.a, i, i2);
    }

    public static int b(List list, ejvr ejvrVar, Object obj, Comparator comparator, int i, int i2) {
        List listG = ekjz.g(list, ejvrVar);
        if (!(listG instanceof RandomAccess)) {
            listG = new ArrayList(listG);
        }
        int size = listG.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iCompare = comparator.compare(obj, listG.get(i4));
            if (iCompare < 0) {
                size = i4 - 1;
            } else {
                if (iCompare <= 0) {
                    return i3 + ekpk.a(i, comparator, obj, listG.subList(i3, size + 1), i4 - i3);
                }
                i3 = i4 + 1;
            }
        }
        return i2 + (-1) != 0 ? i3 : i3 - 1;
    }
}
