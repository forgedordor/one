package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoh extends fcyz implements fdat {
    final /* synthetic */ dmoo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmoh(dmoo dmooVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmooVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.invoke(dmnr.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmoh(this.a, fcxyVar);
    }
}
