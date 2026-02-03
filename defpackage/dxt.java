package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxt extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxz b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxt(dxz dxzVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxzVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxz dxzVar = this.b;
            long j = this.c;
            this.a = 1;
            if (dxzVar.b.h(j, false, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxt(this.b, this.c, fcxyVar);
    }
}
