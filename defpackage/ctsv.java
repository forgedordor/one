package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctsv extends fdbo implements fdap {
    public ctsv(Object obj) {
        super(1, obj, ctsy.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        ctsy ctsyVar = (ctsy) this.g;
        ctsyVar.u.f(str);
        ctsyVar.w.f(null);
        return fctx.a;
    }
}
