package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bodn extends dqsi {
    public static final String[] a = {"conversation_pin._id", "conversation_pin.conversation_id", "conversation_pin.pin_status"};
    public static final ekgp b = new ekgi().c();
    public static final bocx c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_id", "index_conversation_pin_conversation_id");
        ekgiVar.c();
        c = new bocx();
        d = new int[]{58250};
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pin_status INTEGER");
        sb.insert(0, "CREATE TABLE conversation_pin (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_pin_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversation_pin_conversation_id ON conversation_pin(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
