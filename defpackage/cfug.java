package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfug extends fcyz implements fdau {
    /* synthetic */ Object a;
    final /* synthetic */ cfut b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfug(cfut cfutVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = cfutVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cfug cfugVar = new cfug(this.b, (fcxy) obj3);
        cfugVar.a = (Throwable) obj2;
        return cfugVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        ekrw ekrwVarH = cfut.a.h();
        ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
        ((ekrd) ((ekrd) ekrwVarH).g((Throwable) obj2).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/BindChannelHandler$createConnection$1$5", "invokeSuspend", 163, "BindChannelHandler.kt")).q("#receiveMessages has completed.");
        cfut cfutVar = this.b;
        synchronized (cfutVar.h) {
            cfub cfubVar = cfutVar.i;
            if (cfubVar != null) {
                cfubVar.a.t(null);
            }
            cfutVar.i = null;
        }
        return fctx.a;
    }
}
