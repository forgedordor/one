package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhf extends dqsi {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id"};
    public static final ekgp b;
    public static final bqgl c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_labels.confidence", 53060);
        ekgiVar.i("message_labels.intent", 58590);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("intent", "index_message_labels_intent");
        ekgiVar2.c();
        c = new bqgl();
        d = new int[]{53050, 53060, 58550, 58590, 59240};
    }

    public static final bqhc a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_labels._id");
            ekfwVar.h("message_labels.message_id");
            ekfwVar.h("message_labels.label");
            if (numC.intValue() >= 53060) {
                ekfwVar.h("message_labels.confidence");
            }
            ekfwVar.h("message_labels.source");
            if (numC.intValue() >= 58590) {
                ekfwVar.h("message_labels.intent");
            }
            ekfwVar.h("message_labels.model_id");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bqhc(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("confidence INTEGER");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INTEGER");
        if (i >= 58590) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("intent TEXT DEFAULT('')");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("model_id TEXT DEFAULT('')");
        sb.insert(0, "CREATE TABLE message_labels (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS unique_idx_message_label");
        arrayList.add("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
        if (i >= 58550) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_label");
            arrayList.add("CREATE INDEX index_message_labels_label ON message_labels(label);");
        }
        if (i >= 59240) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_intent");
            arrayList.add("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
