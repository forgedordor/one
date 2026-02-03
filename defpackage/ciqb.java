package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqb extends fcyz implements fdat {
    final /* synthetic */ ciqt a;
    final /* synthetic */ brdv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqb(ciqt ciqtVar, brdv brdvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
        this.b = brdvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((baxe) this.a.e.b()).n(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqb(this.a, this.b, fcxyVar);
    }
}
