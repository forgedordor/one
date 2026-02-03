package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbss {
    public static final fbst a(String str, fbsy fbsyVar, Map map) {
        if (fbsyVar == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((fbsr) it.next()).a);
            }
            fbsx fbsxVar = new fbsx(str);
            fbsxVar.b.addAll(arrayList);
            fbsyVar = new fbsy(fbsxVar);
        }
        HashMap map2 = new HashMap(map);
        for (fbrk fbrkVar : fbsyVar.b) {
            String str2 = fbrkVar.b;
            fbsr fbsrVar = (fbsr) map2.remove(str2);
            if (fbsrVar == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(str2));
            }
            if (fbsrVar.a != fbrkVar) {
                throw new IllegalStateException(a.a(str2, "Bound method for ", " not same instance as method in service descriptor"));
            }
        }
        if (map2.size() <= 0) {
            return new fbst(fbsyVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((fbsr) map2.values().iterator().next()).a.b));
    }

    public static final void b(fbrk fbrkVar, fbsn fbsnVar, String str, fbsy fbsyVar, Map map) {
        c(new fbsr(fbrkVar, fbsnVar), str, map);
    }

    public static final void c(fbsr fbsrVar, String str, Map map) {
        fbrk fbrkVar = fbsrVar.a;
        boolean zEquals = str.equals(fbrkVar.c);
        String str2 = fbrkVar.b;
        ejwl.i(zEquals, "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, str2);
        ejwl.p(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, fbsrVar);
    }
}
