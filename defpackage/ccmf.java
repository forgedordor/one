package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccmf extends dqsi {
    public static final String[] a = {"mls_processed_results.self_identity", "mls_processed_results.rcs_message_id", "mls_processed_results.remote_user_id", "mls_processed_results.raw_content", "mls_processed_results.stage", "mls_processed_results.sort_timestamp"};
    public static final ekgp b = new ekgi().c();
    public static final ccln c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("sort_timestamp", "index_mls_processed_results_sort_timestamp");
        ekgiVar.c();
        c = new ccln();
        d = new int[]{60610};
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
        sb.append("self_identity TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("raw_content BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("stage INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sort_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE mls_processed_results (");
        sb.append(", PRIMARY KEY (self_identity,rcs_message_id,remote_user_id));");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_mls_processed_results_sort_timestamp");
        arrayList.add("CREATE INDEX index_mls_processed_results_sort_timestamp ON mls_processed_results(sort_timestamp);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
