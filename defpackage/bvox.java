package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvox extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ bvot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvox(bvot bvotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvox) c((efwo) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        efwo efwoVar = (efwo) this.a;
        efwoVar.getClass();
        return this.b.e(efwoVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvox bvoxVar = new bvox(this.b, fcxyVar);
        bvoxVar.a = obj;
        return bvoxVar;
    }
}
