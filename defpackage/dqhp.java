package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhp implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;
    final /* synthetic */ dqiu c;
    final /* synthetic */ dipu d;

    public dqhp(hox hoxVar, kph kphVar, dqiu dqiuVar, dipu dipuVar) {
        this.a = hoxVar;
        this.b = kphVar;
        this.c = dqiuVar;
        this.d = dipuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(fctx.a);
            kph kphVar = this.b;
            kphVar.c();
            hmlVar.v(610504031);
            kpg kpgVarB = kphVar.b();
            kow kowVarA = kpgVarB.a();
            kow kowVarB = kpgVarB.b();
            kow kowVarC = kpgVarB.c();
            dqiu dqiuVar = this.c;
            boolean zBooleanValue = ((Boolean) hro.a(dqiuVar.b, hmlVar).a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) hro.a(dqiuVar.c, hmlVar).a()).booleanValue();
            ico icoVar = ics.e;
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(kowVarB);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new dqhq(kowVarB);
                hmlVar.y(objF);
            }
            hmlVar.o();
            dqfw.a(zBooleanValue, zBooleanValue2, kph.d(icoVar, kowVarA, (fdap) objF), dqiuVar.f, dqiuVar.g, hmlVar, 0);
            dipu dipuVar = this.d;
            hmlVar.v(-1633490746);
            boolean zD2 = hmlVar.D(kowVarA) | hmlVar.D(kowVarC);
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new dqhr(kowVarA, kowVarC);
                hmlVar.y(objF2);
            }
            hmlVar.o();
            dipt.a(dipuVar, kph.d(icoVar, kowVarB, (fdap) objF2), 0L, 0L, 3.0f, 7.0f, hmlVar, 221184, 12);
            dpzo dpzoVarF = dqid.f(dqiuVar, dpzt.c(hmlVar), hmlVar);
            dpzoVarF.getClass();
            hmlVar.v(1849434622);
            Object objF3 = hmlVar.f();
            if (objF3 == hmk.a) {
                objF3 = dqhs.a;
                hmlVar.y(objF3);
            }
            hmlVar.o();
            dpzt.a(dpzoVarF, kph.d(icoVar, kowVarC, (fdap) objF3), hmlVar, 0, 0);
            hmlVar.o();
            hmlVar.v(1659148056);
            hmlVar.o();
        }
        return fctx.a;
    }
}
