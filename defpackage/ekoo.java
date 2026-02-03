package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekoo extends ekik {
    public static final ekoo c;
    public final transient ekgb d;

    static {
        int i = ekgb.d;
        c = new ekoo(ekoe.a, ekno.a);
    }

    public ekoo(ekgb ekgbVar, Comparator comparator) {
        super(comparator);
        this.d = ekgbVar;
    }

    @Override // defpackage.ekik
    public final ekik B(Object obj, boolean z) {
        return K(0, I(obj, z));
    }

    @Override // defpackage.ekik
    public final ekik D(Object obj, boolean z, Object obj2, boolean z2) {
        return F(obj, z).B(obj2, z2);
    }

    @Override // defpackage.ekik
    public final ekik F(Object obj, boolean z) {
        return K(J(obj, z), size());
    }

    @Override // defpackage.ekik, java.util.NavigableSet
    /* renamed from: H */
    public final ekqg descendingIterator() {
        return this.d.a().iterator();
    }

    final int I(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((ekik) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int J(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((ekik) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final ekoo K(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return G(this.a);
        }
        ekgb ekgbVar = this.d;
        return new ekoo(ekgbVar.subList(i, i2), this.a);
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        return this.d.c(objArr, i);
    }

    @Override // defpackage.ekik, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iJ = J(obj, true);
        if (iJ == size()) {
            return null;
        }
        return this.d.get(iJ);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof ekni) {
            collection = ((ekni) collection).i();
        }
        if (!ekpj.a(((ekik) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ekqg ekqgVarListIterator = listIterator();
        Iterator<?> it = collection.iterator();
        if (!ekqgVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = ekqgVarListIterator.next();
        while (true) {
            try {
                int iA = a(next2, next);
                if (iA >= 0) {
                    if (iA != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!ekqgVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = ekqgVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.ekfn
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!ekpj.a(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            ekqg ekqgVarListIterator = listIterator();
            while (ekqgVarListIterator.hasNext()) {
                Object next = ekqgVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || a(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.ekfn
    public final int f() {
        return this.d.f();
    }

    @Override // defpackage.ekik, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.ekik, java.util.NavigableSet
    public final Object floor(Object obj) {
        int I = I(obj, true) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public final ekgb g() {
        return this.d;
    }

    @Override // defpackage.ekik, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iJ = J(obj, false);
        if (iJ == size()) {
            return null;
        }
        return this.d.get(iJ);
    }

    @Override // defpackage.ekik, defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.ekik, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.ekik, java.util.NavigableSet
    public final Object lower(Object obj) {
        int I = I(obj, false) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.ekfn
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.ekik, defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.ekik
    public final ekik y() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? G(comparatorReverseOrder) : new ekoo(this.d.a(), comparatorReverseOrder);
    }
}
