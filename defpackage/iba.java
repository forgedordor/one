package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iba<T> implements List<T>, fdco {
    public int a;
    private final iac b;
    private final int c;
    private int d;

    public iba(iac iacVar, int i, int i2) {
        this.b = iacVar;
        this.c = i;
        this.d = iacVar.b();
        this.a = i2 - i;
    }

    private final void b() {
        if (this.b.b() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        iac iacVar = this.b;
        Object objF = iacVar.f(this.c + i);
        this.a--;
        this.d = iacVar.b();
        return objF;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        iac iacVar = this.b;
        iacVar.add(this.c + i, t);
        this.a++;
        this.d = iacVar.b();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        b();
        iac iacVar = this.b;
        boolean zAddAll = iacVar.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = iacVar.b();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a > 0) {
            b();
            iac iacVar = this.b;
            int i = this.c;
            iacVar.h(i, this.a + i);
            this.a = 0;
            this.d = iacVar.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
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
        b();
        iad.a(i, this.a);
        return (T) this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        fcvy it = fddu.r(i, this.a + i).iterator();
        while (((fddp) it).a) {
            int iA = it.a();
            if (fdbq.f(obj, this.b.get(iA))) {
                return iA - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (fdbq.f(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        iac iacVar = this.b;
        int iA = iacVar.a();
        do {
            synchronized (iad.a) {
                iay iayVar = iacVar.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huu huuVarB = huvVar.b();
            huuVarB.subList(i2, i3).retainAll(collection);
            huv huvVarA = huuVarB.a();
            if (fdbq.f(huvVarA, huvVar)) {
                break;
            }
            iay iayVar2 = iacVar.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = iac.i((iab) hzt.l(iayVar2, iacVar, hzgVarB), i, huvVarA, true);
            }
            hzt.t(hzgVarB, iacVar);
        } while (!zI);
        int iA2 = iA - iacVar.a();
        if (iA2 > 0) {
            this.d = this.b.b();
            this.a -= iA2;
        }
        return iA2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        iad.a(i, this.a);
        b();
        iac iacVar = this.b;
        T t2 = (T) iacVar.set(i + this.c, t);
        this.d = iacVar.b();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            hpq.a("fromIndex or toIndex are out of bounds");
        }
        b();
        iac iacVar = this.b;
        int i3 = this.c;
        return new iba(iacVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        b();
        fdcg fdcgVar = new fdcg();
        fdcgVar.a = i - 1;
        return new iaz(fdcgVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.c + this.a;
        iac iacVar = this.b;
        iacVar.add(i, t);
        this.a++;
        this.d = iacVar.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.a, collection);
    }
}
