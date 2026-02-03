package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggq implements fdat {
    final /* synthetic */ ghy a;
    final /* synthetic */ hhr b;
    final /* synthetic */ geq c;
    final /* synthetic */ igr d;
    final /* synthetic */ gfd e;

    public ggq(ghy ghyVar, hhr hhrVar, gfd gfdVar, geq geqVar, igr igrVar) {
        this.a = ghyVar;
        this.b = hhrVar;
        this.e = gfdVar;
        this.c = geqVar;
        this.d = igrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final ghy ghyVar = this.a;
            Long lD = ghyVar.d();
            long jA = ghyVar.a();
            int iC = ghyVar.c();
            boolean zD = hmlVar.D(ghyVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: ggo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        Object obj4 = ghyVar;
                        Long l = (Long) obj3;
                        if (l != null) {
                            fzd fzdVar = (fzd) obj4;
                            hhq hhqVarB = fzdVar.c.b(l.longValue());
                            ((gib) obj4).e.b(true == fzdVar.a.g(hhqVarB.a) ? hhqVarB : null);
                        } else {
                            ((gib) obj4).e.b(null);
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdap fdapVar = (fdap) objF;
            boolean zD2 = hmlVar.D(ghyVar);
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new fdap() { // from class: ggp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ghyVar.b(((Long) obj3).longValue());
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fzd fzdVar = (fzd) ghyVar;
            ghx.j(lD, jA, iC, fdapVar, (fdap) objF2, this.b, fzdVar.a, this.e, (djll) fzdVar.d.a(), this.c, this.d, hmlVar, 0, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
