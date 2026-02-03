package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dka extends fcyz implements fdat {
    final /* synthetic */ dkd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dka(dkd dkdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dkdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dka) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dkd dkdVar = this.a;
        if (dkdVar.g == null) {
            ebh ebhVar = new ebh();
            ebk ebkVar = dkdVar.i;
            if (ebkVar != null) {
                fdil.d(dkdVar.E(), null, null, new djs(ebkVar, ebhVar, null), 3);
            }
            dkdVar.g = ebhVar;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dka(this.a, fcxyVar);
    }
}
