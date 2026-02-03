package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshe extends fcyz implements fdat {
    int a;
    final /* synthetic */ cshf b;
    final /* synthetic */ cshx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cshe(fcxy fcxyVar, cshf cshfVar, cshx cshxVar) {
        super(2, fcxyVar);
        this.b = cshfVar;
        this.c = cshxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cshe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cshq cshqVar = (cshq) this.b.b.b();
        cshx cshxVar = this.c;
        this.a = 1;
        Object objC = cshqVar.c(cshxVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cshe csheVar = new cshe(fcxyVar, this.b, this.c);
        csheVar.d = obj;
        return csheVar;
    }
}
