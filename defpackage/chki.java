package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chki extends fcyz implements fdat {
    int a;
    final /* synthetic */ chkj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chki(fcxy fcxyVar, chkj chkjVar) {
        super(2, fcxyVar);
        this.b = chkjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chki) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chkj chkjVar = this.b;
            this.a = 1;
            if (chkjVar.j(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chki chkiVar = new chki(fcxyVar, this.b);
        chkiVar.c = obj;
        return chkiVar;
    }
}
