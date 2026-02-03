package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqik extends dqsi {
    public static final String[] a = {"message_photos_sharing.message_id", "message_photos_sharing.sharing_state"};
    public static final bqhv b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_photos_sharing_message_id");
        ekgiVar.c();
        b = new bqhv();
        c = new int[]{58320, 58610};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sharing_state BLOB NOT NULL");
        sb.insert(0, "CREATE TABLE message_photos_sharing (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58610) {
            arrayList.add("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
            arrayList.add("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
