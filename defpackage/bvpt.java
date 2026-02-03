package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvpt extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvpu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvpt(bvpu bvpuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvpuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvpt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvpu bvpuVar = this.b;
            this.a = 1;
            if (bvpuVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvpt(this.b, fcxyVar);
    }
}
