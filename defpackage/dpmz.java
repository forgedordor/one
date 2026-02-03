package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmz implements dpnm {
    private final hox a;
    private final dpns b;

    public dpmz() {
        this(null);
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ int a(long j, iyl iylVar) {
        iylVar.getClass();
        return 0;
    }

    @Override // defpackage.dpnq
    public final hox b() {
        return this.a;
    }

    @Override // defpackage.dpnq
    public final dpns c() {
        return this.b;
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ List d(izm izmVar, dpmg dpmgVar, long j, dpnr dpnrVar) {
        return dpmx.a(this, izmVar, dpmgVar, j, dpnrVar);
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ void e(iyk iykVar, long j, iyl iylVar) {
        dpmx.b(this, iykVar, j, iylVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpmz) && fdbq.f(this.a, ((dpmz) obj).a);
    }

    public final void f(dpll dpllVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        final dpll dpllVar2;
        dpllVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1533225715);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dpllVar) : hmlVarC.F(dpllVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            dpllVar2 = dpllVar;
        } else {
            dpllVar2 = dpllVar;
            dpmgVar.b.b.a(dpllVar2, ics.e, dpmgVar.a, hmlVarC, Integer.valueOf((i2 & 14) | 48));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpmy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpmz dpmzVar = this.a;
                    dpll dpllVar3 = dpllVar2;
                    int i4 = i;
                    dpmzVar.f(dpllVar3, dpmgVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.dpnq
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ void i(Object obj, dpmg dpmgVar, hml hmlVar) {
        f((dpll) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(-1199927911);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            dpnrVar.a(dpns.c);
            objF = new dpll(j, dpnrVar.b);
            hmlVar.y(objF);
        }
        dpll dpllVar = (dpll) objF;
        hmlVar.o();
        hmlVar.o();
        return dpllVar;
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ void k(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        dpnl.a(this, dpmgVar, j, dpnrVar, hmlVar);
    }

    @Override // defpackage.dpnq
    public final /* synthetic */ void l(iyl iylVar) {
        iylVar.getClass();
    }

    public final String toString() {
        return "Background(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpmz(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.a;
    }
}
