package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcg extends dqsi {
    public static final String[] a = {"message_captions_backup.message_id", "message_captions_backup.caption"};
    public static final ekgp b = new ekgi().c();
    public static final azbr c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_captions_backup_message_id");
        ekgiVar.c();
        c = new azbr();
        d = new int[]{140};
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
        sb.append("message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("caption TEXT");
        sb.insert(0, "CREATE TABLE message_captions_backup (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_captions_backup_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_captions_backup_message_id ON message_captions_backup(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
