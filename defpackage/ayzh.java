package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzh extends dqsi {
    public static final String[] a = {"conversations_backup._id", "conversations_backup.current_my_identity", "conversations_backup.snippet_text", "conversations_backup.archive_status", "conversations_backup.most_recent_timestamp_ms", "conversations_backup.subject", "conversations_backup.name", "conversations_backup.name_is_automatic", "conversations_backup.has_rbm_participant", "conversations_backup.rcs_group_self_msisdn", "conversations_backup.rcs_group_id", "conversations_backup.rcs_conference_uri", "conversations_backup.rcs_group_capabilities", "conversations_backup.error_state", "conversations_backup.rcs_subject_change_timestamp_ms", "conversations_backup.join_state", "conversations_backup.conversation_type", "conversations_backup.send_mode", "conversations_backup.cms_id", "conversations_backup.cms_life_cycle"};
    public static final ekgp b;
    public static final ayxz c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations_backup.current_my_identity", 110);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("current_my_identity", "index_conversations_backup_current_my_identity");
        ekgiVar2.i("rcs_group_id", "index_conversations_backup_rcs_group_id");
        ekgiVar2.i("cms_id", "index_conversations_backup_cms_id");
        ekgiVar2.c();
        c = new ayxz();
        d = new int[0];
        e = new int[]{110};
    }

    public static final ayze a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations_backup._id");
            if (numC.intValue() >= 110) {
                ekfwVar.h("conversations_backup.current_my_identity");
            }
            ekfwVar.h("conversations_backup.snippet_text");
            ekfwVar.h("conversations_backup.archive_status");
            ekfwVar.h("conversations_backup.most_recent_timestamp_ms");
            ekfwVar.h("conversations_backup.subject");
            ekfwVar.h("conversations_backup.name");
            ekfwVar.h("conversations_backup.name_is_automatic");
            ekfwVar.h("conversations_backup.has_rbm_participant");
            ekfwVar.h("conversations_backup.rcs_group_self_msisdn");
            ekfwVar.h("conversations_backup.rcs_group_id");
            ekfwVar.h("conversations_backup.rcs_conference_uri");
            ekfwVar.h("conversations_backup.rcs_group_capabilities");
            ekfwVar.h("conversations_backup.error_state");
            ekfwVar.h("conversations_backup.rcs_subject_change_timestamp_ms");
            ekfwVar.h("conversations_backup.join_state");
            ekfwVar.h("conversations_backup.conversation_type");
            ekfwVar.h("conversations_backup.send_mode");
            ekfwVar.h("conversations_backup.cms_id");
            ekfwVar.h("conversations_backup.cms_life_cycle");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new ayze(strArr);
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
        sb.append("current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("most_recent_timestamp_ms INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_rbm_participant INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_self_msisdn TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("error_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_rcs_group_id");
        arrayList.add("CREATE INDEX index_conversations_backup_rcs_group_id ON conversations_backup(rcs_group_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_cms_id");
        arrayList.add("CREATE INDEX index_conversations_backup_cms_id ON conversations_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_current_my_identity");
        arrayList.add("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
