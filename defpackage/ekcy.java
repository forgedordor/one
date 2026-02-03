package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcy<F, T> extends AbstractCollection<T> {
    final Collection a;
    final ejvr b;

    public ekcy(Collection collection, ejvr ejvrVar) {
        collection.getClass();
        this.a = collection;
        ejvrVar.getClass();
        this.b = ejvrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return ekjc.j(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
