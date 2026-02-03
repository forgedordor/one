package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ akfk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfj(akfk akfkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.b.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return new akfi(this.b.a, (ajts) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akfj(this.b, fcxyVar);
    }
}
