package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmmf extends dqsi {
    public static final String[] a = {"business_conversations_metadata._id", "business_conversations_metadata.conversation_id", "business_conversations_metadata.chatbot_directory_conversation_state", "business_conversations_metadata.conversation_stop_state", "business_conversations_metadata.conversation_toolstone_state", "business_conversations_metadata.conversation_toolstone_timestamp_ms"};
    public static final ekgp b;
    public static final bmlm c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("business_conversations_metadata.conversation_stop_state", 59010);
        ekgiVar.i("business_conversations_metadata.conversation_toolstone_state", 59050);
        ekgiVar.i("business_conversations_metadata.conversation_toolstone_timestamp_ms", 59050);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_business_conversations_metadata_conversation_id");
        ekgiVar2.c();
        c = new bmlm();
        d = new int[]{58070, 59010, 59050};
    }

    public static final bmma a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("business_conversations_metadata._id");
            ekfwVar.h("business_conversations_metadata.conversation_id");
            ekfwVar.h("business_conversations_metadata.chatbot_directory_conversation_state");
            if (numC.intValue() >= 59010) {
                ekfwVar.h("business_conversations_metadata.conversation_stop_state");
            }
            if (numC.intValue() >= 59050) {
                ekfwVar.h("business_conversations_metadata.conversation_toolstone_state");
            }
            if (numC.intValue() >= 59050) {
                ekfwVar.h("business_conversations_metadata.conversation_toolstone_timestamp_ms");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmma(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("chatbot_directory_conversation_state INT");
        if (i >= 59010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_stop_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_timestamp_ms INTEGER");
        }
        sb.insert(0, "CREATE TABLE business_conversations_metadata (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_business_conversations_metadata_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_business_conversations_metadata_conversation_id ON business_conversations_metadata(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
