package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class escq {
    static void a(List list) {
        Set<esco> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (esco escoVar : (Set) it2.next()) {
                        for (escr escrVar : escoVar.a.c) {
                            if (escrVar.a() && (set = (Set) map.get(new escp(escrVar.a, escrVar.b()))) != null) {
                                for (esco escoVar2 : set) {
                                    escoVar.b.add(escoVar2);
                                    escoVar2.c.add(escoVar);
                                }
                            }
                        }
                    }
                }
                HashSet<esco> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (esco escoVar3 : hashSet) {
                    if (escoVar3.a()) {
                        hashSet2.add(escoVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    esco escoVar4 = (esco) hashSet2.iterator().next();
                    hashSet2.remove(escoVar4);
                    i++;
                    for (esco escoVar5 : escoVar4.b) {
                        escoVar5.c.remove(escoVar4);
                        if (escoVar5.a()) {
                            hashSet2.add(escoVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (esco escoVar6 : hashSet) {
                    if (!escoVar6.a() && !escoVar6.b.isEmpty()) {
                        arrayList.add(escoVar6.a);
                    }
                }
                throw new escs(arrayList);
            }
            esca escaVar = (esca) it.next();
            esco escoVar7 = new esco(escaVar);
            for (esde esdeVar : escaVar.b) {
                escp escpVar = new escp(esdeVar, !escaVar.f());
                if (!map.containsKey(escpVar)) {
                    map.put(escpVar, new HashSet());
                }
                Set set2 = (Set) map.get(escpVar);
                if (!set2.isEmpty() && !escpVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", esdeVar));
                }
                set2.add(escoVar7);
            }
        }
    }
}
