package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyd extends fcyz implements fdat {
    final /* synthetic */ fdjc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlyd(fdjc fdjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlyd) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fctx fctxVar = fctx.a;
        ((fdme) this.a).R(fctxVar);
        return fctxVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlyd(this.a, fcxyVar);
    }
}
