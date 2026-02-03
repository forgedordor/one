package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csec extends fcyz implements fdat {
    final /* synthetic */ csed a;
    final /* synthetic */ csdr b;
    final /* synthetic */ csdl c;
    final /* synthetic */ eoeo d;
    final /* synthetic */ int e;
    final /* synthetic */ eofg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csec(csed csedVar, csdr csdrVar, csdl csdlVar, eoeo eoeoVar, int i, eofg eofgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = csedVar;
        this.b = csdrVar;
        this.c = csdlVar;
        this.d = eoeoVar;
        this.e = i;
        this.f = eofgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        csed csedVar = this.a;
        crxy crxyVar = (crxy) csedVar.c.b();
        eofg eofgVar = this.f;
        eofgVar.getClass();
        ecem.b();
        cryk crykVar = (cryk) crxyVar.a.b();
        csdr csdrVar = this.b;
        cryl crylVarA = crykVar.a(csdrVar);
        fdjx fdjxVar = crxyVar.c;
        csdl csdlVar = this.c;
        eoeo eoeoVar = this.d;
        int i = this.e;
        auvw.k(fdjxVar, null, null, new crxw(crxyVar, csdrVar, crylVarA, csdlVar, eoeoVar, i, eofgVar, null), 3);
        ((csea) csedVar.b.b()).l(((cspl) csdrVar).c, csdlVar, eoeoVar, i, eofgVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csec(this.a, this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
