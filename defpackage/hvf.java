package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvf<E> extends fcul<E> implements huu<E> {
    public int a;
    public Object[] b;
    public Object[] c;
    public int d;
    private huv e;
    private Object[] f;
    private Object[] g;
    private hwt h = new hwt();

    public hvf(huv huvVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = huvVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final Object[] A(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itA = fdbd.a(objArr2);
        int i2 = this.a;
        Object[] objArrZ = (i >> 5) < (1 << i2) ? z(objArr, i, i2, itA) : t(objArr);
        while (itA.hasNext()) {
            this.a += 5;
            objArrZ = w(objArrZ);
            int i3 = this.a;
            z(objArrZ, 1 << i3, i3, itA);
        }
        return objArrZ;
    }

    private final Object[] B(Object[] objArr, Object[] objArr2, int i) {
        int i2 = this.d - 1;
        Object[] objArrT = t(objArr);
        int iA = hvl.a(i2, i);
        if (i == 5) {
            objArrT[iA] = objArr2;
            return objArrT;
        }
        objArrT[iA] = B((Object[]) objArrT[iA], objArr2, i - 5);
        return objArrT;
    }

    private final Object[] C(Object[] objArr, int i, int i2, hvc hvcVar) {
        int iA = hvl.a(i2, i);
        int i3 = iA + 1;
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrT = t(objArr);
            fcur.n(objArr, objArrT, iA, i3, 32);
            objArrT[31] = hvcVar.a;
            hvcVar.a = obj;
            return objArrT;
        }
        int iA2 = objArr[31] == null ? hvl.a(i() - 1, i) : 31;
        Object[] objArrT2 = t(objArr);
        int i4 = i - 5;
        if (i3 <= iA2) {
            while (true) {
                Object obj2 = objArrT2[iA2];
                obj2.getClass();
                objArrT2[iA2] = C((Object[]) obj2, i4, 0, hvcVar);
                if (iA2 == i3) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrT2[iA];
        obj3.getClass();
        objArrT2[iA] = C((Object[]) obj3, i4, i2, hvcVar);
        return objArrT2;
    }

    private final Object[] D(Object[] objArr, int i, int i2, Object obj, hvc hvcVar) {
        Object[] objArrT = t(objArr);
        int iA = hvl.a(i2, i);
        if (i == 0) {
            if (objArrT != objArr) {
                this.modCount++;
            }
            hvcVar.a = objArrT[iA];
            objArrT[iA] = obj;
            return objArrT;
        }
        Object obj2 = objArrT[iA];
        obj2.getClass();
        objArrT[iA] = D((Object[]) obj2, i - 5, i2, obj, hvcVar);
        return objArrT;
    }

    private static final void E(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int F(int i) {
        return i <= 32 ? i : i - hvl.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int f(fdap fdapVar, Object[] objArr, int i, int i2, hvc hvcVar, List list, List list2) {
        if (r(objArr)) {
            list.add(objArr);
        }
        Object obj = hvcVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrV = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) fdapVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrV = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : v();
                    i2 = 0;
                }
                objArrV[i2] = obj2;
                i2++;
            }
        }
        hvcVar.a = objArrV;
        if (objArr2 != hvcVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int g(fdap fdapVar, Object[] objArr, int i, hvc hvcVar) {
        Object[] objArrT = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) fdapVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrT = t(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrT[i2] = obj;
                i2++;
            }
        }
        hvcVar.a = objArrT;
        return i2;
    }

    private final int h(fdap fdapVar, int i, hvc hvcVar) {
        int iG = g(fdapVar, this.c, i, hvcVar);
        if (iG == i) {
            return i;
        }
        Object obj = hvcVar.a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        fcur.d(objArr, null, iG, i);
        this.c = objArr;
        this.d -= i - iG;
        return iG;
    }

    private final int i() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return hvl.b(i);
    }

    private final int j() {
        return F(this.d);
    }

    private final Object k(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 == 1) {
            Object obj = this.c[0];
            o(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[i3];
        Object[] objArrT = t(objArr2);
        fcur.n(objArr2, objArrT, i3, i3 + 1, i4);
        objArrT[i4 - 1] = null;
        this.b = objArr;
        this.c = objArrT;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final ListIterator l(int i) {
        Object[] objArr = this.b;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int i2 = i() >> 5;
        hws.b(i, i2);
        int i3 = this.a;
        return i3 == 0 ? new hvi(objArr, i) : new hvk(objArr, i, i2, i3 / 5);
    }

    private final void m(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.b == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        ListIterator listIteratorL = l(i() >> 5);
        int i5 = i3;
        Object[] objArrU = objArr2;
        while (listIteratorL.previousIndex() != i4) {
            Object[] objArr3 = (Object[]) listIteratorL.previous();
            fcur.n(objArr3, objArrU, 0, 32 - i2, 32);
            objArrU = u(objArr3, i2);
            i5--;
            objArr[i5] = objArrU;
        }
        Object[] objArr4 = (Object[]) listIteratorL.previous();
        int i6 = i3 - (((i() >> 5) - 1) - i4);
        if (i6 < i3) {
            objArr2 = objArr[i6];
            objArr2.getClass();
        }
        q(collection, i, objArr4, 32, objArr, i6, objArr2);
    }

    private final void n(Object[] objArr, int i, Object obj) {
        int iJ = j();
        Object[] objArrT = t(this.c);
        int i2 = i + 1;
        if (iJ < 32) {
            fcur.n(this.c, objArrT, i2, i, iJ);
            objArrT[i] = obj;
            this.b = objArr;
            this.c = objArrT;
            this.d++;
            return;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[31];
        fcur.n(objArr2, objArrT, i2, i, 31);
        objArrT[i] = obj;
        p(objArr, objArrT, w(obj2));
    }

    private final void o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        hvc hvcVar = new hvc(null);
        objArr.getClass();
        Object[] objArrY = y(objArr, i2, i, hvcVar);
        objArrY.getClass();
        Object obj = hvcVar.a;
        obj.getClass();
        this.c = (Object[]) obj;
        this.d = i;
        if (objArrY[1] == null) {
            this.b = (Object[]) objArrY[0];
            this.a = i2 - 5;
        } else {
            this.b = objArrY;
            this.a = i2;
        }
    }

    private final void p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = B(w(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = B(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void q(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrV;
        if (i3 <= 0) {
            hpq.a("requires at least one nullBuffer");
        }
        Object[] objArrT = t(objArr);
        objArr2[0] = objArrT;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            fcur.n(objArrT, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                objArrV = objArrT;
            } else {
                objArrV = v();
                i3--;
                objArr2[i3] = objArrV;
            }
            int i8 = i2 - i7;
            fcur.n(objArrT, objArr3, 0, i8, i2);
            fcur.n(objArrT, objArrV, i6, i4, i8);
            objArr3 = objArrV;
        }
        Iterator<E> it = collection.iterator();
        E(objArrT, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrV2 = v();
            E(objArrV2, 0, it);
            objArr2[i9] = objArrV2;
        }
        E(objArr3, 0, it);
    }

    private final boolean r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final Object[] s(Object[] objArr, int i, int i2, Object obj, hvc hvcVar) {
        Object obj2;
        int iA = hvl.a(i2, i);
        int i3 = iA + 1;
        if (i == 0) {
            hvcVar.a = objArr[31];
            Object[] objArrT = t(objArr);
            fcur.n(objArr, objArrT, i3, iA, 31);
            objArrT[iA] = obj;
            return objArrT;
        }
        Object[] objArrT2 = t(objArr);
        int i4 = i - 5;
        Object obj3 = objArrT2[iA];
        obj3.getClass();
        objArrT2[iA] = s((Object[]) obj3, i4, i2, obj, hvcVar);
        while (i3 < 32 && (obj2 = objArrT2[i3]) != null) {
            objArrT2[i3] = s((Object[]) obj2, i4, 0, hvcVar.a, hvcVar);
            i3++;
        }
        return objArrT2;
    }

    private final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] objArrV = v();
        fcur.x(objArr, objArrV, 0, fddu.g(objArr.length, 32), 6);
        return objArrV;
    }

    private final Object[] u(Object[] objArr, int i) {
        int i2 = 32 - i;
        if (r(objArr)) {
            fcur.n(objArr, objArr, i, 0, i2);
            return objArr;
        }
        Object[] objArrV = v();
        fcur.n(objArr, objArrV, i, 0, i2);
        return objArrV;
    }

    private final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            hpq.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = hvl.a(i, i2);
        Object obj = objArr[iA];
        obj.getClass();
        Object objX = x((Object[]) obj, i, i2 - 5);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (r(objArr)) {
                    fcur.d(objArr, null, i3, 32);
                }
                Object[] objArrV = v();
                fcur.n(objArr, objArrV, 0, 0, i3);
                objArr = objArrV;
            }
        }
        if (objX == objArr[iA]) {
            return objArr;
        }
        Object[] objArrT = t(objArr);
        objArrT[iA] = objX;
        return objArrT;
    }

    private final Object[] y(Object[] objArr, int i, int i2, hvc hvcVar) {
        Object[] objArrY;
        int iA = hvl.a(i2 - 1, i);
        if (i == 5) {
            hvcVar.a = objArr[iA];
            objArrY = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrY = y((Object[]) obj, i - 5, i2, hvcVar);
        }
        if (objArrY == null && iA == 0) {
            return null;
        }
        Object[] objArrT = t(objArr);
        objArrT[iA] = objArrY;
        return objArrT;
    }

    private final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            hpq.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            hpq.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrT = t(objArr);
        int iA = hvl.a(i, i2);
        int i3 = i2 - 5;
        objArrT[iA] = z((Object[]) objArrT[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrT[iA] = z((Object[]) objArrT[iA], 0, i3, it);
        }
        return objArrT;
    }

    @Override // defpackage.huu
    public final huv a() {
        huv hvdVar;
        Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            hvdVar = this.e;
        } else {
            this.h = new hwt();
            this.f = objArr;
            Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                hvdVar = new hvd(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                hvdVar = hvj.a;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.c, this.d);
                objArrCopyOf.getClass();
                hvdVar = new hvj(objArrCopyOf);
            }
        }
        this.e = hvdVar;
        return hvdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        hws.b(i, this.d);
        if (i == this.d) {
            add(e);
            return;
        }
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            n(this.b, i - i2, e);
            return;
        }
        hvc hvcVar = new hvc(null);
        Object[] objArr = this.b;
        objArr.getClass();
        n(s(objArr, this.a, i, e, hvcVar), 0, hvcVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        hvf<E> hvfVar;
        Collection<? extends E> collection2;
        Object[] objArrV;
        Object[][] objArr;
        hws.b(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            Object[] objArr2 = this.c;
            Object[] objArrT = t(objArr2);
            fcur.n(objArr2, objArrT, (size2 & 31) + 1, i3, j());
            E(objArrT, i3, collection.iterator());
            this.c = objArrT;
            this.d += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iJ = j();
        int size3 = this.d + collection.size();
        if (i >= i()) {
            objArrV = v();
            objArr = objArr3;
            hvfVar = this;
            collection2 = collection;
            hvfVar.q(collection2, i, this.c, iJ, objArr, size, objArrV);
        } else {
            hvfVar = this;
            collection2 = collection;
            int iF = F(size3);
            if (iF > iJ) {
                int i4 = iF - iJ;
                Object[] objArrU = u(hvfVar.c, i4);
                hvfVar.m(collection2, i, i4, objArr3, size, objArrU);
                objArr = objArr3;
                objArrV = objArrU;
            } else {
                Object[] objArr4 = hvfVar.c;
                objArrV = v();
                int i5 = iJ - iF;
                fcur.n(objArr4, objArrV, 0, i5, iJ);
                int i6 = 32 - i5;
                Object[] objArrU2 = u(hvfVar.c, i6);
                int i7 = size - 1;
                objArr3[i7] = objArrU2;
                hvfVar.m(collection2, i, i6, objArr3, i7, objArrU2);
                collection2 = collection2;
                objArr = objArr3;
                hvfVar = hvfVar;
            }
        }
        hvfVar.b = A(hvfVar.b, i2, objArr);
        hvfVar.c = objArrV;
        hvfVar.d += collection2.size();
        return true;
    }

    public final int b() {
        return this.modCount;
    }

    @Override // defpackage.fcul
    public final int c() {
        return this.d;
    }

    @Override // defpackage.fcul
    public final Object d(int i) {
        hws.a(i, this.d);
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            return k(this.b, i2, this.a, i - i2);
        }
        hvc hvcVar = new hvc(this.c[0]);
        Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, hvcVar), i2, this.a, 0);
        return hvcVar.a;
    }

    public final boolean e(fdap fdapVar) {
        Object[] objArrZ;
        int i;
        fdap fdapVar2 = fdapVar;
        int iJ = j();
        Object[] objArrX = null;
        hvc hvcVar = new hvc(null);
        boolean z = false;
        if (this.b != null) {
            ListIterator listIteratorL = l(0);
            int iG = 32;
            while (true) {
                if (iG == 32) {
                    if (!listIteratorL.hasNext()) {
                        iG = 32;
                        break;
                    }
                    iG = g(fdapVar2, (Object[]) listIteratorL.next(), 32, hvcVar);
                } else {
                    break;
                }
            }
            if (iG == 32) {
                int iH = h(fdapVar2, iJ, hvcVar);
                if (iH == 0) {
                    o(this.b, this.d, this.a);
                    iH = 0;
                }
                if (iH != iJ) {
                }
            } else {
                int iPreviousIndex = listIteratorL.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iF = iG;
                while (listIteratorL.hasNext()) {
                    iF = f(fdapVar2, (Object[]) listIteratorL.next(), 32, iF, hvcVar, arrayList2, arrayList);
                    fdapVar2 = fdapVar;
                }
                int iF2 = f(fdapVar, this.c, iJ, iF, hvcVar, arrayList2, arrayList);
                Object obj = hvcVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                fcur.d(objArr, null, iF2, 32);
                if (arrayList.isEmpty()) {
                    objArrZ = this.b;
                    objArrZ.getClass();
                } else {
                    objArrZ = z(this.b, iPreviousIndex, this.a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    hpq.a("invalid size");
                }
                if (size == 0) {
                    this.a = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.a;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.a = i - 5;
                        Object[] objArr2 = objArrZ[0];
                        objArr2.getClass();
                        objArrZ = objArr2;
                    }
                    objArrX = x(objArrZ, i2, i);
                }
                this.b = objArrX;
                this.c = objArr;
                this.d = size + iF2;
            }
            z = true;
        } else if (h(fdapVar2, iJ, hvcVar) != iJ) {
            z = true;
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        hws.a(i, this.d);
        if (i() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            objArr.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object obj = objArr[hvl.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<?> collection) {
        return e(new fdap() { // from class: hve
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        hws.a(i, this.d);
        if (i() > i) {
            hvc hvcVar = new hvc(null);
            Object[] objArr = this.b;
            objArr.getClass();
            this.b = D(objArr, this.a, i, e, hvcVar);
            return (E) hvcVar.a;
        }
        Object[] objArrT = t(this.c);
        if (objArrT != this.c) {
            this.modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrT[i2];
        objArrT[i2] = e;
        this.c = objArrT;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        hws.b(i, this.d);
        return new hvh(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        this.modCount++;
        int iJ = j();
        if (iJ < 32) {
            Object[] objArrT = t(this.c);
            objArrT[iJ] = e;
            this.c = objArrT;
            this.d++;
        } else {
            p(this.b, this.c, w(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iJ = j();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrT = t(this.c);
            E(objArrT, iJ, it);
            this.c = objArrT;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + iJ) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrT2 = t(this.c);
            E(objArrT2, iJ, it);
            objArr[0] = objArrT2;
            for (int i = 1; i < size; i++) {
                Object[] objArrV = v();
                E(objArrV, 0, it);
                objArr[i] = objArrV;
            }
            this.b = A(this.b, i(), objArr);
            Object[] objArrV2 = v();
            E(objArrV2, 0, it);
            this.c = objArrV2;
            this.d += collection.size();
        }
        return true;
    }
}
