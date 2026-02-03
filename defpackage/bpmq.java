package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpmq extends dqsi {
    public static final String[] a = {"flagged_messages._id", "flagged_messages.flagged_message_id", "flagged_messages.flagging_reason", "flagged_messages.flagged_message_timestamp", "flagged_messages.flagged_message_notified", "flagged_messages.flagged_message_delay"};
    public static final bplv b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("flagged_messages.flagged_message_timestamp", 39030);
        ekgiVar.i("flagged_messages.flagged_message_notified", 46030);
        ekgiVar.i("flagged_messages.flagged_message_delay", 60710);
        ekgiVar.c();
        new ekgi().c();
        b = new bplv();
        c = new int[]{39010, 39030, 46030, 60710};
    }

    public static final bpml a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("flagged_messages._id");
            ekfwVar.h("flagged_messages.flagged_message_id");
            ekfwVar.h("flagged_messages.flagging_reason");
            if (numC.intValue() >= 39030) {
                ekfwVar.h("flagged_messages.flagged_message_timestamp");
            }
            if (numC.intValue() >= 46030) {
                ekfwVar.h("flagged_messages.flagged_message_notified");
            }
            if (numC.intValue() >= 60710) {
                ekfwVar.h("flagged_messages.flagged_message_delay");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpml(strArr);
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
        sb.append("flagged_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("flagging_reason INTEGER");
        if (i >= 39030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_timestamp INT");
        }
        if (i >= 46030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_notified INT DEFAULT(0)");
        }
        if (i >= 60710) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_delay INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE flagged_messages (");
        sb.append(", UNIQUE(flagged_message_id,flagging_reason) ON CONFLICT IGNORE);");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
