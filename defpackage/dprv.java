package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprv implements fdau {
    final /* synthetic */ dplv a;
    final /* synthetic */ dpsb b;
    final /* synthetic */ dprl c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdav e;

    public dprv(dplv dplvVar, dpsb dpsbVar, dprl dprlVar, fdap fdapVar, fdav fdavVar) {
        this.a = dplvVar;
        this.b = dpsbVar;
        this.c = dprlVar;
        this.d = fdapVar;
        this.e = fdavVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarA = edkVar.a(ics.e, ibw.e);
            dplv dplvVar = this.a;
            dpsb dpsbVar = this.b;
            dprl dprlVar = this.c;
            fdap fdapVar = this.d;
            fdav fdavVar = this.e;
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
            kph kphVar = (kph) objF2;
            Object objF3 = hmlVar.f();
            if (objF3 == obj4) {
                hpl hplVar = new hpl(false, hsi.a);
                hmlVar.y(hplVar);
                objF3 = hplVar;
            }
            hox hoxVar = (hox) objF3;
            Object objF4 = hmlVar.f();
            if (objF4 == obj4) {
                objF4 = new kpo(kphVar);
                hmlVar.y(objF4);
            }
            kpo kpoVar = (kpo) objF4;
            Object objF5 = hmlVar.f();
            if (objF5 == obj4) {
                hpl hplVar2 = new hpl(fctx.a, hpb.a);
                hmlVar.y(hplVar2);
                objF5 = hplVar2;
            }
            hox hoxVar2 = (hox) objF5;
            boolean zF = hmlVar.F(kpvVar) | hmlVar.B(257);
            Object objF6 = hmlVar.f();
            if (zF || objF6 == obj4) {
                objF6 = new dprr(hoxVar2, kpvVar, kpoVar, hoxVar);
                hmlVar.y(objF6);
            }
            ixm ixmVar = (ixm) objF6;
            Object objF7 = hmlVar.f();
            if (objF7 == obj4) {
                objF7 = new dprs(hoxVar, kpoVar);
                hmlVar.y(objF7);
            }
            boolean zF2 = hmlVar.F(kpvVar);
            Object objF8 = hmlVar.f();
            if (zF2 || objF8 == obj4) {
                objF8 = new dprt(kpvVar);
                hmlVar.y(objF8);
            }
            iwh.b(jsh.c(icsVarA, false, (fdap) objF8), hxe.d(-1759682870, new dpru(hoxVar2, kphVar, dplvVar, dpsbVar, dprlVar, fdapVar, fdavVar), hmlVar), ixmVar, hmlVar, 48);
            hmlVar.o();
        }
        return fctx.a;
    }
}
