package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbtu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbtz b;
    final /* synthetic */ atys c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbtu(cbtz cbtzVar, atys atysVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbtzVar;
        this.c = atysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbtu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbtz cbtzVar = this.b;
        atys atysVar = this.c;
        this.a = 1;
        Object objA = cbtzVar.a(atysVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbtu(this.b, this.c, fcxyVar);
    }
}
