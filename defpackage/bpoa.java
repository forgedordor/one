package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpoa extends dqsi {
    public static final String[] a = {"gemini_conversation_id_mappings.conversation_id", "gemini_conversation_id_mappings.my_identity_token", "gemini_conversation_id_mappings.gemini_conversation_id"};
    public static final bpnj b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("gemini_conversation_id", "index_gemini_conversation_id_mappings_gemini_conversation_id");
        ekgiVar.c();
        b = new bpnj();
        c = new int[]{60010, 60090};
        d = new int[]{60140};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        dqsyVar.v(d("gemini_conversation_id_mappings"));
        for (String str : c(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60090) {
            arrayList.add("DROP INDEX IF EXISTS index_gemini_conversation_id_mappings_gemini_conversation_id");
            arrayList.add("CREATE UNIQUE INDEX index_gemini_conversation_id_mappings_gemini_conversation_id ON gemini_conversation_id_mappings(gemini_conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT NOT NULL REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("gemini_conversation_id TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (conversation_id,my_identity_token));");
        return sb.toString();
    }
}
