package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpbw extends fdbo implements fdap {
    public dpbw(Object obj) {
        super(1, obj, dpcf.class, "onRenderingStateChanged", "onRenderingStateChanged(Lcom/google/android/libraries/compose/ui/rendering/RenderingState;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dpuv dpuvVar = (dpuv) obj;
        dpuvVar.getClass();
        dpcf dpcfVar = (dpcf) this.g;
        ekrg ekrgVar = dpcf.b;
        if (dpuvVar.ordinal() == 3) {
            fdcz fdczVar = dpcfVar.l;
            fdeh[] fdehVarArr = dpcf.a;
            dpgq dpgqVar = (dpgq) fdczVar.c(fdehVarArr[0]);
            if (dpgqVar != null) {
                dpgqVar.setSelected(false);
            }
            fdczVar.d(fdehVarArr[0], null);
        }
        dpcfVar.f.f(dpuvVar);
        dpcf.r(dpcfVar, 0, 0, 3);
        return fctx.a;
    }
}
