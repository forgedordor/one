package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyb extends fcyz implements fdat {
    int a;
    final /* synthetic */ lvc b;
    final /* synthetic */ lvb c;
    final /* synthetic */ fcyh d;
    final /* synthetic */ fdpl e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb(lvc lvcVar, lvb lvbVar, fcyh fcyhVar, fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lvcVar;
        this.c = lvbVar;
        this.d = fcyhVar;
        this.e = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyb) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hps hpsVar = (hps) this.f;
            lvc lvcVar = this.b;
            lvb lvbVar = this.c;
            lya lyaVar = new lya(this.d, this.e, hpsVar, null);
            this.a = 1;
            if (lwg.a(lvcVar, lvbVar, lyaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lyb lybVar = new lyb(this.b, this.c, this.d, this.e, fcxyVar);
        lybVar.f = obj;
        return lybVar;
    }
}
