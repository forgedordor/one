package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aywb extends dqsi {
    public static final String[] a = {"conversation_pins_backup._id", "conversation_pins_backup.conversation_id", "conversation_pins_backup.pin_status"};
    public static final ekgp b = new ekgi().c();
    public static final ayvk c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_id", "index_conversation_pins_backup_conversation_id");
        ekgiVar.c();
        c = new ayvk();
        d = new int[]{30};
        e = new int[]{90};
    }

    public static dqsy a() {
        return dqru.e("backup");
    }

    public static dqxa b() {
        return a().M();
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pin_status INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_pins_backup_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_pins_backup_conversation_id ON conversation_pins_backup(conversation_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(dqsy dqsyVar) {
        dqsyVar.v(c("conversation_pins_backup"));
        for (String str : d()) {
            dqsyVar.v(str);
        }
    }
}
