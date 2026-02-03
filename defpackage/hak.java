package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hak implements fdat {
    final /* synthetic */ cth a;
    final /* synthetic */ fyf b;
    final /* synthetic */ boolean c;

    public hak(cth cthVar, fyf fyfVar, boolean z) {
        this.a = cthVar;
        this.b = fyfVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            hmlVar.v(1866272143);
            cth cthVar = this.a;
            fyf fyfVar = this.b;
            boolean z = this.c;
            int i = cthVar.b;
            for (final int i2 = 0; i2 < i; i2++) {
                int iA = (!fyfVar.k() || hbk.b(fyfVar.f(), 1)) ? cthVar.a(i2) : cthVar.a(i2) % 12;
                ico icoVar = ics.e;
                boolean zB = hmlVar.B(i2);
                Object objF = hmlVar.f();
                if (zB || objF == hmk.a) {
                    objF = new fdap() { // from class: hah
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            jtk.z((jto) obj3, i2 + 1.0f);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hbj.m(jsh.c(icoVar, false, (fdap) objF), fyfVar, iA, z, hmlVar, 0);
            }
            hmlVar.o();
            if (hbk.b(fyfVar.f(), 0) && fyfVar.k()) {
                hmlVar.v(2020584910);
                ics icsVarA = dkl.a(egq.k(iwa.a(ics.e, gkt.b), 256.0f), ije.g, evn.a);
                float f = hbj.a;
                hbj.B(icsVarA, 0.26953125f, hxe.d(-1385767514, new haj(fyfVar, z), hmlVar), hmlVar, 432);
                hmlVar.o();
            } else {
                hmlVar.v(2021502665);
                hmlVar.o();
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
