package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxd extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdci b;
    final /* synthetic */ swv c;
    final /* synthetic */ elee d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxd(fcxy fcxyVar, fdci fdciVar, swv swvVar, elee eleeVar) {
        super(2, fcxyVar);
        this.b = fdciVar;
        this.c = swvVar;
        this.d = eleeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sxd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdlr fdlrVar = (fdlr) this.b.a;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            swv swvVar = this.c;
            this.a = 1;
            if (swvVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        this.d.close();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sxd sxdVar = new sxd(fcxyVar, this.b, this.c, this.d);
        sxdVar.e = obj;
        return sxdVar;
    }
}
