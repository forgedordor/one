package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnd implements dpnm {
    private final hox a;
    private final dpns b;

    public dpnd() {
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
        return (obj instanceof dpnd) && fdbq.f(this.a, ((dpnd) obj).a);
    }

    public final void f(dplu dpluVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        final dplu dpluVar2;
        dpluVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(305794259);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dpluVar) : hmlVarC.F(dpluVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            dpluVar2 = dpluVar;
        } else {
            dpluVar2 = dpluVar;
            dpmgVar.b.f.a(dpluVar2, ics.e, dpmgVar.a, hmlVarC, Integer.valueOf((i2 & 14) | 48));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpnc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpnd dpndVar = this.a;
                    dplu dpluVar3 = dpluVar2;
                    int i4 = i;
                    dpndVar.f(dpluVar3, dpmgVar, (hml) obj, hpy.a(i4 | 1));
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
        f((dplu) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(-997794261);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            dpnrVar.a(dpns.c);
            dpnrVar.a(dpns.b);
            objF = new dplu(j, dpnrVar.a(dpns.d));
            hmlVar.y(objF);
        }
        dplu dpluVar = (dplu) objF;
        hmlVar.o();
        hmlVar.o();
        return dpluVar;
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
        return "ContentOverlay(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpnd(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.e;
    }
}
