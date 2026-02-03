package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoco extends fcyz implements fdat {
    int a;
    final /* synthetic */ aocw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoco(aocw aocwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aocwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aocw aocwVar = this.b;
        this.a = 1;
        Object objJ = aocwVar.j(this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoco(this.b, fcxyVar);
    }
}
