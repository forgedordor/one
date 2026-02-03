package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjdf {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.conversation_id", "messages_annotations.message_id", "messages_annotations.annotation_type", "messages_annotations.annotation_details", "conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count"};

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages_annotations.message_id", 20040);
        ekgiVar.i("conversations.name_is_automatic", 10012);
        ekgiVar.i("conversations.subtitle", 59760);
        ekgiVar.i("conversations.etouffee_default", 29060);
        ekgiVar.i("conversations.normalized_participant_contact_id", 58090);
        ekgiVar.i("conversations.normalized_participant_lookup_key", 58090);
        ekgiVar.i("conversations.participant_comparable_destination", 58090);
        ekgiVar.i("conversations.current_my_identity_foreign_key", 60160);
        ekgiVar.i("conversations.destination_token", 60360);
        ekgiVar.i("conversations.participant_id_list", 8500);
        ekgiVar.i("conversations.normalized_participant_id_list", 58090);
        ekgiVar.i("conversations.source_type", 8500);
        ekgiVar.i("conversations.rcs_session_id", 10000);
        ekgiVar.i("conversations.join_state", 10006);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.send_mode", 10016);
        ekgiVar.i("conversations.IS_ENTERPRISE", 10018);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.i("conversations.last_interactive_event_timestamp", 15000);
        ekgiVar.i("conversations.participant_display_destination", 15010);
        ekgiVar.i("conversations.normalized_participant_display_destination", 58090);
        ekgiVar.i("conversations.spam_warning_dismiss_status", 23000);
        ekgiVar.i("conversations.open_count", 26020);
        ekgiVar.i("conversations.last_logged_scooby_metadata_timestamp", 28010);
        ekgiVar.i("conversations.delete_timestamp", 29020);
        ekgiVar.i("conversations.cms_id", 32000);
        ekgiVar.i("conversations.rcs_group_id", 40050);
        ekgiVar.i("conversations.rcs_conference_uri", 40050);
        ekgiVar.i("conversations.tachygram_group_routing_info_token", 58120);
        ekgiVar.i("conversations.cms_most_recent_read_message_timestamp_ms", 53030);
        ekgiVar.i("conversations.rcs_subject_change_timestamp_ms", 46050);
        ekgiVar.i("conversations.rcs_session_allows_revocation", 48040);
        ekgiVar.i("conversations.rcs_group_capabilities", 49020);
        ekgiVar.i("conversations.awaiting_reverse_sync", 49060);
        ekgiVar.i("conversations.duplicate_of", 58090);
        ekgiVar.i("conversations.new_duplicate_of", 59130);
        ekgiVar.i("conversations.error_state", 58140);
        ekgiVar.i("conversations.cms_life_cycle", 58210);
        ekgiVar.i("conversations.rcs_group_self_msisdn", 58540);
        ekgiVar.i("conversations.recipient_offline_timestamp_ms", 58750);
        ekgiVar.i("conversations.rcs_group_last_sync_timestamp", 58910);
        ekgiVar.i("conversations.has_been_e2ee", 59210);
        ekgiVar.i("conversations.marked_as_unread", 59220);
        ekgiVar.i("conversations.custom_theme", 59820);
        ekgiVar.i("conversations.mms_group_upgrade_status", 60050);
        ekgiVar.i("conversations.mms_group_upgrade_retries", 60050);
        ekgiVar.i("conversations.encryption_protocol", 60180);
        ekgiVar.i("conversations.encryption_id", 60210);
        ekgiVar.i("conversations.cms_correlation_id", 60250);
        ekgiVar.i("conversations.rcs_group_icon_url", 60590);
        ekgiVar.i("conversations.unread_count", 60740);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_null_conversation_id");
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.i("annotation_type", "index_null_annotation_type");
        ekgiVar2.c();
        dqpr dqprVarM = dqpt.m();
        dqprVarM.m(2);
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.a = "messages_annotations._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: biwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bjcg
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqprVarM2.m(4);
        dqprVarM2.d(true);
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.a = "messages_annotations.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bjcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: biws
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqprVarM3.m(2);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.b = new Supplier() { // from class: bixe
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar3.a = "messages_annotations.message_id";
        dqprVarM3.i(20040);
        dqogVar3.d = new Supplier() { // from class: bixq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: biyc
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqprVarM4.m(1);
        dqprVarM4.d(true);
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.a = "messages_annotations.annotation_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: biyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: biza
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqprVarM5.m(5);
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.a = "messages_annotations.annotation_details";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bizm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bixl
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqprVarM6.m(2);
        dqprVarM6.l(true);
        dqprVarM6.g(true);
        dqprVarM6.d(true);
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.a = "conversations._id";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bizu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bjag
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqprVarM7.m(1);
        dqprVarM7.d(true);
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.a = "conversations.sms_thread_id";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bjas
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bjbe
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqprVarM8.m(4);
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.a = "conversations.name";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bjbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bjcb
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqprVarM9.m(2);
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.a = "conversations.name_is_automatic";
        dqprVarM9.i(10012);
        dqogVar9.d = new Supplier() { // from class: bjcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bjcd
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqprVarM10.m(4);
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.a = "conversations.subtitle";
        dqprVarM10.i(59760);
        dqogVar10.d = new Supplier() { // from class: bjce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bjch
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqprVarM11.m(1);
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.a = "conversations.latest_message_id";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bjci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bjcj
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqprVarM12.m(4);
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.a = "conversations.snippet_text";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: bjck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: bjcl
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqprVarM13.m(4);
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.a = "conversations.subject_text";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bjcm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: bjcn
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqprVarM14.m(4);
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.a = "conversations.preview_uri";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bjco
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar14.c = new dqps() { // from class: bjcp
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqprVarM15.m(4);
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.a = "conversations.preview_content_type";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bjcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar15.c = new dqps() { // from class: bjct
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqprVarM16.m(1);
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.a = "conversations.show_draft";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bjcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar16.c = new dqps() { // from class: bjcv
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqprVarM17.m(4);
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.a = "conversations.draft_snippet_text";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bjcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar17.c = new dqps() { // from class: bjcx
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqprVarM18.m(4);
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.a = "conversations.draft_subject_text";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bjcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar18.c = new dqps() { // from class: bjcz
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqprVarM19.m(4);
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.a = "conversations.draft_preview_uri";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bjda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar19.c = new dqps() { // from class: biwq
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqprVarM20.m(4);
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.a = "conversations.draft_preview_content_type";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: biwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar20.c = new dqps() { // from class: biwt
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqprVarM21.m(1);
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.a = "conversations.etouffee_default";
        dqprVarM21.i(29060);
        dqogVar21.d = new Supplier() { // from class: biwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar21.c = new dqps() { // from class: biwv
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqprVarM22.m(1);
        dqprVarM22.d(true);
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.a = "conversations.archive_status";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: biww
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar22.c = new dqps() { // from class: biwx
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqprVarM23.m(1);
        dqprVarM23.d(true);
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.a = "conversations.sort_timestamp";
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: biwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar23.c = new dqps() { // from class: biwz
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqprVarM24.m(1);
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.a = "conversations.last_read_timestamp";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: bixb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar24.c = new dqps() { // from class: bixc
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqprVarM25.m(4);
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.a = "conversations.icon";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: bixd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar25.c = new dqps() { // from class: bixf
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqprVarM26.m(1);
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.a = "conversations.participant_contact_id";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: bixg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar26.c = new dqps() { // from class: bixh
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqprVarM27.m(1);
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.a = "conversations.normalized_participant_contact_id";
        dqprVarM27.i(58090);
        dqogVar27.d = new Supplier() { // from class: bixi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar27.c = new dqps() { // from class: bixj
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqprVarM28.m(4);
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.a = "conversations.participant_lookup_key";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: bixk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar28.c = new dqps() { // from class: bixm
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqprVarM29.m(4);
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.a = "conversations.normalized_participant_lookup_key";
        dqprVarM29.i(58090);
        dqogVar29.d = new Supplier() { // from class: bixn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar29.c = new dqps() { // from class: bixo
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqprVarM30.m(4);
        dqprVarM30.d(true);
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.a = "conversations.participant_normalized_destination";
        dqprVarM30.i(-1);
        dqogVar30.d = new Supplier() { // from class: bixp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar30.c = new dqps() { // from class: bixr
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqprVarM31.m(4);
        dqprVarM31.l(true);
        dqprVarM31.d(true);
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.a = "conversations.participant_comparable_destination";
        dqprVarM31.f(true);
        dqprVarM31.i(58090);
        dqogVar31.d = new Supplier() { // from class: bixs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar31.c = new dqps() { // from class: bixt
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqprVarM32.m(4);
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.a = "conversations.current_self_id";
        dqprVarM32.i(-1);
        dqogVar32.d = new Supplier() { // from class: bixu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar32.c = new dqps() { // from class: bixv
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqprVarM33.m(4);
        dqprVarM33.d(true);
        dqprVarM33.e(true);
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.b = new Supplier() { // from class: bixx
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar33.a = "conversations.current_my_identity_foreign_key";
        dqprVarM33.i(60160);
        dqogVar33.d = new Supplier() { // from class: bixy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar33.c = new dqps() { // from class: bixz
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqprVarM34.m(4);
        dqprVarM34.d(true);
        dqprVarM34.e(true);
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.b = new Supplier() { // from class: biya
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.b.a;
            }
        };
        dqogVar34.a = "conversations.destination_token";
        dqprVarM34.i(60360);
        dqogVar34.d = new Supplier() { // from class: biyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar34.c = new dqps() { // from class: biyd
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqprVarM35.m(1);
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.a = "conversations.participant_count";
        dqprVarM35.i(-1);
        dqogVar35.d = new Supplier() { // from class: biye
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar35.c = new dqps() { // from class: biyf
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqprVarM36.m(1);
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.a = "conversations.notification_enabled";
        dqprVarM36.i(-1);
        dqogVar36.d = new Supplier() { // from class: biyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar36.c = new dqps() { // from class: biyi
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqprVarM37.m(4);
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.a = "conversations.notification_sound_uri";
        dqprVarM37.i(-1);
        dqogVar37.d = new Supplier() { // from class: biyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar37.c = new dqps() { // from class: biyk
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqprVarM38.m(1);
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.a = "conversations.notification_vibration";
        dqprVarM38.i(-1);
        dqogVar38.d = new Supplier() { // from class: biyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar38.c = new dqps() { // from class: biym
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqprVarM39.m(1);
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.a = "conversations.include_email_addr";
        dqprVarM39.i(-1);
        dqogVar39.d = new Supplier() { // from class: biyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar39.c = new dqps() { // from class: biyp
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqprVarM40.m(4);
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.a = "conversations.sms_service_center";
        dqprVarM40.i(-1);
        dqogVar40.d = new Supplier() { // from class: biyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar40.c = new dqps() { // from class: biyr
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqprVarM41.m(4);
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.a = "conversations.participant_id_list";
        dqprVarM41.i(8500);
        dqogVar41.d = new Supplier() { // from class: biyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar41.c = new dqps() { // from class: biyu
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqprVarM42.m(4);
        dqprVarM42.l(true);
        dqprVarM42.d(true);
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.a = "conversations.normalized_participant_id_list";
        dqprVarM42.f(true);
        dqprVarM42.i(58090);
        dqogVar42.d = new Supplier() { // from class: biyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar42.c = new dqps() { // from class: biyw
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqprVarM43.m(1);
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.a = "conversations.source_type";
        dqprVarM43.i(8500);
        dqogVar43.d = new Supplier() { // from class: biyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar43.c = new dqps() { // from class: biyy
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqprVarM44.m(1);
        dqprVarM44.d(true);
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.a = "conversations.rcs_session_id";
        dqprVarM44.i(10000);
        dqogVar44.d = new Supplier() { // from class: biyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar44.c = new dqps() { // from class: bizb
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqprVarM45.m(1);
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.a = "conversations.join_state";
        dqprVarM45.i(10006);
        dqogVar45.d = new Supplier() { // from class: bizc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar45.c = new dqps() { // from class: bize
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqprVarM46.m(1);
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.a = "conversations.conv_type";
        dqprVarM46.i(10007);
        dqogVar46.d = new Supplier() { // from class: bizf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar46.c = new dqps() { // from class: bizg
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqprVarM47.m(1);
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.a = "conversations.send_mode";
        dqprVarM47.i(10016);
        dqogVar47.d = new Supplier() { // from class: bizh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar47.c = new dqps() { // from class: bizi
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqprVarM48.m(1);
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.a = "conversations.IS_ENTERPRISE";
        dqprVarM48.i(10018);
        dqogVar48.d = new Supplier() { // from class: bizj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar48.c = new dqps() { // from class: bizk
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqprVarM49.m(1);
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.a = "conversations.has_ea2p_bot_recipient";
        dqprVarM49.i(12001);
        dqogVar49.d = new Supplier() { // from class: bizl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar49.c = new dqps() { // from class: bizr
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqprVarM50.m(1);
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.a = "conversations.last_interactive_event_timestamp";
        dqprVarM50.i(15000);
        dqogVar50.d = new Supplier() { // from class: bjac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar50.c = new dqps() { // from class: bjan
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqprVarM51.m(4);
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.a = "conversations.participant_display_destination";
        dqprVarM51.i(15010);
        dqogVar51.d = new Supplier() { // from class: bjay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar51.c = new dqps() { // from class: bjbj
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqprVarM52.m(4);
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.a = "conversations.normalized_participant_display_destination";
        dqprVarM52.i(58090);
        dqogVar52.d = new Supplier() { // from class: bjbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar52.c = new dqps() { // from class: bjcf
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqprVarM53.m(1);
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.a = "conversations.spam_warning_dismiss_status";
        dqprVarM53.i(23000);
        dqogVar53.d = new Supplier() { // from class: bjcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar53.c = new dqps() { // from class: bjdb
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqprVarM54.m(1);
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.a = "conversations.open_count";
        dqprVarM54.i(26020);
        dqogVar54.d = new Supplier() { // from class: bixa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar54.c = new dqps() { // from class: bixw
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqprVarM55.m(1);
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.a = "conversations.last_logged_scooby_metadata_timestamp";
        dqprVarM55.i(28010);
        dqogVar55.d = new Supplier() { // from class: biyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar55.c = new dqps() { // from class: biys
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqprVarM56.m(1);
        dqprVarM56.d(true);
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.a = "conversations.delete_timestamp";
        dqprVarM56.i(29020);
        dqogVar56.d = new Supplier() { // from class: bizd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar56.c = new dqps() { // from class: bizn
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqprVarM57.m(4);
        dqprVarM57.l(true);
        dqprVarM57.d(true);
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.a = "conversations.cms_id";
        dqprVarM57.f(true);
        dqprVarM57.i(32000);
        dqogVar57.d = new Supplier() { // from class: bizo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar57.c = new dqps() { // from class: bizp
        };
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqprVarM58.m(4);
        dqprVarM58.d(true);
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.a = "conversations.rcs_group_id";
        dqprVarM58.i(40050);
        dqogVar58.d = new Supplier() { // from class: bizq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar58.c = new dqps() { // from class: bizs
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqprVarM59.m(4);
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.a = "conversations.rcs_conference_uri";
        dqprVarM59.i(40050);
        dqogVar59.d = new Supplier() { // from class: bizt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar59.c = new dqps() { // from class: bizv
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqprVarM60.m(5);
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.a = "conversations.tachygram_group_routing_info_token";
        dqprVarM60.i(58120);
        dqogVar60.d = new Supplier() { // from class: bizw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar60.c = new dqps() { // from class: bizx
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqprVarM61.m(1);
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        dqprVarM61.i(53030);
        dqogVar61.d = new Supplier() { // from class: bizy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar61.c = new dqps() { // from class: bizz
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqprVarM62.m(2);
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.a = "conversations.rcs_subject_change_timestamp_ms";
        dqprVarM62.i(46050);
        dqogVar62.d = new Supplier() { // from class: bjaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar62.c = new dqps() { // from class: bjab
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqprVarM63.m(1);
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.a = "conversations.rcs_session_allows_revocation";
        dqprVarM63.i(48040);
        dqogVar63.d = new Supplier() { // from class: bjad
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar63.c = new dqps() { // from class: bjae
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqprVarM64.m(2);
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.a = "conversations.rcs_group_capabilities";
        dqprVarM64.i(49020);
        dqogVar64.d = new Supplier() { // from class: bjaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar64.c = new dqps() { // from class: bjah
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqprVarM65.m(1);
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.a = "conversations.awaiting_reverse_sync";
        dqprVarM65.i(49060);
        dqogVar65.d = new Supplier() { // from class: bjai
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar65.c = new dqps() { // from class: bjaj
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqprVarM66.m(2);
        dqprVarM66.d(true);
        dqprVarM66.e(true);
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.b = new Supplier() { // from class: bjak
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar66.a = "conversations.duplicate_of";
        dqprVarM66.i(58090);
        dqogVar66.d = new Supplier() { // from class: bjal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar66.c = new dqps() { // from class: bjam
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqprVarM67.m(2);
        dqprVarM67.d(true);
        dqprVarM67.e(true);
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.b = new Supplier() { // from class: bjao
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar67.a = "conversations.new_duplicate_of";
        dqprVarM67.i(59130);
        dqogVar67.d = new Supplier() { // from class: bjap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar67.c = new dqps() { // from class: bjaq
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqprVarM68.m(1);
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.a = "conversations.error_state";
        dqprVarM68.i(58140);
        dqogVar68.d = new Supplier() { // from class: bjar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar68.c = new dqps() { // from class: bjat
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqprVarM69.m(1);
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.a = "conversations.cms_life_cycle";
        dqprVarM69.i(58210);
        dqogVar69.d = new Supplier() { // from class: bjau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar69.c = new dqps() { // from class: bjav
        };
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqprVarM70.m(4);
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.a = "conversations.rcs_group_self_msisdn";
        dqprVarM70.i(58540);
        dqogVar70.d = new Supplier() { // from class: bjaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar70.c = new dqps() { // from class: bjax
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqprVarM71.m(2);
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.a = "conversations.recipient_offline_timestamp_ms";
        dqprVarM71.i(58750);
        dqogVar71.d = new Supplier() { // from class: bjaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar71.c = new dqps() { // from class: bjba
        };
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqprVarM72.m(2);
        dqog dqogVar72 = (dqog) dqprVarM72;
        dqogVar72.a = "conversations.rcs_group_last_sync_timestamp";
        dqprVarM72.i(58910);
        dqogVar72.d = new Supplier() { // from class: bjbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar72.c = new dqps() { // from class: bjbc
        };
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqprVarM73.m(1);
        dqog dqogVar73 = (dqog) dqprVarM73;
        dqogVar73.a = "conversations.has_been_e2ee";
        dqprVarM73.i(59210);
        dqogVar73.d = new Supplier() { // from class: bjbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar73.c = new dqps() { // from class: bjbf
        };
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqprVarM74.m(1);
        dqog dqogVar74 = (dqog) dqprVarM74;
        dqogVar74.a = "conversations.marked_as_unread";
        dqprVarM74.i(59220);
        dqogVar74.d = new Supplier() { // from class: bjbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar74.c = new dqps() { // from class: bjbh
        };
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqprVarM75.m(5);
        dqog dqogVar75 = (dqog) dqprVarM75;
        dqogVar75.a = "conversations.custom_theme";
        dqprVarM75.i(59820);
        dqogVar75.d = new Supplier() { // from class: bjbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar75.c = new dqps() { // from class: bjbk
        };
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqprVarM76.m(2);
        dqog dqogVar76 = (dqog) dqprVarM76;
        dqogVar76.a = "conversations.mms_group_upgrade_status";
        dqprVarM76.i(60050);
        dqogVar76.d = new Supplier() { // from class: bjbl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar76.c = new dqps() { // from class: bjbm
        };
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqprVarM77.m(2);
        dqog dqogVar77 = (dqog) dqprVarM77;
        dqogVar77.a = "conversations.mms_group_upgrade_retries";
        dqprVarM77.i(60050);
        dqogVar77.d = new Supplier() { // from class: bjbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar77.c = new dqps() { // from class: bjbo
        };
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqprVarM78.m(2);
        dqog dqogVar78 = (dqog) dqprVarM78;
        dqogVar78.a = "conversations.encryption_protocol";
        dqprVarM78.i(60180);
        dqogVar78.d = new Supplier() { // from class: bjbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar78.c = new dqps() { // from class: bjbr
        };
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqprVarM79.m(4);
        dqprVarM79.d(true);
        dqog dqogVar79 = (dqog) dqprVarM79;
        dqogVar79.a = "conversations.encryption_id";
        dqprVarM79.i(60210);
        dqogVar79.d = new Supplier() { // from class: bjbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar79.c = new dqps() { // from class: bjbt
        };
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqprVarM80.m(4);
        dqprVarM80.l(true);
        dqprVarM80.d(true);
        dqog dqogVar80 = (dqog) dqprVarM80;
        dqogVar80.a = "conversations.cms_correlation_id";
        dqprVarM80.f(true);
        dqprVarM80.i(60250);
        dqogVar80.d = new Supplier() { // from class: bjbv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar80.c = new dqps() { // from class: bjbw
        };
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqprVarM81.m(4);
        dqog dqogVar81 = (dqog) dqprVarM81;
        dqogVar81.a = "conversations.rcs_group_icon_url";
        dqprVarM81.i(60590);
        dqogVar81.d = new Supplier() { // from class: bjbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar81.c = new dqps() { // from class: bjby
        };
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqprVarM82.m(2);
        dqog dqogVar82 = (dqog) dqprVarM82;
        dqogVar82.a = "conversations.unread_count";
        dqprVarM82.i(60740);
        dqogVar82.d = new Supplier() { // from class: bjbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjdf.b();
            }
        };
        dqogVar82.c = new dqps() { // from class: bjca
        };
        dqprVarM82.a();
    }

    public static final bjde a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages_annotations._id");
            ekfwVar.h("messages_annotations.conversation_id");
            if (numC.intValue() >= 20040) {
                ekfwVar.h("messages_annotations.message_id");
            }
            ekfwVar.h("messages_annotations.annotation_type");
            ekfwVar.h("messages_annotations.annotation_details");
            ekfwVar.h("conversations._id");
            ekfwVar.h("conversations.sms_thread_id");
            ekfwVar.h("conversations.name");
            if (numC.intValue() >= 10012) {
                ekfwVar.h("conversations.name_is_automatic");
            }
            if (numC.intValue() >= 59760) {
                ekfwVar.h("conversations.subtitle");
            }
            ekfwVar.h("conversations.latest_message_id");
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
            ekfwVar.h("conversations.last_read_timestamp");
            ekfwVar.h("conversations.icon");
            ekfwVar.h("conversations.participant_contact_id");
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_contact_id");
            }
            ekfwVar.h("conversations.participant_lookup_key");
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_lookup_key");
            }
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.participant_comparable_destination");
            }
            ekfwVar.h("conversations.current_self_id");
            if (numC.intValue() >= 60160) {
                ekfwVar.h("conversations.current_my_identity_foreign_key");
            }
            if (numC.intValue() >= 60360) {
                ekfwVar.h("conversations.destination_token");
            }
            ekfwVar.h("conversations.participant_count");
            ekfwVar.h("conversations.notification_enabled");
            ekfwVar.h("conversations.notification_sound_uri");
            ekfwVar.h("conversations.notification_vibration");
            ekfwVar.h("conversations.include_email_addr");
            ekfwVar.h("conversations.sms_service_center");
            if (numC.intValue() >= 8500) {
                ekfwVar.h("conversations.participant_id_list");
            }
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_id_list");
            }
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
            if (numC.intValue() >= 15000) {
                ekfwVar.h("conversations.last_interactive_event_timestamp");
            }
            if (numC.intValue() >= 15010) {
                ekfwVar.h("conversations.participant_display_destination");
            }
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_display_destination");
            }
            if (numC.intValue() >= 23000) {
                ekfwVar.h("conversations.spam_warning_dismiss_status");
            }
            if (numC.intValue() >= 26020) {
                ekfwVar.h("conversations.open_count");
            }
            if (numC.intValue() >= 28010) {
                ekfwVar.h("conversations.last_logged_scooby_metadata_timestamp");
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
            if (numC.intValue() >= 58120) {
                ekfwVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (numC.intValue() >= 53030) {
                ekfwVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (numC.intValue() >= 46050) {
                ekfwVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (numC.intValue() >= 48040) {
                ekfwVar.h("conversations.rcs_session_allows_revocation");
            }
            if (numC.intValue() >= 49020) {
                ekfwVar.h("conversations.rcs_group_capabilities");
            }
            if (numC.intValue() >= 49060) {
                ekfwVar.h("conversations.awaiting_reverse_sync");
            }
            if (numC.intValue() >= 58090) {
                ekfwVar.h("conversations.duplicate_of");
            }
            if (numC.intValue() >= 59130) {
                ekfwVar.h("conversations.new_duplicate_of");
            }
            if (numC.intValue() >= 58140) {
                ekfwVar.h("conversations.error_state");
            }
            if (numC.intValue() >= 58210) {
                ekfwVar.h("conversations.cms_life_cycle");
            }
            if (numC.intValue() >= 58540) {
                ekfwVar.h("conversations.rcs_group_self_msisdn");
            }
            if (numC.intValue() >= 58750) {
                ekfwVar.h("conversations.recipient_offline_timestamp_ms");
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
            if (numC.intValue() >= 59820) {
                ekfwVar.h("conversations.custom_theme");
            }
            if (numC.intValue() >= 60050) {
                ekfwVar.h("conversations.mms_group_upgrade_status");
            }
            if (numC.intValue() >= 60050) {
                ekfwVar.h("conversations.mms_group_upgrade_retries");
            }
            if (numC.intValue() >= 60180) {
                ekfwVar.h("conversations.encryption_protocol");
            }
            if (numC.intValue() >= 60210) {
                ekfwVar.h("conversations.encryption_id");
            }
            if (numC.intValue() >= 60250) {
                ekfwVar.h("conversations.cms_correlation_id");
            }
            if (numC.intValue() >= 60590) {
                ekfwVar.h("conversations.rcs_group_icon_url");
            }
            if (numC.intValue() >= 60740) {
                ekfwVar.h("conversations.unread_count");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bjde(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
