package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqxy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cqyh b;
    final /* synthetic */ cqwt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqxy(fcxy fcxyVar, cqyh cqyhVar, cqwt cqwtVar) {
        super(2, fcxyVar);
        this.b = cqyhVar;
        this.c = cqwtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqxy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cqyh cqyhVar = this.b;
        cqwt cqwtVar = this.c;
        this.a = 1;
        Object objC = cqyhVar.c(cqwtVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cqxy cqxyVar = new cqxy(fcxyVar, this.b, this.c);
        cqxyVar.d = obj;
        return cqxyVar;
    }
}
