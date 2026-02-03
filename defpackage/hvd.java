package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvd<E> extends hva<E> implements List<E>, huv {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public hvd(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            hpq.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return hvl.b(this.c);
    }

    private final huv m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                fcur.n(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new hvd(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new hvj(objArr);
        }
        hvc hvcVar = new hvc(null);
        Object[] objArrQ = q(objArr, i2, i - 1, hvcVar);
        objArrQ.getClass();
        Object obj = hvcVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new hvd(objArrQ, objArr3, i, i2);
        }
        Object obj2 = objArrQ[0];
        obj2.getClass();
        return new hvd((Object[]) obj2, objArr3, i, i2 - 5);
    }

    private final hvd n(Object[] objArr, int i, Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf.getClass();
        int i3 = i + 1;
        if (iL < 32) {
            fcur.n(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new hvd(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        fcur.n(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, hvl.c(obj2));
    }

    private final hvd o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new hvd(r(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new hvd(r(hvl.c(objArr), i4, objArr2), objArr3, i2, i4);
    }

    private final Object[] p(Object[] objArr, int i, int i2, Object obj, hvc hvcVar) {
        Object[] objArrCopyOf;
        int iA = hvl.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            fcur.n(objArr, objArrCopyOf, iA + 1, iA, 31);
            hvcVar.a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = p((Object[]) obj2, i3, i2, obj, hvcVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            obj3.getClass();
            objArrCopyOf2[iA] = p((Object[]) obj3, i3, 0, hvcVar.a, hvcVar);
        }
        return objArrCopyOf2;
    }

    private final Object[] q(Object[] objArr, int i, int i2, hvc hvcVar) {
        Object[] objArrQ;
        int iA = hvl.a(i2, i);
        if (i == 5) {
            hvcVar.a = objArr[iA];
            objArrQ = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, hvcVar);
        }
        if (objArrQ == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iA] = objArrQ;
        return objArrCopyOf;
    }

    private final Object[] r(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf.getClass();
        } else {
            objArrCopyOf = new Object[32];
        }
        int iA = hvl.a(this.c - 1, i);
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = r((Object[]) objArrCopyOf[iA], i - 5, objArr2);
        return objArrCopyOf;
    }

    private final Object[] s(Object[] objArr, int i, int i2, hvc hvcVar) {
        Object[] objArrCopyOf;
        int iA = hvl.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            fcur.n(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = hvcVar.a;
            hvcVar.a = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? hvl.a(l() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                obj.getClass();
                objArrCopyOf2[iA2] = s((Object[]) obj, i3, 0, hvcVar);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = s((Object[]) obj2, i3, i2, hvcVar);
        return objArrCopyOf2;
    }

    private final Object[] t(Object[] objArr, int i, int i2, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        int iA = hvl.a(i2, i);
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        obj2.getClass();
        objArrCopyOf[iA] = t((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.c;
    }

    @Override // defpackage.huv
    public final huv c(Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, hvl.c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iL] = obj;
        return new hvd(this.a, objArrCopyOf, i + 1, this.d);
    }

    @Override // defpackage.huv
    public final huv d(int i, Object obj) {
        int i2 = this.c;
        hws.b(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        hvc hvcVar = new hvc(null);
        return n(p(this.a, this.d, i, obj, hvcVar), 0, hvcVar.a);
    }

    @Override // defpackage.fcuh, java.util.List
    public final E get(int i) {
        Object[] objArr;
        hws.a(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[hvl.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.huv
    public final huv h(fdap fdapVar) {
        hvf hvfVarB = b();
        hvfVarB.e(fdapVar);
        return hvfVarB.a();
    }

    @Override // defpackage.huv
    public final huv i(int i) {
        hws.a(i, this.c);
        int iL = l();
        if (i >= iL) {
            return m(this.a, iL, this.d, i - iL);
        }
        Object[] objArr = this.a;
        int i2 = this.d;
        return m(s(objArr, i2, i, new hvc(this.b[0])), iL, i2, 0);
    }

    @Override // defpackage.huv
    public final huv j(int i, Object obj) {
        int i2 = this.c;
        hws.a(i, i2);
        if (l() > i) {
            Object[] objArr = this.a;
            int i3 = this.d;
            return new hvd(t(objArr, i3, i, obj), this.b, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i & 31] = obj;
        return new hvd(this.a, objArrCopyOf, i2, this.d);
    }

    @Override // defpackage.huv
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final hvf b() {
        return new hvf(this, this.a, this.b, this.d);
    }

    @Override // defpackage.fcuh, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.c;
        hws.b(i, i2);
        return new hvg(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
