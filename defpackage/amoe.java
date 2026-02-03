package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amoe extends fcyz implements fdat {
    int a;
    final /* synthetic */ amok b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amoe(amok amokVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amokVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amoe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        amok amokVar = this.b;
        this.a = 1;
        Object objD = amokVar.d(this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amoe(this.b, fcxyVar);
    }
}
