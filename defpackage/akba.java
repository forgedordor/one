package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akba extends fcyz implements fdat {
    final /* synthetic */ akbc a;
    final /* synthetic */ aubq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akba(akbc akbcVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akbcVar;
        this.b = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akba) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        akbc akbcVar = this.a;
        return ((anuh) akbcVar.c.b()).a(((alrj) akbcVar.d.b()).b(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akba(this.a, this.b, fcxyVar);
    }
}
