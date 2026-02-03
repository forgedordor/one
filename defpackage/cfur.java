package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfur extends fcyz implements fdat {
    final /* synthetic */ fdue a;
    final /* synthetic */ cfut b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfur(fdue fdueVar, cfut cfutVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdueVar;
        this.b = cfutVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfur) c(Integer.valueOf(((Number) obj).intValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (((Number) this.a.b().c()).intValue() == 0) {
            this.b.g.a(cfuy.j);
            ekrw ekrwVarH = cfut.a.h();
            ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$waitForSubscriber$2", "invokeSuspend", 180, "BindChannelHandler.kt")).q("Waiting for Bugle to subscribe for the flow.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfur(this.a, this.b, fcxyVar);
    }
}
