package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzg extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ vzk c;
    final /* synthetic */ arwb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzg(fdpl fdplVar, vzk vzkVar, arwb arwbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = vzkVar;
        this.d = arwbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vzg) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.e;
            fdci fdciVar = new fdci();
            fdpl fdplVar = this.b;
            fdpl fdplVarA = fdqq.a(new vzb(fdplVar));
            vyy vyyVar = new vyy(null, fdplVar, this.c, fdciVar, this.d);
            int i2 = fdsn.a;
            fdwg fdwgVar = new fdwg(vyyVar, fdplVarA);
            this.a = 1;
            if (fdpy.c(fdpmVar, fdwgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vzg vzgVar = new vzg(this.b, this.c, this.d, fcxyVar);
        vzgVar.e = obj;
        return vzgVar;
    }
}
