package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngz extends dqsi {
    public static final String[] a = {"conversation_classifications_table._id", "conversation_classifications_table.conversation_id", "conversation_classifications_table.classification_type", "conversation_classifications_table.classification_state", "conversation_classifications_table.date", "conversation_classifications_table.impression_count", "conversation_classifications_table.generated_timestamp"};
    public static final ekgp b;
    public static final bngd c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_classifications_table.classification_state", 58690);
        ekgiVar.i("conversation_classifications_table.impression_count", 58840);
        ekgiVar.i("conversation_classifications_table.generated_timestamp", 58840);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_conversation_classifications_table_conversation_id");
        ekgiVar2.i("classification_type", "index_conversation_classifications_table_classification_type");
        ekgiVar2.i("date", "index_conversation_classifications_table_date");
        ekgiVar2.c();
        c = new bngd();
        d = new int[]{58670, 58690, 58790, 58840, 59350};
    }

    public static final bngu a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_classifications_table._id");
            ekfwVar.h("conversation_classifications_table.conversation_id");
            ekfwVar.h("conversation_classifications_table.classification_type");
            if (numC.intValue() >= 58690) {
                ekfwVar.h("conversation_classifications_table.classification_state");
            }
            ekfwVar.h("conversation_classifications_table.date");
            if (numC.intValue() >= 58840) {
                ekfwVar.h("conversation_classifications_table.impression_count");
            }
            if (numC.intValue() >= 58840) {
                ekfwVar.h("conversation_classifications_table.generated_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bngu(strArr);
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
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58690) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_state INTEGER DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date TEXT");
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("impression_count INTEGER DEFAULT(0)");
        }
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("generated_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE conversation_classifications_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_classifications_table_conversation_id ON conversation_classifications_table(conversation_id);");
        if (i >= 58790) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
        }
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
