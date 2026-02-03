package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boal extends dqsi {
    public static final String[] a = {"conversation_participants_audit_log._id", "conversation_participants_audit_log.operation_datetime", "conversation_participants_audit_log.operation_type", "conversation_participants_audit_log.conversation_participants_id", "conversation_participants_audit_log.conversation_id", "conversation_participants_audit_log.participant_id", "conversation_participants_audit_log.is_normalized", "conversation_participants_audit_log.rcs_group_join_status", "conversation_participants_audit_log.last_modified_by_key"};
    public static final bnzr b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_participants_audit_log.last_modified_by_key", 59440);
        ekgiVar.c();
        new ekgi().c();
        b = new bnzr();
        c = new int[]{59370, 59440};
    }

    public static final boai a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_participants_audit_log._id");
            ekfwVar.h("conversation_participants_audit_log.operation_datetime");
            ekfwVar.h("conversation_participants_audit_log.operation_type");
            ekfwVar.h("conversation_participants_audit_log.conversation_participants_id");
            ekfwVar.h("conversation_participants_audit_log.conversation_id");
            ekfwVar.h("conversation_participants_audit_log.participant_id");
            ekfwVar.h("conversation_participants_audit_log.is_normalized");
            ekfwVar.h("conversation_participants_audit_log.rcs_group_join_status");
            if (numC.intValue() >= 59440) {
                ekfwVar.h("conversation_participants_audit_log.last_modified_by_key");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new boai(strArr);
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
        sb.append("operation_datetime INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_participants_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, "CREATE TABLE conversation_participants_audit_log (");
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
