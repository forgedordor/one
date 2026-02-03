package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buzp extends dqsi {
    public static final String[] a = {"verified_sms_blacklisted_senders.sender_id"};
    public static final buzf b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new buzf();
        c = new int[]{33080};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id TEXT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE verified_sms_blacklisted_senders (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
