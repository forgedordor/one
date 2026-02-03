package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnal extends fdbo implements fdap {
    public dnal(Object obj) {
        super(1, obj, dnau.class, "onSystemPickerVisibilityChanged", "onSystemPickerVisibilityChanged(Z)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dnau dnauVar = (dnau) this.g;
        ekrg ekrgVar = dnau.a;
        dnauVar.aj = zBooleanValue;
        dnauVar.bk();
        return fctx.a;
    }
}
