package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlmz implements fdau {
    final /* synthetic */ dihq a;
    final /* synthetic */ hox b;

    public dlmz(dihq dihqVar, hox hoxVar) {
        this.a = dihqVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dihq dihqVar = this.a;
            dthx.b(dihqVar.a, null, 0L, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65022);
            final hox hoxVar = this.b;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: dlmy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dlnj.f(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            boolean z = dihqVar.h;
            hmlVar.o();
            dlnj.k(dihqVar.g, z, zBooleanValue, (fdae) objF, hmlVar, 3072);
        }
        return fctx.a;
    }
}
