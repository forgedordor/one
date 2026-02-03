package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cus<T> implements List<T>, fdco {
    private final cuu a;

    public cus(cuu cuuVar) {
        this.a = cuuVar;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        cuu cuuVar = this.a;
        if (i < 0 || i > cuuVar.c) {
            cuuVar.f(i);
        }
        int i2 = cuuVar.c + 1;
        Object[] objArr = cuuVar.b;
        if (objArr.length < i2) {
            cuuVar.e(i2, objArr);
        }
        Object[] objArr2 = cuuVar.b;
        int i3 = cuuVar.c;
        if (i != i3) {
            fcur.n(objArr2, objArr2, i + 1, i, i3);
        }
        objArr2[i] = t;
        cuuVar.c++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        collection.getClass();
        cuu cuuVar = this.a;
        if (i < 0 || i > cuuVar.c) {
            cuuVar.f(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = cuuVar.c + collection.size();
        Object[] objArr = cuuVar.b;
        if (objArr.length < size) {
            cuuVar.e(size, objArr);
        }
        Object[] objArr2 = cuuVar.b;
        if (i != cuuVar.c) {
            fcur.n(objArr2, objArr2, collection.size() + i, i, cuuVar.c);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                fcva.m();
            }
            objArr2[i2 + i] = t;
            i2 = i3;
        }
        cuuVar.c += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.n(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        cvi.b(this, i);
        return (T) this.a.l(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.o();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cur(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        cuu cuuVar = this.a;
        if (obj == null) {
            Object[] objArr = cuuVar.b;
            for (int i = cuuVar.c - 1; i >= 0; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        Object[] objArr2 = cuuVar.b;
        for (int i2 = cuuVar.c - 1; i2 >= 0; i2--) {
            if (obj.equals(objArr2[i2])) {
                return i2;
            }
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
        return (T) this.a.a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        cuu cuuVar = this.a;
        int i = cuuVar.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cuuVar.g(it.next());
        }
        return i != cuuVar.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        cuu cuuVar = this.a;
        int i = cuuVar.c;
        Object[] objArr = cuuVar.b;
        int i2 = cuuVar.c;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            if (!collection.contains(objArr[i2])) {
                cuuVar.a(i2);
            }
        }
        return i != cuuVar.c;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        cvi.b(this, i);
        return (T) this.a.b(i, t);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.c;
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
        return this.a.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        this.a.h(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        cuu cuuVar = this.a;
        int i = cuuVar.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cuuVar.h(it.next());
        }
        return i != cuuVar.c;
    }
}
