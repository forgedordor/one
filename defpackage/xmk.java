package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xmk extends fdbo implements fdap {
    public xmk(Object obj) {
        super(1, obj, xmm.class, "savePhoneNumber", "savePhoneNumber(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        xmm xmmVar = (xmm) this.g;
        if (str.length() != 0) {
            auvw.k(xmmVar.b, null, null, new xmi(xmmVar, str, null), 3);
        }
        return fctx.a;
    }
}
