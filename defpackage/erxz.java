package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxz {
    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue < 0) {
                throw new IllegalArgumentException("Encountered negative delta");
            }
            i = i + iIntValue + 1;
            if (i < 0) {
                throw new IllegalArgumentException("Encountered integer overflow");
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
