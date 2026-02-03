package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwi extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ axwp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axwi(fcxy fcxyVar, boolean z, boolean z2, axwp axwpVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = z2;
        this.c = axwpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cqce cqceVar = axwp.a;
        axtl.d(axvr.a(this.a, this.b), this.c.A);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axwi axwiVar = new axwi(fcxyVar, this.a, this.b, this.c);
        axwiVar.d = obj;
        return axwiVar;
    }
}
