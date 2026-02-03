package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brhq {
    public static dqsq a() {
        return new dqry(brhv.c, "smarts_personalization_features", new dqrx() { // from class: brho
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brhv.a;
                numValueOf.getClass();
                if (i == 54000) {
                    brhv.e(dqsyVar, 54000);
                } else {
                    if (i != 54060) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE smarts_personalization_features ADD COLUMN feature TEXT;");
                    dqsyVar.v("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
                }
            }
        });
    }
}
