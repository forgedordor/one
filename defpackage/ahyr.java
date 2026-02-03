package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyr extends fcyz implements fdat {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyr(fcxy fcxyVar, long j) {
        super(2, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.A("RestoreAnytimeCompatibleRestoreWorkflowSteps#getMessageCount");
        bmkiVar.d(new ahys(this.a));
        return new Integer(bmkiVar.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahyr ahyrVar = new ahyr(fcxyVar, this.a);
        ahyrVar.b = obj;
        return ahyrVar;
    }
}
