package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnak extends dqsi {
    public static final String[] a = {"cms_status._id", "cms_status.table_type", "cms_status.item_id", "cms_status.cms_id", "cms_status.timestamp", "cms_status.event_type", "cms_status.status", "cms_status.attempt_number"};
    public static final bmzp b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bmzp();
        c = new int[]{44000};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("table_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempt_number INT");
        sb.insert(0, "CREATE TABLE cms_status (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
