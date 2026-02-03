package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btin extends dqsi {
    public static final String[] a = {"reminders._id", "reminders.message_id", "reminders.conversation_id", "reminders.trigger_time", "reminders.status"};
    public static final ekgp b;
    public static final bthr c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("reminders.conversation_id", 35070);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_reminders_conversation_id");
        ekgiVar2.i("trigger_time", "index_reminders_trigger_time");
        ekgiVar2.c();
        c = new bthr();
        d = new int[]{33070, 35070, 58470};
    }

    public static bthb a(String str) {
        btii btiiVarC = c();
        btiiVarC.A("reminders.queryOnId");
        btiiVarC.q();
        btim btimVar = new btim();
        btimVar.c(str);
        btiiVarC.d(btimVar);
        return (bthb) dqru.c(btiiVarC.b());
    }

    public static bthb b(MessageIdType messageIdType) {
        btii btiiVarC = c();
        btiiVarC.A("reminders.queryOnMessageId");
        btiiVarC.q();
        btim btimVar = new btim();
        btimVar.ap(new dqpj("reminders.message_id", 1, Long.valueOf(bary.a(messageIdType))));
        btiiVarC.d(btimVar);
        return (bthb) dqru.c(btiiVarC.b());
    }

    public static final btii c() {
        String[] strArr;
        Integer numE = e();
        if (numE.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("reminders._id");
            ekfwVar.h("reminders.message_id");
            if (numE.intValue() >= 35070) {
                ekfwVar.h("reminders.conversation_id");
            }
            ekfwVar.h("reminders.trigger_time");
            ekfwVar.h("reminders.status");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new btii(strArr);
    }

    public static dqsy d() {
        return dqru.e("$primary");
    }

    public static Integer e() {
        return Integer.valueOf(g().a());
    }

    public static void f(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (i >= 35070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE reminders (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_conversation_id");
            arrayList.add("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
        }
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_trigger_time");
            arrayList.add("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa g() {
        return d().M();
    }
}
