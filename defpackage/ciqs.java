package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciqs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ciqt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqs(ciqt ciqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ciqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ciqt ciqtVar = this.b;
        this.a = 1;
        Object objB = ciqtVar.b(true, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqs(this.b, fcxyVar);
    }
}
