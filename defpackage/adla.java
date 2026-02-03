package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class adla extends fdbo implements fdap {
    public adla(Object obj) {
        super(1, obj, adlf.class, "toggleJoinViaLinkToggleState", "toggleJoinViaLinkToggleState(Z)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        adlf adlfVar = (adlf) this.g;
        auvw.k(adlfVar.c, null, null, new adle(adlfVar, zBooleanValue, null), 3);
        return fctx.a;
    }
}
