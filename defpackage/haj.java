package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haj implements fdat {
    final /* synthetic */ fyf a;
    final /* synthetic */ boolean b;

    public haj(fyf fyfVar, boolean z) {
        this.a = fyfVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            cth cthVar = hbj.e;
            int i2 = cthVar.b;
            fyf fyfVar = this.a;
            boolean z = this.b;
            for (final int i3 = 0; i3 < i2; i3++) {
                int iA = cthVar.a(i3);
                ico icoVar = ics.e;
                boolean zB = hmlVar.B(i3);
                Object objF = hmlVar.f();
                if (zB || objF == hmk.a) {
                    objF = new fdap() { // from class: hai
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            jtk.z((jto) obj3, i3 + 12.0f);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hbj.m(jsh.c(icoVar, false, (fdap) objF), fyfVar, iA, z, hmlVar, 0);
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
