package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ evya b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djoi(evya evyaVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = evyaVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = this.b.f;
            this.a = 1;
            if (fdkj.c(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.c.b(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djoi(this.b, this.c, fcxyVar);
    }
}
