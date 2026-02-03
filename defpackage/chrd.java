package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chrd extends fcyz implements fdat {
    int a;
    final /* synthetic */ chrf b;
    final /* synthetic */ chrh c;
    final /* synthetic */ efoi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chrd(chrf chrfVar, chrh chrhVar, efoi efoiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chrfVar;
        this.c = chrhVar;
        this.d = efoiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chrd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chrf chrfVar = this.b;
            chrh chrhVar = this.c;
            chsh chshVar = chrhVar.b == 1 ? (chsh) chrhVar.c : chsh.a;
            chshVar.getClass();
            efoi efoiVar = this.d;
            this.a = 1;
            if (chrfVar.c(chshVar, efoiVar.c, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chrd(this.b, this.c, this.d, fcxyVar);
    }
}
