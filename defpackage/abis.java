package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abis extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ fcsu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abis(fcsu fcsuVar, fcsu fcsuVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abis) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcsu fcsuVar = this.b;
            fcsu fcsuVar2 = this.c;
            abiu abiuVar = abiu.a;
            this.a = 1;
            if (abiuVar.b(fcsuVar, fcsuVar2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abis(this.b, this.c, fcxyVar);
    }
}
