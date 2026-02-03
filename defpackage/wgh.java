package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wgh extends fcyz implements fdat {
    int a;
    final /* synthetic */ wgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgh(wgk wgkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wgkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wgh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wgk wgkVar = this.b;
            this.a = 1;
            if (wgkVar.f.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wgh(this.b, fcxyVar);
    }
}
