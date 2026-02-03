package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkq extends fcyz implements fdat {
    final /* synthetic */ dnkw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnkq(dnkw dnkwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnkwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnkq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b = new dnki().a;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnkq(this.a, fcxyVar);
    }
}
