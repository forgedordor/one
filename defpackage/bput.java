package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bput extends dqsi {
    public static final String[] a = {"link_preview_participants_table._id", "link_preview_participants_table.participant_id", "link_preview_participants_table.manual_link_preview_count"};
    public static final ekgp b = new ekgi().c();
    public static final bpud c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bpud();
        d = new int[]{26010};
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
        sb.append("participant_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("manual_link_preview_count INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE link_preview_participants_table (");
        sb.append(", FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE);");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
