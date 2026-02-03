package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeur {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_count", "conversations.notification_enabled", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.rcs_session_allows_revocation", "conversations.marked_as_unread", "conversations.mms_group_upgrade_status", "conversations.unread_count", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "conversation_to_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.content_type", "reminders.trigger_time", "conversation_pin.pin_status"};
    public static final aeui b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations.source_type", 8500);
        ekgiVar.i("conversations.rcs_session_id", 10000);
        ekgiVar.i("conversations.join_state", 10006);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.IS_ENTERPRISE", 10018);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.i("conversations.participant_display_destination", 15010);
        ekgiVar.i("conversations.rcs_session_allows_revocation", 48040);
        ekgiVar.i("conversations.marked_as_unread", 59220);
        ekgiVar.i("conversations.mms_group_upgrade_status", 60050);
        ekgiVar.i("conversations.unread_count", 60740);
        ekgiVar.i("messages.sms_error_code", 9000);
        ekgiVar.i("messages.sms_error_desc_map_name", 9000);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("archive_status", "index_null_archive_status");
        ekgiVar2.i("sort_timestamp", "index_null_sort_timestamp");
        ekgiVar2.i("participant_normalized_destination", "index_null_participant_normalized_destination");
        ekgiVar2.i("rcs_session_id", "index_null_rcs_session_id");
        ekgiVar2.i("marked_as_unread", "index_null_marked_as_unread");
        ekgiVar2.c();
        b = new aeui();
    }

    public static final aeuo a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations._id");
            ekfwVar.h("conversations.name");
            ekfwVar.h("conversations.snippet_text");
            ekfwVar.h("conversations.subject_text");
            ekfwVar.h("conversations.preview_uri");
            ekfwVar.h("conversations.preview_content_type");
            ekfwVar.h("conversations.show_draft");
            ekfwVar.h("conversations.draft_snippet_text");
            ekfwVar.h("conversations.draft_subject_text");
            ekfwVar.h("conversations.draft_preview_uri");
            ekfwVar.h("conversations.draft_preview_content_type");
            ekfwVar.h("conversations.archive_status");
            ekfwVar.h("conversations.sort_timestamp");
            ekfwVar.h("conversations.icon");
            ekfwVar.h("conversations.participant_lookup_key");
            ekfwVar.h("conversations.participant_normalized_destination");
            ekfwVar.h("conversations.participant_count");
            ekfwVar.h("conversations.notification_enabled");
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
            if (numC.intValue() >= 10018) {
                ekfwVar.h("conversations.IS_ENTERPRISE");
            }
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (numC.intValue() >= 15010) {
                ekfwVar.h("conversations.participant_display_destination");
            }
            if (numC.intValue() >= 48040) {
                ekfwVar.h("conversations.rcs_session_allows_revocation");
            }
            if (numC.intValue() >= 59220) {
                ekfwVar.h("conversations.marked_as_unread");
            }
            if (numC.intValue() >= 60050) {
                ekfwVar.h("conversations.mms_group_upgrade_status");
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
            ekfwVar.h("conversation_to_participants.participant_id");
            ekfwVar.h("one_on_one_participant.full_name");
            ekfwVar.h("one_on_one_participant.first_name");
            ekfwVar.h("profiles_table.display_name");
            ekfwVar.h("parts.content_type");
            ekfwVar.h("reminders.trigger_time");
            ekfwVar.h("conversation_pin.pin_status");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new aeuo(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
