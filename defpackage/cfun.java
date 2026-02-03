package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfun extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfut b;
    final /* synthetic */ ezkl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfun(cfut cfutVar, ezkl ezklVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfutVar;
        this.c = ezklVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdci fdciVar = new fdci();
            cfut cfutVar = this.b;
            fdtm fdtmVar = new fdtm(fdqq.a(new cfum(cfutVar.j.b())), new cfuj(fdciVar, fdjxVar, this.c, cfutVar, null));
            this.a = 1;
            if (fdpy.a(fdtmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfun cfunVar = new cfun(this.b, this.c, fcxyVar);
        cfunVar.d = obj;
        return cfunVar;
    }
}
