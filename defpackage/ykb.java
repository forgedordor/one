package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykb extends fcyz implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ ykc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykb(int i, ykc ykcVar, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = i;
        this.b = ykcVar;
        this.c = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ykb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = this.a;
        if (i > 0) {
            this.b.a.d("Bugle.MessageUiDataCache.Hit", i);
        }
        int i2 = this.c;
        if (i2 > 0) {
            this.b.a.d("Bugle.MessageUiDataCache.Miss", i2);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ykb(this.a, this.b, this.c, fcxyVar);
    }
}
