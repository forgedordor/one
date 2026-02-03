package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypg extends fcyz implements fdat {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bypg(fcxy fcxyVar, long j) {
        super(2, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bypg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bmso.a;
        bmsl bmslVar = new bmsl(bmso.a);
        bmslVar.A("CmsDeletedMessagesBufferPersister#getDeletedMessageEntryForId");
        bmslVar.k(new bmsm((bmsn) new byph(this.a).apply(new bmsn())));
        ekgb ekgbVarZ = bmslVar.b().z();
        if (ekgbVarZ.size() == 0) {
            return null;
        }
        return ekgbVarZ.get(0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bypg bypgVar = new bypg(fcxyVar, this.a);
        bypgVar.b = obj;
        return bypgVar;
    }
}
