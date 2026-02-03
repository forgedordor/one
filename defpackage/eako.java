package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eako {
    public static String a(List list, boolean z, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strConcat = (String) it.next();
            if (z) {
                strConcat = "places.".concat(String.valueOf(strConcat));
            }
            arrayList.add(strConcat);
        }
        if (!list.contains("attributions")) {
            arrayList.add(true == z ? "places.attributions" : "attributions");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((eakn) it2.next()).toString());
        }
        return new ejwc(",").b(arrayList);
    }

    public static String b(List list, List list2) {
        return a(list, true, list2);
    }
}
