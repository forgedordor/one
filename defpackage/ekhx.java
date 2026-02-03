package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekhx<E> extends ekfn<E> implements Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;
    private transient ekgb a;

    static int d(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            ejwl.b(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static ekhv i(int i) {
        ekcw.c(i, "expectedSize");
        return new ekhv(i);
    }

    public static ekhx j(int i, Object... objArr) {
        if (i == 0) {
            return ekon.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new ekph(obj);
        }
        int iD = d(i);
        Object[] objArr2 = new Object[iD];
        int i2 = iD - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            eknr.e(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iA = ekfh.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new ekph(obj4);
        }
        if (d(i4) < iD / 2) {
            return j(i4, objArr);
        }
        if (w(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ekon(objArr, i3, objArr2, i2, i4);
    }

    public static ekhx n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return ekon.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new ekph(next);
        }
        ekhv ekhvVar = new ekhv();
        ekhvVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            ekhvVar.c(it.next());
        }
        return ekhvVar.g();
    }

    public static ekhx o(Collection collection) {
        if ((collection instanceof ekhx) && !(collection instanceof SortedSet)) {
            ekhx ekhxVar = (ekhx) collection;
            if (!ekhxVar.l()) {
                return ekhxVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static ekhx p(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : new ekph(objArr[0]) : ekon.a;
    }

    public static ekhx q() {
        return ekon.a;
    }

    public static ekhx r(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ekhx s(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static ekhx t(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static ekhx u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static ekhx v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        ejwl.b(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean w(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ekhx) && b() && ((ekhx) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return ekpg.l(this, obj);
    }

    @Override // defpackage.ekfn
    public ekgb g() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return ekgbVar;
        }
        ekgb ekgbVarH = h();
        this.a = ekgbVarH;
        return ekgbVarH;
    }

    public ekgb h() {
        return ekgb.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ekpg.a(this);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ekqg listIterator();

    @Override // defpackage.ekfn
    public Object writeReplace() {
        return new ekhw(toArray());
    }
}
