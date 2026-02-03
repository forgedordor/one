package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrg extends dqsi {
    public static final String[] a = {"message_spam._id", "message_spam.message_id", "message_spam.conversation_id", "message_spam.source", "message_spam.score", "message_spam.outcome", "message_spam.ares_initiated_by", "message_spam.classification_timestamp", "message_spam.trigger", "message_spam.action_type", "message_spam.action_contributors", "message_spam.error_code", "message_spam.reclassification_index"};
    public static final bqqa b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_spam.conversation_id", 59460);
        ekgiVar.i("message_spam.score", 45040);
        ekgiVar.i("message_spam.outcome", 58030);
        ekgiVar.i("message_spam.ares_initiated_by", 58100);
        ekgiVar.i("message_spam.classification_timestamp", 59190);
        ekgiVar.i("message_spam.trigger", 59460);
        ekgiVar.i("message_spam.action_type", 59460);
        ekgiVar.i("message_spam.action_contributors", 59460);
        ekgiVar.i("message_spam.error_code", 59460);
        ekgiVar.i("message_spam.reclassification_index", 59460);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_message_spam_message_id");
        ekgiVar2.i("conversation_id", "index_message_spam_conversation_id");
        ekgiVar2.i("classification_timestamp", "index_message_spam_classification_timestamp");
        ekgiVar2.c();
        b = new bqqa();
        c = new int[]{30000, 45040, 58030, 58100, 58350, 59190, 59200, 59460};
    }

    public static final bqqz a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_spam._id");
            ekfwVar.h("message_spam.message_id");
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.conversation_id");
            }
            ekfwVar.h("message_spam.source");
            if (numC.intValue() >= 45040) {
                ekfwVar.h("message_spam.score");
            }
            if (numC.intValue() >= 58030) {
                ekfwVar.h("message_spam.outcome");
            }
            if (numC.intValue() >= 58100) {
                ekfwVar.h("message_spam.ares_initiated_by");
            }
            if (numC.intValue() >= 59190) {
                ekfwVar.h("message_spam.classification_timestamp");
            }
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.trigger");
            }
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.action_type");
            }
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.action_contributors");
            }
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.error_code");
            }
            if (numC.intValue() >= 59460) {
                ekfwVar.h("message_spam.reclassification_index");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bqqz(strArr);
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
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(0)");
        if (i >= 45040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("score REAL DEFAULT(0.0)");
        }
        if (i >= 58030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("outcome INT DEFAULT(1)");
        }
        if (i >= 58100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ares_initiated_by TEXT DEFAULT('')");
        }
        if (i >= 59190) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("trigger INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_type INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_contributors INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_code INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reclassification_index INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "message_spam"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    public static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_message_id");
            arrayList.add("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
        }
        if (i >= 59200) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
            arrayList.add("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
        }
        if (i >= 59460) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_conversation_id");
            arrayList.add("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
