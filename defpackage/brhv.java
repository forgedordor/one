package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brhv extends dqsi {
    public static final String[] a = {"smarts_personalization_features.feature_id", "smarts_personalization_features.feature", "smarts_personalization_features.start_date"};
    public static final brhh b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("smarts_personalization_features.feature", 54060);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("feature", "index_smarts_personalization_features_feature");
        ekgiVar2.c();
        b = new brhh();
        c = new int[]{54000, 54060};
    }

    public static final brhs a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("smarts_personalization_features.feature_id");
            if (numC.intValue() >= 54060) {
                ekfwVar.h("smarts_personalization_features.feature");
            }
            ekfwVar.h("smarts_personalization_features.start_date");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new brhs(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE ON CONFLICT FAIL");
        if (i >= 54060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("feature TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_date INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "smarts_personalization_features"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    public static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 54060) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_features_feature");
            arrayList.add("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
