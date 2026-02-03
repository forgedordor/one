package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bosx {
    public static dqsq a() {
        return new dqry(botm.d, "conversations", new dqrx() { // from class: bosu
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = botm.a;
                numValueOf.getClass();
                switch (i) {
                    case 8500:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN participant_id_list TEXT;");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN source_type INT DEFAULT(0);");
                        return;
                    case 10000:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_session_id INT DEFAULT(-1);");
                        dqsyVar.v("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
                        return;
                    case 10006:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN join_state INT DEFAULT(0);");
                        return;
                    case 10007:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN conv_type INT DEFAULT(0);");
                        return;
                    case 10012:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN name_is_automatic INTEGER DEFAULT(1);");
                        return;
                    case 10016:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN send_mode INT DEFAULT(0);");
                        return;
                    case 10018:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN IS_ENTERPRISE INT DEFAULT(0);");
                        return;
                    case 12001:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN has_ea2p_bot_recipient INT DEFAULT(0);");
                        return;
                    case 15000:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN last_interactive_event_timestamp INT DEFAULT(0);");
                        return;
                    case 15010:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN participant_display_destination TEXT;");
                        return;
                    case 23000:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN spam_warning_dismiss_status INT DEFAULT(0);");
                        return;
                    case 26020:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN open_count INT DEFAULT(0);");
                        return;
                    case 28010:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN last_logged_scooby_metadata_timestamp INT DEFAULT(0);");
                        return;
                    case 29020:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN delete_timestamp INT DEFAULT(0);");
                        dqsyVar.v("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
                        return;
                    case 29060:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN etouffee_default INT DEFAULT(0);");
                        return;
                    case 32000:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN cms_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
                        return;
                    case 40050:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_group_id TEXT;");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_conference_uri TEXT;");
                        return;
                    case 46050:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 48040:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_session_allows_revocation INT DEFAULT(1);");
                        return;
                    case 49020:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_group_capabilities INTEGER DEFAULT(0);");
                        return;
                    case 49060:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        return;
                    case 53030:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN cms_most_recent_read_message_timestamp_ms INT DEFAULT(0);");
                        return;
                    case 58090:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN normalized_participant_contact_id INT DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN normalized_participant_lookup_key TEXT;");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN participant_comparable_destination TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN normalized_participant_id_list TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN normalized_participant_display_destination TEXT;");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN duplicate_of INTEGER REFERENCES conversations(_id)  ;");
                        return;
                    case 58120:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
                        dqsyVar.v("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN tachygram_group_routing_info_token BLOB;");
                        return;
                    case 58140:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN error_state INT;");
                        return;
                    case 58210:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58370:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
                        dqsyVar.v("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58390:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
                        dqsyVar.v("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
                        return;
                    case 58540:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_group_self_msisdn TEXT;");
                        return;
                    case 58750:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN recipient_offline_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 58910:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_group_last_sync_timestamp INTEGER DEFAULT(-1);");
                        return;
                    case 59130:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ;");
                        return;
                    case 59180:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_duplicate_of");
                        dqsyVar.v("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
                        dqsyVar.v("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
                        return;
                    case 59210:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN has_been_e2ee INT DEFAULT(0);");
                        return;
                    case 59220:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN marked_as_unread INT DEFAULT(0);");
                        return;
                    case 59260:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
                        dqsyVar.v("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
                        return;
                    case 59760:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN subtitle TEXT;");
                        return;
                    case 59810:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN current_my_identity TEXT;");
                        return;
                    case 59820:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN custom_theme BLOB;");
                        return;
                    case 60050:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_status INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_retries INTEGER DEFAULT(0);");
                        return;
                    case 60160:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
                        return;
                    case 60180:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN encryption_protocol INTEGER DEFAULT(0);");
                        return;
                    case 60210:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN encryption_id TEXT;");
                        return;
                    case 60250:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN cms_correlation_id TEXT;");
                        return;
                    case 60310:
                        if (dqru.a(botm.f()) < 60310) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
                        dqsyVar.v("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
                        return;
                    case 60360:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
                        return;
                    case 60590:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN rcs_group_icon_url TEXT;");
                        return;
                    case 60740:
                        dqsyVar.v("ALTER TABLE conversations ADD COLUMN unread_count INTEGER;");
                        return;
                    case 60830:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversations_encryption_id");
                        dqsyVar.v("CREATE INDEX index_conversations_encryption_id ON conversations(encryption_id);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(botm.e, true, "conversations", new dqrx() { // from class: bosv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = botm.a;
                numValueOf.getClass();
                if (i != 57040) {
                    return;
                }
                dqru.K(dqsyVar, "conversations", botm.l(57040, "TEMP___conversations"), botm.a, botm.n(57040));
            }
        });
    }

    public static dqpo[] c() {
        return botm.c.az;
    }
}
