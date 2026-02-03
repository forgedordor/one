package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asuq {
    public static dqsq a() {
        return new dqry(asux.c, "rcs_remote_capabilities_cache", new dqrx() { // from class: asun
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = asux.a;
                numValueOf.getClass();
                if (i == 58110) {
                    asux.b(dqsyVar, 58110);
                } else {
                    if (i != 58420) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_rcs_remote_capabilities_cache_msisdn");
                    dqsyVar.v("CREATE INDEX index_rcs_remote_capabilities_cache_msisdn ON rcs_remote_capabilities_cache(msisdn);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(asux.d, true, "rcs_remote_capabilities_cache", new dqrx() { // from class: asuo
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = asux.a;
                numValueOf.getClass();
                if (i != 58130) {
                    return;
                }
                dqru.K(dqsyVar, "rcs_remote_capabilities_cache", asux.d("TEMP___rcs_remote_capabilities_cache"), asux.a, asux.c(58130));
            }
        });
    }
}
