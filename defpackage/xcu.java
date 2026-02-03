package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcu extends fcyz implements fdat {
    int a;
    final /* synthetic */ xdz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcu(xdz xdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xdz xdzVar = this.b;
            xct xctVar = new xct(xdzVar);
            this.a = 1;
            if (fdum.g((fdum) xdzVar.l, xctVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xcu(this.b, fcxyVar);
    }
}
