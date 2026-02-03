package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chtf extends fcyz implements fdat {
    final /* synthetic */ chtk a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chtf(chtk chtkVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chtkVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chtf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chtf(this.a, this.b, fcxyVar);
    }
}
