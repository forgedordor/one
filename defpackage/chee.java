package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chee extends fcyz implements fdat {
    int a;
    final /* synthetic */ chef b;
    final /* synthetic */ ezjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chee(chef chefVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chefVar;
        this.c = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chee) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgxw cgxwVar = (cgxw) this.b.a.b();
            ezjj ezjjVar = this.c;
            cgxy cgxyVar = cgxy.e;
            chdn chdnVar = new chdn(ezjjVar);
            this.a = 1;
            obj = cgxwVar.e(cgxyVar, chdnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chee(this.b, this.c, fcxyVar);
    }
}
