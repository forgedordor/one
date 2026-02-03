package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxd implements hwv {
    public final boolean a;
    public Object b;
    public List c;
    public hpx d;
    private final int e;

    public hxd(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void k(hml hmlVar) {
        hpx hpxVarP;
        if (!this.a || (hpxVarP = ((hmw) hmlVar).P()) == null) {
            return;
        }
        hpxVarP.n();
        if (hxe.e(this.d, hpxVarP)) {
            this.d = hpxVarP;
            return;
        }
        List list = this.c;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(hpxVarP);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (hxe.e((hpx) list.get(i), hpxVarP)) {
                list.set(i, hpxVarP);
                return;
            }
        }
        list.add(hpxVarP);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((hml) obj, ((Number) obj2).intValue());
    }

    public final Object b(hml hmlVar, int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = i | (hmlVarC.D(this) ? hxe.b(0) : hxe.c(0));
        Object obj = this.b;
        obj.getClass();
        fdcm.e(obj, 2);
        Object objA = ((fdat) obj).a(hmlVarC, Integer.valueOf(iB));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new hxc(this);
        }
        return objA;
    }

    public final Object c(final Object obj, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(1) : hxe.c(1);
        Object obj2 = this.b;
        obj2.getClass();
        fdcm.e(obj2, 3);
        Object objA = ((fdau) obj2).a(obj, hmlVarC, Integer.valueOf(iB | i));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hxa
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    hxd hxdVar = this.a;
                    int iA = hpy.a(i);
                    hxdVar.c(obj, (hml) obj3, iA | 1);
                    return fctx.a;
                }
            };
        }
        return objA;
    }

    public final Object d(final Object obj, final Object obj2, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(2) : hxe.c(2);
        Object obj3 = this.b;
        obj3.getClass();
        fdcm.e(obj3, 4);
        Object objA = ((fdav) obj3).a(obj, obj2, hmlVarC, Integer.valueOf(iB | i));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hwy
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    hxd hxdVar = this.a;
                    Object obj6 = obj;
                    int iA = hpy.a(i);
                    hxdVar.d(obj6, obj2, (hml) obj4, iA | 1);
                    return fctx.a;
                }
            };
        }
        return objA;
    }

    public final Object e(final Object obj, final Object obj2, final Object obj3, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(3) : hxe.c(3);
        Object obj4 = this.b;
        obj4.getClass();
        fdcm.e(obj4, 5);
        Object objA = ((fdaw) obj4).a(obj, obj2, obj3, hmlVarC, Integer.valueOf(iB | i));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hwz
                @Override // defpackage.fdat
                public final Object a(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    hxd hxdVar = this.a;
                    Object obj7 = obj;
                    Object obj8 = obj2;
                    hxdVar.e(obj7, obj8, obj3, (hml) obj5, hpy.a(i) | 1);
                    return fctx.a;
                }
            };
        }
        return objA;
    }

    public final Object f(final Object obj, final Object obj2, final Object obj3, final Object obj4, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(4) : hxe.c(4);
        Object obj5 = this.b;
        obj5.getClass();
        fdcm.e(obj5, 6);
        Object objA = ((fdax) obj5).a(obj, obj2, obj3, obj4, hmlVarC, Integer.valueOf(iB | i));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hww
                @Override // defpackage.fdat
                public final Object a(Object obj6, Object obj7) {
                    ((Integer) obj7).intValue();
                    hxd hxdVar = this.a;
                    Object obj8 = obj;
                    Object obj9 = obj2;
                    Object obj10 = obj3;
                    hxdVar.f(obj8, obj9, obj10, obj4, (hml) obj6, hpy.a(i) | 1);
                    return fctx.a;
                }
            };
        }
        return objA;
    }

    public final Object g(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(5) : hxe.c(5);
        Object obj6 = this.b;
        obj6.getClass();
        fdcm.e(obj6, 7);
        Object objH = ((fday) obj6).h(obj, obj2, obj3, obj4, obj5, hmlVarC, Integer.valueOf(i | iB));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hxb
                @Override // defpackage.fdat
                public final Object a(Object obj7, Object obj8) {
                    ((Integer) obj8).intValue();
                    hxd hxdVar = this.a;
                    Object obj9 = obj;
                    Object obj10 = obj2;
                    Object obj11 = obj3;
                    Object obj12 = obj4;
                    hxdVar.g(obj9, obj10, obj11, obj12, obj5, (hml) obj7, hpy.a(i) | 1);
                    return fctx.a;
                }
            };
        }
        return objH;
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return g(obj, obj2, obj3, obj4, obj5, (hml) obj6, ((Number) obj7).intValue());
    }

    public final Object i(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(this.e);
        k(hmlVarC);
        int iB = hmlVarC.D(this) ? hxe.b(6) : hxe.c(6);
        Object obj7 = this.b;
        obj7.getClass();
        fdcm.e(obj7, 8);
        Object objJ = ((fdaz) obj7).j(obj, obj2, obj3, obj4, obj5, obj6, hmlVarC, Integer.valueOf(i | iB));
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hwx
                @Override // defpackage.fdat
                public final Object a(Object obj8, Object obj9) {
                    ((Integer) obj9).intValue();
                    hxd hxdVar = this.a;
                    Object obj10 = obj;
                    Object obj11 = obj2;
                    Object obj12 = obj3;
                    Object obj13 = obj4;
                    Object obj14 = obj5;
                    hxdVar.i(obj10, obj11, obj12, obj13, obj14, obj6, (hml) obj8, hpy.a(i) | 1);
                    return fctx.a;
                }
            };
        }
        return objJ;
    }

    @Override // defpackage.fdaz
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return i(obj, obj2, obj3, obj4, obj5, obj6, (hml) obj7, ((Number) obj8).intValue());
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (hml) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (hml) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (hml) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (hml) obj5, ((Number) obj6).intValue());
    }
}
