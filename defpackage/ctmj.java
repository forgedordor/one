package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmj extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public ctmj(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctmj) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.b;
            ctmo ctmoVar = new ctmo(0, 3);
            this.a = 1;
            if (fdpmVar.fO(ctmoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctmj ctmjVar = new ctmj(fcxyVar);
        ctmjVar.b = obj;
        return ctmjVar;
    }
}
