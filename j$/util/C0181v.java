package j$.util;

import java.util.SortedMap;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0181v extends C0049s implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;
    public final SortedMap e;

    public C0181v(SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.e.comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.e.firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C0181v(this.e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.e.lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C0181v(this.e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C0181v(this.e.tailMap(obj));
    }
}
