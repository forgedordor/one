package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cadb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cadc b;
    final /* synthetic */ caei c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cadb(cadc cadcVar, caei caeiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cadcVar;
        this.c = caeiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cadb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cadc cadcVar = this.b;
            fcyh fcyhVarA = eicg.a(cadcVar.b);
            cada cadaVar = new cada(null, cadcVar);
            this.a = 1;
            if (fdin.a(fcyhVarA, cadaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        caec caecVar = (caec) this.c.toBuilder();
        caecVar.copyOnWrite();
        caei caeiVar = (caei) caecVar.instance;
        caeiVar.f = 2;
        caeiVar.c |= 4;
        evsn evsnVarBuild = caecVar.build();
        evsnVarBuild.getClass();
        return evsnVarBuild;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cadb(this.b, this.c, fcxyVar);
    }
}
