package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ype extends fcyz implements fdat {
    final /* synthetic */ ypn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ype(ypn ypnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ypnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ype) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.g.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ype(this.a, fcxyVar);
    }
}
