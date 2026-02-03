package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edzf extends fcyz implements fdat {
    final /* synthetic */ edzh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edzf(edzh edzhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = edzhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edzf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        edzh edzhVar = this.a;
        edxi edxiVar = edzhVar.g;
        if (edxiVar == null) {
            fdbq.c("viewModel");
            edxiVar = null;
        }
        edxiVar.a(edzhVar.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edzf(this.a, fcxyVar);
    }
}
