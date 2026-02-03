package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsn extends dqsi {
    public static final String[] a = {"restore_workflow_files._id", "restore_workflow_files.workflow_execution_id", "restore_workflow_files.backup_file", "restore_workflow_files.file_type", "restore_workflow_files.status"};
    public static final btrt b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new btrt();
        c = new int[]{60040};
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
        sb.append("workflow_execution_id INTEGER NOT NULL REFERENCES restore_workflow_executions(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_file BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE restore_workflow_files (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_execution_id_file_type_status");
        arrayList.add("CREATE INDEX index_execution_id_file_type_status ON restore_workflow_files(workflow_execution_id, file_type, status);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
