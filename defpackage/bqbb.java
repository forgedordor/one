package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqbb extends dqsi {
    public static final String[] a = {"message_captions.message_id", "message_captions.caption"};
    public static final ekgp b = new ekgi().c();
    public static final bqam c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_captions_message_id");
        ekgiVar.c();
        c = new bqam();
        d = new int[]{59880};
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
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("caption TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE message_captions (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_captions_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_captions_message_id ON message_captions(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
