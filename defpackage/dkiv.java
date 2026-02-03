package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkiv implements fdau {
    final /* synthetic */ dkkr a;
    final /* synthetic */ dklt b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dkgn e;
    final /* synthetic */ ddp f;
    final /* synthetic */ fdau g;
    final /* synthetic */ float h;

    public dkiv(dkkr dkkrVar, dklt dkltVar, float f, boolean z, dkgn dkgnVar, ddp ddpVar, fdau fdauVar, float f2) {
        this.a = dkkrVar;
        this.b = dkltVar;
        this.c = f;
        this.d = z;
        this.e = dkgnVar;
        this.f = ddpVar;
        this.g = fdauVar;
        this.h = f2;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVarI;
        dkkr dkkrVar;
        float f;
        fdau fdauVar;
        kph kphVar;
        dkkr dkkrVar2;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkkr dkkrVar3 = this.a;
            dkoj.a(dkkrVar3.g, dkkrVar3.a, dkkrVar3.o, hmlVar, 0, 0);
            dklt dkltVar = this.b;
            dkgv dkgvVar = dkkrVar3.y.b;
            ico icoVar = ics.e;
            dkke.r(dkkrVar3, dkltVar, efs.b(icoVar, dkgvVar == dkgv.c ? this.c : 0.0f, 0.0f), hmlVar, 0);
            if (!dkke.o(dkkrVar3) || (dkkrVar3.v.c && this.d)) {
                hmlVar.v(-976308507);
                icsVarI = icoVar;
                dkkrVar = dkkrVar3;
                f = 0.0f;
                dkke.f(dkkrVar, this.d, this.e, this.f, null, this.g, hmlVar, 4096, 16);
                hmlVar = hmlVar;
                hmlVar.o();
            } else {
                hmlVar.v(-980187506);
                ddp ddpVar = this.f;
                dkgn dkgnVar = this.e;
                float f2 = this.c;
                float f3 = this.h;
                boolean z = this.d;
                fdau fdauVar2 = this.g;
                hmlVar.v(-1066585843);
                hmlVar.v(-487940011);
                hmlVar.o();
                kio kioVar = (kio) hmlVar.e(jmh.e);
                Object objF = hmlVar.f();
                Object obj4 = hmk.a;
                if (objF == obj4) {
                    objF = new kpv(kioVar);
                    hmlVar.y(objF);
                }
                kpv kpvVar = (kpv) objF;
                Object objF2 = hmlVar.f();
                if (objF2 == obj4) {
                    objF2 = new kph();
                    hmlVar.y(objF2);
                }
                kph kphVar2 = (kph) objF2;
                Object objF3 = hmlVar.f();
                if (objF3 == obj4) {
                    fdauVar = fdauVar2;
                    hpl hplVar = new hpl(false, hsi.a);
                    hmlVar.y(hplVar);
                    objF3 = hplVar;
                } else {
                    fdauVar = fdauVar2;
                }
                hox hoxVar = (hox) objF3;
                Object objF4 = hmlVar.f();
                if (objF4 == obj4) {
                    objF4 = new kpo(kphVar2);
                    hmlVar.y(objF4);
                }
                kpo kpoVar = (kpo) objF4;
                Object objF5 = hmlVar.f();
                if (objF5 == obj4) {
                    kphVar = kphVar2;
                    dkkrVar2 = dkkrVar3;
                    hpl hplVar2 = new hpl(fctx.a, hpb.a);
                    hmlVar.y(hplVar2);
                    objF5 = hplVar2;
                } else {
                    kphVar = kphVar2;
                    dkkrVar2 = dkkrVar3;
                }
                hox hoxVar2 = (hox) objF5;
                boolean zF = hmlVar.F(kpvVar) | hmlVar.B(257);
                Object objF6 = hmlVar.f();
                if (zF || objF6 == obj4) {
                    objF6 = new dkir(hoxVar2, kpvVar, kpoVar, hoxVar);
                    hmlVar.y(objF6);
                }
                ixm ixmVar = (ixm) objF6;
                Object objF7 = hmlVar.f();
                if (objF7 == obj4) {
                    objF7 = new dkis(hoxVar, kpoVar);
                    hmlVar.y(objF7);
                }
                boolean zF2 = hmlVar.F(kpvVar);
                Object objF8 = hmlVar.f();
                if (zF2 || objF8 == obj4) {
                    objF8 = new dkit(kpvVar);
                    hmlVar.y(objF8);
                }
                dkkr dkkrVar4 = dkkrVar2;
                iwh.b(jsh.c(icoVar, false, (fdap) objF8), hxe.d(-1759682870, new dkiu(hoxVar2, kphVar, dkkrVar4, ddpVar, dkgnVar, f2, dkltVar, f3, z, fdauVar), hmlVar), ixmVar, hmlVar, 48);
                hmlVar.o();
                hmlVar.o();
                icsVarI = icoVar;
                dkkrVar = dkkrVar4;
                f = 0.0f;
            }
            if (this.e.b() && (!dkke.o(dkkrVar) || (dkkrVar.v.c && this.d))) {
                if (dkks.f(dkkrVar)) {
                    icsVarI = efy.i(icsVarI, 19.0f, f, 2);
                }
                dkke.g(efs.b(icsVarI, this.c, f), dkkrVar, dkkrVar.f, dkltVar, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
