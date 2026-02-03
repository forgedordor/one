package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnq(fcxy fcxyVar, cdoa cdoaVar) {
        super(2, fcxyVar);
        this.b = cdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdoa cdoaVar = this.b;
            ecem.b();
            String[] strArr = bros.a;
            broi broiVar = new broi();
            broiVar.f("ParentDisallowedConversationDatabaseOperations#markAllConversationsAsAllowed");
            broiVar.e();
            broiVar.d();
            this.a = 1;
            if (cdoaVar.l(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdnq cdnqVar = new cdnq(fcxyVar, this.b);
        cdnqVar.c = obj;
        return cdnqVar;
    }
}
