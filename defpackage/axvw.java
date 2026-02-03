package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvw extends fcyz implements fdat {
    final /* synthetic */ axwp a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ lx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvw(fcxy fcxyVar, axwp axwpVar, byte[] bArr, lx lxVar) {
        super(2, fcxyVar);
        this.a = axwpVar;
        this.b = bArr;
        this.c = lxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.o.d(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axvw axvwVar = new axvw(fcxyVar, this.a, this.b, this.c);
        axvwVar.d = obj;
        return axvwVar;
    }
}
