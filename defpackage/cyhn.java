package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhn implements fdat {
    final /* synthetic */ cyhz a;
    final /* synthetic */ hri b;

    public cyhn(cyhz cyhzVar, hri hriVar) {
        this.a = cyhzVar;
        this.b = hriVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cyhz cyhzVar = this.a;
            final hri hriVar = this.b;
            final int i = 0;
            for (Object obj3 : cyhzVar.b) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                String str = (String) obj3;
                boolean z = hriVar.c() == i;
                hmlVar.v(-1633490746);
                boolean zD = hmlVar.D(hriVar) | hmlVar.B(i);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: cyhl
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            hriVar.i(i);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dthi.a(z, (fdae) objF, null, false, hxe.d(1232031571, new cyhm(str), hmlVar), 0L, 0L, hmlVar, 24576, 492);
                i = i2;
            }
        }
        return fctx.a;
    }
}
