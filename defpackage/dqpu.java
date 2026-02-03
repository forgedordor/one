package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpu {
    protected final Map a = new HashMap();

    private static List d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (true) {
            int iIndexOf = str.indexOf(str2, length);
            if (iIndexOf < 0) {
                break;
            }
            arrayList.add(str.substring(length, iIndexOf));
            length = str2.length() + iIndexOf;
        }
        if (length != 0) {
            str = str.substring(length);
        }
        arrayList.add(str);
        return arrayList;
    }

    public final void a(String str, String str2) {
        Map map = this.a;
        if (!map.containsKey(str)) {
            map.put(str, new HashSet());
        }
        ((Set) map.get(str)).add(str2);
    }

    public final void b(String str, String str2) {
        List listD = d(str, " AS ");
        if (listD.size() > 1) {
            str = (String) listD.get(listD.size() - 1);
        }
        List listD2 = d(str, ".");
        int size = listD2.size();
        if (size != 1) {
            if (size != 2) {
                throw new IllegalArgumentException(a.n(str, str2, "invalid column reference: ", "."));
            }
            a((String) listD2.get(0), (String) listD2.get(1));
        } else {
            if (str2 == null) {
                throw new IllegalStateException("found unqualified column reference: ".concat(String.valueOf(str)));
            }
            a(str2, (String) listD2.get(0));
        }
    }

    public final boolean c(String str, String[] strArr) {
        Set set = (Set) this.a.get(str);
        if (set == null) {
            return false;
        }
        return strArr == null || !Collections.disjoint(set, Arrays.asList(strArr));
    }
}
