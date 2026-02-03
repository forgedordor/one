package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clpc extends fcyz implements fdat {
    final /* synthetic */ clpk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clpc(clpk clpkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = clpkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clpc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a.c();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clpc(this.a, fcxyVar);
    }
}
