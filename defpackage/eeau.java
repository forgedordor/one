package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeau implements fdat {
    final /* synthetic */ hox a;

    public eeau(hox hoxVar) {
        this.a = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final hox hoxVar = this.a;
            boolean zD = hmlVar.D(hoxVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: eeat
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eeaw.c(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtdi.e((fdae) objF, null, false, null, null, null, edxr.c, hmlVar, 805306368, 510);
        }
        return fctx.a;
    }
}
