package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class hui {
    public final cuz a;

    public /* synthetic */ hui(cuz cuzVar) {
        this.a = cuzVar;
    }

    public static final Object a(cuz cuzVar, Object obj) {
        Object objF = cuzVar.f(obj);
        if (objF == null) {
            return null;
        }
        if (!(objF instanceof cuu)) {
            cuzVar.b(obj);
            return objF;
        }
        cuu cuuVar = (cuu) objF;
        if (cuuVar.o()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = cuuVar.c - 1;
        Object objL = cuuVar.l(i);
        cuuVar.a(i);
        objL.getClass();
        if (cuuVar.o()) {
            cuzVar.b(obj);
        }
        if (cuuVar.c != 1) {
            return objL;
        }
        cuzVar.e(obj, cuuVar.k());
        return objL;
    }

    public static final void b(cuz cuzVar, Object obj, Object obj2) {
        int iA = cuzVar.a(obj);
        boolean z = iA < 0;
        Object obj3 = z ? null : cuzVar.c[iA];
        if (obj3 != null) {
            if (obj3 instanceof cuu) {
                cuu cuuVar = (cuu) obj3;
                cuuVar.h(obj2);
                obj2 = cuuVar;
            } else {
                obj2 = cvi.a(obj3, obj2);
            }
        }
        if (!z) {
            cuzVar.c[iA] = obj2;
            return;
        }
        int i = ~iA;
        cuzVar.b[i] = obj;
        cuzVar.c[i] = obj2;
    }

    public static final void c(cuz cuzVar, Object obj, fdap fdapVar) {
        Object objF = cuzVar.f(obj);
        if (objF != null) {
            if (!(objF instanceof cuu)) {
                if (((Boolean) fdapVar.invoke(objF)).booleanValue()) {
                    cuzVar.b(obj);
                    return;
                }
                return;
            }
            cuu cuuVar = (cuu) objF;
            int i = cuuVar.c;
            Object[] objArr = cuuVar.b;
            int i2 = 0;
            fddq fddqVarR = fddu.r(0, cuuVar.c);
            int i3 = fddqVarR.a;
            int i4 = fddqVarR.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) fdapVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            fcur.d(objArr, null, i - i2, i);
            cuuVar.c -= i2;
            if (cuuVar.o()) {
                cuzVar.b(obj);
            }
            if (cuuVar.c == 0) {
                cuzVar.e(obj, cuuVar.k());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hui) && fdbq.f(this.a, ((hui) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
