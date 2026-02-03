package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhq implements fdat {
    final /* synthetic */ cyhz a;

    public cyhq(cyhz cyhzVar) {
        this.a = cyhzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final cyhz cyhzVar = this.a;
            boolean zF = hmlVar.F(cyhzVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: cyhp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eg egVarG = cyhzVar.a.G();
                        if (egVarG != null) {
                            egVarG.finish();
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtfk.b((fdae) objF, null, false, null, null, cygd.b, hmlVar, 1572864, 62);
        }
        return fctx.a;
    }
}
