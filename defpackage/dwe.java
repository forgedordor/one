package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwe extends fcyz implements fdat {
    int a;
    final /* synthetic */ dwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwe(dwj dwjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dwjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdoa fdoaVar = this.b.c;
        this.a = 1;
        Object objA = fdjy.a(new dvz(fdoaVar, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dwe(this.b, fcxyVar);
    }
}
