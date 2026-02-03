package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chre extends fcyz implements fdat {
    int a;
    final /* synthetic */ chrf b;
    final /* synthetic */ efoi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chre(chrf chrfVar, efoi efoiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chrfVar;
        this.c = efoiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chre) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chrf chrfVar = this.b;
            efoi efoiVar = this.c;
            this.a = 1;
            if (chrfVar.b(efoiVar.c, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chre(this.b, this.c, fcxyVar);
    }
}
