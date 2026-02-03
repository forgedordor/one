package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdx implements fdau {
    final /* synthetic */ hox a;
    final /* synthetic */ cwem b;
    final /* synthetic */ hox c;

    public cwdx(hox hoxVar, cwem cwemVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = cwemVar;
        this.c = hoxVar2;
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
            Boolean bool = (Boolean) this.a.a();
            bool.booleanValue();
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: cwds
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ((cxg) obj4).getClass();
                        cyt cytVar = new cyt(dae.l(null, 3), dae.m(null, 3));
                        cytVar.d = cwx.c(new fdat() { // from class: cwdr
                            @Override // defpackage.fdat
                            public final Object a(Object obj5, Object obj6) {
                                final kjg kjgVar = (kjg) obj6;
                                return dea.a(new fdap() { // from class: cwdq
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj7) {
                                        dft dftVar = (dft) obj7;
                                        dftVar.getClass();
                                        long j = kjgVar.a >> 32;
                                        dftVar.a(new kjg((((int) (r0 & 4294967295L)) & 4294967295L) | (((int) j) << 32)), 0);
                                        dftVar.a = 350;
                                        return fctx.a;
                                    }
                                });
                            }
                        }, 1);
                        return cytVar;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            cwx.a(bool, null, (fdap) objF, null, "photoSelectorTransitionInMiniCdp", null, hxe.d(1125085216, new cwdw(this.b, dbsVar, this.c), hmlVar), hmlVar, 1597824, 42);
        }
        return fctx.a;
    }
}
