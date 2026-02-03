package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayuu extends dqsi {
    public static final String[] a = {"conversation_participants_backup._id", "conversation_participants_backup.conversation_id", "conversation_participants_backup.participant_id", "conversation_participants_backup.is_normalized", "conversation_participants_backup.rcs_group_join_status", "conversation_participants_backup.is_c2p_only"};
    public static final ekgp b;
    public static final ayua c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_participants_backup.is_c2p_only", 70);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_conversation_participants_backup_conversation_id");
        ekgiVar2.i("participant_id", "index_conversation_participants_backup_participant_id");
        ekgiVar2.i("is_c2p_only", "index_conversation_participants_backup_is_c2p_only");
        ekgiVar2.c();
        c = new ayua();
        d = new int[]{70};
        e = new int[]{90};
    }

    public static final ayur a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_participants_backup._id");
            ekfwVar.h("conversation_participants_backup.conversation_id");
            ekfwVar.h("conversation_participants_backup.participant_id");
            ekfwVar.h("conversation_participants_backup.is_normalized");
            ekfwVar.h("conversation_participants_backup.rcs_group_join_status");
            if (numC.intValue() >= 70) {
                ekfwVar.h("conversation_participants_backup.is_c2p_only");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new ayur(strArr);
    }

    public static dqsy b() {
        return dqru.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dqxa d() {
        return b().M();
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_c2p_only INT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_conversation_id ON conversation_participants_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_participant_id ON conversation_participants_backup(participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_is_c2p_only");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
