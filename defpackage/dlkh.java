package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlkh extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlkh(fdap fdapVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlkh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.invoke(Boolean.valueOf(!fdbq.f(this.b, dlkk.a)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlkh(this.a, this.b, fcxyVar);
    }
}
