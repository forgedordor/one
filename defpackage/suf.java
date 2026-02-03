package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class suf extends fcyz implements fdat {
    int a;
    final /* synthetic */ suh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suf(suh suhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = suhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        suh suhVar = this.b;
        this.a = 1;
        Object objB = suhVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new suf(this.b, fcxyVar);
    }
}
