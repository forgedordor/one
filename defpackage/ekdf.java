package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdf extends AbstractSet {
    final /* synthetic */ ekdi a;

    public ekdf(ekdi ekdiVar) {
        this.a = ekdiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        return mapN != null ? mapN.keySet().iterator() : new ekda(ekdiVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        return mapN != null ? mapN.keySet().remove(obj) : ekdiVar.h(obj) != ekdi.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
