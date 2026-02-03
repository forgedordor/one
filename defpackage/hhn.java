package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhn extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ hcj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhn(isn isnVar, hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            isn isnVar = this.b;
            hhm hhmVar = new hhm(fdjxVar, this.c, null);
            this.a = 1;
            if (isnVar.q(hhmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhn hhnVar = new hhn(this.b, this.c, fcxyVar);
        hhnVar.d = obj;
        return hhnVar;
    }
}
