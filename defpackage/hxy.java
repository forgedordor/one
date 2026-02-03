package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxy {
    public static final Object a(Object[] objArr, fdae fdaeVar, hml hmlVar, int i) {
        return e(Arrays.copyOf(objArr, 0), hyv.a, fdaeVar, hmlVar, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object b(Object[] objArr, hyr hyrVar, fdae fdaeVar, hml hmlVar, int i) {
        return e(Arrays.copyOf(objArr, objArr.length), hyrVar, fdaeVar, hmlVar, (i & 112) | 384 | ((i << 3) & 7168), 0);
    }

    public static final String c(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    @fcsv
    public static final hox d(Object[] objArr, final hyr hyrVar, fdae fdaeVar, hml hmlVar, int i) {
        return (hox) e(Arrays.copyOf(objArr, 0), new hyu(new fdat() { // from class: hxv
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                hya hyaVar = (hya) obj;
                hox hoxVar = (hox) obj2;
                if (!(hoxVar instanceof hzy)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                hzy hzyVar = (hzy) hoxVar;
                Object objB = hyrVar.b(hyaVar, hzyVar.a());
                if (objB != null) {
                    return new hpl(objB, hzyVar.f());
                }
                return null;
            }
        }, new hxx(hyrVar)), fdaeVar, hmlVar, i & 8064, 0);
    }

    @fcsv
    public static final Object e(Object[] objArr, hyr hyrVar, fdae fdaeVar, hml hmlVar, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object objA;
        if ((i2 & 2) != 0) {
            hyrVar = hyv.a;
        }
        final hyr hyrVar2 = hyrVar;
        final String string = Long.toString(hmg.b(hmlVar), 36);
        string.getClass();
        hyrVar2.getClass();
        final hyk hykVar = (hyk) hmlVar.e(hyo.a);
        Object objF = hmlVar.f();
        Object obj2 = hmk.a;
        if (objF == obj2) {
            Object objA2 = (hykVar == null || (objA = hykVar.a(string)) == null) ? null : hyrVar2.a(objA);
            if (objA2 == null) {
                objA2 = fdaeVar.invoke();
            }
            objArr2 = objArr;
            Object hyaVar = new hya(hyrVar2, hykVar, string, objA2, objArr2);
            hmlVar.y(hyaVar);
            objF = hyaVar;
        } else {
            objArr2 = objArr;
        }
        final hya hyaVar2 = (hya) objF;
        Object objInvoke = Arrays.equals(objArr2, hyaVar2.e) ? hyaVar2.d : null;
        if (objInvoke == null) {
            objInvoke = fdaeVar.invoke();
        }
        boolean zF = hmlVar.F(hyaVar2);
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !hmlVar.F(hyrVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zF2 = zF | z | hmlVar.F(hykVar) | hmlVar.D(string) | hmlVar.F(objInvoke) | hmlVar.F(objArr2);
        Object objF2 = hmlVar.f();
        if (zF2 || objF2 == obj2) {
            Object obj3 = objInvoke;
            final Object[] objArr3 = objArr2;
            obj = obj3;
            Object obj4 = new fdae() { // from class: hxw
                @Override // defpackage.fdae
                public final Object invoke() {
                    boolean z2;
                    hya hyaVar3 = hyaVar2;
                    hyk hykVar2 = hyaVar3.b;
                    hyk hykVar3 = hykVar;
                    boolean z3 = true;
                    if (hykVar2 != hykVar3) {
                        hyaVar3.b = hykVar3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str = string;
                    if (fdbq.f(hyaVar3.c, str)) {
                        z3 = z2;
                    } else {
                        hyaVar3.c = str;
                    }
                    Object[] objArr4 = objArr3;
                    Object obj5 = obj;
                    hyaVar3.a = hyrVar2;
                    hyaVar3.d = obj5;
                    hyaVar3.e = objArr4;
                    hyl hylVar = hyaVar3.f;
                    if (hylVar != null && z3) {
                        hylVar.a();
                        hyaVar3.f = null;
                        hyaVar3.a();
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(obj4);
            objF2 = obj4;
        } else {
            obj = objInvoke;
        }
        hob.i((fdae) objF2, hmlVar);
        return obj;
    }
}
