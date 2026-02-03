package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxrw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxsb b;
    final /* synthetic */ dxvi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrw(dxsb dxsbVar, dxvi dxviVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxsbVar;
        this.c = dxviVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dxsb dxsbVar = this.b;
                dxvi dxviVar = this.c;
                dxrn dxrnVar = dxsbVar.a;
                final int iA = dxhf.a(dxviVar);
                final String strA = dxviVar.a();
                this.a = 1;
                obj = phx.c(((dxrv) dxrnVar).a, false, true, new fdap() { // from class: dxrq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        pgz pgzVar = (pgz) obj2;
                        phi phiVarA = pgzVar.a("DELETE FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                        int i = iA;
                        String str = strA;
                        try {
                            phiVarA.e(1, i);
                            phiVarA.g(2, str);
                            phiVarA.j();
                            return Integer.valueOf(pic.a(pgzVar));
                        } finally {
                            phiVarA.close();
                        }
                    }
                }, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            objA = new Integer(((Number) obj).intValue());
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return dxfv.d(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxrw dxrwVar = new dxrw(this.b, this.c, fcxyVar);
        dxrwVar.d = obj;
        return dxrwVar;
    }
}
