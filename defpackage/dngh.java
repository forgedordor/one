package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngh extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdau b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dngh(fdau fdauVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdauVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dngh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.d;
        fdau fdauVar = this.b;
        Object obj2 = this.c;
        obj2.getClass();
        this.a = 1;
        Object objA = fdauVar.a(fdjxVar, obj2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dngh dnghVar = new dngh(this.b, this.c, fcxyVar);
        dnghVar.d = obj;
        return dnghVar;
    }
}
