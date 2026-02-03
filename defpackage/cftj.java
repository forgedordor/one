package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftj extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fcsu c;
    final /* synthetic */ ezol d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cftj(fcxy fcxyVar, boolean z, fcsu fcsuVar, ezol ezolVar, int i) {
        super(2, fcxyVar);
        this.b = z;
        this.c = fcsuVar;
        this.d = ezolVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cftj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (this.b) {
                eiju eijuVarA = ((cdbu) this.c.b()).a();
                eijuVarA.getClass();
                this.a = 1;
                if (fdxs.c(eijuVarA, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        ((cdbu) this.c.b()).c(this.d, "persistent_messaging_proxy_tickle", 1, 1, this.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cftj cftjVar = new cftj(fcxyVar, this.b, this.c, this.d, this.e);
        cftjVar.f = obj;
        return cftjVar;
    }
}
