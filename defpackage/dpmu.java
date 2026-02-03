package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmu implements fdau {
    final /* synthetic */ dpmg a;

    public dpmu(dpmg dpmgVar) {
        this.a = dpmgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        knl knlVar = new knl(false, false, 0, false, false, 37);
        hmlVar.v(5004770);
        final dpmg dpmgVar = this.a;
        boolean zD = hmlVar.D(dpmgVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdae() { // from class: dpmm
                @Override // defpackage.fdae
                public final Object invoke() {
                    dpmg dpmgVar2 = dpmgVar;
                    if (dpmgVar2 != null) {
                        dpmgVar2.c.e();
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        kme.a((fdae) objF, knlVar, hxe.d(583260920, new dpmt(dpmgVar), hmlVar), hmlVar, 432, 0);
        return fctx.a;
    }
}
