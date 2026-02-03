package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqy extends dqsi {
    public static final String[] a = {"restore_workflow_executions._id", "restore_workflow_executions.session_id", "restore_workflow_executions.feature", "restore_workflow_executions.status", "restore_workflow_executions.start_time", "restore_workflow_executions.finish_time", "restore_workflow_executions.backup_database_metadata", "restore_workflow_executions.initial_messages_version", "restore_workflow_executions.status_timestamp", "restore_workflow_executions.last_attachment_request_timestamp", "restore_workflow_executions.config", "restore_workflow_executions.cleaned_up"};
    public static final ekgp b;
    public static final btpv c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("restore_workflow_executions.initial_messages_version", 60110);
        ekgiVar.i("restore_workflow_executions.status_timestamp", 60220);
        ekgiVar.i("restore_workflow_executions.last_attachment_request_timestamp", 60330);
        ekgiVar.i("restore_workflow_executions.config", 60730);
        ekgiVar.i("restore_workflow_executions.cleaned_up", 60760);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("session_id", "index_restore_workflow_executions_session_id");
        ekgiVar2.c();
        c = new btpv();
        d = new int[]{60040, 60110, 60220, 60330, 60730, 60760};
    }

    public static final btqt a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("restore_workflow_executions._id");
            ekfwVar.h("restore_workflow_executions.session_id");
            ekfwVar.h("restore_workflow_executions.feature");
            ekfwVar.h("restore_workflow_executions.status");
            ekfwVar.h("restore_workflow_executions.start_time");
            ekfwVar.h("restore_workflow_executions.finish_time");
            ekfwVar.h("restore_workflow_executions.backup_database_metadata");
            if (numC.intValue() >= 60110) {
                ekfwVar.h("restore_workflow_executions.initial_messages_version");
            }
            if (numC.intValue() >= 60220) {
                ekfwVar.h("restore_workflow_executions.status_timestamp");
            }
            if (numC.intValue() >= 60330) {
                ekfwVar.h("restore_workflow_executions.last_attachment_request_timestamp");
            }
            if (numC.intValue() >= 60730) {
                ekfwVar.h("restore_workflow_executions.config");
            }
            if (numC.intValue() >= 60760) {
                ekfwVar.h("restore_workflow_executions.cleaned_up");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new btqt(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("session_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_time INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("finish_time INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_database_metadata BLOB");
        if (i >= 60110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("initial_messages_version INTEGER");
        }
        if (i >= 60220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("status_timestamp INTEGER");
        }
        if (i >= 60330) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_attachment_request_timestamp INTEGER");
        }
        if (i >= 60730) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("config BLOB");
        }
        if (i >= 60760) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cleaned_up INTEGER");
        }
        sb.insert(0, "CREATE TABLE restore_workflow_executions (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_executions_session_id");
        arrayList.add("CREATE UNIQUE INDEX index_restore_workflow_executions_session_id ON restore_workflow_executions(session_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
