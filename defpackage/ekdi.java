package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekdi extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public ekdi() {
        p(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.g(i, "Invalid size: "));
        }
        p(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itK = k();
        while (itK.hasNext()) {
            Map.Entry entry = (Map.Entry) itK.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objG = ekdl.g(i2);
        if (i4 != 0) {
            ekdl.i(objG, i3 & i5, i4 + 1);
        }
        Object objI = i();
        int[] iArrV = v();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = ekdl.e(objI, i6);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrV[i7];
                int iA = ekdl.a(i8, i) | i6;
                int i9 = iA & i5;
                int iE2 = ekdl.e(objG, i9);
                ekdl.i(objG, i9, iE);
                iArrV[i7] = ekdl.b(iA, iE2, i5);
                iE = i8 & i;
            }
        }
        this.g = objG;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = ekdl.b(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        ejwl.m(u(), "Arrays already allocated");
        int i = this.e;
        int iF = ekdl.f(i);
        this.g = ekdl.g(iF);
        z(iF - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        Map mapN = n();
        if (mapN != null) {
            this.e = eonc.k(size(), 3);
            mapN.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(w(), 0, this.f, (Object) null);
        Arrays.fill(x(), 0, this.f, (Object) null);
        ekdl.h(i());
        Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapN = n();
        return mapN != null ? mapN.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return mapN.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (ejwh.a(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        ekdd ekddVar = new ekdd(this);
        this.i = ekddVar;
        return ekddVar;
    }

    public final int f(Object obj) {
        if (u()) {
            return -1;
        }
        int iB = ekfh.b(obj);
        int iE = e();
        int iE2 = ekdl.e(i(), iB & iE);
        if (iE2 == 0) {
            return -1;
        }
        int iA = ekdl.a(iB, iE);
        do {
            int i = iE2 - 1;
            int i2 = v()[i];
            if (ekdl.a(i2, iE) == iA && ejwh.a(obj, g(i))) {
                return i;
            }
            iE2 = i2 & iE;
        } while (iE2 != 0);
        return -1;
    }

    public final Object g(int i) {
        return w()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return mapN.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return j(iF);
    }

    public final Object h(Object obj) {
        int iE;
        int iD;
        if (u() || (iD = ekdl.d(obj, null, (iE = e()), i(), v(), w(), null)) == -1) {
            return a;
        }
        Object objJ = j(iD);
        r(iD, iE);
        this.f--;
        o();
        return objJ;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return x()[i];
    }

    final Iterator k() {
        Map mapN = n();
        return mapN != null ? mapN.entrySet().iterator() : new ekdb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        ekdf ekdfVar = new ekdf(this);
        this.h = ekdfVar;
        return ekdfVar;
    }

    public Map l() {
        Map mapM = m(e() + 1);
        int iC = c();
        while (iC >= 0) {
            mapM.put(g(iC), j(iC));
            iC = d(iC);
        }
        this.g = mapM;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return mapM;
    }

    public Map m(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    final Map n() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void o() {
        this.e += 32;
    }

    public void p(int i) {
        ejwl.b(i >= 0, "Expected size must be >= 0");
        this.e = eonc.k(i, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (u()) {
            b();
        }
        Map mapN = n();
        if (mapN != null) {
            return mapN.put(obj, obj2);
        }
        int[] iArrV = v();
        Object[] objArrW = w();
        Object[] objArrX = x();
        int i = this.f;
        int i2 = i + 1;
        int iB = ekfh.b(obj);
        int iE = e();
        int i3 = iB & iE;
        int iE2 = ekdl.e(i(), i3);
        if (iE2 != 0) {
            int iA = ekdl.a(iB, iE);
            int i4 = 0;
            while (true) {
                int i5 = iE2 - 1;
                int i6 = iArrV[i5];
                if (ekdl.a(i6, iE) == iA && ejwh.a(obj, objArrW[i5])) {
                    Object obj3 = objArrX[i5];
                    objArrX[i5] = obj2;
                    return obj3;
                }
                int i7 = i6 & iE;
                i4++;
                if (i7 != 0) {
                    obj = obj;
                    obj2 = obj2;
                    iE2 = i7;
                } else {
                    if (i4 >= 9) {
                        return l().put(obj, obj2);
                    }
                    if (i2 > iE) {
                        iE = y(iE, ekdl.c(iE), iB, i);
                    } else {
                        iArrV[i5] = ekdl.b(i6, i2, iE);
                    }
                }
            }
        } else if (i2 > iE) {
            iE = y(iE, ekdl.c(iE), iB, i);
        } else {
            ekdl.i(i(), i3, i2);
        }
        int length = v().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            s(iMin);
        }
        q(i, obj, obj2, iB, iE);
        this.f = i2;
        o();
        return null;
    }

    public void q(int i, Object obj, Object obj2, int i2, int i3) {
        v()[i] = ekdl.b(i2, 0, i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        Object objI = i();
        int[] iArrV = v();
        Object[] objArrW = w();
        Object[] objArrX = x();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrW[i] = null;
            objArrX[i] = null;
            iArrV[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrW[i3];
        objArrW[i] = obj;
        objArrX[i] = objArrX[i3];
        objArrW[i3] = null;
        objArrX[i3] = null;
        iArrV[i] = iArrV[i3];
        iArrV[i3] = 0;
        int iB = ekfh.b(obj) & i2;
        int iE = ekdl.e(objI, iB);
        if (iE == size) {
            ekdl.i(objI, iB, i4);
            return;
        }
        while (true) {
            int i5 = iE - 1;
            int i6 = iArrV[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrV[i5] = ekdl.b(i6, i4, i2);
                return;
            }
            iE = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return mapN.remove(obj);
        }
        Object objH = h(obj);
        if (objH == a) {
            return null;
        }
        return objH;
    }

    public void s(int i) {
        this.b = Arrays.copyOf(v(), i);
        this.c = Arrays.copyOf(w(), i);
        this.d = Arrays.copyOf(x(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapN = n();
        return mapN != null ? mapN.size() : this.f;
    }

    public final void t(int i, Object obj) {
        x()[i] = obj;
    }

    final boolean u() {
        return this.g == null;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        ekdh ekdhVar = new ekdh(this);
        this.j = ekdhVar;
        return ekdhVar;
    }

    public final Object[] w() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] x() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public ekdi(int i) {
        p(i);
    }
}
