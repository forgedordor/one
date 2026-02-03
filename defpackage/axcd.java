package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcd extends fcyz implements fdat {
    final /* synthetic */ axcl a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcd(fcxy fcxyVar, axcl axclVar) {
        super(2, fcxyVar);
        this.a = axclVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.m();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axcd axcdVar = new axcd(fcxyVar, this.a);
        axcdVar.b = obj;
        return axcdVar;
    }
}
