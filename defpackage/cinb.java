package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cinb extends dqsi {
    public static final String[] a = {"message_self_mention.message_id"};
    public static final cims b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new cims();
        c = new int[]{61020};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER PRIMARY KEY NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        sb.insert(0, "CREATE TABLE message_self_mention (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
