package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxst extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxtd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxst(fcxy fcxyVar, bxtd bxtdVar) {
        super(2, fcxyVar);
        this.b = bxtdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxst) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bxtd bxtdVar = this.b;
        bxsu bxsuVar = new bxsu(null);
        this.a = 1;
        Object objA = bxtdVar.a.a(bxsuVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxst bxstVar = new bxst(fcxyVar, this.b);
        bxstVar.c = obj;
        return bxstVar;
    }
}
