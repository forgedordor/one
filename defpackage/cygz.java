package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cygz extends fcyz implements fdap {
    int a;
    final /* synthetic */ cyha b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cygz(cyha cyhaVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cyhaVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cyha cyhaVar = this.b;
            fcyh fcyhVarA = eicg.a(cyhaVar.c);
            cygy cygyVar = new cygy(null, cyhaVar);
            this.a = 1;
            if (fdin.a(fcyhVarA, cygyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cygz(this.b, (fcxy) obj).b(fctx.a);
    }
}
