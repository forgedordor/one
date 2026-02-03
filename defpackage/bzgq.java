package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgq extends fcyz implements fdat {
    final /* synthetic */ bzgt a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgq(fcxy fcxyVar, bzgt bzgtVar, String str) {
        super(2, fcxyVar);
        this.a = bzgtVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = bzbc.a;
        return this.a.f.c(this.b, bzbd.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzgq bzgqVar = new bzgq(fcxyVar, this.a, this.b);
        bzgqVar.c = obj;
        return bzgqVar;
    }
}
