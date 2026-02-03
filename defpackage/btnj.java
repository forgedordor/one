package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btnj extends dqsi {
    public static final String[] a = {"remote_user_id_info_table.remote_user_id", "remote_user_id_info_table.last_modified_timestamp", "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp"};
    public static final btmt b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new btmt();
        c = new int[]{45000};
    }

    public static btmj a(String str) {
        btne btneVar = new btne(a);
        btneVar.A("remote_user_id_info_table.queryOnRemoteUserId");
        btneVar.q();
        btni btniVar = new btni();
        btniVar.ap(new dqpj("remote_user_id_info_table.remote_user_id", 1, String.valueOf(str)));
        btneVar.k(new btnh(btniVar));
        return (btmj) dqru.c(btneVar.b());
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_user_id_info_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
