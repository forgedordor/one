package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcne extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcna b;
    final /* synthetic */ fbnh c;
    final /* synthetic */ fcnq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcne(fcna fcnaVar, fbnh fbnhVar, fcnq fcnqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcnaVar;
        this.c = fbnhVar;
        this.d = fcnqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fcna fcnaVar = this.b;
                fbnh fbnhVar = this.c;
                this.a = 1;
                fbnhVar.f(((fcmz) fcnaVar).a);
                if (fctx.a == fcylVar) {
                    return fcylVar;
                }
            }
            this.c.d();
            return fctx.a;
        } catch (Exception e) {
            this.c.c("Collection of requests completed exceptionally", e);
            throw e;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fcne(this.b, this.c, this.d, fcxyVar);
    }
}
