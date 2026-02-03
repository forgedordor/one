package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzpd extends fcyz implements fdat {
    final /* synthetic */ bzpg a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpd(fcxy fcxyVar, bzpg bzpgVar, String str, int i, boolean z, boolean z2) {
        super(2, fcxyVar);
        this.a = bzpgVar;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzpd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d(this.b, this.c, this.d, this.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzpd bzpdVar = new bzpd(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        bzpdVar.f = obj;
        return bzpdVar;
    }
}
