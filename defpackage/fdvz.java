package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvz extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdwa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdvz(fdwa fdwaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdwaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdvz) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.b;
            fdwa fdwaVar = this.c;
            this.a = 1;
            if (fdwaVar.g(fdpmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdvz fdvzVar = new fdvz(this.c, fcxyVar);
        fdvzVar.b = obj;
        return fdvzVar;
    }
}
