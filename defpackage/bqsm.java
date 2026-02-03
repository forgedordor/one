package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqsm extends dqsi {
    public static final String[] a = {"message_star._id", "message_star.message_id"};
    public static final ekgp b = new ekgi().c();
    public static final bqrv c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_star_message_id");
        ekgiVar.c();
        c = new bqrv();
        d = new int[]{58180};
    }

    public static dqsy a() {
        return dqru.e("$primary");
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
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        sb.insert(0, "CREATE TABLE message_star (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_star_message_id ON message_star(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
