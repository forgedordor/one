package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfrt {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.is_hidden", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.cms_id", "messages.web_id", "messages.usage_stats_logging_id", "messages.original_rcs_message_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.trace_id", "messages.xms_transport", "group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name", "group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri", "group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name", "group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key", "(count(parts._id)) AS parts_count", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "parts.raw_text", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "group_concat(quote(parts.blob_gaia_email), '|')", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "group_concat(quote(parts.media_send_type), '|')", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.participant_type", "participants.is_spam", "participants.latest_verification_status", "participants.directory_id", "participants.name_source", "participants.photo_source", "read_reports._id", "read_reports.message_id", "group_concat(quote(read_reports.participant_id), '|')", "group_concat(quote(read_reports.receive_time), '|')", "group_concat(quote(read_reports.read_time), '|')", "group_concat(quote(read_reports.ftd_time), '|')", "group_concat(quote(read_reports.rowid), '|') AS read_reports__ROWID", "user_references._id", "user_references.message_id", "group_concat(quote(user_references.user_ref_id), '|')", "group_concat(quote(user_references.user_ref_datetime), '|')", "group_concat(quote(user_references.rowid), '|') AS user_references__ROWID", "group_concat(quote(user_ref_participant.normalized_destination), '|')", "group_concat(quote(user_ref_participant.color_palette_index), '|')", "group_concat(quote(user_ref_participant.color_type), '|')", "group_concat(quote(user_ref_participant.extended_color), '|')", "group_concat(quote(user_ref_participant.participant_type), '|')", "group_concat(quote(user_ref_participant.rowid), '|') AS user_ref_participant__ROWID", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_uri", "conversations.participant_normalized_destination", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.recipient_offline_timestamp_ms", "message_reactions.reactions_data", "file_transfer.transfer_id", "message_star.message_id", "message_photos_sharing.sharing_state", "group_concat(quote(vmt.part_id), '|')", "group_concat(quote(vmt.vmt_status), '|')", "group_concat(quote(vmt.text), '|')", "group_concat(quote(vmt.locale), '|')", "group_concat(quote(vmt.rowid), '|') AS vmt__ROWID", "replied_to_message._id", "replied_to_message.received_timestamp", "replied_to_participant._id", "replied_to_participant.sub_id", "replied_to_participant.normalized_destination", "replied_to_participant.display_destination", "replied_to_participant.full_name", "replied_to_participant.first_name", "replied_to_message_part.text", "replied_to_message_part.uri", "replied_to_message_part.content_type", "replied_to_message_part.file_name", "replied_to_message_part.duration", "replied_to_message_link_preview.trigger_url", "replied_to_message_link_preview.expiration_time_millis", "replied_to_message_link_preview.link_title", "replied_to_message_link_preview.link_image_url", "replied_to_message_link_preview.link_preview_failed", "profiles_table.display_name", "message_captions.caption"};
    public static final bfrh b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages.message_report_status", 13020);
        ekgiVar.i("messages.rcs_expiry", 59890);
        ekgiVar.i("messages.mms_retrieve_text", 9030);
        ekgiVar.i("messages.rcs_message_id_with_text_type", 41040);
        ekgiVar.i("messages.etouffee_status", 29060);
        ekgiVar.i("messages.verification_status", 29090);
        ekgiVar.i("messages.is_hidden", 30010);
        ekgiVar.i("messages.rcs_file_transfer_session_id", 10004);
        ekgiVar.i("messages.sms_error_code", 9000);
        ekgiVar.i("messages.sms_error_desc_map_name", 9000);
        ekgiVar.i("messages.cms_id", 31010);
        ekgiVar.i("messages.web_id", 19020);
        ekgiVar.i("messages.usage_stats_logging_id", 29100);
        ekgiVar.i("messages.original_rcs_message_id", 35030);
        ekgiVar.i("messages.result_code", 58040);
        ekgiVar.i("messages.cms_life_cycle", 58210);
        ekgiVar.i("messages.mute_priority", 60750);
        ekgiVar.i("messages.fallback_reason", 58710);
        ekgiVar.i("messages.trace_id", 58680);
        ekgiVar.i("messages.xms_transport", 59310);
        ekgiVar.i("group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name", 0);
        ekgiVar.i("group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri", 0);
        ekgiVar.i("group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name", 0);
        ekgiVar.i("group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key", 0);
        ekgiVar.i("(count(parts._id)) AS parts_count", 0);
        ekgiVar.i("parts.raw_text", 60990);
        ekgiVar.i("group_concat(quote(parts.original_uri), '|')", 10021);
        ekgiVar.i("group_concat(quote(parts.storage_uri), '|')", 29060);
        ekgiVar.i("parts.timestamp", 3010);
        ekgiVar.i("parts.output_uri", 4020);
        ekgiVar.i("group_concat(quote(parts.target_size), '|')", 4020);
        ekgiVar.i("parts.processing_status", 4020);
        ekgiVar.i("group_concat(quote(parts.cms_attachment_processing_status), '|')", 44010);
        ekgiVar.i("parts.sticker_set_id", 5020);
        ekgiVar.i("parts.sticker_id", 5020);
        ekgiVar.i("parts.media_modified_timestamp", 7000);
        ekgiVar.i("parts.longitude", 10005);
        ekgiVar.i("parts.latitude", 10005);
        ekgiVar.i("group_concat(quote(parts.preview_content_uri), '|')", 10017);
        ekgiVar.i("parts.preview_content_type", 10017);
        ekgiVar.i("group_concat(quote(parts.fallback_uri), '|')", 13000);
        ekgiVar.i("group_concat(quote(parts.source), '|')", 14010);
        ekgiVar.i("group_concat(quote(parts.bundle_index), '|')", 17010);
        ekgiVar.i("group_concat(quote(parts.blob_id), '|')", 17020);
        ekgiVar.i("group_concat(quote(parts.blob_gaia_email), '|')", 59570);
        ekgiVar.i("parts.cms_full_size_blob_id", 40040);
        ekgiVar.i("parts.cms_media_encryption_key", 42010);
        ekgiVar.i("parts.cms_compressed_media_encryption_key", 42070);
        ekgiVar.i("group_concat(quote(parts.blob_upload_permanent_failure), '|')", 18000);
        ekgiVar.i("group_concat(quote(parts.blob_upload_timestamp), '|')", 19030);
        ekgiVar.i("group_concat(quote(parts.expressive_sticker_name), '|')", 22060);
        ekgiVar.i("group_concat(quote(parts.file_name), '|')", 26000);
        ekgiVar.i("group_concat(quote(parts.duration), '|')", 26040);
        ekgiVar.i("group_concat(quote(parts.compressed_blob_id), '|')", 27000);
        ekgiVar.i("parts.cms_compressed_blob_id", 40040);
        ekgiVar.i("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", 27000);
        ekgiVar.i("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", 27000);
        ekgiVar.i("group_concat(quote(parts.media_encryption_key), '|')", 30040);
        ekgiVar.i("group_concat(quote(parts.compressed_media_encryption_key), '|')", 30040);
        ekgiVar.i("group_concat(quote(parts.missing_entry_in_telephony), '|')", 52030);
        ekgiVar.i("parts.awaiting_reverse_sync", 53040);
        ekgiVar.i("parts.file_size_bytes", 52050);
        ekgiVar.i("parts.local_cache_path", 52050);
        ekgiVar.i("group_concat(quote(parts.media_send_type), '|')", 58150);
        ekgiVar.i("parts.voice_metadata", 59470);
        ekgiVar.i("parts.validation_status", 58770);
        ekgiVar.i("parts.processing_id", 60080);
        ekgiVar.i("parts.rich_card_media_download_failure_reason", 60230);
        ekgiVar.i("parts.image_display_state", 60240);
        ekgiVar.i("parts.preserve_size", 60680);
        ekgiVar.i("participants.color_type", 1000);
        ekgiVar.i("participants.extended_color", 10027);
        ekgiVar.i("participants.participant_type", 12001);
        ekgiVar.i("participants.is_spam", 24060);
        ekgiVar.i("participants.latest_verification_status", 31030);
        ekgiVar.i("participants.directory_id", 35010);
        ekgiVar.i("participants.name_source", 59550);
        ekgiVar.i("participants.photo_source", 59550);
        ekgiVar.i("group_concat(quote(read_reports.ftd_time), '|')", 58880);
        ekgiVar.i("group_concat(quote(user_ref_participant.color_type), '|')", 1000);
        ekgiVar.i("group_concat(quote(user_ref_participant.extended_color), '|')", 10027);
        ekgiVar.i("group_concat(quote(user_ref_participant.participant_type), '|')", 12001);
        ekgiVar.i("link_preview.link_preview_prevented", 21010);
        ekgiVar.i("link_preview.link_preview_failed", 22020);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.i("conversations.rcs_group_id", 40050);
        ekgiVar.i("conversations.rcs_conference_uri", 40050);
        ekgiVar.i("conversations.rcs_session_allows_revocation", 48040);
        ekgiVar.i("conversations.recipient_offline_timestamp_ms", 58750);
        ekgiVar.i("replied_to_message_part.file_name", 26000);
        ekgiVar.i("replied_to_message_part.duration", 26040);
        ekgiVar.i("replied_to_message_link_preview.link_preview_failed", 22020);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("_id", "index_unsent_rcs_report");
        ekgiVar2.i("sender_id", "index_null_sender_id");
        ekgiVar2.i("sent_timestamp", "index_null_sent_timestamp");
        ekgiVar2.i("read", "index_messages_read_0");
        ekgiVar2.i("sms_message_uri", "index_null_sms_message_uri");
        ekgiVar2.i("rcs_expiry", "index_null_rcs_expiry");
        ekgiVar2.i("self_id", "index_null_self_id");
        ekgiVar2.i(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        ekgiVar2.i("cms_id", "index_null_cms_id");
        ekgiVar2.i("web_id", "index_null_web_id");
        ekgiVar2.i("original_rcs_message_id", "index_null_original_rcs_message_id");
        ekgiVar2.c();
        b = new bfrh();
    }

    public static final bfro a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.sender_id");
            ekfwVar.h("messages.sent_timestamp");
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("messages.message_protocol");
            ekfwVar.h("messages.message_status");
            if (numC.intValue() >= 13020) {
                ekfwVar.h("messages.message_report_status");
            }
            ekfwVar.h("messages.seen");
            ekfwVar.h("messages.read");
            ekfwVar.h("messages.sms_message_uri");
            ekfwVar.h("messages.sms_priority");
            ekfwVar.h("messages.sms_message_size");
            ekfwVar.h("messages.mms_subject");
            ekfwVar.h("messages.mms_expiry");
            if (numC.intValue() >= 59890) {
                ekfwVar.h("messages.rcs_expiry");
            }
            if (numC.intValue() >= 9030) {
                ekfwVar.h("messages.mms_retrieve_text");
            }
            ekfwVar.h("messages.raw_status");
            ekfwVar.h("messages.self_id");
            if (numC.intValue() >= 41040) {
                ekfwVar.h("messages.rcs_message_id_with_text_type");
            }
            if (numC.intValue() >= 29060) {
                ekfwVar.h("messages.etouffee_status");
            }
            if (numC.intValue() >= 29090) {
                ekfwVar.h("messages.verification_status");
            }
            if (numC.intValue() >= 30010) {
                ekfwVar.h("messages.is_hidden");
            }
            if (numC.intValue() >= 10004) {
                ekfwVar.h("messages.rcs_file_transfer_session_id");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_code");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_desc_map_name");
            }
            if (numC.intValue() >= 31010) {
                ekfwVar.h("messages.cms_id");
            }
            if (numC.intValue() >= 19020) {
                ekfwVar.h("messages.web_id");
            }
            if (numC.intValue() >= 29100) {
                ekfwVar.h("messages.usage_stats_logging_id");
            }
            if (numC.intValue() >= 35030) {
                ekfwVar.h("messages.original_rcs_message_id");
            }
            if (numC.intValue() >= 58040) {
                ekfwVar.h("messages.result_code");
            }
            if (numC.intValue() >= 58210) {
                ekfwVar.h("messages.cms_life_cycle");
            }
            if (numC.intValue() >= 60750) {
                ekfwVar.h("messages.mute_priority");
            }
            if (numC.intValue() >= 58710) {
                ekfwVar.h("messages.fallback_reason");
            }
            if (numC.intValue() >= 58680) {
                ekfwVar.h("messages.trace_id");
            }
            if (numC.intValue() >= 59310) {
                ekfwVar.h("messages.xms_transport");
            }
            if (numC.intValue() >= 0) {
                ekfwVar.h("group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name");
            }
            if (numC.intValue() >= 0) {
                ekfwVar.h("group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri");
            }
            if (numC.intValue() >= 0) {
                ekfwVar.h("group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name");
            }
            if (numC.intValue() >= 0) {
                ekfwVar.h("group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key");
            }
            if (numC.intValue() >= 0) {
                ekfwVar.h("(count(parts._id)) AS parts_count");
            }
            ekfwVar.h("group_concat(quote(parts._id), '|')");
            ekfwVar.h("parts.message_id");
            ekfwVar.h("group_concat(quote(parts.text), '|')");
            if (numC.intValue() >= 60990) {
                ekfwVar.h("parts.raw_text");
            }
            ekfwVar.h("group_concat(quote(parts.uri), '|')");
            ekfwVar.h("group_concat(quote(parts.content_type), '|')");
            if (numC.intValue() >= 10021) {
                ekfwVar.h("group_concat(quote(parts.original_uri), '|')");
            }
            if (numC.intValue() >= 29060) {
                ekfwVar.h("group_concat(quote(parts.storage_uri), '|')");
            }
            ekfwVar.h("group_concat(quote(parts.width), '|')");
            ekfwVar.h("group_concat(quote(parts.height), '|')");
            if (numC.intValue() >= 3010) {
                ekfwVar.h("parts.timestamp");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("parts.output_uri");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("group_concat(quote(parts.target_size), '|')");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("parts.processing_status");
            }
            if (numC.intValue() >= 44010) {
                ekfwVar.h("group_concat(quote(parts.cms_attachment_processing_status), '|')");
            }
            ekfwVar.h("parts.conversation_id");
            if (numC.intValue() >= 5020) {
                ekfwVar.h("parts.sticker_set_id");
            }
            if (numC.intValue() >= 5020) {
                ekfwVar.h("parts.sticker_id");
            }
            if (numC.intValue() >= 7000) {
                ekfwVar.h("parts.media_modified_timestamp");
            }
            if (numC.intValue() >= 10005) {
                ekfwVar.h("parts.longitude");
            }
            if (numC.intValue() >= 10005) {
                ekfwVar.h("parts.latitude");
            }
            if (numC.intValue() >= 10017) {
                ekfwVar.h("group_concat(quote(parts.preview_content_uri), '|')");
            }
            if (numC.intValue() >= 10017) {
                ekfwVar.h("parts.preview_content_type");
            }
            if (numC.intValue() >= 13000) {
                ekfwVar.h("group_concat(quote(parts.fallback_uri), '|')");
            }
            if (numC.intValue() >= 14010) {
                ekfwVar.h("group_concat(quote(parts.source), '|')");
            }
            if (numC.intValue() >= 17010) {
                ekfwVar.h("group_concat(quote(parts.bundle_index), '|')");
            }
            if (numC.intValue() >= 17020) {
                ekfwVar.h("group_concat(quote(parts.blob_id), '|')");
            }
            if (numC.intValue() >= 59570) {
                ekfwVar.h("group_concat(quote(parts.blob_gaia_email), '|')");
            }
            if (numC.intValue() >= 40040) {
                ekfwVar.h("parts.cms_full_size_blob_id");
            }
            if (numC.intValue() >= 42010) {
                ekfwVar.h("parts.cms_media_encryption_key");
            }
            if (numC.intValue() >= 42070) {
                ekfwVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (numC.intValue() >= 18000) {
                ekfwVar.h("group_concat(quote(parts.blob_upload_permanent_failure), '|')");
            }
            if (numC.intValue() >= 19030) {
                ekfwVar.h("group_concat(quote(parts.blob_upload_timestamp), '|')");
            }
            if (numC.intValue() >= 22060) {
                ekfwVar.h("group_concat(quote(parts.expressive_sticker_name), '|')");
            }
            if (numC.intValue() >= 26000) {
                ekfwVar.h("group_concat(quote(parts.file_name), '|')");
            }
            if (numC.intValue() >= 26040) {
                ekfwVar.h("group_concat(quote(parts.duration), '|')");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("group_concat(quote(parts.compressed_blob_id), '|')");
            }
            if (numC.intValue() >= 40040) {
                ekfwVar.h("parts.cms_compressed_blob_id");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')");
            }
            if (numC.intValue() >= 30040) {
                ekfwVar.h("group_concat(quote(parts.media_encryption_key), '|')");
            }
            if (numC.intValue() >= 30040) {
                ekfwVar.h("group_concat(quote(parts.compressed_media_encryption_key), '|')");
            }
            if (numC.intValue() >= 52030) {
                ekfwVar.h("group_concat(quote(parts.missing_entry_in_telephony), '|')");
            }
            if (numC.intValue() >= 53040) {
                ekfwVar.h("parts.awaiting_reverse_sync");
            }
            if (numC.intValue() >= 52050) {
                ekfwVar.h("parts.file_size_bytes");
            }
            if (numC.intValue() >= 52050) {
                ekfwVar.h("parts.local_cache_path");
            }
            if (numC.intValue() >= 58150) {
                ekfwVar.h("group_concat(quote(parts.media_send_type), '|')");
            }
            if (numC.intValue() >= 59470) {
                ekfwVar.h("parts.voice_metadata");
            }
            if (numC.intValue() >= 58770) {
                ekfwVar.h("parts.validation_status");
            }
            if (numC.intValue() >= 60080) {
                ekfwVar.h("parts.processing_id");
            }
            if (numC.intValue() >= 60230) {
                ekfwVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (numC.intValue() >= 60240) {
                ekfwVar.h("parts.image_display_state");
            }
            if (numC.intValue() >= 60680) {
                ekfwVar.h("parts.preserve_size");
            }
            ekfwVar.h("participants.normalized_destination");
            ekfwVar.h("participants.send_destination");
            ekfwVar.h("participants.display_destination");
            ekfwVar.h("participants.full_name");
            ekfwVar.h("participants.first_name");
            ekfwVar.h("participants.profile_photo_uri");
            ekfwVar.h("participants.contact_id");
            ekfwVar.h("participants.lookup_key");
            ekfwVar.h("participants.color_palette_index");
            if (numC.intValue() >= 1000) {
                ekfwVar.h("participants.color_type");
            }
            if (numC.intValue() >= 10027) {
                ekfwVar.h("participants.extended_color");
            }
            ekfwVar.h("participants.blocked");
            if (numC.intValue() >= 12001) {
                ekfwVar.h("participants.participant_type");
            }
            if (numC.intValue() >= 24060) {
                ekfwVar.h("participants.is_spam");
            }
            if (numC.intValue() >= 31030) {
                ekfwVar.h("participants.latest_verification_status");
            }
            if (numC.intValue() >= 35010) {
                ekfwVar.h("participants.directory_id");
            }
            if (numC.intValue() >= 59550) {
                ekfwVar.h("participants.name_source");
            }
            if (numC.intValue() >= 59550) {
                ekfwVar.h("participants.photo_source");
            }
            ekfwVar.h("read_reports._id");
            ekfwVar.h("read_reports.message_id");
            ekfwVar.h("group_concat(quote(read_reports.participant_id), '|')");
            ekfwVar.h("group_concat(quote(read_reports.receive_time), '|')");
            ekfwVar.h("group_concat(quote(read_reports.read_time), '|')");
            if (numC.intValue() >= 58880) {
                ekfwVar.h("group_concat(quote(read_reports.ftd_time), '|')");
            }
            ekfwVar.h("user_references._id");
            ekfwVar.h("user_references.message_id");
            ekfwVar.h("group_concat(quote(user_references.user_ref_id), '|')");
            ekfwVar.h("group_concat(quote(user_references.user_ref_datetime), '|')");
            ekfwVar.h("group_concat(quote(user_ref_participant.normalized_destination), '|')");
            ekfwVar.h("group_concat(quote(user_ref_participant.color_palette_index), '|')");
            if (numC.intValue() >= 1000) {
                ekfwVar.h("group_concat(quote(user_ref_participant.color_type), '|')");
            }
            if (numC.intValue() >= 10027) {
                ekfwVar.h("group_concat(quote(user_ref_participant.extended_color), '|')");
            }
            if (numC.intValue() >= 12001) {
                ekfwVar.h("group_concat(quote(user_ref_participant.participant_type), '|')");
            }
            ekfwVar.h("link_preview.message_id");
            ekfwVar.h("link_preview.trigger_url");
            ekfwVar.h("link_preview.expiration_time_millis");
            ekfwVar.h("link_preview.link_title");
            ekfwVar.h("link_preview.link_description");
            ekfwVar.h("link_preview.link_image_url");
            ekfwVar.h("link_preview.link_domain");
            ekfwVar.h("link_preview.link_canonical_url");
            if (numC.intValue() >= 21010) {
                ekfwVar.h("link_preview.link_preview_prevented");
            }
            if (numC.intValue() >= 22020) {
                ekfwVar.h("link_preview.link_preview_failed");
            }
            ekfwVar.h("verified_sms_brands.name");
            ekfwVar.h("verified_sms_brands.description");
            ekfwVar.h("verified_sms_brands.logo_uri");
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numC.intValue() >= 10007) {
                ekfwVar.h("conversations.conv_type");
            }
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
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
            if (numC.intValue() >= 58750) {
                ekfwVar.h("conversations.recipient_offline_timestamp_ms");
            }
            ekfwVar.h("message_reactions.reactions_data");
            ekfwVar.h("file_transfer.transfer_id");
            ekfwVar.h("message_star.message_id");
            ekfwVar.h("message_photos_sharing.sharing_state");
            ekfwVar.h("group_concat(quote(vmt.part_id), '|')");
            ekfwVar.h("group_concat(quote(vmt.vmt_status), '|')");
            ekfwVar.h("group_concat(quote(vmt.text), '|')");
            ekfwVar.h("group_concat(quote(vmt.locale), '|')");
            ekfwVar.h("replied_to_message._id");
            ekfwVar.h("replied_to_message.received_timestamp");
            ekfwVar.h("replied_to_participant._id");
            ekfwVar.h("replied_to_participant.sub_id");
            ekfwVar.h("replied_to_participant.normalized_destination");
            ekfwVar.h("replied_to_participant.display_destination");
            ekfwVar.h("replied_to_participant.full_name");
            ekfwVar.h("replied_to_participant.first_name");
            ekfwVar.h("replied_to_message_part.text");
            ekfwVar.h("replied_to_message_part.uri");
            ekfwVar.h("replied_to_message_part.content_type");
            if (numC.intValue() >= 26000) {
                ekfwVar.h("replied_to_message_part.file_name");
            }
            if (numC.intValue() >= 26040) {
                ekfwVar.h("replied_to_message_part.duration");
            }
            ekfwVar.h("replied_to_message_link_preview.trigger_url");
            ekfwVar.h("replied_to_message_link_preview.expiration_time_millis");
            ekfwVar.h("replied_to_message_link_preview.link_title");
            ekfwVar.h("replied_to_message_link_preview.link_image_url");
            if (numC.intValue() >= 22020) {
                ekfwVar.h("replied_to_message_link_preview.link_preview_failed");
            }
            ekfwVar.h("profiles_table.display_name");
            ekfwVar.h("message_captions.caption");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bfro(strArr);
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
