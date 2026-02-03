package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllu extends fcyz implements fdat {
    final /* synthetic */ cllw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllu(fcxy fcxyVar, cllw cllwVar) {
        super(2, fcxyVar);
        this.a = cllwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cllu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        evrk evrkVar = (evrk) evrl.a.createBuilder();
        evrkVar.getClass();
        evrl evrlVarA = evrm.a(evrkVar);
        caxr caxrVar = new caxr();
        caxrVar.b = "retrieve_questionnaire_task";
        return ((cazj) this.a.b.a.b()).a(cbcu.g("retrieve_questionnaire", evrlVarA, caxrVar.a()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cllu clluVar = new cllu(fcxyVar, this.a);
        clluVar.b = obj;
        return clluVar;
    }
}
