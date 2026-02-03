package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqp extends fcyz implements fdat {
    final /* synthetic */ dnqr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqp(dnqr dnqrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnqrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dnqr dnqrVar = this.a;
        dnqrVar.v(0, dnqrVar.i.size(), dnqn.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnqp(this.a, fcxyVar);
    }
}
