package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqj extends fcyz implements fdat {
    final /* synthetic */ yql a;
    final /* synthetic */ anms b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqj(yql yqlVar, anms anmsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yqlVar;
        this.b = anmsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((afzc) this.a.i.b()).h(new aggn(this.b.a));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yqj(this.a, this.b, fcxyVar);
    }
}
