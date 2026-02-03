package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chod extends fcyz implements fdat {
    final /* synthetic */ chpk a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chod(fcxy fcxyVar, chpk chpkVar) {
        super(2, fcxyVar);
        this.a = chpkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chod chodVar = new chod(fcxyVar, this.a);
        chodVar.b = obj;
        return chodVar;
    }
}
