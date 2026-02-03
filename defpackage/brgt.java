package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brgt extends dqsi {
    public static final String[] a = {"smarts_personalization_decayed_feature_values.feature_id", "smarts_personalization_decayed_feature_values.date", "smarts_personalization_decayed_feature_values.feature_value"};
    public static final ekgp b = new ekgi().c();
    public static final brgd c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("feature_id", "index_smarts_personalization_decayed_feature_values_feature_id");
        ekgiVar.i("date", "index_smarts_personalization_decayed_feature_values_date");
        ekgiVar.c();
        c = new brgd();
        d = new int[]{54010, 58490, 58950};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_id INTEGER REFERENCES smarts_personalization_features(feature_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_value REAL");
        sb.insert(0, "CREATE TABLE smarts_personalization_decayed_feature_values (");
        sb.append(", PRIMARY KEY (feature_id,date));");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58490) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_date");
            arrayList.add("CREATE INDEX index_smarts_personalization_decayed_feature_values_date ON smarts_personalization_decayed_feature_values(date);");
        }
        if (i >= 58950) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_feature_id");
            arrayList.add("CREATE INDEX index_smarts_personalization_decayed_feature_values_feature_id ON smarts_personalization_decayed_feature_values(feature_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa c() {
        return a().M();
    }
}
