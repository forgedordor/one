package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwu<E> extends fcul<E> implements List<E>, RandomAccess, Serializable, fdco {
    public Object[] a;
    public final int b;
    public int c;
    public final fcww d;
    private final fcwu e;

    public fcwu(Object[] objArr, int i, int i2, fcwu fcwuVar, fcww fcwwVar) {
        objArr.getClass();
        fcwwVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = fcwuVar;
        this.d = fcwwVar;
        this.modCount = fcwwVar.modCount;
    }

    private final int b(int i, int i2, Collection collection, boolean z) {
        int iB;
        fcwu fcwuVar = this.e;
        if (fcwuVar != null) {
            iB = fcwuVar.b(i, i2, collection, z);
        } else {
            fcww fcwwVar = this.d;
            fcww fcwwVar2 = fcww.a;
            iB = fcwwVar.b(i, i2, collection, z);
        }
        if (iB > 0) {
            j();
        }
        this.c -= iB;
        return iB;
    }

    private final Object e(int i) {
        Object objE;
        j();
        fcwu fcwuVar = this.e;
        if (fcwuVar != null) {
            objE = fcwuVar.e(i);
        } else {
            fcww fcwwVar = this.d;
            fcww fcwwVar2 = fcww.a;
            objE = fcwwVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        fcwu fcwuVar = this.e;
        if (fcwuVar != null) {
            fcwuVar.f(i, collection, i2);
        } else {
            fcww fcwwVar = this.d;
            fcww fcwwVar2 = fcww.a;
            fcwwVar.f(i, collection, i2);
        }
        fcww fcwwVar3 = this.d;
        fcww fcwwVar4 = fcww.a;
        this.a = fcwwVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        fcwu fcwuVar = this.e;
        if (fcwuVar != null) {
            fcwuVar.g(i, obj);
        } else {
            fcww fcwwVar = this.d;
            fcww fcwwVar2 = fcww.a;
            fcwwVar.g(i, obj);
        }
        fcww fcwwVar3 = this.d;
        fcww fcwwVar4 = fcww.a;
        this.a = fcwwVar3.b;
        this.c++;
    }

    private final void h() {
        fcww fcwwVar = fcww.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        fcwu fcwuVar = this.e;
        if (fcwuVar != null) {
            fcwuVar.k(i, i2);
        } else {
            fcww fcwwVar = this.d;
            fcww fcwwVar2 = fcww.a;
            fcwwVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        fcww fcwwVar = fcww.a;
        return this.d.d;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new fcxi(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        i();
        h();
        fcud.c(i, this.c);
        g(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        fcud.c(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.fcul
    public final int c() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.fcul
    public final Object d(int i) {
        i();
        h();
        fcud.b(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (fcwx.e(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h();
        fcud.b(i, this.c);
        return (E) this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return fcwx.a(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (fdbq.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (fdbq.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        i();
        h();
        return b(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        i();
        h();
        return b(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        i();
        h();
        fcud.b(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        E e2 = (E) objArr[i3];
        objArr[i3] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        fcud.d(i, i2, this.c);
        return new fcwu(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return fcur.g(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return fcwx.b(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        h();
        fcud.c(i, this.c);
        return new fcwt(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        h();
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr = this.a;
            int i2 = this.b;
            T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, i2, i + i2, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        fcur.n(objArr2, tArr, 0, i3, i + i3);
        fcva.d(this.c, tArr);
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        i();
        h();
        g(this.b + this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
