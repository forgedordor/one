package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnxx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cobc(fcxy fcxyVar, cnxx cnxxVar) {
        super(2, fcxyVar);
        this.b = cnxxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cobc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnxx cnxxVar = this.b;
        this.a = 1;
        Object objA = cnxxVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cobc cobcVar = new cobc(fcxyVar, this.b);
        cobcVar.c = obj;
        return cobcVar;
    }
}
