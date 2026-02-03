package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vag extends fcyz implements fdat {
    final /* synthetic */ vah a;
    final /* synthetic */ enta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vag(vah vahVar, enta entaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vahVar;
        this.b = entaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vag) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((uzw) this.a.a.b()).m(this.b);
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vag(this.a, this.b, fcxyVar);
    }
}
