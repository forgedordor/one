package defpackage;

import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfuf extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cfut c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfuf(cfut cfutVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cfutVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cfuf cfufVar = new cfuf(this.c, (fcxy) obj3);
        cfufVar.b = (Throwable) obj2;
        return cfufVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Object obj3 = this.b;
            if (!(obj3 instanceof StatusException)) {
                if (obj3 instanceof fdmx) {
                    ekrw ekrwVarH = cfut.a.h();
                    ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
                    ((ekrd) ((ekrd) ekrwVarH).g((Throwable) obj3).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$4", "invokeSuspend", 146, "BindChannelHandler.kt")).q("Pong watchdog expired.");
                    this.c.g.a(cfuy.c);
                } else if (obj3 instanceof cfvc) {
                    ekrw ekrwVarJ = cfut.a.j();
                    ekrwVarJ.X(eksq.a, "BugleBindChannelProxy");
                    ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj3).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$4", "invokeSuspend", 153, "BindChannelHandler.kt")).q("Failed to forward the message to the main process.");
                    this.c.g.a(cfuy.k);
                } else {
                    ekrw ekrwVarJ2 = cfut.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleBindChannelProxy");
                    ((ekrd) ((ekrd) ekrwVarJ2).g((Throwable) obj3).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$4", "invokeSuspend", 157, "BindChannelHandler.kt")).q("Unexpected exception encountered.");
                    this.c.g.a(cfuy.f);
                }
                return fctx.a;
            }
            ekrw ekrwVarH2 = cfut.a.h();
            ekrwVarH2.X(eksq.a, "BugleBindChannelProxy");
            Throwable th = (Throwable) obj3;
            ((ekrd) ((ekrd) ekrwVarH2).g(th).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$4", "invokeSuspend", 136, "BindChannelHandler.kt")).q("Bind channel exception encountered.");
            cfut cfutVar = this.c;
            fctk fctkVar = new fctk(fctl.a(th));
            this.b = obj3;
            this.a = 1;
            if (cfutVar.j.fO(fctkVar, this) == fcylVar) {
                return fcylVar;
            }
            obj2 = obj3;
        }
        if (cfut.b.contains(((StatusException) obj2).a.getCode())) {
            this.c.g.a(cfuy.f);
        } else {
            this.c.g.a(cfuy.e);
        }
        return fctx.a;
    }
}
