package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class luj {
    final Map a = new HashMap();
    final Map b;

    public luj(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            lva lvaVar = (lva) entry.getValue();
            List arrayList = (List) this.a.get(lvaVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(lvaVar, arrayList);
            }
            arrayList.add((luk) entry.getKey());
        }
    }

    public static void a(List list, lvj lvjVar, lva lvaVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            luk lukVar = (luk) list.get(size);
            try {
                int i = lukVar.a;
                if (i == 0) {
                    lukVar.b.invoke(obj, null);
                } else if (i != 1) {
                    lukVar.b.invoke(obj, lvjVar, lvaVar);
                } else {
                    lukVar.b.invoke(obj, lvjVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
