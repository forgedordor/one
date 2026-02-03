package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcvt {
    public static final Map a(fcvr fcvrVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = fcvrVar.b();
        while (itB.hasNext()) {
            Object objA = fcvrVar.a(itB.next());
            Object fdcgVar = linkedHashMap.get(objA);
            if (fdcgVar == null && !linkedHashMap.containsKey(objA)) {
                fdcgVar = new fdcg();
            }
            fdcg fdcgVar2 = (fdcg) fdcgVar;
            fdcgVar2.a++;
            linkedHashMap.put(objA, fdcgVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof fdcn) && !(entry instanceof fdcq)) {
                fdcm.a(entry, "kotlin.collections.MutableMap.MutableEntry");
            }
            entry.setValue(Integer.valueOf(((fdcg) entry.getValue()).a));
        }
        fdcm.g(linkedHashMap);
        return linkedHashMap;
    }
}
