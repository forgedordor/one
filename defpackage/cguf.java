package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cguf extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cguf(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguf) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.b |= 2;
        cgtdVar.e = true;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cguf cgufVar = new cguf(fcxyVar);
        cgufVar.a = obj;
        return cgufVar;
    }
}
