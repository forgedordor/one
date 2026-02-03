package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aujr extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujs b;
    final /* synthetic */ aujk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aujr(aujs aujsVar, aujk aujkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aujsVar;
        this.c = aujkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aujr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aujs aujsVar = this.b;
        aujk aujkVar = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(aujsVar.b), new aujq(null, aujsVar, aujkVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aujr(this.b, this.c, fcxyVar);
    }
}
