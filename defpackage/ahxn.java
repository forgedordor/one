package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxn extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public ahxn(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.A("BasicRestoreWorkflowSteps#getRestoredMessageCount");
        bmkiVar.d(ahxo.a);
        return new Integer(bmkiVar.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxn ahxnVar = new ahxn(fcxyVar);
        ahxnVar.a = obj;
        return ahxnVar;
    }
}
