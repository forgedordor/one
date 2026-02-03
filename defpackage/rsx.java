package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsx {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private final synchronized List f(String str) {
        List list = this.a;
        if (!list.contains(str)) {
            list.add(str);
        }
        Map map = this.b;
        List list2 = (List) map.get(str);
        if (list2 != null) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<rsw> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (rsw rswVar : list) {
                    if (rswVar.a(cls, cls2)) {
                        arrayList.add(rswVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<rsw> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (rsw rswVar : list) {
                    if (rswVar.a(cls, cls2)) {
                        Class cls3 = rswVar.a;
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, rez rezVar, Class cls, Class cls2) {
        f(str).add(new rsw(cls, cls2, rezVar));
    }

    public final synchronized void d(List list) {
        List list2 = this.a;
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                list2.add(str);
            }
        }
    }

    public final synchronized void e(rez rezVar, Class cls, Class cls2) {
        f("legacy_prepend_all").add(0, new rsw(cls, cls2, rezVar));
    }
}
