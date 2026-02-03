package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yah implements fdau {
    final /* synthetic */ ejy a;
    final /* synthetic */ hri b;
    final /* synthetic */ hri c;

    public yah(ejy ejyVar, hri hriVar, hri hriVar2) {
        this.a = ejyVar;
        this.b = hriVar;
        this.c = hriVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1849434622);
            final ejy ejyVar = this.a;
            final hri hriVar = this.b;
            final hri hriVar2 = this.c;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                fdae fdaeVar = new fdae() { // from class: yag
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int iE = ejyVar.d().e();
                        return Integer.valueOf(iE - Math.min(hriVar.c() + hriVar2.c(), iE / 2));
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar, null);
                hmlVar.y(hntVar);
                objF = hntVar;
            }
            hmlVar.o();
            ico icoVar = ics.e;
            int iIntValue2 = ((Number) ((hsf) objF).a()).intValue();
            hmlVar.v(-475029924);
            float fEl = ((kio) hmlVar.e(jmh.e)).el(iIntValue2);
            hmlVar.o();
            egt.a(joj.a(efy.j(icoVar, 0.0f, fEl, 0.0f, 0.0f, 13), "columnSpacer"), hmlVar);
        }
        return fctx.a;
    }
}
