package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvj<E> extends hva<E> implements List<E>, hus {
    public static final hvj a = new hvj(new Object[0]);
    private final Object[] b;

    public hvj(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.huv
    public final huu b() {
        return new hvf(this, null, this.b, 0);
    }

    @Override // defpackage.huv
    public final huv c(Object obj) {
        if (a() >= 32) {
            return new hvd(this.b, hvl.c(obj), a() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + 1);
        objArrCopyOf.getClass();
        objArrCopyOf[a()] = obj;
        return new hvj(objArrCopyOf);
    }

    @Override // defpackage.huv
    public final huv d(int i, Object obj) {
        hws.b(i, a());
        if (i == a()) {
            return c(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            fcur.n(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new hvd(objArrCopyOf, hvl.c(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        Object[] objArr2 = this.b;
        Object[] objArr3 = new Object[iA];
        fcur.x(objArr2, objArr3, 0, i, 6);
        fcur.n(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new hvj(objArr3);
    }

    @Override // defpackage.hva, defpackage.huv
    public final huv e(Collection collection) {
        if (a() + collection.size() > 32) {
            huu huuVarB = b();
            huuVarB.addAll(collection);
            return huuVarB.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + collection.size());
        objArrCopyOf.getClass();
        int iA = a();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new hvj(objArrCopyOf);
    }

    @Override // defpackage.fcuh, java.util.List
    public final E get(int i) {
        hws.a(i, a());
        return (E) this.b[i];
    }

    @Override // defpackage.huv
    public final huv h(fdap fdapVar) {
        Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            Object obj = objArr[i];
            if (((Boolean) fdapVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    objArrCopyOf.getClass();
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        return iA == a() ? this : iA == 0 ? a : new hvj(fcur.g(objArrCopyOf, 0, iA));
    }

    @Override // defpackage.huv
    public final huv i(int i) {
        hws.a(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, a() - 1);
        objArrCopyOf.getClass();
        fcur.n(objArr, objArrCopyOf, i, i + 1, a());
        return new hvj(objArrCopyOf);
    }

    @Override // defpackage.fcuh, java.util.List
    public final int indexOf(Object obj) {
        return fcur.E(this.b, obj);
    }

    @Override // defpackage.huv
    public final huv j(int i, Object obj) {
        hws.a(i, a());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = obj;
        return new hvj(objArrCopyOf);
    }

    @Override // defpackage.fcuh, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (fdbq.f(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.fcuh, java.util.List
    public final ListIterator<E> listIterator(int i) {
        hws.b(i, a());
        return new hvb(this.b, i, a());
    }
}
