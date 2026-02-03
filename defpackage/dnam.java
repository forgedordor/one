package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnam extends fdbo implements fdat {
    public dnam(Object obj) {
        super(2, obj, dnbk.class, "submitData", "submitData(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        oog oogVar = ((ova) ((dnbk) this.g)).a;
        oogVar.h.incrementAndGet();
        Object objC = oogVar.g.c((oux) obj, (fcxy) obj2);
        fcyl fcylVar = fcyl.a;
        if (objC != fcylVar) {
            objC = fctx.a;
        }
        return objC == fcylVar ? objC : fctx.a;
    }
}
