package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aisu extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisw b;
    final /* synthetic */ aisq c;
    final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisu(aisw aiswVar, aisq aisqVar, Long l, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiswVar;
        this.c = aisqVar;
        this.d = l;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aisw aiswVar = this.b;
            aisq aisqVar = this.c;
            Long l = this.d;
            l.getClass();
            long jLongValue = l.longValue();
            this.a = 1;
            if (aiswVar.d(aisqVar, jLongValue, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisu(this.b, this.c, this.d, fcxyVar);
    }
}
