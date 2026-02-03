package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdk<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    ekdk() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objG = ekdl.g(i2);
        if (i4 != 0) {
            ekdl.i(objG, i3 & i5, i4 + 1);
        }
        Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = ekdl.e(objJ, i6);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrL[i7];
                int iA = ekdl.a(i8, i) | i6;
                int i9 = iA & i5;
                int iE2 = ekdl.e(objG, i9);
                ekdl.i(objG, i9, iE);
                iArrL[i7] = ekdl.b(iA, iE2, i5);
                iE = i8 & i;
            }
        }
        this.c = objG;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = ekdl.b(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.g(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int iMin;
        if (g()) {
            ejwl.m(g(), "Arrays already allocated");
            int i = this.b;
            int iF = ekdl.f(i);
            this.c = ekdl.g(iF);
            k(iF - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set setD = d();
        if (setD != null) {
            return setD.add(e);
        }
        int[] iArrL = l();
        Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iB = ekfh.b(e);
        int iH = h();
        int i4 = iB & iH;
        int iE = ekdl.e(j(), i4);
        if (iE != 0) {
            int iA = ekdl.a(iB, iH);
            int i5 = 0;
            while (true) {
                int i6 = iE - 1;
                int i7 = iArrL[i6];
                if (ekdl.a(i7, iH) == iA && ejwh.a(e, objArrM[i6])) {
                    return false;
                }
                int i8 = i7 & iH;
                i5++;
                if (i8 != 0) {
                    iE = i8;
                } else {
                    if (i5 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int iA2 = a();
                        while (iA2 >= 0) {
                            linkedHashSet.add(c(iA2));
                            iA2 = b(iA2);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(e);
                    }
                    if (i3 > iH) {
                        iH = i(iH, ekdl.c(iH), iB, i2);
                    } else {
                        iArrL[i6] = ekdl.b(i7, i3, iH);
                    }
                }
            }
        } else if (i3 > iH) {
            iH = i(iH, ekdl.c(iH), iB, i2);
        } else {
            ekdl.i(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), iMin);
            this.a = Arrays.copyOf(m(), iMin);
        }
        l()[i2] = ekdl.b(iB, 0, iH);
        m()[i2] = e;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set setD = d();
        if (setD != null) {
            this.b = eonc.k(size(), 3);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        ekdl.h(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iB = ekfh.b(obj);
        int iH = h();
        int iE = ekdl.e(j(), iB & iH);
        if (iE == 0) {
            return false;
        }
        int iA = ekdl.a(iB, iH);
        do {
            int i = iE - 1;
            int i2 = l()[i];
            if (ekdl.a(i2, iH) == iA && ejwh.a(obj, c(i))) {
                return true;
            }
            iE = i2 & iH;
        } while (iE != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        ejwl.b(true, "Expected size must be >= 0");
        this.b = eonc.k(i, 1);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set setD = d();
        return setD != null ? setD.iterator() : new ekdj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set setD = d();
            if (setD != null) {
                return setD.remove(obj);
            }
            int iH = h();
            int iD = ekdl.d(obj, null, iH, j(), l(), m(), null);
            if (iD != -1) {
                Object objJ = j();
                int[] iArrL = l();
                Object[] objArrM = m();
                int size = size();
                int i3 = size - 1;
                if (iD < i3) {
                    int i4 = iD + 1;
                    Object obj2 = objArrM[i3];
                    objArrM[iD] = obj2;
                    objArrM[i3] = null;
                    iArrL[iD] = iArrL[i3];
                    iArrL[i3] = 0;
                    int iB = ekfh.b(obj2) & iH;
                    int iE = ekdl.e(objJ, iB);
                    if (iE == size) {
                        ekdl.i(objJ, iB, i4);
                    } else {
                        while (true) {
                            i = iE - 1;
                            i2 = iArrL[i];
                            int i5 = i2 & iH;
                            if (i5 == size) {
                                break;
                            }
                            iE = i5;
                        }
                        iArrL[i] = ekdl.b(i2, i4, iH);
                    }
                } else {
                    objArrM[iD] = null;
                    iArrL[iD] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set setD = d();
        return setD != null ? setD.toArray() : Arrays.copyOf(m(), this.e);
    }

    public ekdk(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (g()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set setD = d();
        if (setD != null) {
            return (T[]) setD.toArray(tArr);
        }
        Object[] objArrM = m();
        int i = this.e;
        ejwl.k(0, i, objArrM.length);
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) eknx.a(tArr, i);
        } else if (length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArrM, 0, tArr, 0, i);
        return tArr;
    }
}
