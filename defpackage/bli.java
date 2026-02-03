package defpackage;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bli extends blo implements bjq {
    private static final bjp d = bjp.OPTIONAL;

    private bli(TreeMap treeMap) {
        super(treeMap);
    }

    public static bli a() {
        return new bli(new TreeMap(a));
    }

    public static bli b(bjq bjqVar) {
        TreeMap treeMap = new TreeMap(a);
        for (bjo bjoVar : bjqVar.s()) {
            Set<bjp> setR = bjqVar.r(bjoVar);
            ArrayMap arrayMap = new ArrayMap();
            for (bjp bjpVar : setR) {
                arrayMap.put(bjpVar, bjqVar.o(bjoVar, bjpVar));
            }
            treeMap.put(bjoVar, arrayMap);
        }
        return new bli(treeMap);
    }

    public final void c(bjo bjoVar, Object obj) {
        d(bjoVar, d, obj);
    }

    public final void d(bjo bjoVar, bjp bjpVar, Object obj) {
        bjp bjpVar2;
        TreeMap treeMap = this.c;
        Map map = (Map) treeMap.get(bjoVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(bjoVar, arrayMap);
            arrayMap.put(bjpVar, obj);
            return;
        }
        bjp bjpVar3 = (bjp) Collections.min(map.keySet());
        if (Objects.equals(map.get(bjpVar3), obj) || bjpVar3 != (bjpVar2 = bjp.REQUIRED) || bjpVar != bjpVar2) {
            map.put(bjpVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + bjoVar.c() + ", existing value (" + bjpVar3 + ")=" + map.get(bjpVar3) + ", conflicting (" + bjpVar + ")=" + obj);
    }

    public final void e(bjo bjoVar) {
        this.c.remove(bjoVar);
    }
}
