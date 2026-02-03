package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bowl extends dqsi {
    public static final String[] a = {"data_usage._id", "data_usage.phone_number", "data_usage.data_size"};
    public static final bovz b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bovz();
        c = new int[]{51010};
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
        sb.append("phone_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data_size INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_usage (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
