package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnxi extends dqsi {
    public static final String[] a = {"conversation_labels._id", "conversation_labels.conversation_id", "conversation_labels.label", "conversation_labels.message_id", "conversation_labels.snippet_text", "conversation_labels.preview_uri", "conversation_labels.preview_content_type", "conversation_labels.message_status", "conversation_labels.read", "conversation_labels.received_timestamp", "conversation_labels.message_protocol", "conversation_labels.raw_telephony_status"};
    public static final bnwn b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_labels.label", 53020);
        ekgiVar.i("conversation_labels.snippet_text", 53010);
        ekgiVar.i("conversation_labels.preview_uri", 55040);
        ekgiVar.i("conversation_labels.preview_content_type", 55040);
        ekgiVar.i("conversation_labels.message_status", 57050);
        ekgiVar.i("conversation_labels.read", 57050);
        ekgiVar.i("conversation_labels.received_timestamp", 57050);
        ekgiVar.i("conversation_labels.message_protocol", 57050);
        ekgiVar.i("conversation_labels.raw_telephony_status", 57050);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_conversation_labels_message_id");
        ekgiVar2.c();
        b = new bnwn();
        c = new int[]{51000, 53010, 53020, 55040, 57050, 58430, 58920};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(f().a());
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("snippet_text TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_uri TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_content_type TEXT");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_status INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("received_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("raw_telephony_status INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void d(dqsy dqsyVar, int i) {
        dqsyVar.v(c(i, "conversation_labels"));
        for (String str : e(i)) {
            dqsyVar.v(str);
        }
    }

    public static String[] e(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 53020) {
            arrayList.add("DROP INDEX IF EXISTS unique_idx_conversation_label");
            arrayList.add("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
        }
        if (i >= 58430) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_label");
            arrayList.add("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
        }
        if (i >= 58920) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_message_id");
            arrayList.add("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa f() {
        return a().M();
    }
}
