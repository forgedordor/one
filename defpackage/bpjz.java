package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpjz extends dqsi {
    public static final String[] a = {"events._id", "events.timestamp", "events.event", "events.data"};
    public static final ekgp b = new ekgi().c();
    public static final bpjg c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bpjg();
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
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data TEXT");
        sb.insert(0, "CREATE TABLE events (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
