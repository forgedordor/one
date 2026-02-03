package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dzb extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdau b;
    final /* synthetic */ dwr c;
    final /* synthetic */ ise d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzb(fdau fdauVar, dwr dwrVar, ise iseVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdauVar;
        this.c = dwrVar;
        this.d = iseVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dzb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdau fdauVar = this.b;
            dwr dwrVar = this.c;
            ihs ihsVar = new ihs(this.d.c);
            this.a = 1;
            if (fdauVar.a(dwrVar, ihsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dzb(this.b, this.c, this.d, fcxyVar);
    }
}
