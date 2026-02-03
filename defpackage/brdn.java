package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdn {
    public static dqsq a() {
        return new dqry(MessagesTable.d, "messages", new dqrx() { // from class: brdl
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = MessagesTable.a;
                numValueOf.getClass();
                switch (i) {
                    case 8500:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN cloud_sync_id TEXT;");
                        return;
                    case 9000:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN sms_error_code INT DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN sms_error_desc_map_name TEXT;");
                        return;
                    case 9010:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN correlation_id TEXT;");
                        return;
                    case 9030:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN mms_retrieve_text TEXT;");
                        return;
                    case 10000:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_message_id STRING;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_rcs_message_id");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_rcs_message_id ON messages(rcs_message_id, seen);");
                        return;
                    case 10002:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_remote_instance STRING;");
                        return;
                    case 10004:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_file_transfer_session_id INT DEFAULT(-1);");
                        return;
                    case 13020:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN message_report_status INT DEFAULT(0);");
                        return;
                    case 17030:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN queue_insert_timestamp INT DEFAULT(0);");
                        return;
                    case 19020:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN web_id TEXT DEFAULT('');");
                        return;
                    case 22080:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_ui_sort");
                        dqsyVar.v("CREATE INDEX index_messages_ui_sort ON messages(conversation_id, received_timestamp);");
                        return;
                    case 24090:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_read_0");
                        dqsyVar.v("CREATE INDEX IF NOT EXISTS index_messages_read_0 ON messages(read) WHERE read == 0;");
                        return;
                    case 25010:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_web_id");
                        dqsyVar.v("CREATE INDEX IF NOT EXISTS index_messages_web_id ON messages(web_id);");
                        return;
                    case 29060:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN etouffee_status INT DEFAULT(0);");
                        return;
                    case 29090:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN verification_status INT DEFAULT(0);");
                        return;
                    case 29100:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN usage_stats_logging_id INT DEFAULT(0);");
                        return;
                    case 30010:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN is_hidden INT DEFAULT(0);");
                        return;
                    case 31010:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN cms_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
                        return;
                    case 32050:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_verification_status");
                        dqsyVar.v("CREATE INDEX index_messages_verification_status ON messages(verification_status) WHERE verification_status <> 0;");
                        return;
                    case 35030:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN send_counter INT DEFAULT(1);");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN original_rcs_message_id TEXT;");
                        return;
                    case 36000:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_seen_0");
                        dqsyVar.v("CREATE INDEX IF NOT EXISTS index_messages_seen_0 ON messages(seen) WHERE seen == 0;");
                        return;
                    case 37020:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_mime_type TEXT;");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_content BLOB;");
                        return;
                    case 37030:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN report_attempt_acounter INT DEFAULT(0);");
                        return;
                    case 37040:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN cms_last_mod_seq INTEGER;");
                        return;
                    case 39000:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_ui_status INT DEFAULT(0);");
                        return;
                    case 41040:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_message_id_with_text_type TEXT;");
                        dqsyVar.v("DROP INDEX IF EXISTS rcs_message_id_and_seen_index");
                        dqsyVar.v("CREATE UNIQUE INDEX rcs_message_id_and_seen_index ON messages(rcs_message_id_with_text_type, seen);");
                        return;
                    case 45020:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN custom_headers BLOB;");
                        return;
                    case 46010:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN cms_correlation_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_cms_correlation_id ON messages(cms_correlation_id);");
                        return;
                    case 48030:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN group_private_participant INT REFERENCES participants(_id) ON DELETE CASCADE ;");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN original_message_id INT REFERENCES messages(_id) ON DELETE CASCADE ;");
                        return;
                    case 49060:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN old_sms_message_uri TEXT;");
                        return;
                    case 54040:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN sender_send_destination TEXT;");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN receiving_network_country TEXT;");
                        return;
                    case 54070:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        dqsyVar.v("CREATE INDEX index_messages_is_hidden_0 ON messages(is_hidden) WHERE is_hidden = 0;");
                        return;
                    case 56000:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN draft_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_draft_id ON messages(draft_id) WHERE draft_id NOT NULL;");
                        return;
                    case 58040:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN result_code INT DEFAULT(-2);");
                        return;
                    case 58060:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_sms_message_uri");
                        dqsyVar.v("CREATE INDEX index_messages_sms_message_uri ON messages(sms_message_uri);");
                        return;
                    case 58210:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58230:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN auto_retry_counter INT DEFAULT(0);");
                        return;
                    case 58280:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN can_revoke_before_delivered_with_rcs INTEGER DEFAULT(0);");
                        return;
                    case 58360:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_sender_id");
                        dqsyVar.v("CREATE INDEX index_messages_sender_id ON messages(sender_id);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_sent_timestamp");
                        dqsyVar.v("CREATE INDEX index_messages_sent_timestamp ON messages(sent_timestamp);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_received_timestamp");
                        dqsyVar.v("CREATE INDEX index_messages_received_timestamp ON messages(received_timestamp);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_cloud_sync_id");
                        dqsyVar.v("CREATE INDEX index_messages_cloud_sync_id ON messages(cloud_sync_id);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_is_hidden");
                        dqsyVar.v("CREATE INDEX index_messages_is_hidden ON messages(is_hidden);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_awaiting_reverse_sync");
                        dqsyVar.v("CREATE INDEX index_messages_awaiting_reverse_sync ON messages(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58680:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN trace_id BLOB;");
                        return;
                    case 58710:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN fallback_reason INT DEFAULT(0);");
                        return;
                    case 58720:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN outgoing_delivery_report_status INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN outgoing_read_report_status INT DEFAULT(0);");
                        return;
                    case 58740:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_original_message_id");
                        dqsyVar.v("CREATE INDEX index_messages_original_message_id ON messages(original_message_id);");
                        return;
                    case 59160:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_self_id");
                        dqsyVar.v("CREATE INDEX index_messages_self_id ON messages(self_id) WHERE self_id NOT NULL;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_group_private_participant");
                        dqsyVar.v("CREATE INDEX index_messages_group_private_participant ON messages(group_private_participant) WHERE group_private_participant NOT NULL;");
                        return;
                    case 59310:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN xms_transport INT DEFAULT(0);");
                        return;
                    case 59340:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                        return;
                    case 59430:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN message_original_protocol INT DEFAULT(-1);");
                        return;
                    case 59490:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN satellite_datagram_id TEXT;");
                        return;
                    case 59510:
                        if (dqru.a(MessagesTable.f()) < 59510) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_satellite_datagram_id");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_satellite_datagram_id ON messages(satellite_datagram_id);");
                        return;
                    case 59530:
                        dqsyVar.v("DROP INDEX IF EXISTS index_messages_original_rcs_message_id");
                        dqsyVar.v("CREATE INDEX index_messages_original_rcs_message_id ON messages(original_rcs_message_id) WHERE original_rcs_message_id NOT NULL;");
                        return;
                    case 59810:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN my_identity TEXT;");
                        dqsyVar.v("CREATE INDEX index_messages_my_identity ON messages(my_identity);");
                        return;
                    case 59890:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN rcs_expiry INT DEFAULT(0);");
                        dqsyVar.v("CREATE INDEX index_messages_rcs_expiry ON messages(rcs_expiry) WHERE rcs_expiry NOT NULL;");
                        return;
                    case 60160:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_messages_my_identity_foreign_key ON messages(my_identity_foreign_key);");
                        return;
                    case 60190:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN encryption_protocol INT DEFAULT(0);");
                        return;
                    case 60370:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN message_persistence_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_messages_message_persistence_id ON messages(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                        return;
                    case 60550:
                        dqsyVar.v("DROP INDEX IF EXISTS index_unread_unhidden_messages_with_conversation_and_status");
                        dqsyVar.v("CREATE INDEX index_unread_unhidden_messages_with_conversation_and_status ON messages(conversation_id, message_status) WHERE read == 0 AND is_hidden == 0;");
                        return;
                    case 60650:
                        dqsyVar.v("DROP INDEX IF EXISTS index_unsent_rcs_report");
                        dqsyVar.v("CREATE INDEX index_unsent_rcs_report ON messages(_id) WHERE messages.message_protocol = 3 AND ((messages.outgoing_delivery_report_status = 0 AND messages.message_report_status = 1) OR (messages.outgoing_read_report_status = 0 AND messages.message_report_status = 2) OR messages.outgoing_delivery_report_status = 2 OR messages.outgoing_read_report_status = 2) AND messages.report_attempt_acounter <= 10;");
                        return;
                    case 60750:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN mute_priority INT DEFAULT(2);");
                        return;
                    case 60820:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN raw_rcs_message_to_send BLOB;");
                        return;
                    case 60950:
                        dqsyVar.v("ALTER TABLE messages ADD COLUMN parent_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        dqsyVar.v("CREATE INDEX index_messages_parent_message_id ON messages(parent_message_id);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static dqpo[] b() {
        return MessagesTable.c.as;
    }
}
