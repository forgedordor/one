package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpt implements fdat {
    final /* synthetic */ djpx a;

    public djpt(djpx djpxVar) {
        this.a = djpxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final gpe gpeVarB = glz.b(hmlVar);
            djpx djpxVar = this.a;
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(gpeVarB);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: djps
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((cxg) obj3).getClass();
                        final gpe gpeVar = gpeVarB;
                        cyt cytVar = new cyt(dae.l(gpeVar.a(), 2), dae.m(gpeVar.a(), 2));
                        cytVar.d = cwx.c(new fdat() { // from class: djpr
                            @Override // defpackage.fdat
                            public final Object a(Object obj4, Object obj5) {
                                return gpeVar.d();
                            }
                        }, 1);
                        return cytVar;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            cwx.a(djpxVar, null, (fdap) objF, null, null, null, djpg.a, hmlVar, 1572864, 58);
        }
        return fctx.a;
    }
}
