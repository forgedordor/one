package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpno implements dpnm {
    private final hox a;
    private final dpns b;

    public dpno() {
        this(null);
    }

    @Override // defpackage.dpnq
    public final int a(long j, iyl iylVar) {
        iylVar.getClass();
        return kil.a(j) - iylVar.b;
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
        return (obj instanceof dpno) && fdbq.f(this.a, ((dpno) obj).a);
    }

    public final void f(dpom dpomVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        final dpom dpomVar2;
        dpomVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(636373235);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dpomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            dpomVar2 = dpomVar;
        } else {
            dpomVar2 = dpomVar;
            dpmgVar.b.g.a(dpomVar2, ics.e, dpmgVar.a, hmlVarC, Integer.valueOf((i2 & 14) | 48));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpnn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpno dpnoVar = this.a;
                    dpom dpomVar3 = dpomVar2;
                    int i4 = i;
                    dpnoVar.f(dpomVar3, dpmgVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.dpnq
    public final boolean g() {
        return false;
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
        f((dpom) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(1392417575);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            dpnrVar.a(dpns.b);
            objF = new dpom(j, dpnrVar.a(dpns.d));
            hmlVar.y(objF);
        }
        dpom dpomVar = (dpom) objF;
        hmlVar.o();
        hmlVar.o();
        return dpomVar;
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
        return "ScreenOverlay(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpno(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.f;
    }
}
