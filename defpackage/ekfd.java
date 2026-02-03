package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfd extends AbstractMap implements Serializable, ekcb {
    transient Object[] a;
    transient Object[] b;
    public transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient ekcb g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public ekfd() {
        i();
    }

    private final int m(int i) {
        return i & (this.h.length - 1);
    }

    private final void n(int i, int i2) {
        ejwl.a(i != -1);
        int iM = m(i2);
        int[] iArr = this.h;
        int i3 = iArr[iM];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[iM] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.j[i3];
        }
    }

    private final void o(int i, int i2) {
        ejwl.a(i != -1);
        int iM = m(i2);
        int[] iArr = this.i;
        int i3 = iArr[iM];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[iM] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.k[i3];
        }
    }

    private final void p(int i) {
        int length = this.j.length;
        if (length < i) {
            int iF = ekfm.f(length, i);
            this.a = Arrays.copyOf(this.a, iF);
            this.b = Arrays.copyOf(this.b, iF);
            this.j = v(this.j, iF);
            this.k = v(this.k, iF);
            this.m = v(this.m, iF);
            this.f = v(this.f, iF);
        }
        if (this.h.length < i) {
            int iC = ekfh.c(i);
            this.h = u(iC);
            this.i = u(iC);
            for (int i2 = 0; i2 < this.c; i2++) {
                int iM = m(ekfh.b(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[iM];
                iArr2[iM] = i2;
                int iM2 = m(ekfh.b(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[iM2];
                iArr4[iM2] = i2;
            }
        }
    }

    private final void q(int i, int i2) {
        ejwl.a(i != -1);
        int iM = m(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iM];
        iArr2[iM] = i;
    }

    private final void r(int i, int i2) {
        ejwl.a(i != -1);
        int iM = m(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iM];
        iArr2[iM] = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        i();
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2, int i3) {
        int i4;
        int i5;
        ejwl.a(i != -1);
        n(i, i2);
        o(i, i3);
        t(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            t(i7, i);
            t(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iM = m(ekfh.b(obj));
            int[] iArr = this.h;
            int i9 = iArr[iM];
            if (i9 == i6) {
                iArr[iM] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int iM2 = m(ekfh.b(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[iM2];
            if (i11 == i6) {
                iArr3[iM2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void t(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private static int[] u(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] v(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m(i)];
        while (i2 != -1) {
            if (ejwh.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    final int b(Object obj) {
        return c(obj, ekfh.b(obj));
    }

    final int c(Object obj, int i) {
        return a(obj, i, this.h, this.j, this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return d(obj) != -1;
    }

    final int d(Object obj) {
        return e(obj, ekfh.b(obj));
    }

    final int e(Object obj, int i) {
        return a(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        ekew ekewVar = new ekew(this);
        this.p = ekewVar;
        return ekewVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        ekfa ekfaVar = new ekfa(this);
        this.o = ekfaVar;
        return ekfaVar;
    }

    final void g(int i, int i2) {
        s(i, i2, ekfh.b(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB == -1) {
            return null;
        }
        return this.b[iB];
    }

    final void h(int i, int i2) {
        s(i, ekfh.b(this.a[i]), i2);
    }

    final void i() {
        ekcw.c(16, "expectedSize");
        int iC = ekfh.c(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = u(iC);
        this.i = u(iC);
        this.j = u(16);
        this.k = u(16);
        this.e = -2;
        this.l = -2;
        this.m = u(16);
        this.f = u(16);
    }

    final Object j(Object obj, Object obj2) {
        int iB = ekfh.b(obj);
        int iE = e(obj, iB);
        if (iE != -1) {
            Object obj3 = this.a[iE];
            if (ejwh.a(obj3, obj2)) {
                return obj2;
            }
            k(iE, obj2);
            return obj3;
        }
        int i = this.l;
        int iB2 = ekfh.b(obj2);
        ejwl.f(c(obj2, iB2) == -1, "Key already present: %s", obj2);
        p(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        q(i2, iB2);
        r(this.c, iB);
        int i3 = i == -2 ? this.e : this.f[i];
        t(i, this.c);
        t(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public final void k(int i, Object obj) {
        ejwl.a(i != -1);
        int iC = c(obj, ekfh.b(obj));
        int i2 = this.l;
        if (iC != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = iC;
        }
        if (i == -2) {
            iC = this.f[-2];
        } else if (this.c != -2) {
            iC = -2;
        }
        t(this.m[i], this.f[i]);
        n(i, ekfh.b(this.a[i]));
        this.a[i] = obj;
        q(i, ekfh.b(obj));
        t(i2, i);
        t(i, iC);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        ekez ekezVar = new ekez(this);
        this.n = ekezVar;
        return ekezVar;
    }

    public final void l(int i, Object obj) {
        ejwl.a(i != -1);
        int iB = ekfh.b(obj);
        if (e(obj, iB) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        o(i, ekfh.b(this.b[i]));
        this.b[i] = obj;
        r(i, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.ekcb
    public final Object put(Object obj, Object obj2) {
        int iB = ekfh.b(obj);
        int iC = c(obj, iB);
        if (iC != -1) {
            Object obj3 = this.b[iC];
            if (ejwh.a(obj3, obj2)) {
                return obj2;
            }
            l(iC, obj2);
            return obj3;
        }
        int iB2 = ekfh.b(obj2);
        ejwl.f(e(obj2, iB2) == -1, "Value already present: %s", obj2);
        p(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        q(i, iB);
        r(this.c, iB2);
        t(this.l, this.c);
        t(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iB = ekfh.b(obj);
        int iC = c(obj, iB);
        if (iC == -1) {
            return null;
        }
        Object obj2 = this.b[iC];
        g(iC, iB);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
