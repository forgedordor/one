package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpng implements dpnm {
    private final hox a;
    private final dpns b;

    public dpng() {
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
        return (obj instanceof dpng) && fdbq.f(this.a, ((dpng) obj).a);
    }

    public final void f(final dpmc dpmcVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        dpmcVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1263573331);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dpmcVar) : hmlVarC.F(dpmcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.a(dpmcVar.a, null, dpmcVar.b, dpmcVar.c, null, hxe.d(-93943765, new dpnf(dpmgVar, dpmcVar), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpne
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpng dpngVar = this.a;
                    dpmc dpmcVar2 = dpmcVar;
                    int i4 = i;
                    dpngVar.f(dpmcVar2, dpmgVar, (hml) obj, hpy.a(i4 | 1));
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
        f((dpmc) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(324561715);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            dpnrVar.a(dpns.c);
            dpnrVar.a(dpns.f);
            objF = new dpmc(j, dpnrVar.b);
            hmlVar.y(objF);
        }
        dpmc dpmcVar = (dpmc) objF;
        hmlVar.o();
        hmlVar.o();
        return dpmcVar;
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
        return "Footer(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpng(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.d;
    }
}
