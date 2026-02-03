package j$.util.stream;

import j$.util.C0037f;
import j$.util.stream.Collector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0084g3 {
    public static Set a(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof Collector.Characteristics) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e) {
                    C0037f.a("java.util.stream.Collector.Characteristics", e);
                    throw null;
                }
            }
        } else {
            if (!AbstractC0069d3.u(next)) {
                C0037f.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristicsH = AbstractC0069d3.h(it2.next());
                    hashSet.add(characteristicsH == null ? null : characteristicsH == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristicsH == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e2) {
                    C0037f.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
