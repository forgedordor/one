package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ort extends fcyz implements fdat {
    final /* synthetic */ orv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ort(orv orvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = orvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ort) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ort(this.a, fcxyVar);
    }
}
