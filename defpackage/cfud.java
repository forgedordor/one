package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfud extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cfud(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfud) c((ezlb) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ezlb ezlbVar = (ezlb) this.a;
        ekrw ekrwVarH = cfut.a.h();
        ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$2", "invokeSuspend", 119, "BindChannelHandler.kt");
        int i = ezlbVar.b;
        ekrdVar.D("Received message type:%s id:%s in the proxy.", ezkm.a(i), (i == 2 ? (ezjj) ezlbVar.c : ezjj.a).c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfud cfudVar = new cfud(fcxyVar);
        cfudVar.a = obj;
        return cfudVar;
    }
}
