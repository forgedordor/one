package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvmy extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvmy(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvmy) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b;
        bvmw bvmwVar = this.c;
        this.a = 1;
        Object objN = bvmwVar.n(str, this);
        return objN == fcylVar ? fcylVar : objN;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvmy bvmyVar = new bvmy(this.c, fcxyVar);
        bvmyVar.b = obj;
        return bvmyVar;
    }
}
