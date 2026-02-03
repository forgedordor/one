package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnw extends fcyz implements fdat {
    int a;
    final /* synthetic */ amnz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnw(amnz amnzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amnzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarB = this.b.m().b();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amnw(this.b, fcxyVar);
    }
}
