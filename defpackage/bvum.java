package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvum extends fcyz implements fdat {
    final /* synthetic */ bvuo a;
    final /* synthetic */ bvvt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvum(bvuo bvuoVar, bvvt bvvtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bvuoVar;
        this.b = bvvtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvum) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((bvvu) this.a.a.b()).a(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvum(this.a, this.b, fcxyVar);
    }
}
