package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cut<T> implements List<T>, fdco {
    private final List a;
    private final int b;
    private int c;

    public cut(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.a.add(i + this.b, t);
        this.c++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        collection.getClass();
        this.a.addAll(i + this.b, collection);
        this.c += collection.size();
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (true) {
                this.a.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.c = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            if (fdbq.f(this.a.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        cvi.b(this, i);
        return (T) this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.c;
        int i2 = this.b;
        for (int i3 = i2; i3 < i; i3++) {
            if (fdbq.f(this.a.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.c == this.b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cur(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (!fdbq.f(this.a.get(i), obj)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new cur(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        cvi.b(this, i);
        this.c--;
        return (T) this.a.remove(i + this.b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        int i = this.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        int i = this.c;
        int i2 = i - 1;
        int i3 = this.b;
        if (i3 <= i2) {
            while (true) {
                List list = this.a;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.c--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.c;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        cvi.b(this, i);
        return (T) this.a.set(i + this.b, t);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.c - this.b;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        cvi.c(this, i, i2);
        return new cut(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i = this.c;
        this.c = i + 1;
        this.a.add(i, t);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new cur(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) fdbj.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            List list = this.a;
            if (fdbq.f(list.get(i2), obj)) {
                list.remove(i2);
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        this.a.addAll(this.c, collection);
        this.c += collection.size();
        return collection.size() > 0;
    }
}
