package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnzt extends fcyz implements fdat {
    int a;
    final /* synthetic */ coaw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnzt(coaw coawVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coawVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnzt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnxc cnxcVar = (cnxc) this.b.a.b();
            this.a = 1;
            if (cnxcVar.a(null, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnzt(this.b, fcxyVar);
    }
}
