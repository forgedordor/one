package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efom implements eyif {
    public static void a(Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((efol) it.next()).b);
        }
        if (fcva.ab(arrayList).size() != set.size()) {
            throw new IllegalStateException("duplicate configuration entry of content-type found.");
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((efol) it2.next()).a);
        }
        if (fcva.ab(arrayList2).size() != set.size()) {
            throw new IllegalStateException("duplicate configuration entry of proto type found.");
        }
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
