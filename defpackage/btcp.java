package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btcp extends dqsi {
    public static final String[] a = {"received_message_phone_numbers.rcs_message_id", "received_message_phone_numbers.self_msisdn"};
    public static final btce b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new btce();
        c = new int[]{40020};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_msisdn TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE received_message_phone_numbers (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
