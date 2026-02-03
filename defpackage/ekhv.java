package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekhv extends ekfl {
    Object[] d;
    private int e;

    public ekhv() {
        super(4);
    }

    public ekhx g() {
        ekhx ekhxVarJ;
        int i = this.b;
        if (i == 0) {
            return ekon.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new ekph(obj);
        }
        if (this.d == null || ekhx.d(i) != this.d.length) {
            ekhxVarJ = ekhx.j(this.b, this.a);
            this.b = ekhxVarJ.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (ekhx.w(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            ekhxVarJ = new ekon(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return ekhxVarJ;
    }

    public final void h(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    @Override // defpackage.ekfl, defpackage.ekfm
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iD = ekhx.d(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iD <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iA = ekfh.a(iHashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = iA & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void k(ekhv ekhvVar) {
        if (this.d == null) {
            a(ekhvVar.a, ekhvVar.b);
            return;
        }
        for (int i = 0; i < ekhvVar.b; i++) {
            Object obj = ekhvVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public ekhv(int i) {
        super(i);
        this.d = new Object[ekhx.d(i)];
    }
}
