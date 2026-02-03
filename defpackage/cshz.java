package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cshz extends fcyz implements fdat {
    int a;
    final /* synthetic */ csia b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cshz(csia csiaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csiaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cshz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cshq cshqVar = (cshq) this.b.a.b();
            this.a = 1;
            if (cshqVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cshz(this.b, fcxyVar);
    }
}
