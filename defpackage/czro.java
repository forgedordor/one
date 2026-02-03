package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czro extends fcyz implements fdat {
    final /* synthetic */ czrp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czro(czrp czrpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = czrpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czro) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        czrp czrpVar = this.a;
        czrpVar.b.l(czrpVar.a.fg(), true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new czro(this.a, fcxyVar);
    }
}
