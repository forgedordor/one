package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwid implements fdau {
    final /* synthetic */ hox a;
    final /* synthetic */ cwhs b;
    final /* synthetic */ hsf c;

    public cwid(hox hoxVar, cwhs cwhsVar, hsf hsfVar) {
        this.a = hoxVar;
        this.b = cwhsVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dbs dbsVar = (dbs) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dbsVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(dbsVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hox hoxVar = this.a;
            hpt hptVar = cwil.a;
            Boolean bool = (Boolean) hoxVar.a();
            bool.booleanValue();
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: cwib
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ((cxg) obj4).getClass();
                        den denVar = cwhf.a;
                        return new cyt(dae.l(dea.c(500, 0, cwhf.a, 2), 2), dae.m(dea.c(500, 0, cwhf.b, 2), 2));
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            cwx.a(bool, null, (fdap) objF, null, "photoSelectorTransition", null, hxe.d(-1857489894, new cwic(dbsVar, this.b, this.c), hmlVar), hmlVar, 1597824, 42);
        }
        return fctx.a;
    }
}
