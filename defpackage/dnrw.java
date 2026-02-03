package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrw extends fcyz implements fdat {
    final /* synthetic */ dnsa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrw(dnsa dnsaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnsaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dnsa dnsaVar = this.a;
        dnsaVar.b.P().c(new dnrv(dnsaVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnrw(this.a, fcxyVar);
    }
}
