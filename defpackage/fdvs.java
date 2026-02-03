package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvs extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdvt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdvs(fdvt fdvtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdvtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdvs) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.b;
            fdvt fdvtVar = this.c;
            this.a = 1;
            if (fdvtVar.b(fdosVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdvs fdvsVar = new fdvs(this.c, fcxyVar);
        fdvsVar.b = obj;
        return fdvsVar;
    }
}
