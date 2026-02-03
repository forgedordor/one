package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnmu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnmu(dnmw dnmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnmu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnmw dnmwVar = this.b;
            this.a = 1;
            if (dnmwVar.c.e() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnmu(this.b, fcxyVar);
    }
}
