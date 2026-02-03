package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tei extends fcyz implements fdat {
    final /* synthetic */ teg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tei(teg tegVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tegVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tei) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tei(this.a, fcxyVar);
    }
}
