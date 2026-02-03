package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfw extends fcyz implements fdat {
    final /* synthetic */ vgd a;
    final /* synthetic */ cqky b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfw(vgd vgdVar, cqky cqkyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vgdVar;
        this.b = cqkyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vfw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.f(Boolean.valueOf(this.b.a()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vfw(this.a, this.b, fcxyVar);
    }
}
