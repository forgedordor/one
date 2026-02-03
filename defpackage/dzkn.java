package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzkn {
    public abstract evuh a(String str, Object obj);

    public abstract evuh b(evuh evuhVar, evuh evuhVar2);

    public abstract String c(evuh evuhVar);

    final List d(Map map) {
        evuh evuhVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (evuhVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(evuhVarA);
            }
        }
        return arrayList;
    }

    final List e(List list, List list2) {
        evuh evuhVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evuh evuhVar2 = (evuh) it.next();
            String strC = c(evuhVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    evuhVar = null;
                    break;
                }
                evuhVar = (evuh) it2.next();
                if (strC.equals(c(evuhVar))) {
                    break;
                }
            }
            evuh evuhVarB = b(evuhVar2, evuhVar);
            if (evuhVarB != null) {
                arrayList.add(evuhVarB);
            }
        }
        return arrayList;
    }
}
