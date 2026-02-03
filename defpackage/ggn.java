package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggn implements fdat {
    final /* synthetic */ ghy a;
    final /* synthetic */ geq b;

    public ggn(ghy ghyVar, geq geqVar) {
        this.a = ghyVar;
        this.b = geqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarC = efy.c(ics.e, ghx.a);
            final ghy ghyVar = this.a;
            int iC = ghyVar.c();
            boolean zD = hmlVar.D(ghyVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: ggm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        int i2 = ((giy) obj3).a;
                        Object obj4 = ghyVar;
                        gib gibVar = (gib) obj4;
                        Long lD = gibVar.d();
                        if (lD != null) {
                            fzd fzdVar = (fzd) obj4;
                            fzdVar.b(fzdVar.c.e(lD.longValue()).e);
                        }
                        gibVar.f.b(new giy(i2));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ghx.b(icsVarC, iC, (fdap) objF, this.b, hmlVar, 6);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
