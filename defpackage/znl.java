package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znl extends fcyz implements fdat {
    /* synthetic */ Object a;

    public znl(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znl) c((oux) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) znp.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$2$2", "invokeSuspend", 131, "MessageListPagingDataProviderImpl.kt")).t("PagingData emitted: %s", (oux) this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        znl znlVar = new znl(fcxyVar);
        znlVar.a = obj;
        return znlVar;
    }
}
