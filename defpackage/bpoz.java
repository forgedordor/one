package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpoz extends dqsi {
    public static final String[] a = {"gemini.conversation_id", "gemini.desired_gemini_state"};
    public static final bpom b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_id", "index_gemini_conversation_id");
        ekgiVar.c();
        b = new bpom();
        c = new int[]{60000};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("desired_gemini_state INT");
        sb.insert(0, "CREATE TABLE gemini (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_gemini_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_gemini_conversation_id ON gemini(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
