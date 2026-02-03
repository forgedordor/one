package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghd implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ ics c;

    public ghd(int i, fdap fdapVar, ics icsVar) {
        this.a = i;
        this.b = fdapVar;
        this.c = icsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (!hmlVar.J(i != 2, iIntValue & 1)) {
            hmlVar.s();
        } else if (giy.a(this.a, 0)) {
            hmlVar.v(-101264555);
            final fdap fdapVar = this.b;
            boolean zD = hmlVar.D(fdapVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: ghb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar.invoke(new giy(1));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gjz.b((fdae) objF, this.c, false, null, null, gdk.a, hmlVar, 1572864, 60);
            hmlVar.o();
        } else {
            hmlVar.v(-100954772);
            final fdap fdapVar2 = this.b;
            boolean zD2 = hmlVar.D(fdapVar2);
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: ghc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar2.invoke(new giy(0));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            gjz.b((fdae) objF2, this.c, false, null, null, gdk.b, hmlVar, 1572864, 60);
            hmlVar.o();
        }
        return fctx.a;
    }
}
