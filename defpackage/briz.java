package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class briz extends dqsi {
    public static final String[] a = {"smarts_personalization_normalized_feature_values.date", "smarts_personalization_normalized_feature_values.features"};
    public static final brik b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new brik();
        c = new int[]{54020};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("features BLOB");
        sb.insert(0, "CREATE TABLE smarts_personalization_normalized_feature_values (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
