package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmas {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time", "messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.raw_rcs_message_to_send", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.parent_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "parts.raw_text", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "message_captions.caption"};
    public static final cmai b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("scheduled_send.creation_time", 58020);
        ekgiVar.i("messages.sender_send_destination", 54040);
        ekgiVar.i("messages.msisdn_receiving_rcs_message", 59340);
        ekgiVar.i("messages.receiving_network_country", 54040);
        ekgiVar.i("messages.queue_insert_timestamp", 17030);
        ekgiVar.i("messages.message_report_status", 13020);
        ekgiVar.i("messages.rcs_expiry", 59890);
        ekgiVar.i("messages.mms_retrieve_text", 9030);
        ekgiVar.i("messages.my_identity_foreign_key", 60160);
        ekgiVar.i("messages.cloud_sync_id", 8500);
        ekgiVar.i("messages.rcs_message_id_with_text_type", 41040);
        ekgiVar.i("messages.etouffee_status", 29060);
        ekgiVar.i("messages.verification_status", 29090);
        ekgiVar.i("messages.rcs_ui_status", 39000);
        ekgiVar.i("messages.is_hidden", 30010);
        ekgiVar.i("messages.rcs_remote_instance", 10002);
        ekgiVar.i("messages.rcs_file_transfer_session_id", 10004);
        ekgiVar.i("messages.sms_error_code", 9000);
        ekgiVar.i("messages.sms_error_desc_map_name", 9000);
        ekgiVar.i("messages.correlation_id", 9010);
        ekgiVar.i("messages.cms_id", 31010);
        ekgiVar.i("messages.cms_last_mod_seq", 37040);
        ekgiVar.i("messages.web_id", 19020);
        ekgiVar.i("messages.usage_stats_logging_id", 29100);
        ekgiVar.i("messages.send_counter", 35030);
        ekgiVar.i("messages.original_rcs_message_id", 35030);
        ekgiVar.i("messages.raw_rcs_message_to_send", 60820);
        ekgiVar.i("messages.custom_delivery_receipt_mime_type", 37020);
        ekgiVar.i("messages.custom_delivery_receipt_content", 37020);
        ekgiVar.i("messages.report_attempt_acounter", 37030);
        ekgiVar.i("messages.custom_headers", 45020);
        ekgiVar.i("messages.cms_correlation_id", 46010);
        ekgiVar.i("messages.group_private_participant", 48030);
        ekgiVar.i("messages.original_message_id", 48030);
        ekgiVar.i("messages.parent_message_id", 60950);
        ekgiVar.i("messages.awaiting_reverse_sync", 49060);
        ekgiVar.i("messages.old_sms_message_uri", 49060);
        ekgiVar.i("messages.draft_id", 56000);
        ekgiVar.i("messages.result_code", 58040);
        ekgiVar.i("messages.cms_life_cycle", 58210);
        ekgiVar.i("messages.mute_priority", 60750);
        ekgiVar.i("messages.fallback_reason", 58710);
        ekgiVar.i("messages.auto_retry_counter", 58230);
        ekgiVar.i("messages.can_revoke_before_delivered_with_rcs", 58280);
        ekgiVar.i("messages.trace_id", 58680);
        ekgiVar.i("messages.outgoing_delivery_report_status", 58720);
        ekgiVar.i("messages.outgoing_read_report_status", 58720);
        ekgiVar.i("messages.xms_transport", 59310);
        ekgiVar.i("messages.message_original_protocol", 59430);
        ekgiVar.i("messages.satellite_datagram_id", 59490);
        ekgiVar.i("messages.encryption_protocol", 60190);
        ekgiVar.i("messages.message_persistence_id", 60370);
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
        ekgiVar.i("parts.blob_gaia_email", 59570);
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
        ekgiVar.i("parts.media_send_type", 58150);
        ekgiVar.i("parts.voice_metadata", 59470);
        ekgiVar.i("parts.validation_status", 58770);
        ekgiVar.i("parts.processing_id", 60080);
        ekgiVar.i("parts.rich_card_media_download_failure_reason", 60230);
        ekgiVar.i("parts.image_display_state", 60240);
        ekgiVar.i("parts.preserve_size", 60680);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_null_conversation_id");
        ekgiVar2.c();
        b = new cmai();
    }

    public static final cmap a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("scheduled_send._id");
            ekfwVar.h("scheduled_send.message_id");
            ekfwVar.h("scheduled_send.conversation_id");
            ekfwVar.h("scheduled_send.scheduled_time");
            ekfwVar.h("scheduled_send.status");
            if (numC.intValue() >= 58020) {
                ekfwVar.h("scheduled_send.creation_time");
            }
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.sender_id");
            if (numC.intValue() >= 54040) {
                ekfwVar.h("messages.sender_send_destination");
            }
            if (numC.intValue() >= 59340) {
                ekfwVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (numC.intValue() >= 54040) {
                ekfwVar.h("messages.receiving_network_country");
            }
            ekfwVar.h("messages.sent_timestamp");
            if (numC.intValue() >= 17030) {
                ekfwVar.h("messages.queue_insert_timestamp");
            }
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
            ekfwVar.h("messages.mms_transaction_id");
            ekfwVar.h("messages.mms_content_location");
            ekfwVar.h("messages.mms_expiry");
            if (numC.intValue() >= 59890) {
                ekfwVar.h("messages.rcs_expiry");
            }
            if (numC.intValue() >= 9030) {
                ekfwVar.h("messages.mms_retrieve_text");
            }
            ekfwVar.h("messages.raw_status");
            ekfwVar.h("messages.self_id");
            if (numC.intValue() >= 60160) {
                ekfwVar.h("messages.my_identity_foreign_key");
            }
            ekfwVar.h("messages.retry_start_timestamp");
            if (numC.intValue() >= 8500) {
                ekfwVar.h("messages.cloud_sync_id");
            }
            if (numC.intValue() >= 41040) {
                ekfwVar.h("messages.rcs_message_id_with_text_type");
            }
            if (numC.intValue() >= 29060) {
                ekfwVar.h("messages.etouffee_status");
            }
            if (numC.intValue() >= 29090) {
                ekfwVar.h("messages.verification_status");
            }
            if (numC.intValue() >= 39000) {
                ekfwVar.h("messages.rcs_ui_status");
            }
            if (numC.intValue() >= 30010) {
                ekfwVar.h("messages.is_hidden");
            }
            if (numC.intValue() >= 10002) {
                ekfwVar.h("messages.rcs_remote_instance");
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
            if (numC.intValue() >= 9010) {
                ekfwVar.h("messages.correlation_id");
            }
            if (numC.intValue() >= 31010) {
                ekfwVar.h("messages.cms_id");
            }
            if (numC.intValue() >= 37040) {
                ekfwVar.h("messages.cms_last_mod_seq");
            }
            if (numC.intValue() >= 19020) {
                ekfwVar.h("messages.web_id");
            }
            if (numC.intValue() >= 29100) {
                ekfwVar.h("messages.usage_stats_logging_id");
            }
            if (numC.intValue() >= 35030) {
                ekfwVar.h("messages.send_counter");
            }
            if (numC.intValue() >= 35030) {
                ekfwVar.h("messages.original_rcs_message_id");
            }
            if (numC.intValue() >= 60820) {
                ekfwVar.h("messages.raw_rcs_message_to_send");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("messages.custom_delivery_receipt_content");
            }
            if (numC.intValue() >= 37030) {
                ekfwVar.h("messages.report_attempt_acounter");
            }
            if (numC.intValue() >= 45020) {
                ekfwVar.h("messages.custom_headers");
            }
            if (numC.intValue() >= 46010) {
                ekfwVar.h("messages.cms_correlation_id");
            }
            if (numC.intValue() >= 48030) {
                ekfwVar.h("messages.group_private_participant");
            }
            if (numC.intValue() >= 48030) {
                ekfwVar.h("messages.original_message_id");
            }
            if (numC.intValue() >= 60950) {
                ekfwVar.h("messages.parent_message_id");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("messages.awaiting_reverse_sync");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("messages.old_sms_message_uri");
            }
            if (numC.intValue() >= 56000) {
                ekfwVar.h("messages.draft_id");
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
            if (numC.intValue() >= 58230) {
                ekfwVar.h("messages.auto_retry_counter");
            }
            if (numC.intValue() >= 58280) {
                ekfwVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (numC.intValue() >= 58680) {
                ekfwVar.h("messages.trace_id");
            }
            if (numC.intValue() >= 58720) {
                ekfwVar.h("messages.outgoing_delivery_report_status");
            }
            if (numC.intValue() >= 58720) {
                ekfwVar.h("messages.outgoing_read_report_status");
            }
            if (numC.intValue() >= 59310) {
                ekfwVar.h("messages.xms_transport");
            }
            if (numC.intValue() >= 59430) {
                ekfwVar.h("messages.message_original_protocol");
            }
            if (numC.intValue() >= 59490) {
                ekfwVar.h("messages.satellite_datagram_id");
            }
            if (numC.intValue() >= 60190) {
                ekfwVar.h("messages.encryption_protocol");
            }
            if (numC.intValue() >= 60370) {
                ekfwVar.h("messages.message_persistence_id");
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
                ekfwVar.h("parts.blob_gaia_email");
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
                ekfwVar.h("parts.media_send_type");
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
            ekfwVar.h("message_captions.caption");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new cmap(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
