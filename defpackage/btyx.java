package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyx extends dqsi {
    public static final String[] a = {"self_participants._id", "self_participants.phone_number", "self_participants.sim_serial_number", "self_participants.sim_slot_index", "self_participants.sub_id", "self_participants.subscription_name", "self_participants.subscription_color", "self_participants.participant_id", "self_participants.smsc"};
    public static final ekgp b;
    public static final btyb c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("self_participants.smsc", 29080);
        b = ekgiVar.c();
        new ekgi().c();
        c = new btyb();
        d = new int[]{29050, 29080};
    }

    public static final btys a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("self_participants._id");
            ekfwVar.h("self_participants.phone_number");
            ekfwVar.h("self_participants.sim_serial_number");
            ekfwVar.h("self_participants.sim_slot_index");
            ekfwVar.h("self_participants.sub_id");
            ekfwVar.h("self_participants.subscription_name");
            ekfwVar.h("self_participants.subscription_color");
            ekfwVar.h("self_participants.participant_id");
            if (numC.intValue() >= 29080) {
                ekfwVar.h("self_participants.smsc");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new btys(strArr);
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
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_index INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER");
        if (i >= 29080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("smsc TEXT");
        }
        sb.insert(0, "CREATE TABLE self_participants (");
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
