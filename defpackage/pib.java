package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class pib {
    public static final void a(HashMap map, fdap fdapVar) {
        int i;
        map.getClass();
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object obj : map.keySet()) {
                obj.getClass();
                map2.put(obj, map.get(obj));
                i++;
                if (i == 999) {
                    break;
                }
            }
            fdapVar.invoke(map2);
            map2.clear();
        }
        if (i > 0) {
            fdapVar.invoke(map2);
        }
    }
}
