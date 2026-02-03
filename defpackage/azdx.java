package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdx extends dqsi {
    public static final String[] a = {"message_reactions_backup._id", "message_reactions_backup.message_id", "message_reactions_backup.reactions_data", "message_reactions_backup.reacted_message_id", "message_reactions_backup.reaction", "message_reactions_backup.applied_reaction"};
    public static final ekgp b = new ekgi().c();
    public static final azdd c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_reactions_backup_message_id");
        ekgiVar.i("reacted_message_id", "index_message_reactions_backup_reacted_message_id");
        ekgiVar.c();
        c = new azdd();
        d = new int[]{40};
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reactions_data BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reacted_message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reaction INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("applied_reaction BLOB");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_reactions_backup_message_id");
        arrayList.add("CREATE INDEX index_message_reactions_backup_message_id ON message_reactions_backup(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_reactions_backup_reacted_message_id");
        arrayList.add("CREATE INDEX index_message_reactions_backup_reacted_message_id ON message_reactions_backup(reacted_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(dqsy dqsyVar) {
        dqsyVar.v(c("message_reactions_backup"));
        for (String str : d()) {
            dqsyVar.v(str);
        }
    }
}
