package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcoc extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fbrk c;
    final /* synthetic */ fdap d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcoc(fdpl fdplVar, fbrk fbrkVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fbrkVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcoc) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.e;
            fdpl fdplVar = this.b;
            fbrk fbrkVar = this.c;
            fdap fdapVar = this.d;
            fdpl fdplVarA = fcnn.a(fdplVar, fbrkVar);
            fcob fcobVar = new fcob(fdapVar, fdpmVar);
            this.a = 1;
            if (fdplVarA.a(fcobVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fcoc fcocVar = new fcoc(this.b, this.c, this.d, fcxyVar);
        fcocVar.e = obj;
        return fcocVar;
    }
}
