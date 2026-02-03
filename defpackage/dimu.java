package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimu implements fdau {
    final /* synthetic */ dikp a;

    public dimu(dikp dikpVar) {
        this.a = dikpVar;
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
            dikp dikpVar = this.a;
            dimx.d(diln.a(dikpVar, hmlVar), diln.c(dikpVar, hmlVar), hmlVar, 0);
            hmlVar.v(1319679379);
            dipu dipuVar = dikpVar.c;
            if (dipuVar == null) {
                fctxVar = null;
            } else {
                dipt.a(dipuVar, egq.e(egoVar.a(ics.e, 1.0f, true), 56.0f), diln.a(dikpVar, hmlVar), diln.b(dikpVar, hmlVar), 0.0f, 0.0f, hmlVar, 0, 48);
                hmlVar = hmlVar;
                fctxVar = fctx.a;
            }
            hmlVar.o();
            hmlVar.v(1319678810);
            if (fctxVar == null) {
                dimx.f(egoVar, diln.b(dikpVar, hmlVar), hmlVar, 0);
            }
            hmlVar.o();
            dimx.j(dikpVar.b, diln.d(dikpVar, hmlVar), hmlVar, 0);
            if (dikpVar.a != null) {
                egt.a(egq.e(egq.o(ics.e, 40.0f), 1.0f), hmlVar);
            }
        }
        return fctx.a;
    }
}
