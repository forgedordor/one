package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnif extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnih b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnif(fcxy fcxyVar, cnih cnihVar) {
        super(2, fcxyVar);
        this.b = cnihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnif) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnih cnihVar = this.b;
        this.a = 1;
        Object objA = cnihVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnif cnifVar = new cnif(fcxyVar, this.b);
        cnifVar.c = obj;
        return cnifVar;
    }
}
