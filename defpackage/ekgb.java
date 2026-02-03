package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekgb<E> extends ekfn<E> implements List<E>, RandomAccess, j$.util.List<E> {
    private static final ekqh a = new ekfx(ekoe.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static ekgb A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static ekgb B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @SafeVarargs
    public static ekgb C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        ejwl.b(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return H(objArr2);
    }

    public static ekgb D(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) ekis.t(iterable, new Comparable[0]);
        eknr.f(comparableArr);
        Arrays.sort(comparableArr);
        return h(comparableArr);
    }

    public static ekgb E(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] objArrR = ekis.r(iterable);
        eknr.f(objArrR);
        Arrays.sort(objArrR, comparator);
        return h(objArrR);
    }

    private static ekgb H(Object... objArr) {
        eknr.f(objArr);
        return h(objArr);
    }

    public static ekfw d(int i) {
        ekcw.c(i, "expectedSize");
        return new ekfw(i);
    }

    static ekgb h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    static ekgb i(Object[] objArr, int i) {
        return i == 0 ? ekoe.a : new ekoe(objArr, i);
    }

    public static ekgb j(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? n((Collection) iterable) : o(iterable.iterator());
    }

    public static ekgb n(Collection collection) {
        if (!(collection instanceof ekfn)) {
            return H(collection.toArray());
        }
        ekgb ekgbVarG = ((ekfn) collection).g();
        return ekgbVarG.l() ? h(ekgbVarG.toArray()) : ekgbVarG;
    }

    public static ekgb o(Iterator it) {
        if (!it.hasNext()) {
            return ekoe.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(next);
        ekfwVar.k(it);
        return ekfwVar.g();
    }

    public static ekgb p(Object[] objArr) {
        return objArr.length == 0 ? ekoe.a : H((Object[]) objArr.clone());
    }

    public static ekgb q() {
        return ekoe.a;
    }

    public static ekgb r(Object obj) {
        return H(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ekgb s(Object obj, Object obj2) {
        return H(obj, obj2);
    }

    public static ekgb t(Object obj, Object obj2, Object obj3) {
        return H(obj, obj2, obj3);
    }

    public static ekgb u(Object obj, Object obj2, Object obj3, Object obj4) {
        return H(obj, obj2, obj3, obj4);
    }

    public static ekgb v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return H(obj, obj2, obj3, obj4, obj5);
    }

    public static ekgb w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return H(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ekgb x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ekgb y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static ekgb z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ekqh listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final ekqh listIterator(int i) {
        ejwl.x(i, size());
        return isEmpty() ? a : new ekfx(this, i);
    }

    public ekgb a() {
        return size() <= 1 ? this : new ekfy(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ekgb subList(int i, int i2) {
        ejwl.k(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? ekoe.a : new ekga(this, i, i3);
    }

    @Override // defpackage.ekfn
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return ekjz.h(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ekfn
    /* renamed from: k */
    public final ekqg listIterator() {
        return iterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.ekfn
    public Object writeReplace() {
        return new ekfz(toArray());
    }

    @Override // defpackage.ekfn
    @Deprecated
    public final ekgb g() {
        return this;
    }
}
