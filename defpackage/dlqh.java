package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqh extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fdap d;
    final /* synthetic */ dlqn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlqh(isn isnVar, boolean z, fdap fdapVar, dlqn dlqnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = z;
        this.d = fdapVar;
        this.e = dlqnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlqh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.f;
            isn isnVar = this.b;
            dlqg dlqgVar = new dlqg(fdjxVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (dvn.b(isnVar, dlqgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlqh dlqhVar = new dlqh(this.b, this.c, this.d, this.e, fcxyVar);
        dlqhVar.f = obj;
        return dlqhVar;
    }
}
