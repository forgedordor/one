package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqq extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqq(fcxy fcxyVar, wqu wquVar) {
        super(2, fcxyVar);
        this.b = wquVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wqu wquVar = this.b;
        this.a = 1;
        Object objB = wquVar.d.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wqq wqqVar = new wqq(fcxyVar, this.b);
        wqqVar.c = obj;
        return wqqVar;
    }
}
