package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvov extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ bvot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvov(bvot bvotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvov) c((efwo) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.b.e((efwo) this.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvov bvovVar = new bvov(this.b, fcxyVar);
        bvovVar.a = obj;
        return bvovVar;
    }
}
