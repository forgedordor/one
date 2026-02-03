package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejcq extends fcyz implements fdat {
    final /* synthetic */ ejcz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejcq(ejcz ejczVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ejczVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejcq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ejcz ejczVar = this.a;
        ekrw ekrwVarE = ejczVar.d.e();
        ekrwVarE.X(eksq.a, "BuglePenpal");
        ((ekrd) ekrwVarE.h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$close$1", "invokeSuspend", 287, "PenpalOnDeviceClientImpl.kt")).q("Closing AiCore client");
        ejczVar.h().close();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejcq(this.a, fcxyVar);
    }
}
