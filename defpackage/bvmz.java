package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvmz extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvmz(String str, bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvmz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = this.b;
        bvmw bvmwVar = this.c;
        bvpo bvpoVar = bvpp.a;
        bvmy bvmyVar = new bvmy(bvmwVar, null);
        this.a = 1;
        Object objA = bvpoVar.a(str, 7, bvmyVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvmz(this.b, this.c, fcxyVar);
    }
}
