package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdh extends AbstractCollection {
    final /* synthetic */ ekdi a;

    public ekdh(ekdi ekdiVar) {
        this.a = ekdiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        return mapN != null ? mapN.values().iterator() : new ekdc(ekdiVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
