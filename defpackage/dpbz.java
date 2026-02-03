package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpcf b;
    final /* synthetic */ doxa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbz(dpcf dpcfVar, doxa doxaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpcfVar;
        this.c = doxaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpcf dpcfVar = this.b;
            doxa doxaVar = this.c;
            this.a = 1;
            if (dpcfVar.p(doxaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpbz(this.b, this.c, fcxyVar);
    }
}
