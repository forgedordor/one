package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsm(fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsm) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.c;
            fdpl fdplVar = this.b;
            cvsl cvslVar = new cvsl(fdpmVar);
            this.a = 1;
            if (fdplVar.a(cvslVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvsm cvsmVar = new cvsm(this.b, fcxyVar);
        cvsmVar.c = obj;
        return cvsmVar;
    }
}
