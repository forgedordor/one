package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cseg extends fcyz implements fdat {
    final /* synthetic */ csei a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cseg(csei cseiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cseiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cseg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.f());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cseg(this.a, fcxyVar);
    }
}
