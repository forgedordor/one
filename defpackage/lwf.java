package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lwf extends fcyz implements fdat {
    int a;
    final /* synthetic */ lvc b;
    final /* synthetic */ lvb c;
    final /* synthetic */ fdat d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwf(lvc lvcVar, lvb lvbVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lvcVar;
        this.c = lvbVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.e;
            fdjq fdjqVar = fdkq.a;
            fdmi fdmiVarJ = fdzb.a.j();
            lwe lweVar = new lwe(this.b, this.c, fdjxVar, this.d, null);
            this.a = 1;
            if (fdin.a(fdmiVarJ, lweVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lwf lwfVar = new lwf(this.b, this.c, this.d, fcxyVar);
        lwfVar.e = obj;
        return lwfVar;
    }
}
