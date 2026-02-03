package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkn extends fcyz implements fdat {
    int a;
    final /* synthetic */ kkt b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(kkt kktVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = kktVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            kkt kktVar = this.b;
            long j = this.c;
            this.a = 1;
            if (kktVar.b.e(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new kkn(this.b, this.c, fcxyVar);
    }
}
