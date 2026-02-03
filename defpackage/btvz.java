package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvz extends dqsi {
    public static final String[] a = {"restore_workflow_scratch_timestamps.which_database", "restore_workflow_scratch_timestamps.message_id", "restore_workflow_scratch_timestamps.timestamp_in_seconds", "restore_workflow_scratch_timestamps.timestamp_mod_1000"};
    public static final btvi b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_restore_workflow_scratch_timestamps_message_id");
        ekgiVar.i("timestamp_in_seconds", "index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        ekgiVar.c();
        b = new btvi();
        c = new int[]{60420};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("which_database INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_in_seconds INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_mod_1000 INTEGER");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_timestamps (");
        sb.append(", UNIQUE(which_database,message_id) ON CONFLICT IGNORE);");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_message_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_message_id ON restore_workflow_scratch_timestamps(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_timestamp_in_seconds ON restore_workflow_scratch_timestamps(timestamp_in_seconds);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
