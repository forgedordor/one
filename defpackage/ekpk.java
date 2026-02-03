package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpk {
    static int a(int i, Comparator comparator, Object obj, List list, int i2) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return a(2, comparator, obj, list, i2) + 1;
                }
                int i4 = 0;
                while (i4 < i2) {
                    int i5 = (i4 + i2) >>> 1;
                    if (comparator.compare(list.get(i5), obj) < 0) {
                        i4 = i5 + 1;
                    } else {
                        i2 = i5;
                    }
                }
                return i4;
            }
            int size = list.size() - 1;
            while (i2 < size) {
                int i6 = ((i2 + size) + 1) >>> 1;
                if (comparator.compare(list.get(i6), obj) > 0) {
                    size = i6 - 1;
                } else {
                    i2 = i6;
                }
            }
        }
        return i2;
    }
}
