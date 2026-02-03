package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnej extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnek b;
    final /* synthetic */ ezjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnej(cnek cnekVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnekVar;
        this.c = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnej) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnek cnekVar = this.b;
        ezjj ezjjVar = this.c;
        this.a = 1;
        Object objK = cnekVar.k(ezjjVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnej(this.b, this.c, fcxyVar);
    }
}
