package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfuj extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ fdci b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ ezkl d;
    final /* synthetic */ cfut e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfuj(fdci fdciVar, fdjx fdjxVar, ezkl ezklVar, cfut cfutVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdciVar;
        this.c = fdjxVar;
        this.d = ezklVar;
        this.e = cfutVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((cfuj) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a) {
            ekrw ekrwVarH = cfut.a.h();
            ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$launchPongGeneration$1$2", "invokeSuspend", 211, "BindChannelHandler.kt")).q("Enabling pong generation.");
            this.b.a = auvw.k(this.c, null, null, new cfui(this.d, this.e, null), 3);
        } else {
            ekrw ekrwVarH2 = cfut.a.h();
            ekrwVarH2.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$launchPongGeneration$1$2", "invokeSuspend", 221, "BindChannelHandler.kt")).q("Turning off pong generation.");
            fdci fdciVar = this.b;
            fdlr fdlrVar = (fdlr) fdciVar.a;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            fdciVar.a = null;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfuj cfujVar = new cfuj(this.b, this.c, this.d, this.e, fcxyVar);
        cfujVar.a = ((Boolean) obj).booleanValue();
        return cfujVar;
    }
}
