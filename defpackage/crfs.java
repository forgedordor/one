package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crfs extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfs(crgd crgdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crgdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crfs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            crgq crgqVar = (crgq) this.b.k.b();
            this.a = 1;
            if (crgqVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crfs(this.b, fcxyVar);
    }
}
