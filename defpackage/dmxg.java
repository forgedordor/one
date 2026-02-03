package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxg implements fdau {
    final /* synthetic */ dmvm a;
    final /* synthetic */ dmxn b;

    public dmxg(dmxn dmxnVar, dmvm dmvmVar) {
        this.b = dmxnVar;
        this.a = dmvmVar;
    }

    public static final float b(hsf hsfVar) {
        return ((kir) hsfVar.a()).a;
    }

    public static final void c(hox hoxVar, float f) {
        hoxVar.b(new kir(f));
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gsq gsqVar = gsq.c;
            Object objF = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF == obj4) {
                objF = new fdap() { // from class: fzl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        return true;
                    }
                };
                hmlVar.y(objF);
            }
            gsp gspVarA = gsi.a(false, (fdap) objF, gsqVar, true, hmlVar, 0, 49);
            Object objF2 = hmlVar.f();
            if (objF2 == obj4) {
                objF2 = new gun();
                hmlVar.y(objF2);
            }
            gun gunVar = (gun) objF2;
            boolean zD = hmlVar.D(gspVarA) | hmlVar.D(gunVar);
            Object objF3 = hmlVar.f();
            if (zD || objF3 == obj4) {
                objF3 = new gak(gspVarA, gunVar);
                hmlVar.y(objF3);
            }
            gak gakVar = (gak) objF3;
            hmlVar.v(1849434622);
            Object objF4 = hmlVar.f();
            if (objF4 == obj4) {
                hpl hplVar = new hpl(new kir(64.0f), hsi.a);
                hmlVar.y(hplVar);
                objF4 = hplVar;
            }
            final hox hoxVar = (hox) objF4;
            hmlVar.o();
            final kio kioVar = (kio) hmlVar.e(jmh.e);
            hmlVar.v(-1746271574);
            boolean zD2 = hmlVar.D(kioVar) | ((iIntValue & 14) == 4);
            Object objF5 = hmlVar.f();
            if (zD2 || objF5 == obj4) {
                objF5 = new fdae() { // from class: dmwt
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        float fEl = kioVar.el(kil.a(edkVar.a)) - ((kir) hoxVar.a()).a;
                        egc egcVar = dmuj.a;
                        return new kir(fEl - 36.0f);
                    }
                };
                hmlVar.y(objF5);
            }
            hmlVar.o();
            hxn hxnVar = hrp.a;
            hnt hntVar = new hnt((fdae) objF5, null);
            hmlVar.v(1849434622);
            Object objF6 = hmlVar.f();
            if (objF6 == obj4) {
                objF6 = new hpf(0.0f);
                hmlVar.y(objF6);
            }
            hmlVar.o();
            dpgp.a(true, null, hxe.d(2052207940, new dmxf(gakVar, this.b, hntVar, edkVar, this.a, (hrg) objF6, hoxVar), hmlVar), hmlVar, 390, 2);
        }
        return fctx.a;
    }
}
