package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azlc extends dqsi {
    public static final String[] a = {"messages_backup._id", "messages_backup.message_persistence_id", "messages_backup.my_identity", "messages_backup.message_status", "messages_backup.seen", "messages_backup.read", "messages_backup.conversation_id", "messages_backup.sender_participant_id", "messages_backup.sender_send_destination", "messages_backup.msisdn_receiving_rcs_message", "messages_backup.self_participant_id", "messages_backup.mms_subject", "messages_backup.received_timestamp", "messages_backup.sent_timestamp", "messages_backup.protocol", "messages_backup.message_priority", "messages_backup.rcs_encryption_status", "messages_backup.cloud_sync_id", "messages_backup.correlation_id", "messages_backup.sms_error_code", "messages_backup.sms_error_desc_map_name", "messages_backup.mms_transaction_id", "messages_backup.mms_content_location", "messages_backup.is_hidden", "messages_backup.rcs_message_id", "messages_backup.custom_headers", "messages_backup.cms_id", "messages_backup.cms_life_cycle", "messages_backup.cms_correlation_id", "messages_backup.cms_last_mod_seq"};
    public static final ekgp b;
    public static final azji c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages_backup.message_persistence_id", 120);
        ekgiVar.i("messages_backup.my_identity", 110);
        ekgiVar.i("messages_backup.sender_send_destination", 80);
        ekgiVar.i("messages_backup.msisdn_receiving_rcs_message", 80);
        ekgiVar.i("messages_backup.custom_headers", 50);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_persistence_id", "index_messages_backup_message_persistence_id");
        ekgiVar2.i("my_identity", "index_messages_backup_my_identity");
        ekgiVar2.i("conversation_id", "index_messages_backup_conversation_id");
        ekgiVar2.i("sender_participant_id", "index_messages_backup_sender_participant_id");
        ekgiVar2.i("self_participant_id", "index_messages_backup_self_participant_id");
        ekgiVar2.i("received_timestamp", "index_messages_backup_received_timestamp");
        ekgiVar2.i("rcs_message_id", "index_messages_backup_rcs_message_id");
        ekgiVar2.i("custom_headers", "index_messages_backup_custom_headers");
        ekgiVar2.i("cms_id", "index_messages_backup_cms_id");
        ekgiVar2.i("cms_correlation_id", "index_messages_backup_cms_correlation_id");
        ekgiVar2.c();
        c = new azji();
        d = new int[]{50, 80, 120};
        e = new int[]{90, 110};
    }

    public static final azkz a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages_backup._id");
            if (numC.intValue() >= 120) {
                ekfwVar.h("messages_backup.message_persistence_id");
            }
            if (numC.intValue() >= 110) {
                ekfwVar.h("messages_backup.my_identity");
            }
            ekfwVar.h("messages_backup.message_status");
            ekfwVar.h("messages_backup.seen");
            ekfwVar.h("messages_backup.read");
            ekfwVar.h("messages_backup.conversation_id");
            ekfwVar.h("messages_backup.sender_participant_id");
            if (numC.intValue() >= 80) {
                ekfwVar.h("messages_backup.sender_send_destination");
            }
            if (numC.intValue() >= 80) {
                ekfwVar.h("messages_backup.msisdn_receiving_rcs_message");
            }
            ekfwVar.h("messages_backup.self_participant_id");
            ekfwVar.h("messages_backup.mms_subject");
            ekfwVar.h("messages_backup.received_timestamp");
            ekfwVar.h("messages_backup.sent_timestamp");
            ekfwVar.h("messages_backup.protocol");
            ekfwVar.h("messages_backup.message_priority");
            ekfwVar.h("messages_backup.rcs_encryption_status");
            ekfwVar.h("messages_backup.cloud_sync_id");
            ekfwVar.h("messages_backup.correlation_id");
            ekfwVar.h("messages_backup.sms_error_code");
            ekfwVar.h("messages_backup.sms_error_desc_map_name");
            ekfwVar.h("messages_backup.mms_transaction_id");
            ekfwVar.h("messages_backup.mms_content_location");
            ekfwVar.h("messages_backup.is_hidden");
            ekfwVar.h("messages_backup.rcs_message_id");
            if (numC.intValue() >= 50) {
                ekfwVar.h("messages_backup.custom_headers");
            }
            ekfwVar.h("messages_backup.cms_id");
            ekfwVar.h("messages_backup.cms_life_cycle");
            ekfwVar.h("messages_backup.cms_correlation_id");
            ekfwVar.h("messages_backup.cms_last_mod_seq");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new azkz(strArr);
    }

    public static dqsy b() {
        return dqru.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (i >= 120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_persistence_id TEXT");
        }
        if (i >= 110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("seen INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("msisdn_receiving_rcs_message TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("protocol INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_priority INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_encryption_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cloud_sync_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_code INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_desc_map_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_transaction_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_content_location TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_hidden INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_headers BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqru.K(dqsyVar, "messages_backup", d(i, "TEMP___messages_backup"), a, f(i));
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_conversation_id");
        arrayList.add("CREATE INDEX index_messages_backup_conversation_id ON messages_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_sender_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_sender_participant_id ON messages_backup(sender_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_self_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_self_participant_id ON messages_backup(self_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_received_timestamp");
        arrayList.add("CREATE INDEX index_messages_backup_received_timestamp ON messages_backup(received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_rcs_message_id");
        arrayList.add("CREATE INDEX index_messages_backup_rcs_message_id ON messages_backup(rcs_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_id ON messages_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_correlation_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_correlation_id ON messages_backup(cms_correlation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_custom_headers");
        arrayList.add("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
        if (i >= 110) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_my_identity");
            arrayList.add("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
        }
        if (i >= 120) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_message_persistence_id");
            arrayList.add("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
