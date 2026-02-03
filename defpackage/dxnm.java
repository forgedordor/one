package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnm extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxno b;
    final /* synthetic */ dxvi c;
    final /* synthetic */ dxha d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxnm(dxno dxnoVar, dxvi dxviVar, dxha dxhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxnoVar;
        this.c = dxviVar;
        this.d = dxhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxnm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxno dxnoVar = this.b;
        dxvi dxviVar = this.c;
        dxha dxhaVar = this.d;
        this.a = 1;
        Object objA = dxnoVar.a.a(dxviVar, dxhaVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxnm(this.b, this.c, this.d, fcxyVar);
    }
}
