package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimr implements fdau {
    final /* synthetic */ dikl a;

    public dimr(dikl diklVar) {
        this.a = diklVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fctx fctxVar;
        ego egoVar = (ego) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egoVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egoVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dikl diklVar = this.a;
            dimx.g(diklVar.a, diklVar.c, diln.a(diklVar, hmlVar), diln.a(diklVar, hmlVar), diln.c(diklVar, hmlVar), hmlVar, 0);
            hmlVar.v(-356043525);
            dipu dipuVar = diklVar.g;
            if (dipuVar == null) {
                fctxVar = null;
            } else {
                dipt.a(dipuVar, egq.e(egoVar.a(ics.e, 1.0f, true), 56.0f), diln.a(diklVar, hmlVar), diln.b(diklVar, hmlVar), 0.0f, 0.0f, hmlVar, 0, 48);
                fctxVar = fctx.a;
            }
            hmlVar.o();
            hmlVar.v(-356043969);
            if (fctxVar == null) {
                dimx.i(egoVar, diklVar.d, diln.a(diklVar, hmlVar), diln.b(diklVar, hmlVar), hmlVar, 0);
            }
            hmlVar.o();
            dimx.j(diklVar.b, diln.d(diklVar, hmlVar), hmlVar, 0);
            dkpc dkpcVar = diklVar.f;
            hmlVar.v(-356025214);
            if (dkpcVar != null) {
                egt.a(egq.e(egq.o(ics.e, 40.0f), 1.0f), hmlVar);
            }
            hmlVar.o();
            dike dikeVar = diklVar.h;
            if (dikeVar != null) {
                hmlVar.v(5004770);
                boolean zF = hmlVar.F(dikeVar);
                Object objF = hmlVar.f();
                if (zF || objF == hmk.a) {
                    objF = new dimq(dikeVar, null);
                    hmlVar.y(objF);
                }
                hmlVar.o();
                hob.g(dikeVar.a, (fdat) objF, hmlVar);
            }
        }
        return fctx.a;
    }
}
