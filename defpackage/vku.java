package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vku extends fcyz implements fdat {
    int a;
    final /* synthetic */ fduf b;
    final /* synthetic */ ahat c;
    final /* synthetic */ vkv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vku(fduf fdufVar, ahat ahatVar, vkv vkvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdufVar;
        this.c = ahatVar;
        this.d = vkvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vku) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fduf fdufVar = this.b;
            vkt vktVar = new vkt(this.c, this.d, fdufVar);
            this.a = 1;
            if (fdufVar.a(vktVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vku(this.b, this.c, this.d, fcxyVar);
    }
}
