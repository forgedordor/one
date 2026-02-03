package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cslh extends fcyz implements fdat {
    int a;
    final /* synthetic */ csli b;
    final /* synthetic */ String c;
    final /* synthetic */ csch d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslh(fcxy fcxyVar, csli csliVar, String str, csch cschVar, int i) {
        super(2, fcxyVar);
        this.b = csliVar;
        this.c = str;
        this.d = cschVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csrb csrbVar = (csrb) this.b.e.b();
        String str = this.c;
        csch cschVar = this.d;
        int i2 = this.e;
        this.a = 1;
        Object objA = fdin.a(eicg.a(csrbVar.e), new csqv(null, str, cschVar.j, csrbVar, i2), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cslh cslhVar = new cslh(fcxyVar, this.b, this.c, this.d, this.e);
        cslhVar.f = obj;
        return cslhVar;
    }
}
