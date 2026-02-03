package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvci implements fdat {
    final /* synthetic */ cvcp a;

    public cvci(cvcp cvcpVar) {
        this.a = cvcpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final cvcp cvcpVar = this.a;
            cvhj cvhjVar = (cvhj) cvcpVar.b.a();
            hmlVar.v(5004770);
            boolean zF = hmlVar.F(cvcpVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: cvcg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eg egVarFg = cvcpVar.a.fg();
                        egVarFg.setResult(-1);
                        egVarFg.finish();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            hmlVar.o();
            hmlVar.v(5004770);
            boolean zF2 = hmlVar.F(cvcpVar);
            Object objF2 = hmlVar.f();
            if (zF2 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: cvch
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eg egVarFg = cvcpVar.a.fg();
                        egVarFg.setResult(0);
                        egVarFg.finish();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar2 = (fdae) objF2;
            hmlVar.o();
            fdaeVar.getClass();
            fdaeVar2.getClass();
            cvgx cvgxVar = cvhjVar.a;
            cvhi.c(fdvf.a(new cvha(fdaeVar, fdaeVar2)), hmlVar, 0);
        }
        return fctx.a;
    }
}
