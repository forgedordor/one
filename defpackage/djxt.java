package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxt extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxt(long j, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djxt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hox hoxVar = this.c;
            long j = this.b;
            ddp ddpVarB = djyg.b(hoxVar);
            ije ijeVar = new ije(j);
            this.a = 1;
            if (ddp.k(ddpVarB, ijeVar, null, null, this, 14) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djxt(this.b, this.c, fcxyVar);
    }
}
