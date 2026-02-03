package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekcx<E> extends AbstractCollection<E> {
    final Collection a;
    final ejwm b;

    public ekcx(Collection collection, ejwm ejwmVar) {
        this.a = collection;
        this.b = ejwmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        ejwl.a(this.b.a(e));
        return this.a.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            ejwl.a(this.b.a(it.next()));
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ejwm ejwmVar = this.b;
        Collection collection = this.a;
        if ((collection instanceof RandomAccess) && (collection instanceof List)) {
            ejwmVar.getClass();
            ekis.u((List) collection, ejwmVar);
            return;
        }
        Iterator it = collection.iterator();
        ejwmVar.getClass();
        while (it.hasNext()) {
            if (ejwmVar.a(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (ekcz.b(this.a, obj)) {
            return this.b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return ekcz.a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !ekis.q(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return ekjc.c(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.a(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return ekjz.b(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ekjz.b(iterator()).toArray(tArr);
    }
}
