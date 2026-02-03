package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekau extends ekmh {
    final transient Map a;
    final /* synthetic */ ekbi b;

    public ekau(ekbi ekbiVar, Map map) {
        this.b = ekbiVar;
        this.a = map;
    }

    final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return new ekfo(key, this.b.f(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.ekmh
    public final Set b() {
        return new ekas(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        ekbi ekbiVar = this.b;
        if (map == ekbiVar.a) {
            ekbiVar.q();
        } else {
            ekjc.k(new ekat(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) ekmi.f(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ekmh, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        ekbi ekbiVar = this.b;
        Collection collectionA = ekbiVar.a();
        collectionA.addAll(collection);
        ekbiVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
