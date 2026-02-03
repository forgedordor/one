package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brnk extends dqsi {
    public static final String[] a = {"p2p_suggestions._id", "p2p_suggestions.target_message_id", "p2p_suggestions.generated_timestamp", "p2p_suggestions.suggestion", "p2p_suggestions.smart_suggestion_type", "p2p_suggestions.suggestion_status", "p2p_suggestions.consumption_state"};
    public static final ekgp b;
    public static final brmj c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("p2p_suggestions.consumption_state", 53080);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("target_message_id", "index_p2p_suggestions_target_message_id");
        ekgiVar2.i("generated_timestamp", "index_p2p_suggestions_generated_timestamp");
        ekgiVar2.c();
        c = new brmj();
        d = new int[]{42020, 53080, 58510};
    }

    public static final brna a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("p2p_suggestions._id");
            ekfwVar.h("p2p_suggestions.target_message_id");
            ekfwVar.h("p2p_suggestions.generated_timestamp");
            ekfwVar.h("p2p_suggestions.suggestion");
            ekfwVar.h("p2p_suggestions.smart_suggestion_type");
            ekfwVar.h("p2p_suggestions.suggestion_status");
            if (numC.intValue() >= 53080) {
                ekfwVar.h("p2p_suggestions.consumption_state");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new brna(strArr);
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
        sb.append("target_message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("generated_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("smart_suggestion_type INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_status INTEGER DEFAULT(0)");
        if (i >= 53080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("consumption_state INTEGER DEFAULT(1)");
        }
        sb.insert(0, "CREATE TABLE p2p_suggestions (");
        sb.append(", FOREIGN KEY (target_message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_target_message_id");
        arrayList.add("CREATE INDEX index_p2p_suggestions_target_message_id ON p2p_suggestions(target_message_id);");
        if (i >= 58510) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
            arrayList.add("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
