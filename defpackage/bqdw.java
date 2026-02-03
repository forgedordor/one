package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdw extends dqsi {
    public static final String[] a = {"message_destinations._id", "message_destinations.message_send_receive_attempt_id", "message_destinations.message_destination_type", "message_destinations.message_destination_raw"};
    public static final bqdh b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_send_receive_attempt_id", "index_message_destinations_message_send_receive_attempt_id");
        ekgiVar.c();
        b = new bqdh();
        c = new int[]{59360};
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
        sb.append("message_send_receive_attempt_id TEXT NOT NULL REFERENCES message_send_receive_attempt(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_destination_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_destination_raw TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE message_destinations (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_destinations_message_send_receive_attempt_id");
        arrayList.add("CREATE INDEX index_message_destinations_message_send_receive_attempt_id ON message_destinations(message_send_receive_attempt_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
