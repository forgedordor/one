package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejcx extends fcyz implements fdat {
    final /* synthetic */ ejcz a;
    final /* synthetic */ smq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejcx(ejcz ejczVar, smq smqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ejczVar;
        this.b = smqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejcx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ejcz ejczVar = this.a;
        ekrw ekrwVarH = ejczVar.d.h();
        ekrwVarH.X(eksq.a, "BuglePenpal");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$requestFeatureDownload$1", "invokeSuspend", 493, "PenpalOnDeviceClientImpl.kt");
        smq smqVar = this.b;
        ekrdVar.r("Requesting download for feature %d", smqVar.a());
        ejczVar.h().h(smqVar, new ejcr(ejczVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejcx(this.a, this.b, fcxyVar);
    }
}
