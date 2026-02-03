package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfwp extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfws b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfwp(cfws cfwsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfwsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfwp) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            cfws cfwsVar = this.b;
            final cfwo cfwoVar = new cfwo(cfwsVar, fdosVar);
            try {
                cfwsVar.b.registerDefaultNetworkCallback(cfwoVar);
            } catch (RuntimeException e) {
                fdosVar.e(new IllegalStateException("Failed to register default network callback.", e));
            }
            ekrw ekrwVarH = cfws.a.h();
            ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$1", "invokeSuspend", 87, "NetworkAvailabilityMonitor.kt")).q("Default network callback registered.");
            final cfws cfwsVar2 = this.b;
            fdae fdaeVar = new fdae() { // from class: cfwn
                @Override // defpackage.fdae
                public final Object invoke() {
                    cfwsVar2.b.unregisterNetworkCallback(cfwoVar);
                    ekrw ekrwVarH2 = cfws.a.h();
                    ekrwVarH2.X(eksq.a, "BugleBindChannelProxy");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$1", "invokeSuspend$lambda$0", 91, "NetworkAvailabilityMonitor.kt")).q("Default network callback cleaned up.");
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfwp cfwpVar = new cfwp(this.b, fcxyVar);
        cfwpVar.c = obj;
        return cfwpVar;
    }
}
