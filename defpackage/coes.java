package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coes extends fcyz implements fdat {
    final /* synthetic */ coeu a;
    final /* synthetic */ ewtf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coes(coeu coeuVar, ewtf ewtfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = coeuVar;
        this.b = ewtfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coes) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.a(cbcu.f("TelephonyDatabaseUpdateWorkItemHandler", this.b));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new coes(this.a, this.b, fcxyVar);
    }
}
