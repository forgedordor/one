package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feka extends fcyz implements fdat {
    final /* synthetic */ fekg a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feka(fcxy fcxyVar, fekg fekgVar) {
        super(2, fcxyVar);
        this.a = fekgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((feka) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((vbv) this.a.a.b()).c(false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        feka fekaVar = new feka(fcxyVar, this.a);
        fekaVar.b = obj;
        return fekaVar;
    }
}
