package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnb implements dpnm {
    private final hox a;
    private final dpns b;

    public dpnb() {
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
        return (obj instanceof dpnb) && fdbq.f(this.a, ((dpnb) obj).a);
    }

    public final void f(dply dplyVar, final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        final dply dplyVar2;
        dplyVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1029493469);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dplyVar) : hmlVarC.F(dplyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dpmgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            dplyVar2 = dplyVar;
        } else {
            dplyVar2 = dplyVar;
            dpmgVar.b.e.a(dplyVar2, ics.e, dpmgVar.a, hmlVarC, Integer.valueOf((i2 & 14) | 48));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpna
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpnb dpnbVar = this.a;
                    dply dplyVar3 = dplyVar2;
                    int i4 = i;
                    dpnbVar.f(dplyVar3, dpmgVar, (hml) obj, hpy.a(i4 | 1));
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
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ void i(Object obj, dpmg dpmgVar, hml hmlVar) {
        f((dply) obj, dpmgVar, hmlVar, 0);
    }

    @Override // defpackage.dpnm
    public final /* bridge */ /* synthetic */ Object j(dpmg dpmgVar, long j, dpnr dpnrVar, hml hmlVar) {
        hmlVar.v(-9841081);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(dpmgVar) | hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            hox hoxVar = this.a;
            dpnrVar.a(dpns.f);
            dply dplyVar = new dply(j, hoxVar, dpnrVar.a(dpns.b), dpnrVar.a(dpns.d), dpnrVar.b);
            hmlVar.y(dplyVar);
            objF = dplyVar;
        }
        dply dplyVar2 = (dply) objF;
        hmlVar.o();
        hmlVar.o();
        return dplyVar2;
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
        return "Content(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dpnb(byte[] bArr) {
        this.a = new hpl(null, hsi.a);
        this.b = dpns.c;
    }
}
