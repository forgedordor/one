package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxno b;
    final /* synthetic */ evjz c;
    final /* synthetic */ dxha d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxnn(dxno dxnoVar, evjz evjzVar, dxha dxhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxnoVar;
        this.c = evjzVar;
        this.d = dxhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxnn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        evjz evjzVar = this.c;
        dxha dxhaVar = this.d;
        this.a = 1;
        Object objB = dxnoVar.a.b(evjzVar, dxhaVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxnn(this.b, this.c, this.d, fcxyVar);
    }
}
