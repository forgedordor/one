package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brgm {
    public static dqsq a() {
        return new dqry(brgt.d, "smarts_personalization_decayed_feature_values", new dqrx() { // from class: brgk
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brgt.a;
                numValueOf.getClass();
                if (i == 54010) {
                    brgt.b(dqsyVar, 54010);
                    return;
                }
                if (i == 58490) {
                    dqsyVar.v("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_date");
                    dqsyVar.v("CREATE INDEX index_smarts_personalization_decayed_feature_values_date ON smarts_personalization_decayed_feature_values(date);");
                } else {
                    if (i != 58950) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_feature_id");
                    dqsyVar.v("CREATE INDEX index_smarts_personalization_decayed_feature_values_feature_id ON smarts_personalization_decayed_feature_values(feature_id);");
                }
            }
        });
    }
}
