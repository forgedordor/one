package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekbb extends ekau implements SortedMap {
    SortedSet d;
    final /* synthetic */ ekbi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekbb(ekbi ekbiVar, SortedMap sortedMap) {
        super(ekbiVar, sortedMap);
        this.e = ekbiVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new ekbb(this.e, h().headMap(obj));
    }

    @Override // defpackage.ekmh
    public SortedSet i() {
        return new ekbc(this.e, h());
    }

    @Override // defpackage.ekau, defpackage.ekmh, java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetI = i();
        this.d = sortedSetI;
        return sortedSetI;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new ekbb(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new ekbb(this.e, h().tailMap(obj));
    }
}
