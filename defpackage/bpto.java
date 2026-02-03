package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpto extends dqsi {
    public static final String[] a = {"lighter_conversations_table._id", "lighter_conversations_table.conversation_id", "lighter_conversations_table.business_id", "lighter_conversations_table.lighter_conversation_id_json", "lighter_conversations_table.read", "lighter_conversations_table.is_last_message_outgoing", "lighter_conversations_table.conversation_status", "lighter_conversations_table.last_action_timestamp", "lighter_conversations_table.sync_timestamp_ms"};
    public static final ekgp b;
    public static final bpsr c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("lighter_conversations_table.read", 58700);
        ekgiVar.i("lighter_conversations_table.is_last_message_outgoing", 58810);
        ekgiVar.i("lighter_conversations_table.conversation_status", 59030);
        ekgiVar.i("lighter_conversations_table.last_action_timestamp", 59040);
        ekgiVar.i("lighter_conversations_table.sync_timestamp_ms", 59100);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_lighter_conversations_table_conversation_id");
        ekgiVar2.i("business_id", "index_lighter_conversations_table_business_id");
        ekgiVar2.i("read", "index_lighter_conversation_read_0");
        ekgiVar2.c();
        c = new bpsr();
        d = new int[]{58660, 58700, 58760, 58810, 58930, 59030, 59040, 59100};
        e = new int[]{59110};
    }

    public static final bptj a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("lighter_conversations_table._id");
            ekfwVar.h("lighter_conversations_table.conversation_id");
            ekfwVar.h("lighter_conversations_table.business_id");
            ekfwVar.h("lighter_conversations_table.lighter_conversation_id_json");
            if (numC.intValue() >= 58700) {
                ekfwVar.h("lighter_conversations_table.read");
            }
            if (numC.intValue() >= 58810) {
                ekfwVar.h("lighter_conversations_table.is_last_message_outgoing");
            }
            if (numC.intValue() >= 59030) {
                ekfwVar.h("lighter_conversations_table.conversation_status");
            }
            if (numC.intValue() >= 59040) {
                ekfwVar.h("lighter_conversations_table.last_action_timestamp");
            }
            if (numC.intValue() >= 59100) {
                ekfwVar.h("lighter_conversations_table.sync_timestamp_ms");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bptj(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("business_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lighter_conversation_id_json TEXT");
        if (i >= 58700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(1)");
        }
        if (i >= 58810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_last_message_outgoing INTEGER");
        }
        if (i >= 59030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_status INTEGER");
        }
        if (i >= 59040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_action_timestamp INT DEFAULT(0)");
        }
        if (i >= 59100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sync_timestamp_ms INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "lighter_conversations_table"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_business_id");
        arrayList.add("CREATE UNIQUE INDEX index_lighter_conversations_table_business_id ON lighter_conversations_table(business_id);");
        if (i >= 58760) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversation_read_0");
            arrayList.add("CREATE INDEX index_lighter_conversation_read_0 ON lighter_conversations_table(read) WHERE read == 0;");
        }
        if (i >= 58930) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_conversation_id");
            arrayList.add("CREATE INDEX index_lighter_conversations_table_conversation_id ON lighter_conversations_table(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
