package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cycc implements fdat {
    final /* synthetic */ cyci a;

    public cycc(cyci cyciVar) {
        this.a = cyciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final cyci cyciVar = this.a;
            boolean zF = hmlVar.F(cyciVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: cycb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eg egVarG = ((cybv) cyciVar.a.b()).G();
                        if (egVarG != null) {
                            egVarG.finish();
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtfk.b((fdae) objF, null, false, null, null, cybq.b, hmlVar, 1572864, 62);
        }
        return fctx.a;
    }
}
