package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxrz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxsb b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrz(dxsb dxsbVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxsbVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                pex pexVar = ((dxrv) dxrnVar).a;
                final dxrv dxrvVar = (dxrv) dxrnVar;
                obj = phx.c(pexVar, false, true, new fdap() { // from class: dxrr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) throws Exception {
                        pgz pgzVar = (pgz) obj2;
                        pgzVar.getClass();
                        fcww fcwwVar = new fcww((byte[]) null);
                        pdm pdmVar = dxrvVar.b;
                        phi phiVarA = pgzVar.a("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        try {
                            for (Object obj3 : list) {
                                long jB = -1;
                                if (obj3 != null) {
                                    pdmVar.b(phiVarA, obj3);
                                    phiVarA.j();
                                    phiVarA.h();
                                    if (pic.a(pgzVar) != 0) {
                                        phiVarA = pgzVar.a("SELECT last_insert_rowid()");
                                        try {
                                            phiVarA.j();
                                            jB = phiVarA.b(0);
                                            fdaa.a(phiVarA, null);
                                        } finally {
                                        }
                                    }
                                    fcwwVar.add(Long.valueOf(jB));
                                } else {
                                    fcwwVar.add(-1L);
                                }
                            }
                            fdaa.a(phiVarA, null);
                            return fcva.a(fcwwVar);
                        } finally {
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
        dxrz dxrzVar = new dxrz(this.b, this.c, fcxyVar);
        dxrzVar.d = obj;
        return dxrzVar;
    }
}
