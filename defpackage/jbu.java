package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbu implements List, j$.util.List, fdcn {
    public final cuu a = new cuu(16);
    public final cul b = new cul(16);
    public int c = -1;

    public final int a() {
        return this.a.c;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends icr> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jA = jbv.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.c + 1;
        int iE = fcva.e(this);
        if (i <= iE) {
            while (true) {
                cul culVar = this.b;
                if (i < 0 || i >= culVar.b) {
                    cwh.c("Index must be between 0 and size");
                }
                long j = culVar.a[i];
                if (jbn.b(j, jA) < 0) {
                    jA = j;
                }
                if ((jbn.a(jA) < 0.0f && jbn.d(jA)) || i == iE) {
                    break;
                }
                i++;
            }
        }
        return jA;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final icr get(int i) {
        Object objL = this.a.l(i);
        objL.getClass();
        return (icr) objL;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        this.a.c();
        this.b.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return (obj instanceof icr) && indexOf((icr) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((icr) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        this.a.d(i, i2);
        cul culVar = this.b;
        if (i < 0 || i > (i3 = culVar.b) || i2 < 0 || i2 > i3) {
            cwh.c("Index must be between 0 and size");
        }
        if (i2 < i) {
            cwh.a("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = culVar.b;
            if (i2 < i4) {
                long[] jArr = culVar.a;
                fcur.m(jArr, jArr, i, i2, i4);
            }
            culVar.b -= i2 - i;
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.c == fcva.e(this)) {
            return true;
        }
        return jbn.b(b(), jbv.a(f, z, false)) > 0;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof icr)) {
            return -1;
        }
        icr icrVar = (icr) obj;
        int iE = fcva.e(this);
        if (iE < 0) {
            return -1;
        }
        int i = 0;
        while (!fdbq.f(this.a.l(i), icrVar)) {
            if (i == iE) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.o();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<icr> iterator() {
        return new jbs(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof icr)) {
            return -1;
        }
        icr icrVar = (icr) obj;
        for (int iE = fcva.e(this); iE >= 0; iE--) {
            if (fdbq.f(this.a.l(iE), icrVar)) {
                return iE;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<icr> listIterator() {
        return new jbs(this, 0, 7);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator<icr> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super icr> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List<icr> subList(int i, int i2) {
        return new jbt(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends icr> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<icr> listIterator(int i) {
        return new jbs(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }
}
