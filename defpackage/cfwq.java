package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfwq extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cfwq(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfwq) c((Throwable) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Throwable th = (Throwable) this.a;
        ekrw ekrwVarJ = cfws.a.j();
        ekrwVarJ.X(eksq.a, "BugleBindChannelProxy");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$2", "invokeSuspend", 96, "NetworkAvailabilityMonitor.kt")).q("NetworkCallback was cancelled.");
        return Boolean.valueOf(th instanceof IllegalStateException);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfwq cfwqVar = new cfwq(fcxyVar);
        cfwqVar.a = obj;
        return cfwqVar;
    }
}
