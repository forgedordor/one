package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkb extends fcyz implements fdat {
    int a;
    final /* synthetic */ clkd b;
    final /* synthetic */ clng c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkb(fcxy fcxyVar, clkd clkdVar, clng clngVar) {
        super(2, fcxyVar);
        this.b = clkdVar;
        this.c = clngVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clkb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            clkd clkdVar = this.b;
            clng clngVar = this.c;
            this.a = 1;
            if (clkdVar.c(clngVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clkb clkbVar = new clkb(fcxyVar, this.b, this.c);
        clkbVar.d = obj;
        return clkbVar;
    }
}
