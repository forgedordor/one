package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxj extends fcyz implements fdat {
    final /* synthetic */ add a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxj(add addVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = addVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dmuo.b(this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmxj(this.a, fcxyVar);
    }
}
