package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doof {
    public static final Map a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            eahz eahzVar = ((eaib) obj).b;
            if (eahzVar == null) {
                eahzVar = eahz.a;
            }
            String str = eahzVar.c;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).size() != 1) {
                Object key2 = entry.getKey();
                Objects.toString(key2);
                throw new IllegalStateException("Illegal duplicated upload failure for ".concat(String.valueOf(key2)));
            }
            eaid eaidVarB = eaid.b(((eaib) fcva.N((List) entry.getValue())).c);
            if (eaidVarB == null) {
                eaidVarB = eaid.UNRECOGNIZED;
            }
            linkedHashMap2.put(key, eaidVarB);
        }
        return linkedHashMap2;
    }
}
