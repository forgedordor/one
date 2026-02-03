package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkb extends fcyz implements fdat {
    final /* synthetic */ dkd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkb(dkd dkdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dkdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dkd dkdVar = this.a;
        ebh ebhVar = dkdVar.g;
        if (ebhVar != null) {
            ebi ebiVar = new ebi(ebhVar);
            ebk ebkVar = dkdVar.i;
            if (ebkVar != null) {
                fdil.d(dkdVar.E(), null, null, new djt(ebkVar, ebiVar, null), 3);
            }
            dkdVar.g = null;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkb(this.a, fcxyVar);
    }
}
