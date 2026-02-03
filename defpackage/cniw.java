package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cniw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cniy b;
    final /* synthetic */ ezjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cniw(cniy cniyVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cniyVar;
        this.c = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cniw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cniy cniyVar = this.b;
        ezjj ezjjVar = this.c;
        this.a = 1;
        Object objB = cniyVar.b(ezjjVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cniw(this.b, this.c, fcxyVar);
    }
}
