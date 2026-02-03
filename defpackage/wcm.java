package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wcm implements fdat {
    final /* synthetic */ ach a;
    final /* synthetic */ hsf b;

    public wcm(ach achVar, hsf hsfVar) {
        this.a = achVar;
        this.b = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djrr djrrVar = wcp.a(this.b).b;
            hmlVar.v(5004770);
            final ach achVar = this.a;
            boolean zF = hmlVar.F(achVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: wcl
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ace aceVarC;
                        ach achVar2 = achVar;
                        if (achVar2 != null && (aceVarC = achVar2.c()) != null) {
                            aceVarC.d();
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            wcp.b(djrrVar, (fdae) objF, hmlVar, 0);
        }
        return fctx.a;
    }
}
