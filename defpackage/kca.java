package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kca {
    public final List a;

    public kca(kbz... kbzVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kbz kbzVar : kbzVarArr) {
            String str = kbzVar.a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(kbzVar);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException("'" + str2 + "' must be unique. Actual [ [" + fcva.aF(list, null, null, null, null, 63) + ']');
            }
            fcva.y(arrayList2, list);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.a = arrayList3;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kca) && fdbq.f(this.a, ((kca) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
