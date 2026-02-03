package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzv extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzv(fcxy fcxyVar, aybe aybeVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((cdzw) this.a.B.b()).a());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axzv axzvVar = new axzv(fcxyVar, this.a);
        axzvVar.b = obj;
        return axzvVar;
    }
}
