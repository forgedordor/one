package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnw extends dqsi {
    public static final String[] a = {"phone_number_min_match_guesser.guesser_id", "phone_number_min_match_guesser.test_phone_number"};
    public static final bsnh b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bsnh();
        c = new int[]{58080};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guesser_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("test_phone_number TEXT");
        sb.insert(0, "CREATE TABLE phone_number_min_match_guesser (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
