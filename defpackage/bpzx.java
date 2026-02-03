package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzx extends dqsi {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.conversation_id", "messages_annotations.message_id", "messages_annotations.annotation_type", "messages_annotations.annotation_details"};
    public static final ekgp b;
    public static final bpzc c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages_annotations.message_id", 20040);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_messages_annotations_conversation_id");
        ekgiVar2.i("message_id", "index_messages_annotations_message_id");
        ekgiVar2.i("annotation_type", "index_messages_annotations_annotation_type");
        ekgiVar2.c();
        c = new bpzc();
        d = new int[]{20030, 20040, 20070, 58530};
        e = new int[]{57020};
    }

    public static final bpzs a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages_annotations._id");
            ekfwVar.h("messages_annotations.conversation_id");
            if (numC.intValue() >= 20040) {
                ekfwVar.h("messages_annotations.message_id");
            }
            ekfwVar.h("messages_annotations.annotation_type");
            ekfwVar.h("messages_annotations.annotation_details");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpzs(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id TEXT");
        if (i >= 20040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_details BLOB");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "messages_annotations"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 20040) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_message_id");
            arrayList.add("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
        }
        if (i >= 20070) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
            arrayList.add("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
        }
        if (i >= 58530) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
            arrayList.add("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
