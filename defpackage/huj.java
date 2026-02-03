package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huj<T> implements List<T>, fdco {
    private final hum a;

    public huj(hum humVar) {
        this.a = humVar;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.a.f(i, t);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.a.k(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.l(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        hun.a(this, i);
        return (T) this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new hul(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        hum humVar = this.a;
        Object[] objArr = humVar.a;
        for (int i = humVar.b - 1; i >= 0; i--) {
            if (fdbq.f(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new hul(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        hun.a(this, i);
        return (T) this.a.c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        hum humVar = this.a;
        int i = humVar.b;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            humVar.m(it.next());
        }
        return i != humVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        hum humVar = this.a;
        int i = humVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(humVar.a[i2])) {
                humVar.c(i2);
            }
        }
        return i != humVar.b;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        hun.a(this, i);
        return (T) this.a.d(i, t);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        hun.b(this, i, i2);
        return new huk(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        this.a.n(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        hum humVar = this.a;
        return humVar.k(humVar.b, collection);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new hul(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.m(obj);
    }
}
