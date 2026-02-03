package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brlh extends dqsi {
    public static final String[] a = {"p2p_conversation_suggestion_event.id", "p2p_conversation_suggestion_event.message_id", "p2p_conversation_suggestion_event.timestamp", "p2p_conversation_suggestion_event.event_type", "p2p_conversation_suggestion_event.reply_mode", "p2p_conversation_suggestion_event.rejection_reason", "p2p_conversation_suggestion_event.action_source", "p2p_conversation_suggestion_event.num_of_items", "p2p_conversation_suggestion_event.click_index", "p2p_conversation_suggestion_event.impression_id", "p2p_conversation_suggestion_event.suggestion_types", "p2p_conversation_suggestion_event.model_output_label"};
    public static final brkh b;
    public static final int[] c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("p2p_conversation_suggestion_event.message_id", 51030);
        ekgiVar.i("p2p_conversation_suggestion_event.model_output_label", 42030);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_p2p_conversation_suggestion_event_message_id");
        ekgiVar2.c();
        b = new brkh();
        c = new int[]{37000, 42030, 51030, 58940};
        d = new int[]{57010};
    }

    public static final brle a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("p2p_conversation_suggestion_event.id");
            if (numC.intValue() >= 51030) {
                ekfwVar.h("p2p_conversation_suggestion_event.message_id");
            }
            ekfwVar.h("p2p_conversation_suggestion_event.timestamp");
            ekfwVar.h("p2p_conversation_suggestion_event.event_type");
            ekfwVar.h("p2p_conversation_suggestion_event.reply_mode");
            ekfwVar.h("p2p_conversation_suggestion_event.rejection_reason");
            ekfwVar.h("p2p_conversation_suggestion_event.action_source");
            ekfwVar.h("p2p_conversation_suggestion_event.num_of_items");
            ekfwVar.h("p2p_conversation_suggestion_event.click_index");
            ekfwVar.h("p2p_conversation_suggestion_event.impression_id");
            ekfwVar.h("p2p_conversation_suggestion_event.suggestion_types");
            if (numC.intValue() >= 42030) {
                ekfwVar.h("p2p_conversation_suggestion_event.model_output_label");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new brle(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 51030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event_type INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reply_mode INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rejection_reason INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("action_source INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("num_of_items INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("click_index INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("impression_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_types TEXT");
        if (i >= 42030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("model_output_label TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "p2p_conversation_suggestion_event"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58940) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
            arrayList.add("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
