package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwnk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwne b;
    final /* synthetic */ bwnn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwnk(bwne bwneVar, bwnn bwnnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwneVar;
        this.c = bwnnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwnk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bwne bwneVar = this.b;
        if ((bwneVar.b & 1) == 0) {
            throw new IllegalArgumentException("Local identity is not set for FTD clean up handler, aborting.");
        }
        bwnn bwnnVar = this.c;
        this.a = 1;
        Object objM = bwnnVar.m(bwneVar, this);
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwnk(this.b, this.c, fcxyVar);
    }
}
