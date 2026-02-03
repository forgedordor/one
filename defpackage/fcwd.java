package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcwd extends fcwc {
    public static final Object e(Map map, Object obj) {
        map.getClass();
        if (map instanceof fcwh) {
            fcwh fcwhVar = (fcwh) map;
            Map map2 = fcwhVar.a;
            Object obj2 = map2.get(obj);
            return (obj2 != null || map2.containsKey(obj)) ? obj2 : fcwhVar.b.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new NoSuchElementException(a.h(obj, "Key ", " is missing in the map."));
    }

    public static final LinkedHashMap f(fcti... fctiVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(fctiVarArr.length));
        fcwa.o(linkedHashMap, fctiVarArr);
        return linkedHashMap;
    }

    public static final Map g(fcti... fctiVarArr) {
        fctiVarArr.getClass();
        int length = fctiVarArr.length;
        if (length <= 0) {
            return fcvp.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(length));
        fcwa.o(linkedHashMap, fctiVarArr);
        return linkedHashMap;
    }

    public static final Map h(fcti... fctiVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(fctiVarArr.length));
        fcwa.o(linkedHashMap, fctiVarArr);
        return linkedHashMap;
    }

    public static final Map i(Map map) {
        int size = map.size();
        return size != 0 ? size != 1 ? map : fcwa.d(map) : fcvp.a;
    }

    public static final Map j(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final Map k(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            fcwa.n(linkedHashMap, iterable);
            return fcwa.i(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return fcvp.a;
        }
        if (size == 1) {
            return fcwa.c((fcti) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(collection.size()));
        fcwa.n(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static final Map l(Map map) {
        map.getClass();
        int size = map.size();
        return size != 0 ? size != 1 ? fcwa.m(map) : fcwa.d(map) : fcvp.a;
    }

    public static final Map m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final void n(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fcti fctiVar = (fcti) it.next();
            map.put(fctiVar.a, fctiVar.b);
        }
    }

    public static final void o(Map map, fcti[] fctiVarArr) {
        for (fcti fctiVar : fctiVarArr) {
            map.put(fctiVar.a, fctiVar.b);
        }
    }
}
