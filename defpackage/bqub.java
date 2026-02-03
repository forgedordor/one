package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqub extends dqsi {
    public static final String[] a = {"message_status._id", "message_status.message_id", "message_status.timestamp", "message_status.status", "message_status.custom_status", "message_status.data"};
    public static final ekgp b = new ekgi().c();
    public static final bqti c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bqti();
        d = new int[]{33010};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static dqxa b() {
        return a().M();
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data TEXT");
        sb.insert(0, "CREATE TABLE message_status (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
