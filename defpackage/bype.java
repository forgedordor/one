package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bype extends fcyz implements fdat {
    final /* synthetic */ bypl a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bype(fcxy fcxyVar, bypl byplVar) {
        super(2, fcxyVar);
        this.a = byplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bype) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bypl byplVar = this.a;
        long epochMilli = byplVar.b.f().toEpochMilli() - byplVar.i.toMillis();
        String[] strArr = bmso.a;
        bmse bmseVar = new bmse();
        bmseVar.f("CmsDeletedMessagesBufferPersister#evictOldDeletedMessageEntries");
        bmseVar.e();
        bmseVar.a(new bypf(epochMilli));
        return new Integer(bmseVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bype bypeVar = new bype(fcxyVar, this.a);
        bypeVar.b = obj;
        return bypeVar;
    }
}
