package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxry extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxsb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxry(dxsb dxsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxry) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                dxrn dxrnVar = this.b.a;
                this.a = 1;
                obj = phx.c(((dxrv) dxrnVar).a, true, false, new fdap() { // from class: dxrs
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        phi phiVarA = ((pgz) obj2).a("SELECT * FROM gnp_accounts");
                        try {
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
                            ArrayList arrayList = new ArrayList();
                            while (phiVarA.j()) {
                                long jB = phiVarA.b(iB);
                                String strD = phiVarA.i(iB2) ? null : phiVarA.d(iB2);
                                int i = iB14;
                                ArrayList arrayList2 = arrayList;
                                int iC = dxqf.c((int) phiVarA.b(iB3));
                                String strD2 = phiVarA.i(iB4) ? null : phiVarA.d(iB4);
                                String strD3 = phiVarA.i(iB5) ? null : phiVarA.d(iB5);
                                String strD4 = phiVarA.i(iB6) ? null : phiVarA.d(iB6);
                                int iB17 = (int) phiVarA.b(iB7);
                                String strD5 = phiVarA.i(iB8) ? null : phiVarA.d(iB8);
                                ekhx ekhxVarA = dxqf.a(phiVarA.i(iB9) ? null : phiVarA.d(iB9));
                                String strD6 = phiVarA.i(iB10) ? null : phiVarA.d(iB10);
                                long jB2 = phiVarA.b(iB11);
                                long jB3 = phiVarA.b(iB12);
                                int i2 = iB2;
                                int i3 = iB3;
                                int iB18 = (int) phiVarA.b(iB13);
                                long jB4 = phiVarA.b(i);
                                int i4 = iB;
                                int i5 = iB15;
                                String strD7 = phiVarA.i(i5) ? null : phiVarA.d(i5);
                                iB15 = i5;
                                int i6 = iB16;
                                arrayList2.add(dxhe.u(jB, strD, iC, strD2, strD3, strD4, iB17, strD5, ekhxVarA, strD6, jB2, jB3, iB18, jB4, strD7, phiVarA.b(i6)));
                                iB16 = i6;
                                iB2 = i2;
                                iB = i4;
                                arrayList = arrayList2;
                                iB14 = i;
                                iB3 = i3;
                            }
                            return arrayList;
                        } finally {
                            phiVarA.close();
                        }
                    }
                }, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            objA = (List) obj;
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return dxfv.d(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxry dxryVar = new dxry(this.b, fcxyVar);
        dxryVar.c = obj;
        return dxryVar;
    }
}
