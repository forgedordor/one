package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvv extends fcyz implements fdat {
    final /* synthetic */ axwp a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvv(fcxy fcxyVar, axwp axwpVar, int i, String str, String str2, long j) {
        super(2, fcxyVar);
        this.a = axwpVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axwp axwpVar = this.a;
        axwpVar.d.c(axwpVar.c, this.b, this.c, this.d, 131, this.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axvv axvvVar = new axvv(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        axvvVar.f = obj;
        return axvvVar;
    }
}
