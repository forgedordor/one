package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xop extends fcyz implements fdat {
    final /* synthetic */ xoy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xop(xoy xoyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xoyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xop) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aspz aspzVar = (aspz) this.a.i.b();
        enfx enfxVar = (enfx) enfy.a.createBuilder();
        enfxVar.copyOnWrite();
        enfy enfyVar = (enfy) enfxVar.instance;
        enfyVar.c = 3;
        enfyVar.b |= 1;
        aspzVar.i((enfy) enfxVar.build());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xop(this.a, fcxyVar);
    }
}
