package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azgl extends dqsi {
    public static final String[] a = {"message_star_backup._id", "message_star_backup.message_id"};
    public static final ekgp b = new ekgi().c();
    public static final azfv c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_star_backup_message_id");
        ekgiVar.c();
        c = new azfv();
        d = new int[]{20};
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
        sb.append("message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_backup_message_id");
        arrayList.add("CREATE INDEX index_message_star_backup_message_id ON message_star_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(dqsy dqsyVar) {
        dqsyVar.v(c("message_star_backup"));
        for (String str : d()) {
            dqsyVar.v(str);
        }
    }
}
