package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class orj extends fcyz implements fdat {
    final /* synthetic */ orl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orj(orl orlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = orlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((orj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.l.i(orr.a, orn.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new orj(this.a, fcxyVar);
    }
}
