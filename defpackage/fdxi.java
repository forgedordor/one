package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxi extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdpm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdxi(fdpm fdpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdpmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdxi) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            fdpm fdpmVar = this.c;
            this.a = 1;
            if (fdpmVar.fO(obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdxi fdxiVar = new fdxi(this.c, fcxyVar);
        fdxiVar.b = obj;
        return fdxiVar;
    }
}
