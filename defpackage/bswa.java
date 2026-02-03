package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bswa {
    public static dqsq a() {
        return new dqry(bswf.d, "rbm_business_info_properties", new dqrx() { // from class: bsvy
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bswf.a;
                numValueOf.getClass();
                if (i == 51020) {
                    dqsyVar.v("ALTER TABLE rbm_business_info_properties ADD COLUMN rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                    bswf.d(dqsyVar, 51020);
                } else if (i == 58410) {
                    dqsyVar.v("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
                    dqsyVar.v("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
                } else {
                    if (i != 59830) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
                    dqsyVar.v("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
                }
            }
        });
    }
}
