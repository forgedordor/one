package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azph extends dqsi {
    public static final String[] a = {"read_reports_backup._id", "read_reports_backup.message_id", "read_reports_backup.participant_id", "read_reports_backup.receive_time", "read_reports_backup.read_time", "read_reports_backup.ftd_time"};
    public static final ekgp b = new ekgi().c();
    public static final azoo c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_read_reports_backup_message_id");
        ekgiVar.i("participant_id", "index_read_reports_backup_participant_id");
        ekgiVar.c();
        c = new azoo();
        d = new int[]{150};
    }

    public static dqsy a() {
        return dqru.e("backup");
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
        sb.append("message_id INT NOT NULL REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("receive_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("ftd_time INTEGER DEFAULT(-1)");
        sb.insert(0, "CREATE TABLE read_reports_backup (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_read_reports_backup_message_id");
        arrayList.add("CREATE INDEX index_read_reports_backup_message_id ON read_reports_backup(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_read_reports_backup_participant_id");
        arrayList.add("CREATE INDEX index_read_reports_backup_participant_id ON read_reports_backup(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
