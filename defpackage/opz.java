package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opz extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opz(fdpl fdplVar, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((opz) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.d;
            fdci fdciVar = new fdci();
            fdciVar.a = oqf.a;
            fdpl fdplVar = this.b;
            opy opyVar = new opy(fdciVar, this.c, fdpmVar);
            this.a = 1;
            if (fdplVar.a(opyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        opz opzVar = new opz(this.b, this.c, fcxyVar);
        opzVar.d = obj;
        return opzVar;
    }
}
