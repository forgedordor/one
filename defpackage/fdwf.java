package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwf extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdwg b;
    final /* synthetic */ fdpm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdwf(fdwg fdwgVar, fdpm fdpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdwgVar;
        this.c = fdpmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdci fdciVar = new fdci();
            fdwg fdwgVar = this.b;
            fdwe fdweVar = new fdwe(fdciVar, fdjxVar, fdwgVar, this.c);
            this.a = 1;
            if (fdwgVar.d.a(fdweVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdwf fdwfVar = new fdwf(this.b, this.c, fcxyVar);
        fdwfVar.d = obj;
        return fdwfVar;
    }
}
