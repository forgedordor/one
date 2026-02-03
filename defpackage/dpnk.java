package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnk implements dpnm {
    private final hox a;
    private final dpns b;

    public dpnk() {
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
        return (obj instanceof dpnk) && fdbq.f(this.a, ((dpnk) obj).a);
    }

    public final void f(final dpme dpmeVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        dpmeVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-928677613);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dpmeVar) : hmlVarC.F(dpmeVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.a(dpmeVar.a, null, dpmeVar.c, dpmeVar.d, null, hxe.d(2008772587, new dpni(dpmgVar, dpmeVar), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpnh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpnk dpnkVar = this.a;
                    dpme dpmeVar2 = dpmeVar;
                    int i4 = i;
                    dpnkVar.f(dpmeVar2, dpmgVar, (hml) obj, hpy.a(i4 | 1));
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
        f((dpme) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(1145151895);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            dpnrVar.a(dpns.c);
            dpnrVar.a(dpns.f);
            objF = new dpme(j, dpnrVar.b, new dpnj(dpmgVar.c));
            hmlVar.y(objF);
        }
        dpme dpmeVar = (dpme) objF;
        hmlVar.o();
        hmlVar.o();
        return dpmeVar;
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
        return "Header(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpnk(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.b;
    }
}
