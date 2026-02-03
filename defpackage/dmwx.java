package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwx extends fcyz implements fdat {
    final /* synthetic */ dmvm a;
    final /* synthetic */ gak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmwx(dmvm dmvmVar, gak gakVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmvmVar;
        this.b = gakVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmwx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((dmvk) this.a).b.b(Boolean.valueOf(this.b.a.d() == gsq.b));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmwx(this.a, this.b, fcxyVar);
    }
}
