package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class doto extends fdbo implements fdap {
    public doto(Object obj) {
        super(1, obj, dots.class, "onScreenCategorySelected", "onScreenCategorySelected(Lcom/google/android/libraries/compose/ui/screen/ComposeScreenCategory;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dpxe dpxeVar = (dpxe) obj;
        dpxeVar.getClass();
        dots dotsVar = (dots) this.g;
        dpxo dpxoVarC = dotsVar.c();
        if (dpxoVarC == null || dpxoVarC.t() != dpxeVar) {
            dotsVar.g(dotsVar.d(dpxeVar, dotsVar.a()));
        } else {
            dpxo.bR(dpxoVarC);
        }
        dotsVar.d.b.a(true);
        return fctx.a;
    }
}
