package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofr extends dqsi {
    public static final String[] a = {"conversation_suggestions._id", "conversation_suggestions.message_id", "conversation_suggestions.conversation_suggestion_type", "conversation_suggestions.properties", "conversation_suggestions.post_back_data", "conversation_suggestions.post_back_encoding", "conversation_suggestions.rcs_message_id", "conversation_suggestions.target_rcs_message_id", "conversation_suggestions.read", "conversation_suggestions.received_timestamp"};
    public static final boer b;
    public static final int[] c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_suggestions.rcs_message_id", 11001);
        ekgiVar.i("conversation_suggestions.target_rcs_message_id", 12000);
        ekgiVar.i("conversation_suggestions.read", 12000);
        ekgiVar.i("conversation_suggestions.received_timestamp", 12000);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_conversation_suggestions_message_id");
        ekgiVar2.i("target_rcs_message_id", "index_conversation_suggestions_target_rcs_message_id");
        ekgiVar2.c();
        b = new boer();
        c = new int[]{11001, 12000, 17000};
        d = new int[]{55020, 56010};
    }

    public static final bofm a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_suggestions._id");
            ekfwVar.h("conversation_suggestions.message_id");
            ekfwVar.h("conversation_suggestions.conversation_suggestion_type");
            ekfwVar.h("conversation_suggestions.properties");
            ekfwVar.h("conversation_suggestions.post_back_data");
            ekfwVar.h("conversation_suggestions.post_back_encoding");
            if (numC.intValue() >= 11001) {
                ekfwVar.h("conversation_suggestions.rcs_message_id");
            }
            if (numC.intValue() >= 12000) {
                ekfwVar.h("conversation_suggestions.target_rcs_message_id");
            }
            if (numC.intValue() >= 12000) {
                ekfwVar.h("conversation_suggestions.read");
            }
            if (numC.intValue() >= 12000) {
                ekfwVar.h("conversation_suggestions.received_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bofm(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dqxa d() {
        return b().M();
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_suggestion_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("properties TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_data TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_encoding TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("target_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void g(dqsy dqsyVar) {
        dqru.K(dqsyVar, "conversation_suggestions", e("TEMP___conversation_suggestions"), a, f());
    }
}
