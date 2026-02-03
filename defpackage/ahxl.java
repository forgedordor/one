package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxl extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public ahxl(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.A("BasicRestoreWorkflowSteps#getRestoredMessageCount");
        bmkiVar.d(ahxm.a);
        return new Integer(bmkiVar.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxl ahxlVar = new ahxl(fcxyVar);
        ahxlVar.a = obj;
        return ahxlVar;
    }
}
