package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxrx extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxsb b;
    final /* synthetic */ dxvi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrx(dxsb dxsbVar, dxvi dxviVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxsbVar;
        this.c = dxviVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                obj = phx.c(((dxrv) dxrnVar).a, true, false, new fdap() { // from class: dxro
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        phi phiVarA = ((pgz) obj2).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                        int i = iA;
                        String str = strA;
                        try {
                            phiVarA.e(1, i);
                            phiVarA.g(2, str);
                            int iB = pid.b(phiVarA, "id");
                            int iB2 = pid.b(phiVarA, "account_specific_id");
                            int iB3 = pid.b(phiVarA, "account_type");
                            int iB4 = pid.b(phiVarA, "obfuscated_gaia_id");
                            int iB5 = pid.b(phiVarA, "actual_account_name");
                            int iB6 = pid.b(phiVarA, "actual_account_oid");
                            int iB7 = pid.b(phiVarA, "registration_status");
                            int iB8 = pid.b(phiVarA, "registration_id");
                            int iB9 = pid.b(phiVarA, "sync_sources");
                            int iB10 = pid.b(phiVarA, "representative_target_id");
                            int iB11 = pid.b(phiVarA, "sync_version");
                            int iB12 = pid.b(phiVarA, "last_registration_time_ms");
                            int iB13 = pid.b(phiVarA, "last_registration_request_hash");
                            int iB14 = pid.b(phiVarA, "first_registration_version");
                            int iB15 = pid.b(phiVarA, "internal_target_id");
                            int iB16 = pid.b(phiVarA, "fitbit_decoded_id");
                            if (phiVarA.j()) {
                                objU = dxhe.u(phiVarA.b(iB), phiVarA.i(iB2) ? null : phiVarA.d(iB2), dxqf.c((int) phiVarA.b(iB3)), phiVarA.i(iB4) ? null : phiVarA.d(iB4), phiVarA.i(iB5) ? null : phiVarA.d(iB5), phiVarA.i(iB6) ? null : phiVarA.d(iB6), (int) phiVarA.b(iB7), phiVarA.i(iB8) ? null : phiVarA.d(iB8), dxqf.a(phiVarA.i(iB9) ? null : phiVarA.d(iB9)), phiVarA.i(iB10) ? null : phiVarA.d(iB10), phiVarA.b(iB11), phiVarA.b(iB12), (int) phiVarA.b(iB13), phiVarA.b(iB14), phiVarA.i(iB15) ? null : phiVarA.d(iB15), phiVarA.b(iB16));
                            }
                            return objU;
                        } finally {
                            phiVarA.close();
                        }
                    }
                }, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            objA = (dxhe) obj;
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return dxfv.d(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxrx dxrxVar = new dxrx(this.b, this.c, fcxyVar);
        dxrxVar.d = obj;
        return dxrxVar;
    }
}
