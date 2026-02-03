package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmhw extends dqsi {
    public static final String[] a = {"a2p_conversation_subscriptions.participant_id", "a2p_conversation_subscriptions.conversation_toolstone_state", "a2p_conversation_subscriptions.conversation_toolstone_last_dismiss_timestamp", "a2p_conversation_subscriptions.conversation_subscription_state", "a2p_conversation_subscriptions.last_action_timestamp"};
    public static final bmhc b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("a2p_conversation_subscriptions.conversation_toolstone_last_dismiss_timestamp", 61030);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("participant_id", "index_a2p_conversation_subscriptions_participant_id");
        ekgiVar2.c();
        b = new bmhc();
        c = new int[]{60410, 61030};
    }

    public static final bmhr a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("a2p_conversation_subscriptions.participant_id");
            ekfwVar.h("a2p_conversation_subscriptions.conversation_toolstone_state");
            if (numC.intValue() >= 61030) {
                ekfwVar.h("a2p_conversation_subscriptions.conversation_toolstone_last_dismiss_timestamp");
            }
            ekfwVar.h("a2p_conversation_subscriptions.conversation_subscription_state");
            ekfwVar.h("a2p_conversation_subscriptions.last_action_timestamp");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmhr(strArr);
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
        sb.append("participant_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_toolstone_state INTEGER");
        if (i >= 61030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_last_dismiss_timestamp INTEGER");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_subscription_state INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_action_timestamp INTEGER");
        sb.insert(0, "CREATE TABLE a2p_conversation_subscriptions (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_a2p_conversation_subscriptions_participant_id");
        arrayList.add("CREATE UNIQUE INDEX index_a2p_conversation_subscriptions_participant_id ON a2p_conversation_subscriptions(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
