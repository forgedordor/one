package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xuk extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ xul c;
    final /* synthetic */ awzf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuk(xul xulVar, awzf awzfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = xulVar;
        this.d = awzfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xuk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fduf fdufVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            fdufVar = obj2;
        } else {
            fctl.b(obj);
            xul xulVar = this.c;
            awzf awzfVar = this.d;
            fduf fdufVar2 = xulVar.b;
            this.a = fdufVar2;
            this.b = 1;
            Object objE = awzfVar.e(this);
            if (objE == fcylVar) {
                return fcylVar;
            }
            fdufVar = fdufVar2;
            obj = objE;
        }
        fdufVar.f(fcva.O((Iterable) obj));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xuk(this.c, this.d, fcxyVar);
    }
}
