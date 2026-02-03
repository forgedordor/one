package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhv extends fcyz implements fdat {
    final /* synthetic */ fdjx a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ iac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqhv(fdjx fdjxVar, fdpl fdplVar, iac iacVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdjxVar;
        this.b = fdplVar;
        this.c = iacVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqhv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdil.d(this.a, null, null, new dqhu(this.b, this.c, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqhv(this.a, this.b, this.c, fcxyVar);
    }
}
