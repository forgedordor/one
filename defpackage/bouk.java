package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bouk extends dqsi {
    public static final String[] a = {"custodian_rcs_group_ids.conversation_id", "custodian_rcs_group_ids.rcs_group_id"};
    public static final boty b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new boty();
        c = new int[]{57000};
        d = new int[]{57060};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dqsy dqsyVar) {
        dqsyVar.v(b("custodian_rcs_group_ids"));
        for (String str : c()) {
            dqsyVar.v(str);
        }
    }
}
