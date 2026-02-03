package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bros extends dqsi {
    public static final String[] a = {"parent_disallowed_conversations.conversation_id", "parent_disallowed_conversations.conversation_parent_supervision_state"};
    public static final ekgp b;
    public static final brob c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("parent_disallowed_conversations.conversation_parent_supervision_state", 60790);
        b = ekgiVar.c();
        new ekgi().c();
        c = new brob();
        d = new int[]{59780, 60790};
    }

    public static final bron a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("parent_disallowed_conversations.conversation_id");
            if (numC.intValue() >= 60790) {
                ekfwVar.h("parent_disallowed_conversations.conversation_parent_supervision_state");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bron(strArr);
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
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 60790) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_parent_supervision_state INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE parent_disallowed_conversations (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
