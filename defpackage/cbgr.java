package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbgr extends fcyz implements fdat {
    final /* synthetic */ fdkf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbgr(fdkf fdkfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdkfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbgr) c((fctx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdlw.e(this.a, "Eager job completed but did not run onComplete!", null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbgr(this.a, fcxyVar);
    }
}
