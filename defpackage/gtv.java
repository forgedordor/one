package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtv extends fcyz implements fdat {
    int a;
    final /* synthetic */ gtx b;
    final /* synthetic */ dod c;
    final /* synthetic */ fdat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtv(gtx gtxVar, dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gtxVar;
        this.c = dodVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gtx gtxVar = this.b;
            gtxVar.i(true);
            dod dodVar = this.c;
            fdat fdatVar = this.d;
            this.a = 1;
            if (gtxVar.h.b(gtxVar.g, dodVar, fdatVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.i(false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gtv(this.b, this.c, this.d, fcxyVar);
    }
}
