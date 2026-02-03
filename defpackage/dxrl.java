package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrl extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxrm b;
    final /* synthetic */ dxvi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrl(dxrm dxrmVar, dxvi dxviVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxrmVar;
        this.c = dxviVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxrm dxrmVar = this.b;
        dxvi dxviVar = this.c;
        this.a = 1;
        Object objB = dxrmVar.a.b(dxviVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxrl(this.b, this.c, fcxyVar);
    }
}
