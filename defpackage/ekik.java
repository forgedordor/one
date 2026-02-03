package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekik extends ekhx implements NavigableSet, SortedSet, ekpi {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient ekik b;

    public ekik(Comparator comparator) {
        this.a = comparator;
    }

    static ekoo G(Comparator comparator) {
        if (ekno.a.equals(comparator)) {
            return ekoo.c;
        }
        int i = ekgb.d;
        return new ekoo(ekoe.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ekik x(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return G(comparator);
        }
        eknr.g(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new ekoo(ekgb.i(objArr, i2), comparator);
    }

    @Override // java.util.NavigableSet
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ekik headSet(Object obj, boolean z) {
        obj.getClass();
        return B(obj, z);
    }

    public abstract ekik B(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ekik subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        ejwl.a(this.a.compare(obj, obj2) <= 0);
        return D(obj, z, obj2, z2);
    }

    public abstract ekik D(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final ekik tailSet(Object obj, boolean z) {
        obj.getClass();
        return F(obj, z);
    }

    public abstract ekik F(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract ekqg descendingIterator();

    final int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return ekis.i(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, defpackage.ekpi
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return ekjc.g(headSet(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return ekis.i(tailSet(obj, false), null);
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract ekqg listIterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return ekjc.g(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return new ekij(this.a, toArray());
    }

    public abstract ekik y();

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ekik descendingSet() {
        ekik ekikVar = this.b;
        if (ekikVar != null) {
            return ekikVar;
        }
        ekik ekikVarY = y();
        this.b = ekikVarY;
        ekikVarY.b = this;
        return ekikVarY;
    }
}
