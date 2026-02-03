package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class phs extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ pex c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phs(fcyh fcyhVar, pex pexVar, boolean z, boolean z2, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcyhVar;
        this.c = pexVar;
        this.d = z;
        this.e = z2;
        this.f = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((phs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fcyh fcyhVar = this.b;
        phr phrVar = new phr(this.c, this.d, this.e, this.f, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVar, phrVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new phs(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
