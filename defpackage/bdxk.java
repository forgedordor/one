package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdxk {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.awaiting_reverse_sync", "conversations.error_state", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.encryption_protocol", "conversations.unread_count", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.rcs_message_id_with_text_type", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.directory_id", "conversation_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.text", "parts.uri", "parts.content_type", "vmt.vmt_status", "vmt.text", "reminders.trigger_time", "messages_annotations.annotation_type", "messages_annotations.annotation_details", "message_star._id", "parent_disallowed_conversations.conversation_id"};
    public static final bdxb b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations.name_is_automatic", 10012);
        ekgiVar.i("conversations.etouffee_default", 29060);
        ekgiVar.i("conversations.current_my_identity_foreign_key", 60160);
        ekgiVar.i("conversations.source_type", 8500);
        ekgiVar.i("conversations.rcs_session_id", 10000);
        ekgiVar.i("conversations.join_state", 10006);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.send_mode", 10016);
        ekgiVar.i("conversations.IS_ENTERPRISE", 10018);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.i("conversations.participant_display_destination", 15010);
        ekgiVar.i("conversations.delete_timestamp", 29020);
        ekgiVar.i("conversations.cms_id", 32000);
        ekgiVar.i("conversations.rcs_group_id", 40050);
        ekgiVar.i("conversations.rcs_conference_uri", 40050);
        ekgiVar.i("conversations.rcs_session_allows_revocation", 48040);
        ekgiVar.i("conversations.awaiting_reverse_sync", 49060);
        ekgiVar.i("conversations.error_state", 58140);
        ekgiVar.i("conversations.rcs_group_last_sync_timestamp", 58910);
        ekgiVar.i("conversations.has_been_e2ee", 59210);
        ekgiVar.i("conversations.marked_as_unread", 59220);
        ekgiVar.i("conversations.encryption_protocol", 60180);
        ekgiVar.i("conversations.unread_count", 60740);
        ekgiVar.i("messages.rcs_message_id_with_text_type", 41040);
        ekgiVar.i("messages.sms_error_code", 9000);
        ekgiVar.i("messages.sms_error_desc_map_name", 9000);
        ekgiVar.i("participants.directory_id", 35010);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("sms_thread_id", "index_null_sms_thread_id");
        ekgiVar2.i("archive_status", "index_null_archive_status");
        ekgiVar2.i("sort_timestamp", "index_null_sort_timestamp");
        ekgiVar2.i("participant_normalized_destination", "index_null_participant_normalized_destination");
        ekgiVar2.i("current_my_identity_foreign_key", "index_null_current_my_identity_foreign_key");
        ekgiVar2.i("rcs_session_id", "index_null_rcs_session_id");
        ekgiVar2.i("delete_timestamp", "index_null_delete_timestamp");
        ekgiVar2.i("cms_id", "index_null_cms_id");
        ekgiVar2.i("rcs_group_id", "index_null_rcs_group_id");
        ekgiVar2.i("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        ekgiVar2.i("marked_as_unread", "index_null_marked_as_unread");
        ekgiVar2.c();
        b = new bdxb();
    }

    public static final bdxh a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations._id");
            ekfwVar.h("conversations.sms_thread_id");
            ekfwVar.h("conversations.name");
            if (numC.intValue() >= 10012) {
                ekfwVar.h("conversations.name_is_automatic");
            }
            ekfwVar.h("conversations.snippet_text");
            ekfwVar.h("conversations.subject_text");
            ekfwVar.h("conversations.preview_uri");
            ekfwVar.h("conversations.preview_content_type");
            ekfwVar.h("conversations.show_draft");
            ekfwVar.h("conversations.draft_snippet_text");
            ekfwVar.h("conversations.draft_subject_text");
            ekfwVar.h("conversations.draft_preview_uri");
            ekfwVar.h("conversations.draft_preview_content_type");
            if (numC.intValue() >= 29060) {
                ekfwVar.h("conversations.etouffee_default");
            }
            ekfwVar.h("conversations.archive_status");
            ekfwVar.h("conversations.sort_timestamp");
            ekfwVar.h("conversations.icon");
            ekfwVar.h("conversations.participant_contact_id");
            ekfwVar.h("conversations.participant_lookup_key");
            ekfwVar.h("conversations.participant_normalized_destination");
            ekfwVar.h("conversations.current_self_id");
            if (numC.intValue() >= 60160) {
                ekfwVar.h("conversations.current_my_identity_foreign_key");
            }
            ekfwVar.h("conversations.participant_count");
            ekfwVar.h("conversations.notification_enabled");
            ekfwVar.h("conversations.notification_sound_uri");
            ekfwVar.h("conversations.notification_vibration");
            ekfwVar.h("conversations.include_email_addr");
            if (numC.intValue() >= 8500) {
                ekfwVar.h("conversations.source_type");
            }
            if (numC.intValue() >= 10000) {
                ekfwVar.h("conversations.rcs_session_id");
            }
            if (numC.intValue() >= 10006) {
                ekfwVar.h("conversations.join_state");
            }
            if (numC.intValue() >= 10007) {
                ekfwVar.h("conversations.conv_type");
            }
            if (numC.intValue() >= 10016) {
                ekfwVar.h("conversations.send_mode");
            }
            if (numC.intValue() >= 10018) {
                ekfwVar.h("conversations.IS_ENTERPRISE");
            }
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (numC.intValue() >= 15010) {
                ekfwVar.h("conversations.participant_display_destination");
            }
            if (numC.intValue() >= 29020) {
                ekfwVar.h("conversations.delete_timestamp");
            }
            if (numC.intValue() >= 32000) {
                ekfwVar.h("conversations.cms_id");
            }
            if (numC.intValue() >= 40050) {
                ekfwVar.h("conversations.rcs_group_id");
            }
            if (numC.intValue() >= 40050) {
                ekfwVar.h("conversations.rcs_conference_uri");
            }
            if (numC.intValue() >= 48040) {
                ekfwVar.h("conversations.rcs_session_allows_revocation");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("conversations.awaiting_reverse_sync");
            }
            if (numC.intValue() >= 58140) {
                ekfwVar.h("conversations.error_state");
            }
            if (numC.intValue() >= 58910) {
                ekfwVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (numC.intValue() >= 59210) {
                ekfwVar.h("conversations.has_been_e2ee");
            }
            if (numC.intValue() >= 59220) {
                ekfwVar.h("conversations.marked_as_unread");
            }
            if (numC.intValue() >= 60180) {
                ekfwVar.h("conversations.encryption_protocol");
            }
            if (numC.intValue() >= 60740) {
                ekfwVar.h("conversations.unread_count");
            }
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.sent_timestamp");
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("messages.message_protocol");
            ekfwVar.h("messages.message_status");
            ekfwVar.h("messages.read");
            ekfwVar.h("messages.sms_priority");
            ekfwVar.h("messages.raw_status");
            if (numC.intValue() >= 41040) {
                ekfwVar.h("messages.rcs_message_id_with_text_type");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_code");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_desc_map_name");
            }
            ekfwVar.h("participants.sub_id");
            ekfwVar.h("participants.display_destination");
            ekfwVar.h("participants.full_name");
            ekfwVar.h("participants.first_name");
            if (numC.intValue() >= 35010) {
                ekfwVar.h("participants.directory_id");
            }
            ekfwVar.h("conversation_participants.participant_id");
            ekfwVar.h("one_on_one_participant.full_name");
            ekfwVar.h("one_on_one_participant.first_name");
            ekfwVar.h("profiles_table.display_name");
            ekfwVar.h("parts.text");
            ekfwVar.h("parts.uri");
            ekfwVar.h("parts.content_type");
            ekfwVar.h("vmt.vmt_status");
            ekfwVar.h("vmt.text");
            ekfwVar.h("reminders.trigger_time");
            ekfwVar.h("messages_annotations.annotation_type");
            ekfwVar.h("messages_annotations.annotation_details");
            ekfwVar.h("message_star._id");
            ekfwVar.h("parent_disallowed_conversations.conversation_id");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bdxh(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dqxa d() {
        return b().M();
    }
}
