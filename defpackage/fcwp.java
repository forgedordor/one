package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcwp extends fcwo {
    public static final Set e(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionV = fcva.v(iterable);
        if (collectionV.isEmpty()) {
            return fcva.av(set);
        }
        if (!(collectionV instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionV);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionV).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static final Set f(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(fcwa.a(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && fdbq.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final Set g(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            int size2 = set.size();
            size = size2 + size2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fcwa.a(size));
        linkedHashSet.addAll(set);
        fcva.y(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final Set h(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(fcwa.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
