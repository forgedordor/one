package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eolw<K, V> extends ekei<Collection<V>> {
    final Collection a;
    final Set b;

    public eolw(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.ekei
    /* renamed from: b */
    protected final Collection hp() {
        return this.a;
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean contains(Object obj) {
        return d(obj);
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return ekcz.a(this, collection);
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekei, java.util.Collection, java.lang.Iterable
    public final Iterator<Collection<V>> iterator() {
        return new eolv(this.b.iterator());
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean remove(Object obj) {
        Iterator<Collection<V>> it = iterator();
        while (it.hasNext()) {
            if (ejwh.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return ekjc.n(iterator(), collection);
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return ekjc.o(iterator(), collection);
    }

    @Override // defpackage.ekei, java.util.Collection
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.ekei, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) eknr.d(this, tArr);
    }
}
