package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcn extends dqsi {
    public static final String[] a = {"message_classifications_table._id", "message_classifications_table.message_id", "message_classifications_table.classification_type", "message_classifications_table.classification_details"};
    public static final ekgp b;
    public static final bqbt c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_classifications_table.classification_details", 58480);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_message_classifications_table_message_id");
        ekgiVar2.i("classification_type", "index_message_classifications_table_classification_type");
        ekgiVar2.c();
        c = new bqbt();
        d = new int[]{58400, 58480, 59350};
    }

    public static final bqch a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_classifications_table._id");
            ekfwVar.h("message_classifications_table.message_id");
            ekfwVar.h("message_classifications_table.classification_type");
            if (numC.intValue() >= 58480) {
                ekfwVar.h("message_classifications_table.classification_details");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bqch(strArr);
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
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58480) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_details BLOB");
        }
        sb.insert(0, "CREATE TABLE message_classifications_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_message_id");
        arrayList.add("CREATE INDEX index_message_classifications_table_message_id ON message_classifications_table(message_id);");
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
