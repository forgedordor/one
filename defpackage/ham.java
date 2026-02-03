package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ham implements fdau {
    final /* synthetic */ gyq a;
    final /* synthetic */ fyf b;
    final /* synthetic */ boolean c;

    public ham(gyq gyqVar, fyf fyfVar, boolean z) {
        this.a = gyqVar;
        this.b = fyfVar;
        this.c = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cth cthVar = (cth) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ics icsVarK = egq.k(ics.e, 256.0f);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new fdap() { // from class: hag
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jtk.j((jto) obj4);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        ics icsVarC = jsh.c(icsVarK, false, (fdap) objF);
        gyq gyqVar = this.a;
        fyf fyfVar = this.b;
        boolean z = this.c;
        float f = hbj.a;
        hbj.B(icsVarC, 0.39453125f, hxe.d(-99063847, new hal(gyqVar, cthVar, fyfVar, z), hmlVar), hmlVar, 432);
        return fctx.a;
    }
}
