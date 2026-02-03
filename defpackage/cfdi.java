package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfdl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdi(cfdl cfdlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfdlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cfdl cfdlVar = this.b;
            this.a = 1;
            obj = cfdlVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long jLongValue = ((Number) obj).longValue();
        epnk epnkVar = (epnk) epnl.a.createBuilder();
        epnkVar.getClass();
        epnm.b(epnkVar);
        epnkVar.copyOnWrite();
        ((epnl) epnkVar.instance).c = jLongValue;
        epnkVar.copyOnWrite();
        ((epnl) epnkVar.instance).d = true;
        return epnm.a(epnkVar).toByteString();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfdi(this.b, fcxyVar);
    }
}
