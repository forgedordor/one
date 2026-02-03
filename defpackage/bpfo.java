package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpfo extends dqsi {
    public static final String[] a = {"emergency_sessions.emergency_destination", "emergency_sessions.type", "emergency_sessions.start_timestamp", "emergency_sessions.end_timestamp", "emergency_sessions.refill_duration_ms"};
    public static final bpew b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bpew();
        c = new int[]{60630};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("emergency_destination TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("end_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("refill_duration_ms INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE emergency_sessions (");
        sb.append(", PRIMARY KEY (emergency_destination,type));");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
