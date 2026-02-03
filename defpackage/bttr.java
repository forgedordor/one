package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bttr extends dqsi {
    public static final String[] a = {"restore_workflow_scratch_duplicates.key", "restore_workflow_scratch_duplicates.backup_id", "restore_workflow_scratch_duplicates.bugle_id"};
    public static final bttb b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("key", "index_restore_workflow_scratch_duplicates_key");
        ekgiVar.i("backup_id", "index_restore_workflow_scratch_duplicates_backup_id");
        ekgiVar.i("bugle_id", "index_restore_workflow_scratch_duplicates_bugle_id");
        ekgiVar.c();
        b = new bttb();
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
        sb.append("key INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bugle_id TEXT");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_duplicates (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_key");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_key ON restore_workflow_scratch_duplicates(key);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_backup_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_backup_id ON restore_workflow_scratch_duplicates(backup_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_bugle_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_bugle_id ON restore_workflow_scratch_duplicates(bugle_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
