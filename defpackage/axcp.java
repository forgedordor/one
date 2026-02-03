package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axcp extends fcyz implements fdat {
    int a;
    final /* synthetic */ axcv b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcp(axcv axcvVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axcvVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new axcp(this.b, this.c, fcxyVar);
    }
}
