package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yne extends fcyz implements fdat {
    final /* synthetic */ ynh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yne(ynh ynhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ynhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            ynh ynhVar = this.a;
            ynhVar.b.unregisterNetworkCallback(ynhVar.e);
        } catch (IllegalArgumentException e) {
            ((ekrd) ynh.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl$close$1", "invokeSuspend", 91, "NetworkConnectionImpl.kt")).t("Exception unregistering NetworkCallback", e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yne(this.a, fcxyVar);
    }
}
