package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fms extends fcyz implements fdat {
    final /* synthetic */ fmx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fms(fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.D();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fms(this.a, fcxyVar);
    }
}
