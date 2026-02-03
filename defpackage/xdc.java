package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xdc extends fcyz implements fdat {
    final /* synthetic */ xdz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdc(xdz xdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        xdz xdzVar = this.a;
        dnih dnihVar = xdzVar.m.f;
        dnihVar.h();
        ekrw ekrwVarE = xdz.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$onDraftClearedForSending$1", "invokeSuspend", 316, "DraftTextUiAdapterImpl.kt")).q("DraftTextUiAdapterImpl.onDraftClearedForSending clearing text for sending");
        dnihVar.e();
        xdzVar.k.incrementAndGet();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xdc(this.a, fcxyVar);
    }
}
