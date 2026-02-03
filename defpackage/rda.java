package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rda extends fcyz implements fdat {
    int a;
    final /* synthetic */ rdb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rda(rdb rdbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = rdbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rda) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            rdb rdbVar = this.b;
            rdx rdxVar = rdbVar.b;
            rbr rbrVar = rdbVar.a;
            fdpb fdpbVar = new fdpb(new rdt(rdxVar, rbrVar, rbrVar.a, null));
            rcz rczVar = new rcz(rdbVar);
            this.a = 1;
            if (fdvt.h(fdpbVar, rczVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new rda(this.b, fcxyVar);
    }
}
