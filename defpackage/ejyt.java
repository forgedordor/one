package defpackage;

import java.util.AbstractSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejyt extends AbstractSet {
    final /* synthetic */ ekak a;

    public ejyt(ekak ekakVar) {
        this.a = ekakVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
