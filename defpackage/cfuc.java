package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfuc extends fcyz implements fdat {
    final /* synthetic */ cfut a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ cfvn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfuc(cfut cfutVar, fdjx fdjxVar, cfvn cfvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cfutVar;
        this.b = fdjxVar;
        this.c = cfvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfuc) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cfut cfutVar = this.a;
        auvw.k(this.b, null, null, new cfun(cfutVar, this.c.a, null), 3);
        cfutVar.g.a(cfuy.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfuc(this.a, this.b, this.c, fcxyVar);
    }
}
