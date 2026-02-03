package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ful implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ ebk b;
    final /* synthetic */ foz c;

    public ful(boolean z, ebk ebkVar, foz fozVar) {
        this.a = z;
        this.b = ebkVar;
        this.c = fozVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1398930845);
        hsf hsfVarA = fun.a(this.a, this.b, this.c, 2.0f, 1.0f, hmlVar, 0);
        ico icoVar = ics.e;
        final dky dkyVar = (dky) hsfVarA.a();
        final float f = dkyVar.a;
        ics icsVarC = ifb.c(icoVar, new fdap() { // from class: fuz
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                imw imwVar = (imw) obj4;
                imwVar.p();
                float f2 = f;
                if (kir.b(f2, 0.0f)) {
                    return fctx.a;
                }
                dky dkyVar2 = dkyVar;
                float fEd = f2 * imwVar.ed();
                float fA = ihz.a(imwVar.b()) - (fEd / 2.0f);
                imy.g(imwVar, dkyVar2.b, iht.a(0.0f, fA), iht.a(ihz.c(imwVar.b()), fA), fEd, 0.0f, 496);
                return fctx.a;
            }
        });
        hmlVar.o();
        return icsVarC;
    }
}
