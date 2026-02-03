package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxsa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxsb b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxsa(dxsb dxsbVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxsbVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxsa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                final List list = this.c;
                dxrn dxrnVar = dxsbVar.a;
                this.a = 1;
                if (list == null) {
                    throw null;
                }
                pex pexVar = ((dxrv) dxrnVar).a;
                final dxrv dxrvVar = (dxrv) dxrnVar;
                obj = phx.c(pexVar, false, true, new fdap() { // from class: dxrp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) throws Exception {
                        pgz pgzVar = (pgz) obj2;
                        pgzVar.getClass();
                        pdk pdkVar = dxrvVar.c;
                        phi phiVarA = pgzVar.a("UPDATE OR REPLACE `gnp_accounts` SET `id` = ?,`account_specific_id` = ?,`account_type` = ?,`obfuscated_gaia_id` = ?,`actual_account_name` = ?,`actual_account_oid` = ?,`registration_status` = ?,`registration_id` = ?,`sync_sources` = ?,`representative_target_id` = ?,`sync_version` = ?,`last_registration_time_ms` = ?,`last_registration_request_hash` = ?,`first_registration_version` = ?,`internal_target_id` = ?,`fitbit_decoded_id` = ? WHERE `id` = ?");
                        try {
                            int iA = 0;
                            for (Object obj3 : list) {
                                if (obj3 != null) {
                                    pdkVar.b(phiVarA, obj3);
                                    phiVarA.j();
                                    phiVarA.h();
                                    iA += pic.a(pgzVar);
                                }
                            }
                            fdaa.a(phiVarA, null);
                            return Integer.valueOf(iA);
                        } finally {
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
        dxsa dxsaVar = new dxsa(this.b, this.c, fcxyVar);
        dxsaVar.d = obj;
        return dxsaVar;
    }
}
