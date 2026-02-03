package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnsg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnsj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnsg(dnsj dnsjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnsjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnsg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnsj dnsjVar = this.b;
            this.a = 1;
            if (dnsjVar.d.a(dnsjVar.b, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnsg(this.b, fcxyVar);
    }
}
