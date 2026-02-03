package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znj extends fcyz implements fdat {
    /* synthetic */ Object a;

    public znj(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znj) c((ajly) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) znp.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$1", "invokeSuspend", 111, "MessageListPagingDataProviderImpl.kt")).t("Initial PagingKey emitted: %s", (ajly) this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        znj znjVar = new znj(fcxyVar);
        znjVar.a = obj;
        return znjVar;
    }
}
