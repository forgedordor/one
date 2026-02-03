package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnkj extends fcyz implements fdat {
    final /* synthetic */ cnkm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkj(cnkm cnkmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cnkmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((cozg) this.a.a.b()).f(coze.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkj(this.a, fcxyVar);
    }
}
