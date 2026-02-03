package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhka {
    public static final String[] a = {"draft_parts_view._id_messages", "draft_parts_view.conversation_id_messages", "draft_parts_view.sender_participant_id_messages", "draft_parts_view.sender_send_destination_messages", "draft_parts_view.msisdn_receiving_rcs_message_messages", "draft_parts_view.receiving_network_country_messages", "draft_parts_view.sent_timestamp_messages", "draft_parts_view.queue_insert_timestamp_messages", "draft_parts_view.received_timestamp_messages", "draft_parts_view.protocol_messages", "draft_parts_view.status_messages", "draft_parts_view.message_report_status_messages", "draft_parts_view.notified_messages", "draft_parts_view.read_messages", "draft_parts_view.sms_message_uri_messages", "draft_parts_view.sms_priority_messages", "draft_parts_view.sms_message_size_messages", "draft_parts_view.mms_subject_messages", "draft_parts_view.mms_transaction_id_messages", "draft_parts_view.mms_content_location_messages", "draft_parts_view.mms_expiry_messages", "draft_parts_view.rcs_expiry_messages", "draft_parts_view.mms_retrieve_text_messages", "draft_parts_view.raw_telephony_status_messages", "draft_parts_view.self_id_messages", "draft_parts_view.my_identity_messages", "draft_parts_view.retry_start_timestamp_messages", "draft_parts_view.cloud_sync_id_messages", "draft_parts_view.rcs_message_id_messages", "draft_parts_view.rcs_encryption_status_messages", "draft_parts_view.verification_status_messages", "draft_parts_view.rcs_ui_status_messages", "draft_parts_view.is_hidden_messages", "draft_parts_view.rcs_remote_instance_messages", "draft_parts_view.rcs_file_transfer_session_id_messages", "draft_parts_view.sms_error_code_messages", "draft_parts_view.sms_error_desc_map_name_messages", "draft_parts_view.correlation_id_messages", "draft_parts_view.cms_id_messages", "draft_parts_view.cms_last_mod_seq_messages", "draft_parts_view.web_id_messages", "draft_parts_view.usage_stats_logging_id_messages", "draft_parts_view.send_counter_messages", "draft_parts_view.original_rcs_message_id_messages", "draft_parts_view.raw_rcs_message_to_send_messages", "draft_parts_view.custom_delivery_receipt_mime_type_messages", "draft_parts_view.custom_delivery_receipt_content_messages", "draft_parts_view.report_attempt_counter_messages", "draft_parts_view.custom_headers_messages", "draft_parts_view.cms_correlation_id_messages", "draft_parts_view.group_private_participant_messages", "draft_parts_view.original_message_id_messages", "draft_parts_view.parent_message_id_messages", "draft_parts_view.awaiting_reverse_sync_messages", "draft_parts_view.old_sms_message_uri_messages", "draft_parts_view.draft_id_messages", "draft_parts_view.result_code_messages", "draft_parts_view.cms_life_cycle_messages", "draft_parts_view.mute_priority_messages", "draft_parts_view.fallback_reason_messages", "draft_parts_view.auto_retry_counter_messages", "draft_parts_view.can_revoke_before_delivered_with_rcs_messages", "draft_parts_view.trace_id_messages", "draft_parts_view.outgoing_delivery_report_status_messages", "draft_parts_view.outgoing_read_report_status_messages", "draft_parts_view.xms_transport_messages", "draft_parts_view.original_protocol_messages", "draft_parts_view.satellite_datagram_id_messages", "draft_parts_view.encryption_protocol_messages", "draft_parts_view.message_persistence_id_messages", "draft_parts_view._id_parts", "draft_parts_view.message_id_parts", "draft_parts_view.text_parts", "draft_parts_view.raw_text_parts", "draft_parts_view.uri_parts", "draft_parts_view.content_type_parts", "draft_parts_view.original_uri_parts", "draft_parts_view.storage_uri_parts", "draft_parts_view.width_parts", "draft_parts_view.height_parts", "draft_parts_view.timestamp_parts", "draft_parts_view.processing_output_uri_parts", "draft_parts_view.target_size_parts", "draft_parts_view.processing_status_parts", "draft_parts_view.cms_attachment_processing_status_parts", "draft_parts_view.conversation_id_parts", "draft_parts_view.sticker_set_id_parts", "draft_parts_view.sticker_id_parts", "draft_parts_view.media_modified_timestamp_parts", "draft_parts_view.longitude_parts", "draft_parts_view.latitude_parts", "draft_parts_view.preview_content_uri_parts", "draft_parts_view.preview_content_type_parts", "draft_parts_view.fallback_uri_parts", "draft_parts_view.source_parts", "draft_parts_view.bundle_index_parts", "draft_parts_view.blob_id_parts", "draft_parts_view.blob_gaia_email_parts", "draft_parts_view.cms_full_size_blob_id_parts", "draft_parts_view.cms_media_encryption_key_parts", "draft_parts_view.cms_compressed_media_encryption_key_parts", "draft_parts_view.blob_upload_permanent_failure_parts", "draft_parts_view.blob_upload_timestamp_parts", "draft_parts_view.expressive_sticker_name_parts", "draft_parts_view.file_name_parts", "draft_parts_view.duration_parts", "draft_parts_view.compressed_blob_id_parts", "draft_parts_view.cms_compressed_blob_id_parts", "draft_parts_view.compressed_blob_upload_permanent_failure_parts", "draft_parts_view.compressed_blob_upload_timestamp_parts", "draft_parts_view.media_encryption_key_parts", "draft_parts_view.compressed_media_encryption_key_parts", "draft_parts_view.missing_entry_in_telephony_parts", "draft_parts_view.awaiting_reverse_sync_parts", "draft_parts_view.file_size_bytes_parts", "draft_parts_view.local_cache_path_parts", "draft_parts_view.media_send_type_parts", "draft_parts_view.voice_metadata_parts", "draft_parts_view.validation_status_parts", "draft_parts_view.processing_id_parts", "draft_parts_view.rich_card_media_download_failure_reason_parts", "draft_parts_view.image_display_state_parts", "draft_parts_view.preserve_size_parts"};

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("draft_parts_view.sender_send_destination_messages", 54040);
        ekgiVar.i("draft_parts_view.msisdn_receiving_rcs_message_messages", 59340);
        ekgiVar.i("draft_parts_view.receiving_network_country_messages", 54040);
        ekgiVar.i("draft_parts_view.queue_insert_timestamp_messages", 17030);
        ekgiVar.i("draft_parts_view.message_report_status_messages", 13020);
        ekgiVar.i("draft_parts_view.rcs_expiry_messages", 59890);
        ekgiVar.i("draft_parts_view.mms_retrieve_text_messages", 9030);
        ekgiVar.i("draft_parts_view.my_identity_messages", 60160);
        ekgiVar.i("draft_parts_view.cloud_sync_id_messages", 8500);
        ekgiVar.i("draft_parts_view.rcs_message_id_messages", 41040);
        ekgiVar.i("draft_parts_view.rcs_encryption_status_messages", 29060);
        ekgiVar.i("draft_parts_view.verification_status_messages", 29090);
        ekgiVar.i("draft_parts_view.rcs_ui_status_messages", 39000);
        ekgiVar.i("draft_parts_view.is_hidden_messages", 30010);
        ekgiVar.i("draft_parts_view.rcs_remote_instance_messages", 10002);
        ekgiVar.i("draft_parts_view.rcs_file_transfer_session_id_messages", 10004);
        ekgiVar.i("draft_parts_view.sms_error_code_messages", 9000);
        ekgiVar.i("draft_parts_view.sms_error_desc_map_name_messages", 9000);
        ekgiVar.i("draft_parts_view.correlation_id_messages", 9010);
        ekgiVar.i("draft_parts_view.cms_id_messages", 31010);
        ekgiVar.i("draft_parts_view.cms_last_mod_seq_messages", 37040);
        ekgiVar.i("draft_parts_view.web_id_messages", 19020);
        ekgiVar.i("draft_parts_view.usage_stats_logging_id_messages", 29100);
        ekgiVar.i("draft_parts_view.send_counter_messages", 35030);
        ekgiVar.i("draft_parts_view.original_rcs_message_id_messages", 35030);
        ekgiVar.i("draft_parts_view.raw_rcs_message_to_send_messages", 60820);
        ekgiVar.i("draft_parts_view.custom_delivery_receipt_mime_type_messages", 37020);
        ekgiVar.i("draft_parts_view.custom_delivery_receipt_content_messages", 37020);
        ekgiVar.i("draft_parts_view.report_attempt_counter_messages", 37030);
        ekgiVar.i("draft_parts_view.custom_headers_messages", 45020);
        ekgiVar.i("draft_parts_view.cms_correlation_id_messages", 46010);
        ekgiVar.i("draft_parts_view.group_private_participant_messages", 48030);
        ekgiVar.i("draft_parts_view.original_message_id_messages", 48030);
        ekgiVar.i("draft_parts_view.parent_message_id_messages", 60950);
        ekgiVar.i("draft_parts_view.awaiting_reverse_sync_messages", 49060);
        ekgiVar.i("draft_parts_view.old_sms_message_uri_messages", 49060);
        ekgiVar.i("draft_parts_view.draft_id_messages", 56000);
        ekgiVar.i("draft_parts_view.result_code_messages", 58040);
        ekgiVar.i("draft_parts_view.cms_life_cycle_messages", 58210);
        ekgiVar.i("draft_parts_view.mute_priority_messages", 60750);
        ekgiVar.i("draft_parts_view.fallback_reason_messages", 58710);
        ekgiVar.i("draft_parts_view.auto_retry_counter_messages", 58230);
        ekgiVar.i("draft_parts_view.can_revoke_before_delivered_with_rcs_messages", 58280);
        ekgiVar.i("draft_parts_view.trace_id_messages", 58680);
        ekgiVar.i("draft_parts_view.outgoing_delivery_report_status_messages", 58720);
        ekgiVar.i("draft_parts_view.outgoing_read_report_status_messages", 58720);
        ekgiVar.i("draft_parts_view.xms_transport_messages", 59310);
        ekgiVar.i("draft_parts_view.original_protocol_messages", 59430);
        ekgiVar.i("draft_parts_view.satellite_datagram_id_messages", 59490);
        ekgiVar.i("draft_parts_view.encryption_protocol_messages", 60190);
        ekgiVar.i("draft_parts_view.message_persistence_id_messages", 60370);
        ekgiVar.i("draft_parts_view.raw_text_parts", 60990);
        ekgiVar.i("draft_parts_view.original_uri_parts", 10021);
        ekgiVar.i("draft_parts_view.storage_uri_parts", 29060);
        ekgiVar.i("draft_parts_view.timestamp_parts", 3010);
        ekgiVar.i("draft_parts_view.processing_output_uri_parts", 4020);
        ekgiVar.i("draft_parts_view.target_size_parts", 4020);
        ekgiVar.i("draft_parts_view.processing_status_parts", 4020);
        ekgiVar.i("draft_parts_view.cms_attachment_processing_status_parts", 44010);
        ekgiVar.i("draft_parts_view.sticker_set_id_parts", 5020);
        ekgiVar.i("draft_parts_view.sticker_id_parts", 5020);
        ekgiVar.i("draft_parts_view.media_modified_timestamp_parts", 7000);
        ekgiVar.i("draft_parts_view.longitude_parts", 10005);
        ekgiVar.i("draft_parts_view.latitude_parts", 10005);
        ekgiVar.i("draft_parts_view.preview_content_uri_parts", 10017);
        ekgiVar.i("draft_parts_view.preview_content_type_parts", 10017);
        ekgiVar.i("draft_parts_view.fallback_uri_parts", 13000);
        ekgiVar.i("draft_parts_view.source_parts", 14010);
        ekgiVar.i("draft_parts_view.bundle_index_parts", 17010);
        ekgiVar.i("draft_parts_view.blob_id_parts", 17020);
        ekgiVar.i("draft_parts_view.blob_gaia_email_parts", 59570);
        ekgiVar.i("draft_parts_view.cms_full_size_blob_id_parts", 40040);
        ekgiVar.i("draft_parts_view.cms_media_encryption_key_parts", 42010);
        ekgiVar.i("draft_parts_view.cms_compressed_media_encryption_key_parts", 42070);
        ekgiVar.i("draft_parts_view.blob_upload_permanent_failure_parts", 18000);
        ekgiVar.i("draft_parts_view.blob_upload_timestamp_parts", 19030);
        ekgiVar.i("draft_parts_view.expressive_sticker_name_parts", 22060);
        ekgiVar.i("draft_parts_view.file_name_parts", 26000);
        ekgiVar.i("draft_parts_view.duration_parts", 26040);
        ekgiVar.i("draft_parts_view.compressed_blob_id_parts", 27000);
        ekgiVar.i("draft_parts_view.cms_compressed_blob_id_parts", 40040);
        ekgiVar.i("draft_parts_view.compressed_blob_upload_permanent_failure_parts", 27000);
        ekgiVar.i("draft_parts_view.compressed_blob_upload_timestamp_parts", 27000);
        ekgiVar.i("draft_parts_view.media_encryption_key_parts", 30040);
        ekgiVar.i("draft_parts_view.compressed_media_encryption_key_parts", 30040);
        ekgiVar.i("draft_parts_view.missing_entry_in_telephony_parts", 52030);
        ekgiVar.i("draft_parts_view.awaiting_reverse_sync_parts", 53040);
        ekgiVar.i("draft_parts_view.file_size_bytes_parts", 52050);
        ekgiVar.i("draft_parts_view.local_cache_path_parts", 52050);
        ekgiVar.i("draft_parts_view.media_send_type_parts", 58150);
        ekgiVar.i("draft_parts_view.voice_metadata_parts", 59470);
        ekgiVar.i("draft_parts_view.validation_status_parts", 58770);
        ekgiVar.i("draft_parts_view.processing_id_parts", 60080);
        ekgiVar.i("draft_parts_view.rich_card_media_download_failure_reason_parts", 60230);
        ekgiVar.i("draft_parts_view.image_display_state_parts", 60240);
        ekgiVar.i("draft_parts_view.preserve_size_parts", 60680);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("_id", "index_unsent_rcs_report");
        ekgiVar2.i("sender_id", "index_null_sender_id");
        ekgiVar2.i("sent_timestamp", "index_null_sent_timestamp");
        ekgiVar2.i("read", "index_messages_read_0");
        ekgiVar2.i("sms_message_uri", "index_null_sms_message_uri");
        ekgiVar2.i("rcs_expiry", "index_null_rcs_expiry");
        ekgiVar2.i("self_id", "index_null_self_id");
        ekgiVar2.i("my_identity", "index_null_my_identity");
        ekgiVar2.i("my_identity_foreign_key", "index_null_my_identity_foreign_key");
        ekgiVar2.i("cloud_sync_id", "index_null_cloud_sync_id");
        ekgiVar2.i(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        ekgiVar2.i("cms_id", "index_null_cms_id");
        ekgiVar2.i("web_id", "index_null_web_id");
        ekgiVar2.i("original_rcs_message_id", "index_null_original_rcs_message_id");
        ekgiVar2.i("cms_correlation_id", "index_null_cms_correlation_id");
        ekgiVar2.i("group_private_participant", "index_null_group_private_participant");
        ekgiVar2.i("original_message_id", "index_null_original_message_id");
        ekgiVar2.i("parent_message_id", "index_null_parent_message_id");
        ekgiVar2.i("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        ekgiVar2.i("draft_id", "index_null_draft_id");
        ekgiVar2.i("satellite_datagram_id", "index_null_satellite_datagram_id");
        ekgiVar2.i("message_persistence_id", "index_null_message_persistence_id");
        ekgiVar2.c();
        dqpr dqprVarM = dqpt.m();
        dqprVarM.m(2);
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.b("draft_parts_view._id_messages");
        dqprVarM.i(-1);
        dqprVarM.c(new Supplier() { // from class: bhaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM.j(new dqps() { // from class: bhan
        });
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqprVarM2.m(1);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqprVarM2.h(new Supplier() { // from class: bhdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM2.b("draft_parts_view.conversation_id_messages");
        dqprVarM2.i(-1);
        dqprVarM2.c(new Supplier() { // from class: bhdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM2.j(new dqps() { // from class: bhef
        });
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqprVarM3.m(1);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqprVarM3.h(new Supplier() { // from class: bhet
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM3.b("draft_parts_view.sender_participant_id_messages");
        dqprVarM3.i(-1);
        dqprVarM3.c(new Supplier() { // from class: bhff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM3.j(new dqps() { // from class: bhfr
        });
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqprVarM4.m(4);
        dqprVarM4.b("draft_parts_view.sender_send_destination_messages");
        dqprVarM4.i(54040);
        dqprVarM4.c(new Supplier() { // from class: bhgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM4.j(new dqps() { // from class: bhgp
        });
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqprVarM5.m(4);
        dqprVarM5.b("draft_parts_view.msisdn_receiving_rcs_message_messages");
        dqprVarM5.i(59340);
        dqprVarM5.c(new Supplier() { // from class: bhaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM5.j(new dqps() { // from class: bhfo
        });
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqprVarM6.m(4);
        dqprVarM6.b("draft_parts_view.receiving_network_country_messages");
        dqprVarM6.i(54040);
        dqprVarM6.c(new Supplier() { // from class: bhgz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM6.j(new dqps() { // from class: bhhl
        });
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqprVarM7.m(1);
        dqprVarM7.d(true);
        dqprVarM7.b("draft_parts_view.sent_timestamp_messages");
        dqprVarM7.i(-1);
        dqprVarM7.c(new Supplier() { // from class: bhhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM7.j(new dqps() { // from class: bhij
        });
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqprVarM8.m(1);
        dqprVarM8.b("draft_parts_view.queue_insert_timestamp_messages");
        dqprVarM8.i(17030);
        dqprVarM8.c(new Supplier() { // from class: bhiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM8.j(new dqps() { // from class: bhjh
        });
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqprVarM9.m(1);
        dqprVarM9.d(true);
        dqprVarM9.b("draft_parts_view.received_timestamp_messages");
        dqprVarM9.i(-1);
        dqprVarM9.c(new Supplier() { // from class: bhjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM9.j(new dqps() { // from class: bham
        });
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqprVarM10.m(1);
        dqprVarM10.b("draft_parts_view.protocol_messages");
        dqprVarM10.i(-1);
        dqprVarM10.c(new Supplier() { // from class: bhaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM10.j(new dqps() { // from class: bhbl
        });
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqprVarM11.m(1);
        dqprVarM11.d(true);
        dqprVarM11.b("draft_parts_view.status_messages");
        dqprVarM11.i(-1);
        dqprVarM11.c(new Supplier() { // from class: bhbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM11.j(new dqps() { // from class: bhcj
        });
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqprVarM12.m(1);
        dqprVarM12.b("draft_parts_view.message_report_status_messages");
        dqprVarM12.i(13020);
        dqprVarM12.c(new Supplier() { // from class: bhcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM12.j(new dqps() { // from class: bhdc
        });
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqprVarM13.m(1);
        dqprVarM13.d(true);
        dqprVarM13.b("draft_parts_view.notified_messages");
        dqprVarM13.f(true);
        dqprVarM13.i(-1);
        dqprVarM13.c(new Supplier() { // from class: bhdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM13.j(new dqps() { // from class: bhde
        });
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqprVarM14.m(1);
        dqprVarM14.d(true);
        dqprVarM14.b("draft_parts_view.read_messages");
        dqprVarM14.i(-1);
        dqprVarM14.c(new Supplier() { // from class: bhdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM14.j(new dqps() { // from class: bhdg
        });
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqprVarM15.m(4);
        dqprVarM15.d(true);
        dqprVarM15.b("draft_parts_view.sms_message_uri_messages");
        dqprVarM15.i(-1);
        dqprVarM15.c(new Supplier() { // from class: bhdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM15.j(new dqps() { // from class: bhdj
        });
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqprVarM16.m(1);
        dqprVarM16.b("draft_parts_view.sms_priority_messages");
        dqprVarM16.i(-1);
        dqprVarM16.c(new Supplier() { // from class: bhdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM16.j(new dqps() { // from class: bhdm
        });
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqprVarM17.m(1);
        dqprVarM17.b("draft_parts_view.sms_message_size_messages");
        dqprVarM17.i(-1);
        dqprVarM17.c(new Supplier() { // from class: bhdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM17.j(new dqps() { // from class: bhdo
        });
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqprVarM18.m(4);
        dqprVarM18.b("draft_parts_view.mms_subject_messages");
        dqprVarM18.i(-1);
        dqprVarM18.c(new Supplier() { // from class: bhdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM18.j(new dqps() { // from class: bhdq
        });
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqprVarM19.m(4);
        dqprVarM19.b("draft_parts_view.mms_transaction_id_messages");
        dqprVarM19.i(-1);
        dqprVarM19.c(new Supplier() { // from class: bhdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM19.j(new dqps() { // from class: bhds
        });
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqprVarM20.m(4);
        dqprVarM20.b("draft_parts_view.mms_content_location_messages");
        dqprVarM20.i(-1);
        dqprVarM20.c(new Supplier() { // from class: bhdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM20.j(new dqps() { // from class: bhdw
        });
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqprVarM21.m(1);
        dqprVarM21.b("draft_parts_view.mms_expiry_messages");
        dqprVarM21.i(-1);
        dqprVarM21.c(new Supplier() { // from class: bhdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM21.j(new dqps() { // from class: bhdy
        });
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqprVarM22.m(1);
        dqprVarM22.d(true);
        dqprVarM22.b("draft_parts_view.rcs_expiry_messages");
        dqprVarM22.i(59890);
        dqprVarM22.c(new Supplier() { // from class: bhdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM22.j(new dqps() { // from class: bhea
        });
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqprVarM23.m(4);
        dqprVarM23.b("draft_parts_view.mms_retrieve_text_messages");
        dqprVarM23.i(9030);
        dqprVarM23.c(new Supplier() { // from class: bheb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM23.j(new dqps() { // from class: bhec
        });
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqprVarM24.m(1);
        dqprVarM24.b("draft_parts_view.raw_telephony_status_messages");
        dqprVarM24.i(-1);
        dqprVarM24.c(new Supplier() { // from class: bhed
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM24.j(new dqps() { // from class: bhee
        });
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqprVarM25.m(1);
        dqprVarM25.d(true);
        dqprVarM25.e(true);
        dqprVarM25.h(new Supplier() { // from class: bhei
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM25.b("draft_parts_view.self_id_messages");
        dqprVarM25.i(-1);
        dqprVarM25.c(new Supplier() { // from class: bhej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM25.j(new dqps() { // from class: bhek
        });
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqprVarM26.m(4);
        dqprVarM26.d(true);
        dqprVarM26.e(true);
        dqprVarM26.h(new Supplier() { // from class: bhel
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM26.b("draft_parts_view.my_identity_messages");
        dqprVarM26.i(60160);
        dqprVarM26.c(new Supplier() { // from class: bhem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM26.j(new dqps() { // from class: bhen
        });
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqprVarM27.m(1);
        dqprVarM27.b("draft_parts_view.retry_start_timestamp_messages");
        dqprVarM27.i(-1);
        dqprVarM27.c(new Supplier() { // from class: bheo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM27.j(new dqps() { // from class: bhep
        });
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqprVarM28.m(4);
        dqprVarM28.d(true);
        dqprVarM28.b("draft_parts_view.cloud_sync_id_messages");
        dqprVarM28.i(8500);
        dqprVarM28.c(new Supplier() { // from class: bheq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM28.j(new dqps() { // from class: bher
        });
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqprVarM29.m(4);
        dqprVarM29.d(true);
        dqprVarM29.b("draft_parts_view.rcs_message_id_messages");
        dqprVarM29.f(true);
        dqprVarM29.i(41040);
        dqprVarM29.c(new Supplier() { // from class: bheu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM29.j(new dqps() { // from class: bhev
        });
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqprVarM30.m(1);
        dqprVarM30.b("draft_parts_view.rcs_encryption_status_messages");
        dqprVarM30.i(29060);
        dqprVarM30.c(new Supplier() { // from class: bhew
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM30.j(new dqps() { // from class: bhex
        });
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqprVarM31.m(1);
        dqprVarM31.b("draft_parts_view.verification_status_messages");
        dqprVarM31.i(29090);
        dqprVarM31.c(new Supplier() { // from class: bhey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM31.j(new dqps() { // from class: bhez
        });
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqprVarM32.m(1);
        dqprVarM32.b("draft_parts_view.rcs_ui_status_messages");
        dqprVarM32.i(39000);
        dqprVarM32.c(new Supplier() { // from class: bhfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM32.j(new dqps() { // from class: bhfb
        });
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqprVarM33.m(1);
        dqprVarM33.d(true);
        dqprVarM33.b("draft_parts_view.is_hidden_messages");
        dqprVarM33.i(30010);
        dqprVarM33.c(new Supplier() { // from class: bhfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM33.j(new dqps() { // from class: bhfe
        });
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqprVarM34.m(7);
        dqprVarM34.b("draft_parts_view.rcs_remote_instance_messages");
        dqprVarM34.i(10002);
        dqprVarM34.c(new Supplier() { // from class: bhfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM34.j(new dqps() { // from class: bhfh
        });
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqprVarM35.m(1);
        dqprVarM35.b("draft_parts_view.rcs_file_transfer_session_id_messages");
        dqprVarM35.i(10004);
        dqprVarM35.c(new Supplier() { // from class: bhfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM35.j(new dqps() { // from class: bhfj
        });
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqprVarM36.m(1);
        dqprVarM36.b("draft_parts_view.sms_error_code_messages");
        dqprVarM36.i(9000);
        dqprVarM36.c(new Supplier() { // from class: bhfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM36.j(new dqps() { // from class: bhfl
        });
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqprVarM37.m(4);
        dqprVarM37.b("draft_parts_view.sms_error_desc_map_name_messages");
        dqprVarM37.i(9000);
        dqprVarM37.c(new Supplier() { // from class: bhfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM37.j(new dqps() { // from class: bhfn
        });
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqprVarM38.m(4);
        dqprVarM38.b("draft_parts_view.correlation_id_messages");
        dqprVarM38.i(9010);
        dqprVarM38.c(new Supplier() { // from class: bhfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM38.j(new dqps() { // from class: bhfq
        });
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqprVarM39.m(4);
        dqprVarM39.l(true);
        dqprVarM39.d(true);
        dqprVarM39.b("draft_parts_view.cms_id_messages");
        dqprVarM39.f(true);
        dqprVarM39.i(31010);
        dqprVarM39.c(new Supplier() { // from class: bhfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM39.j(new dqps() { // from class: bhft
        });
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqprVarM40.m(2);
        dqprVarM40.b("draft_parts_view.cms_last_mod_seq_messages");
        dqprVarM40.i(37040);
        dqprVarM40.c(new Supplier() { // from class: bhfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM40.j(new dqps() { // from class: bhfv
        });
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqprVarM41.m(4);
        dqprVarM41.d(true);
        dqprVarM41.b("draft_parts_view.web_id_messages");
        dqprVarM41.i(19020);
        dqprVarM41.c(new Supplier() { // from class: bhfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM41.j(new dqps() { // from class: bhfx
        });
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqprVarM42.m(1);
        dqprVarM42.b("draft_parts_view.usage_stats_logging_id_messages");
        dqprVarM42.i(29100);
        dqprVarM42.c(new Supplier() { // from class: bhfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM42.j(new dqps() { // from class: bhga
        });
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqprVarM43.m(1);
        dqprVarM43.b("draft_parts_view.send_counter_messages");
        dqprVarM43.i(35030);
        dqprVarM43.c(new Supplier() { // from class: bhgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM43.j(new dqps() { // from class: bhgc
        });
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqprVarM44.m(4);
        dqprVarM44.d(true);
        dqprVarM44.b("draft_parts_view.original_rcs_message_id_messages");
        dqprVarM44.i(35030);
        dqprVarM44.c(new Supplier() { // from class: bhge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM44.j(new dqps() { // from class: bhgf
        });
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqprVarM45.m(5);
        dqprVarM45.b("draft_parts_view.raw_rcs_message_to_send_messages");
        dqprVarM45.i(60820);
        dqprVarM45.c(new Supplier() { // from class: bhgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM45.j(new dqps() { // from class: bhgh
        });
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqprVarM46.m(4);
        dqprVarM46.b("draft_parts_view.custom_delivery_receipt_mime_type_messages");
        dqprVarM46.i(37020);
        dqprVarM46.c(new Supplier() { // from class: bhgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM46.j(new dqps() { // from class: bhgj
        });
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqprVarM47.m(5);
        dqprVarM47.b("draft_parts_view.custom_delivery_receipt_content_messages");
        dqprVarM47.i(37020);
        dqprVarM47.c(new Supplier() { // from class: bhgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM47.j(new dqps() { // from class: bhgm
        });
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqprVarM48.m(1);
        dqprVarM48.b("draft_parts_view.report_attempt_counter_messages");
        dqprVarM48.i(37030);
        dqprVarM48.c(new Supplier() { // from class: bhgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM48.j(new dqps() { // from class: bhgo
        });
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqprVarM49.m(5);
        dqprVarM49.b("draft_parts_view.custom_headers_messages");
        dqprVarM49.i(45020);
        dqprVarM49.c(new Supplier() { // from class: bheh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM49.j(new dqps() { // from class: bhgv
        });
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqprVarM50.m(4);
        dqprVarM50.l(true);
        dqprVarM50.d(true);
        dqprVarM50.b("draft_parts_view.cms_correlation_id_messages");
        dqprVarM50.f(true);
        dqprVarM50.i(46010);
        dqprVarM50.c(new Supplier() { // from class: bhhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM50.j(new dqps() { // from class: bhhr
        });
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqprVarM51.m(1);
        dqprVarM51.d(true);
        dqprVarM51.e(true);
        dqprVarM51.h(new Supplier() { // from class: bhic
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM51.b("draft_parts_view.group_private_participant_messages");
        dqprVarM51.i(48030);
        dqprVarM51.c(new Supplier() { // from class: bhin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM51.j(new dqps() { // from class: bhiy
        });
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqprVarM52.m(1);
        dqprVarM52.d(true);
        dqprVarM52.e(true);
        dqprVarM52.h(new Supplier() { // from class: bhjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM52.b("draft_parts_view.original_message_id_messages");
        dqprVarM52.i(48030);
        dqprVarM52.c(new Supplier() { // from class: bhju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM52.j(new dqps() { // from class: bhal
        });
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqprVarM53.m(2);
        dqprVarM53.d(true);
        dqprVarM53.e(true);
        dqprVarM53.h(new Supplier() { // from class: bhbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM53.b("draft_parts_view.parent_message_id_messages");
        dqprVarM53.i(60950);
        dqprVarM53.c(new Supplier() { // from class: bhbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM53.j(new dqps() { // from class: bhcd
        });
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqprVarM54.m(1);
        dqprVarM54.b("draft_parts_view.awaiting_reverse_sync_messages");
        dqprVarM54.i(49060);
        dqprVarM54.c(new Supplier() { // from class: bhco
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM54.j(new dqps() { // from class: bhcz
        });
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqprVarM55.m(4);
        dqprVarM55.b("draft_parts_view.old_sms_message_uri_messages");
        dqprVarM55.i(49060);
        dqprVarM55.c(new Supplier() { // from class: bhdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM55.j(new dqps() { // from class: bhdv
        });
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqprVarM56.m(4);
        dqprVarM56.l(true);
        dqprVarM56.d(true);
        dqprVarM56.b("draft_parts_view.draft_id_messages");
        dqprVarM56.f(true);
        dqprVarM56.i(56000);
        dqprVarM56.c(new Supplier() { // from class: bheg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM56.j(new dqps() { // from class: bhes
        });
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqprVarM57.m(1);
        dqprVarM57.b("draft_parts_view.result_code_messages");
        dqprVarM57.i(58040);
        dqprVarM57.c(new Supplier() { // from class: bhfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM57.j(new dqps() { // from class: bhfz
        });
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqprVarM58.m(1);
        dqprVarM58.b("draft_parts_view.cms_life_cycle_messages");
        dqprVarM58.i(58210);
        dqprVarM58.c(new Supplier() { // from class: bhgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM58.j(new dqps() { // from class: bhgq
        });
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqprVarM59.m(1);
        dqprVarM59.b("draft_parts_view.mute_priority_messages");
        dqprVarM59.i(60750);
        dqprVarM59.c(new Supplier() { // from class: bhgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM59.j(new dqps() { // from class: bhgs
        });
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqprVarM60.m(1);
        dqprVarM60.b("draft_parts_view.fallback_reason_messages");
        dqprVarM60.i(58710);
        dqprVarM60.c(new Supplier() { // from class: bhgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM60.j(new dqps() { // from class: bhgu
        });
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqprVarM61.m(1);
        dqprVarM61.b("draft_parts_view.auto_retry_counter_messages");
        dqprVarM61.i(58230);
        dqprVarM61.c(new Supplier() { // from class: bhgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM61.j(new dqps() { // from class: bhgx
        });
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqprVarM62.m(2);
        dqprVarM62.b("draft_parts_view.can_revoke_before_delivered_with_rcs_messages");
        dqprVarM62.i(58280);
        dqprVarM62.c(new Supplier() { // from class: bhgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM62.j(new dqps() { // from class: bhha
        });
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqprVarM63.m(5);
        dqprVarM63.b("draft_parts_view.trace_id_messages");
        dqprVarM63.i(58680);
        dqprVarM63.c(new Supplier() { // from class: bhhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM63.j(new dqps() { // from class: bhhc
        });
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqprVarM64.m(1);
        dqprVarM64.b("draft_parts_view.outgoing_delivery_report_status_messages");
        dqprVarM64.i(58720);
        dqprVarM64.c(new Supplier() { // from class: bhhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM64.j(new dqps() { // from class: bhhe
        });
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqprVarM65.m(1);
        dqprVarM65.b("draft_parts_view.outgoing_read_report_status_messages");
        dqprVarM65.i(58720);
        dqprVarM65.c(new Supplier() { // from class: bhhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM65.j(new dqps() { // from class: bhhh
        });
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqprVarM66.m(1);
        dqprVarM66.b("draft_parts_view.xms_transport_messages");
        dqprVarM66.i(59310);
        dqprVarM66.c(new Supplier() { // from class: bhhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM66.j(new dqps() { // from class: bhhj
        });
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqprVarM67.m(1);
        dqprVarM67.b("draft_parts_view.original_protocol_messages");
        dqprVarM67.i(59430);
        dqprVarM67.c(new Supplier() { // from class: bhhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM67.j(new dqps() { // from class: bhhm
        });
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqprVarM68.m(4);
        dqprVarM68.l(true);
        dqprVarM68.d(true);
        dqprVarM68.b("draft_parts_view.satellite_datagram_id_messages");
        dqprVarM68.f(true);
        dqprVarM68.i(59490);
        dqprVarM68.c(new Supplier() { // from class: bhhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM68.j(new dqps() { // from class: bhho
        });
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqprVarM69.m(1);
        dqprVarM69.b("draft_parts_view.encryption_protocol_messages");
        dqprVarM69.i(60190);
        dqprVarM69.c(new Supplier() { // from class: bhhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM69.j(new dqps() { // from class: bhhq
        });
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqprVarM70.m(4);
        dqprVarM70.l(true);
        dqprVarM70.d(true);
        dqprVarM70.b("draft_parts_view.message_persistence_id_messages");
        dqprVarM70.f(true);
        dqprVarM70.i(60370);
        dqprVarM70.c(new Supplier() { // from class: bhhs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM70.j(new dqps() { // from class: bhht
        });
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqprVarM71.m(2);
        dqprVarM71.l(true);
        dqprVarM71.g(true);
        dqprVarM71.d(true);
        dqprVarM71.b("draft_parts_view._id_parts");
        dqprVarM71.i(-1);
        dqprVarM71.c(new Supplier() { // from class: bhhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM71.j(new dqps() { // from class: bhhv
        });
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqprVarM72.m(1);
        dqprVarM72.d(true);
        dqprVarM72.e(true);
        dqprVarM72.h(new Supplier() { // from class: bhhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM72.b("draft_parts_view.message_id_parts");
        dqprVarM72.i(-1);
        dqprVarM72.c(new Supplier() { // from class: bhhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM72.j(new dqps() { // from class: bhhz
        });
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqprVarM73.m(4);
        dqprVarM73.b("draft_parts_view.text_parts");
        dqprVarM73.i(-1);
        dqprVarM73.c(new Supplier() { // from class: bhia
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM73.j(new dqps() { // from class: bhib
        });
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqprVarM74.m(4);
        dqprVarM74.b("draft_parts_view.raw_text_parts");
        dqprVarM74.i(60990);
        dqprVarM74.c(new Supplier() { // from class: bhid
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM74.j(new dqps() { // from class: bhie
        });
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqprVarM75.m(4);
        dqprVarM75.b("draft_parts_view.uri_parts");
        dqprVarM75.i(-1);
        dqprVarM75.c(new Supplier() { // from class: bhif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM75.j(new dqps() { // from class: bhig
        });
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqprVarM76.m(4);
        dqprVarM76.d(true);
        dqprVarM76.b("draft_parts_view.content_type_parts");
        dqprVarM76.i(-1);
        dqprVarM76.c(new Supplier() { // from class: bhih
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM76.j(new dqps() { // from class: bhii
        });
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqprVarM77.m(4);
        dqprVarM77.b("draft_parts_view.original_uri_parts");
        dqprVarM77.i(10021);
        dqprVarM77.c(new Supplier() { // from class: bhik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM77.j(new dqps() { // from class: bhil
        });
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqprVarM78.m(4);
        dqprVarM78.b("draft_parts_view.storage_uri_parts");
        dqprVarM78.i(29060);
        dqprVarM78.c(new Supplier() { // from class: bhim
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM78.j(new dqps() { // from class: bhio
        });
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqprVarM79.m(1);
        dqprVarM79.b("draft_parts_view.width_parts");
        dqprVarM79.i(-1);
        dqprVarM79.c(new Supplier() { // from class: bhip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM79.j(new dqps() { // from class: bhiq
        });
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqprVarM80.m(1);
        dqprVarM80.b("draft_parts_view.height_parts");
        dqprVarM80.i(-1);
        dqprVarM80.c(new Supplier() { // from class: bhir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM80.j(new dqps() { // from class: bhis
        });
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqprVarM81.m(1);
        dqprVarM81.b("draft_parts_view.timestamp_parts");
        dqprVarM81.i(3010);
        dqprVarM81.c(new Supplier() { // from class: bhit
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM81.j(new dqps() { // from class: bhiu
        });
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqprVarM82.m(4);
        dqprVarM82.d(true);
        dqprVarM82.b("draft_parts_view.processing_output_uri_parts");
        dqprVarM82.i(4020);
        dqprVarM82.c(new Supplier() { // from class: bhiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM82.j(new dqps() { // from class: bhix
        });
        dqprVarM82.a();
        dqpr dqprVarM83 = dqpt.m();
        dqprVarM83.m(1);
        dqprVarM83.b("draft_parts_view.target_size_parts");
        dqprVarM83.i(4020);
        dqprVarM83.c(new Supplier() { // from class: bhiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM83.j(new dqps() { // from class: bhja
        });
        dqprVarM83.a();
        dqpr dqprVarM84 = dqpt.m();
        dqprVarM84.m(1);
        dqprVarM84.b("draft_parts_view.processing_status_parts");
        dqprVarM84.i(4020);
        dqprVarM84.c(new Supplier() { // from class: bhjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM84.j(new dqps() { // from class: bhjc
        });
        dqprVarM84.a();
        dqpr dqprVarM85 = dqpt.m();
        dqprVarM85.m(1);
        dqprVarM85.b("draft_parts_view.cms_attachment_processing_status_parts");
        dqprVarM85.i(44010);
        dqprVarM85.c(new Supplier() { // from class: bhjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM85.j(new dqps() { // from class: bhje
        });
        dqprVarM85.a();
        dqpr dqprVarM86 = dqpt.m();
        dqprVarM86.m(1);
        dqprVarM86.k(true);
        dqprVarM86.d(true);
        dqprVarM86.e(true);
        dqprVarM86.h(new Supplier() { // from class: bhjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM86.b("draft_parts_view.conversation_id_parts");
        dqprVarM86.i(-1);
        dqprVarM86.c(new Supplier() { // from class: bhjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM86.j(new dqps() { // from class: bhji
        });
        dqprVarM86.a();
        dqpr dqprVarM87 = dqpt.m();
        dqprVarM87.m(1);
        dqprVarM87.b("draft_parts_view.sticker_set_id_parts");
        dqprVarM87.i(5020);
        dqprVarM87.c(new Supplier() { // from class: bhjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM87.j(new dqps() { // from class: bhjl
        });
        dqprVarM87.a();
        dqpr dqprVarM88 = dqpt.m();
        dqprVarM88.m(1);
        dqprVarM88.b("draft_parts_view.sticker_id_parts");
        dqprVarM88.i(5020);
        dqprVarM88.c(new Supplier() { // from class: bhjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM88.j(new dqps() { // from class: bhjn
        });
        dqprVarM88.a();
        dqpr dqprVarM89 = dqpt.m();
        dqprVarM89.m(1);
        dqprVarM89.b("draft_parts_view.media_modified_timestamp_parts");
        dqprVarM89.i(7000);
        dqprVarM89.c(new Supplier() { // from class: bhjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM89.j(new dqps() { // from class: bhjp
        });
        dqprVarM89.a();
        dqpr dqprVarM90 = dqpt.m();
        dqprVarM90.m(3);
        dqprVarM90.b("draft_parts_view.longitude_parts");
        dqprVarM90.i(10005);
        dqprVarM90.c(new Supplier() { // from class: bhjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM90.j(new dqps() { // from class: bhjr
        });
        dqprVarM90.a();
        dqpr dqprVarM91 = dqpt.m();
        dqprVarM91.m(3);
        dqprVarM91.b("draft_parts_view.latitude_parts");
        dqprVarM91.i(10005);
        dqprVarM91.c(new Supplier() { // from class: bhjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM91.j(new dqps() { // from class: bhab
        });
        dqprVarM91.a();
        dqpr dqprVarM92 = dqpt.m();
        dqprVarM92.m(4);
        dqprVarM92.b("draft_parts_view.preview_content_uri_parts");
        dqprVarM92.i(10017);
        dqprVarM92.c(new Supplier() { // from class: bhac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM92.j(new dqps() { // from class: bhad
        });
        dqprVarM92.a();
        dqpr dqprVarM93 = dqpt.m();
        dqprVarM93.m(4);
        dqprVarM93.d(true);
        dqprVarM93.b("draft_parts_view.preview_content_type_parts");
        dqprVarM93.i(10017);
        dqprVarM93.c(new Supplier() { // from class: bhae
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM93.j(new dqps() { // from class: bhaf
        });
        dqprVarM93.a();
        dqpr dqprVarM94 = dqpt.m();
        dqprVarM94.m(4);
        dqprVarM94.b("draft_parts_view.fallback_uri_parts");
        dqprVarM94.i(13000);
        dqprVarM94.c(new Supplier() { // from class: bhag
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM94.j(new dqps() { // from class: bhah
        });
        dqprVarM94.a();
        dqpr dqprVarM95 = dqpt.m();
        dqprVarM95.m(1);
        dqprVarM95.b("draft_parts_view.source_parts");
        dqprVarM95.i(14010);
        dqprVarM95.c(new Supplier() { // from class: bhai
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM95.j(new dqps() { // from class: bhaj
        });
        dqprVarM95.a();
        dqpr dqprVarM96 = dqpt.m();
        dqprVarM96.m(1);
        dqprVarM96.b("draft_parts_view.bundle_index_parts");
        dqprVarM96.i(17010);
        dqprVarM96.c(new Supplier() { // from class: bhak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM96.j(new dqps() { // from class: bhao
        });
        dqprVarM96.a();
        dqpr dqprVarM97 = dqpt.m();
        dqprVarM97.m(4);
        dqprVarM97.b("draft_parts_view.blob_id_parts");
        dqprVarM97.i(17020);
        dqprVarM97.c(new Supplier() { // from class: bhap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM97.j(new dqps() { // from class: bhaq
        });
        dqprVarM97.a();
        dqpr dqprVarM98 = dqpt.m();
        dqprVarM98.m(4);
        dqprVarM98.b("draft_parts_view.blob_gaia_email_parts");
        dqprVarM98.i(59570);
        dqprVarM98.c(new Supplier() { // from class: bhar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM98.j(new dqps() { // from class: bhas
        });
        dqprVarM98.a();
        dqpr dqprVarM99 = dqpt.m();
        dqprVarM99.m(4);
        dqprVarM99.b("draft_parts_view.cms_full_size_blob_id_parts");
        dqprVarM99.i(40040);
        dqprVarM99.c(new Supplier() { // from class: bhat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM99.j(new dqps() { // from class: bhau
        });
        dqprVarM99.a();
        dqpr dqprVarM100 = dqpt.m();
        dqprVarM100.m(5);
        dqprVarM100.b("draft_parts_view.cms_media_encryption_key_parts");
        dqprVarM100.i(42010);
        dqprVarM100.c(new Supplier() { // from class: bhav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM100.j(new dqps() { // from class: bhax
        });
        dqprVarM100.a();
        dqpr dqprVarM101 = dqpt.m();
        dqprVarM101.m(5);
        dqprVarM101.b("draft_parts_view.cms_compressed_media_encryption_key_parts");
        dqprVarM101.i(42070);
        dqprVarM101.c(new Supplier() { // from class: bhay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM101.j(new dqps() { // from class: bhba
        });
        dqprVarM101.a();
        dqpr dqprVarM102 = dqpt.m();
        dqprVarM102.m(1);
        dqprVarM102.b("draft_parts_view.blob_upload_permanent_failure_parts");
        dqprVarM102.i(18000);
        dqprVarM102.c(new Supplier() { // from class: bhbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM102.j(new dqps() { // from class: bhbc
        });
        dqprVarM102.a();
        dqpr dqprVarM103 = dqpt.m();
        dqprVarM103.m(1);
        dqprVarM103.b("draft_parts_view.blob_upload_timestamp_parts");
        dqprVarM103.i(19030);
        dqprVarM103.c(new Supplier() { // from class: bhbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM103.j(new dqps() { // from class: bhbe
        });
        dqprVarM103.a();
        dqpr dqprVarM104 = dqpt.m();
        dqprVarM104.m(4);
        dqprVarM104.b("draft_parts_view.expressive_sticker_name_parts");
        dqprVarM104.i(22060);
        dqprVarM104.c(new Supplier() { // from class: bhbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM104.j(new dqps() { // from class: bhbg
        });
        dqprVarM104.a();
        dqpr dqprVarM105 = dqpt.m();
        dqprVarM105.m(4);
        dqprVarM105.b("draft_parts_view.file_name_parts");
        dqprVarM105.i(26000);
        dqprVarM105.c(new Supplier() { // from class: bhbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM105.j(new dqps() { // from class: bhbj
        });
        dqprVarM105.a();
        dqpr dqprVarM106 = dqpt.m();
        dqprVarM106.m(1);
        dqprVarM106.b("draft_parts_view.duration_parts");
        dqprVarM106.i(26040);
        dqprVarM106.c(new Supplier() { // from class: bhbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM106.j(new dqps() { // from class: bhbm
        });
        dqprVarM106.a();
        dqpr dqprVarM107 = dqpt.m();
        dqprVarM107.m(4);
        dqprVarM107.b("draft_parts_view.compressed_blob_id_parts");
        dqprVarM107.i(27000);
        dqprVarM107.c(new Supplier() { // from class: bhbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM107.j(new dqps() { // from class: bhbo
        });
        dqprVarM107.a();
        dqpr dqprVarM108 = dqpt.m();
        dqprVarM108.m(4);
        dqprVarM108.b("draft_parts_view.cms_compressed_blob_id_parts");
        dqprVarM108.i(40040);
        dqprVarM108.c(new Supplier() { // from class: bhbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM108.j(new dqps() { // from class: bhbq
        });
        dqprVarM108.a();
        dqpr dqprVarM109 = dqpt.m();
        dqprVarM109.m(1);
        dqprVarM109.b("draft_parts_view.compressed_blob_upload_permanent_failure_parts");
        dqprVarM109.i(27000);
        dqprVarM109.c(new Supplier() { // from class: bhbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM109.j(new dqps() { // from class: bhbt
        });
        dqprVarM109.a();
        dqpr dqprVarM110 = dqpt.m();
        dqprVarM110.m(1);
        dqprVarM110.b("draft_parts_view.compressed_blob_upload_timestamp_parts");
        dqprVarM110.i(27000);
        dqprVarM110.c(new Supplier() { // from class: bhbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM110.j(new dqps() { // from class: bhbv
        });
        dqprVarM110.a();
        dqpr dqprVarM111 = dqpt.m();
        dqprVarM111.m(5);
        dqprVarM111.b("draft_parts_view.media_encryption_key_parts");
        dqprVarM111.i(30040);
        dqprVarM111.c(new Supplier() { // from class: bhbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM111.j(new dqps() { // from class: bhby
        });
        dqprVarM111.a();
        dqpr dqprVarM112 = dqpt.m();
        dqprVarM112.m(5);
        dqprVarM112.b("draft_parts_view.compressed_media_encryption_key_parts");
        dqprVarM112.i(30040);
        dqprVarM112.c(new Supplier() { // from class: bhbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM112.j(new dqps() { // from class: bhca
        });
        dqprVarM112.a();
        dqpr dqprVarM113 = dqpt.m();
        dqprVarM113.m(1);
        dqprVarM113.b("draft_parts_view.missing_entry_in_telephony_parts");
        dqprVarM113.i(52030);
        dqprVarM113.c(new Supplier() { // from class: bhcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM113.j(new dqps() { // from class: bhcc
        });
        dqprVarM113.a();
        dqpr dqprVarM114 = dqpt.m();
        dqprVarM114.m(1);
        dqprVarM114.b("draft_parts_view.awaiting_reverse_sync_parts");
        dqprVarM114.i(53040);
        dqprVarM114.c(new Supplier() { // from class: bhce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM114.j(new dqps() { // from class: bhcf
        });
        dqprVarM114.a();
        dqpr dqprVarM115 = dqpt.m();
        dqprVarM115.m(1);
        dqprVarM115.b("draft_parts_view.file_size_bytes_parts");
        dqprVarM115.i(52050);
        dqprVarM115.c(new Supplier() { // from class: bhcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM115.j(new dqps() { // from class: bhch
        });
        dqprVarM115.a();
        dqpr dqprVarM116 = dqpt.m();
        dqprVarM116.m(4);
        dqprVarM116.d(true);
        dqprVarM116.b("draft_parts_view.local_cache_path_parts");
        dqprVarM116.i(52050);
        dqprVarM116.c(new Supplier() { // from class: bhci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM116.j(new dqps() { // from class: bhck
        });
        dqprVarM116.a();
        dqpr dqprVarM117 = dqpt.m();
        dqprVarM117.m(1);
        dqprVarM117.b("draft_parts_view.media_send_type_parts");
        dqprVarM117.i(58150);
        dqprVarM117.c(new Supplier() { // from class: bhcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM117.j(new dqps() { // from class: bhcm
        });
        dqprVarM117.a();
        dqpr dqprVarM118 = dqpt.m();
        dqprVarM118.m(5);
        dqprVarM118.b("draft_parts_view.voice_metadata_parts");
        dqprVarM118.i(59470);
        dqprVarM118.c(new Supplier() { // from class: bhcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM118.j(new dqps() { // from class: bhcp
        });
        dqprVarM118.a();
        dqpr dqprVarM119 = dqpt.m();
        dqprVarM119.m(1);
        dqprVarM119.b("draft_parts_view.validation_status_parts");
        dqprVarM119.i(58770);
        dqprVarM119.c(new Supplier() { // from class: bhcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM119.j(new dqps() { // from class: bhcr
        });
        dqprVarM119.a();
        dqpr dqprVarM120 = dqpt.m();
        dqprVarM120.m(4);
        dqprVarM120.b("draft_parts_view.processing_id_parts");
        dqprVarM120.i(60080);
        dqprVarM120.c(new Supplier() { // from class: bhcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM120.j(new dqps() { // from class: bhct
        });
        dqprVarM120.a();
        dqpr dqprVarM121 = dqpt.m();
        dqprVarM121.m(1);
        dqprVarM121.b("draft_parts_view.rich_card_media_download_failure_reason_parts");
        dqprVarM121.i(60230);
        dqprVarM121.c(new Supplier() { // from class: bhcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM121.j(new dqps() { // from class: bhcw
        });
        dqprVarM121.a();
        dqpr dqprVarM122 = dqpt.m();
        dqprVarM122.m(1);
        dqprVarM122.b("draft_parts_view.image_display_state_parts");
        dqprVarM122.i(60240);
        dqprVarM122.c(new Supplier() { // from class: bhcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM122.j(new dqps() { // from class: bhcy
        });
        dqprVarM122.a();
        dqpr dqprVarM123 = dqpt.m();
        dqprVarM123.m(1);
        dqprVarM123.b("draft_parts_view.preserve_size_parts");
        dqprVarM123.i(60680);
        dqprVarM123.c(new Supplier() { // from class: bhda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bhka.b();
            }
        });
        dqprVarM123.j(new dqps() { // from class: bhdb
        });
        dqprVarM123.a();
    }

    public static final bhjx a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("draft_parts_view._id_messages");
            ekfwVar.h("draft_parts_view.conversation_id_messages");
            ekfwVar.h("draft_parts_view.sender_participant_id_messages");
            if (numC.intValue() >= 54040) {
                ekfwVar.h("draft_parts_view.sender_send_destination_messages");
            }
            if (numC.intValue() >= 59340) {
                ekfwVar.h("draft_parts_view.msisdn_receiving_rcs_message_messages");
            }
            if (numC.intValue() >= 54040) {
                ekfwVar.h("draft_parts_view.receiving_network_country_messages");
            }
            ekfwVar.h("draft_parts_view.sent_timestamp_messages");
            if (numC.intValue() >= 17030) {
                ekfwVar.h("draft_parts_view.queue_insert_timestamp_messages");
            }
            ekfwVar.h("draft_parts_view.received_timestamp_messages");
            ekfwVar.h("draft_parts_view.protocol_messages");
            ekfwVar.h("draft_parts_view.status_messages");
            if (numC.intValue() >= 13020) {
                ekfwVar.h("draft_parts_view.message_report_status_messages");
            }
            ekfwVar.h("draft_parts_view.notified_messages");
            ekfwVar.h("draft_parts_view.read_messages");
            ekfwVar.h("draft_parts_view.sms_message_uri_messages");
            ekfwVar.h("draft_parts_view.sms_priority_messages");
            ekfwVar.h("draft_parts_view.sms_message_size_messages");
            ekfwVar.h("draft_parts_view.mms_subject_messages");
            ekfwVar.h("draft_parts_view.mms_transaction_id_messages");
            ekfwVar.h("draft_parts_view.mms_content_location_messages");
            ekfwVar.h("draft_parts_view.mms_expiry_messages");
            if (numC.intValue() >= 59890) {
                ekfwVar.h("draft_parts_view.rcs_expiry_messages");
            }
            if (numC.intValue() >= 9030) {
                ekfwVar.h("draft_parts_view.mms_retrieve_text_messages");
            }
            ekfwVar.h("draft_parts_view.raw_telephony_status_messages");
            ekfwVar.h("draft_parts_view.self_id_messages");
            if (numC.intValue() >= 60160) {
                ekfwVar.h("draft_parts_view.my_identity_messages");
            }
            ekfwVar.h("draft_parts_view.retry_start_timestamp_messages");
            if (numC.intValue() >= 8500) {
                ekfwVar.h("draft_parts_view.cloud_sync_id_messages");
            }
            if (numC.intValue() >= 41040) {
                ekfwVar.h("draft_parts_view.rcs_message_id_messages");
            }
            if (numC.intValue() >= 29060) {
                ekfwVar.h("draft_parts_view.rcs_encryption_status_messages");
            }
            if (numC.intValue() >= 29090) {
                ekfwVar.h("draft_parts_view.verification_status_messages");
            }
            if (numC.intValue() >= 39000) {
                ekfwVar.h("draft_parts_view.rcs_ui_status_messages");
            }
            if (numC.intValue() >= 30010) {
                ekfwVar.h("draft_parts_view.is_hidden_messages");
            }
            if (numC.intValue() >= 10002) {
                ekfwVar.h("draft_parts_view.rcs_remote_instance_messages");
            }
            if (numC.intValue() >= 10004) {
                ekfwVar.h("draft_parts_view.rcs_file_transfer_session_id_messages");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("draft_parts_view.sms_error_code_messages");
            }
            if (numC.intValue() >= 9000) {
                ekfwVar.h("draft_parts_view.sms_error_desc_map_name_messages");
            }
            if (numC.intValue() >= 9010) {
                ekfwVar.h("draft_parts_view.correlation_id_messages");
            }
            if (numC.intValue() >= 31010) {
                ekfwVar.h("draft_parts_view.cms_id_messages");
            }
            if (numC.intValue() >= 37040) {
                ekfwVar.h("draft_parts_view.cms_last_mod_seq_messages");
            }
            if (numC.intValue() >= 19020) {
                ekfwVar.h("draft_parts_view.web_id_messages");
            }
            if (numC.intValue() >= 29100) {
                ekfwVar.h("draft_parts_view.usage_stats_logging_id_messages");
            }
            if (numC.intValue() >= 35030) {
                ekfwVar.h("draft_parts_view.send_counter_messages");
            }
            if (numC.intValue() >= 35030) {
                ekfwVar.h("draft_parts_view.original_rcs_message_id_messages");
            }
            if (numC.intValue() >= 60820) {
                ekfwVar.h("draft_parts_view.raw_rcs_message_to_send_messages");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("draft_parts_view.custom_delivery_receipt_mime_type_messages");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("draft_parts_view.custom_delivery_receipt_content_messages");
            }
            if (numC.intValue() >= 37030) {
                ekfwVar.h("draft_parts_view.report_attempt_counter_messages");
            }
            if (numC.intValue() >= 45020) {
                ekfwVar.h("draft_parts_view.custom_headers_messages");
            }
            if (numC.intValue() >= 46010) {
                ekfwVar.h("draft_parts_view.cms_correlation_id_messages");
            }
            if (numC.intValue() >= 48030) {
                ekfwVar.h("draft_parts_view.group_private_participant_messages");
            }
            if (numC.intValue() >= 48030) {
                ekfwVar.h("draft_parts_view.original_message_id_messages");
            }
            if (numC.intValue() >= 60950) {
                ekfwVar.h("draft_parts_view.parent_message_id_messages");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("draft_parts_view.awaiting_reverse_sync_messages");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("draft_parts_view.old_sms_message_uri_messages");
            }
            if (numC.intValue() >= 56000) {
                ekfwVar.h("draft_parts_view.draft_id_messages");
            }
            if (numC.intValue() >= 58040) {
                ekfwVar.h("draft_parts_view.result_code_messages");
            }
            if (numC.intValue() >= 58210) {
                ekfwVar.h("draft_parts_view.cms_life_cycle_messages");
            }
            if (numC.intValue() >= 60750) {
                ekfwVar.h("draft_parts_view.mute_priority_messages");
            }
            if (numC.intValue() >= 58710) {
                ekfwVar.h("draft_parts_view.fallback_reason_messages");
            }
            if (numC.intValue() >= 58230) {
                ekfwVar.h("draft_parts_view.auto_retry_counter_messages");
            }
            if (numC.intValue() >= 58280) {
                ekfwVar.h("draft_parts_view.can_revoke_before_delivered_with_rcs_messages");
            }
            if (numC.intValue() >= 58680) {
                ekfwVar.h("draft_parts_view.trace_id_messages");
            }
            if (numC.intValue() >= 58720) {
                ekfwVar.h("draft_parts_view.outgoing_delivery_report_status_messages");
            }
            if (numC.intValue() >= 58720) {
                ekfwVar.h("draft_parts_view.outgoing_read_report_status_messages");
            }
            if (numC.intValue() >= 59310) {
                ekfwVar.h("draft_parts_view.xms_transport_messages");
            }
            if (numC.intValue() >= 59430) {
                ekfwVar.h("draft_parts_view.original_protocol_messages");
            }
            if (numC.intValue() >= 59490) {
                ekfwVar.h("draft_parts_view.satellite_datagram_id_messages");
            }
            if (numC.intValue() >= 60190) {
                ekfwVar.h("draft_parts_view.encryption_protocol_messages");
            }
            if (numC.intValue() >= 60370) {
                ekfwVar.h("draft_parts_view.message_persistence_id_messages");
            }
            ekfwVar.h("draft_parts_view._id_parts");
            ekfwVar.h("draft_parts_view.message_id_parts");
            ekfwVar.h("draft_parts_view.text_parts");
            if (numC.intValue() >= 60990) {
                ekfwVar.h("draft_parts_view.raw_text_parts");
            }
            ekfwVar.h("draft_parts_view.uri_parts");
            ekfwVar.h("draft_parts_view.content_type_parts");
            if (numC.intValue() >= 10021) {
                ekfwVar.h("draft_parts_view.original_uri_parts");
            }
            if (numC.intValue() >= 29060) {
                ekfwVar.h("draft_parts_view.storage_uri_parts");
            }
            ekfwVar.h("draft_parts_view.width_parts");
            ekfwVar.h("draft_parts_view.height_parts");
            if (numC.intValue() >= 3010) {
                ekfwVar.h("draft_parts_view.timestamp_parts");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("draft_parts_view.processing_output_uri_parts");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("draft_parts_view.target_size_parts");
            }
            if (numC.intValue() >= 4020) {
                ekfwVar.h("draft_parts_view.processing_status_parts");
            }
            if (numC.intValue() >= 44010) {
                ekfwVar.h("draft_parts_view.cms_attachment_processing_status_parts");
            }
            ekfwVar.h("draft_parts_view.conversation_id_parts");
            if (numC.intValue() >= 5020) {
                ekfwVar.h("draft_parts_view.sticker_set_id_parts");
            }
            if (numC.intValue() >= 5020) {
                ekfwVar.h("draft_parts_view.sticker_id_parts");
            }
            if (numC.intValue() >= 7000) {
                ekfwVar.h("draft_parts_view.media_modified_timestamp_parts");
            }
            if (numC.intValue() >= 10005) {
                ekfwVar.h("draft_parts_view.longitude_parts");
            }
            if (numC.intValue() >= 10005) {
                ekfwVar.h("draft_parts_view.latitude_parts");
            }
            if (numC.intValue() >= 10017) {
                ekfwVar.h("draft_parts_view.preview_content_uri_parts");
            }
            if (numC.intValue() >= 10017) {
                ekfwVar.h("draft_parts_view.preview_content_type_parts");
            }
            if (numC.intValue() >= 13000) {
                ekfwVar.h("draft_parts_view.fallback_uri_parts");
            }
            if (numC.intValue() >= 14010) {
                ekfwVar.h("draft_parts_view.source_parts");
            }
            if (numC.intValue() >= 17010) {
                ekfwVar.h("draft_parts_view.bundle_index_parts");
            }
            if (numC.intValue() >= 17020) {
                ekfwVar.h("draft_parts_view.blob_id_parts");
            }
            if (numC.intValue() >= 59570) {
                ekfwVar.h("draft_parts_view.blob_gaia_email_parts");
            }
            if (numC.intValue() >= 40040) {
                ekfwVar.h("draft_parts_view.cms_full_size_blob_id_parts");
            }
            if (numC.intValue() >= 42010) {
                ekfwVar.h("draft_parts_view.cms_media_encryption_key_parts");
            }
            if (numC.intValue() >= 42070) {
                ekfwVar.h("draft_parts_view.cms_compressed_media_encryption_key_parts");
            }
            if (numC.intValue() >= 18000) {
                ekfwVar.h("draft_parts_view.blob_upload_permanent_failure_parts");
            }
            if (numC.intValue() >= 19030) {
                ekfwVar.h("draft_parts_view.blob_upload_timestamp_parts");
            }
            if (numC.intValue() >= 22060) {
                ekfwVar.h("draft_parts_view.expressive_sticker_name_parts");
            }
            if (numC.intValue() >= 26000) {
                ekfwVar.h("draft_parts_view.file_name_parts");
            }
            if (numC.intValue() >= 26040) {
                ekfwVar.h("draft_parts_view.duration_parts");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("draft_parts_view.compressed_blob_id_parts");
            }
            if (numC.intValue() >= 40040) {
                ekfwVar.h("draft_parts_view.cms_compressed_blob_id_parts");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("draft_parts_view.compressed_blob_upload_permanent_failure_parts");
            }
            if (numC.intValue() >= 27000) {
                ekfwVar.h("draft_parts_view.compressed_blob_upload_timestamp_parts");
            }
            if (numC.intValue() >= 30040) {
                ekfwVar.h("draft_parts_view.media_encryption_key_parts");
            }
            if (numC.intValue() >= 30040) {
                ekfwVar.h("draft_parts_view.compressed_media_encryption_key_parts");
            }
            if (numC.intValue() >= 52030) {
                ekfwVar.h("draft_parts_view.missing_entry_in_telephony_parts");
            }
            if (numC.intValue() >= 53040) {
                ekfwVar.h("draft_parts_view.awaiting_reverse_sync_parts");
            }
            if (numC.intValue() >= 52050) {
                ekfwVar.h("draft_parts_view.file_size_bytes_parts");
            }
            if (numC.intValue() >= 52050) {
                ekfwVar.h("draft_parts_view.local_cache_path_parts");
            }
            if (numC.intValue() >= 58150) {
                ekfwVar.h("draft_parts_view.media_send_type_parts");
            }
            if (numC.intValue() >= 59470) {
                ekfwVar.h("draft_parts_view.voice_metadata_parts");
            }
            if (numC.intValue() >= 58770) {
                ekfwVar.h("draft_parts_view.validation_status_parts");
            }
            if (numC.intValue() >= 60080) {
                ekfwVar.h("draft_parts_view.processing_id_parts");
            }
            if (numC.intValue() >= 60230) {
                ekfwVar.h("draft_parts_view.rich_card_media_download_failure_reason_parts");
            }
            if (numC.intValue() >= 60240) {
                ekfwVar.h("draft_parts_view.image_display_state_parts");
            }
            if (numC.intValue() >= 60680) {
                ekfwVar.h("draft_parts_view.preserve_size_parts");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bhjx(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
