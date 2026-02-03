package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxv extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ cchc c;
    final /* synthetic */ int d;
    final /* synthetic */ evqs e;
    final /* synthetic */ aubq f;
    final /* synthetic */ enba g;
    final /* synthetic */ basd h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxv(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, cchc cchcVar, int i, evqs evqsVar, aubq aubqVar, enba enbaVar, basd basdVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = cchcVar;
        this.d = i;
        this.e = evqsVar;
        this.f = aubqVar;
        this.g = enbaVar;
        this.h = basdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.n(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxv cbxvVar = new cbxv(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        cbxvVar.i = obj;
        return cbxvVar;
    }
}
