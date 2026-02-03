package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class ccze {
    public static final cczi A;
    public static final cczi B;
    public static final cczi C;
    public static final cczi D;
    public static final cczi E;
    public static final cczi F;
    public static final cczi G;
    public static final cczu H;
    public static final cczi I;
    public static final cczi J;
    public static final cczi K;
    public static final cczi L;
    public static final cczi M;
    public static final cczi N;
    public static final cczi O;
    public static final cczi P;
    public static final cczi Q;
    public static final cczi R;
    public static final cczi S;
    public static final cczi T;
    public static final cczi U;
    public static final cczi V;
    public static final cczi W;
    public static final cczi X;
    public static final cczi Y;
    public static final cczi Z;
    public static final cczi aa;
    public static final cczv ab;
    public static final cczv ac;
    public static final cczi i;
    public static final cczi j;
    public static final cczi k;
    public static final cczi l;
    public static final cczi m;
    public static final cczi n;
    public static final cczi o;
    public static final cczi p;
    public static final cczi q;
    public static final cczi r;
    public static final cczi s;
    public static final cczi t;
    public static final cczi u;
    public static final cczi v;
    public static final cczi w;
    public static final cczi x;
    public static final cczi y;
    public static final cczi z;
    public static final cczi a = cdag.h(cdag.b, "enable_c2o_device_camera", false);
    public static final cczi b = cdag.h(cdag.b, "enable_c2o_customization", false);
    public static final cczi c = cdag.h(cdag.b, "enable_c2o_gif_search", false);
    public static final cczi d = cdag.h(cdag.b, "enable_c2o_gif_search_recents", false);
    public static final cczi e = cdag.e(cdag.b, "c2o_gif_search_thumbnail_size", 100000);
    public static final cczi f = cdag.h(cdag.b, "enable_c2o_expressive_stickers", false);
    public static final cczi g = cdag.h(cdag.b, "enable_emoji_button_uplevel", false);
    public static final cczi h = cdag.h(cdag.b, "enable_grpc_compression", true);

    static {
        cdag.h(cdag.b, "enable_smart_linkify_flag", false);
        cdag.h(cdag.b, "enable_tclib_smart_linkify", false);
        i = cdag.h(cdag.b, "enable_multi_device", true);
        j = cdag.h(cdag.b, "enable_rbm_sort_messages_by_sent_timestamp", false);
        cdag.h(cdag.b, "enable_rbm_trigger_missing_rich_card_thumbnail_download_from_ui", false);
        cdag.h(cdag.b, "enable_rbm_generalized_verifier_ui", false);
        k = cdag.g(cdag.b, "listnr_feedback_category", "");
        l = cdag.g(cdag.b, "jibe_global_term_of_service", "https://jibe.google.com/policies/terms/");
        m = cdag.m(cdag.b, "enable_attachment_content_refactor", false);
        n = cdag.m(cdag.b, "enable_draft_ui_decouple", false);
        cdag.h(cdag.b, "enable_send_conversation_id_to_gboard", false);
        o = cdag.c(cdag.b, "report_slow_code_ratio", 1.0d);
        p = cdag.e(cdag.b, "minimum_conversation_number", 3);
        cdag.g(cdag.b, "rcs_help_url_pattern", "https://support.google.com/messages/?p=eligible&hl=%s");
        q = cdag.c(cdag.b, "async_minimum_timeout_reporting_ratio", 0.0d);
        r = cdag.g(cdag.b, "uma_upload_ratio_map", "");
        s = cdag.h(cdag.b, "enable_link_preview_untrusted_senders", false);
        t = cdag.e(cdag.b, "link_preview_manual_preview_trust_threshold", 3);
        cdag.g(cdag.b, "link_preview_help_center_link", "https://support.google.com/messages/?p=link_previews");
        u = cdag.g(cdag.b, "rich_cards_help_center_link", "https://support.google.com/messages/?p=rich_cards");
        v = cdag.g(cdag.b, "rich_cards_opt_in_consent_banner_learn_more_link", "");
        w = cdag.g(cdag.b, "rich_cards_opt_in_consent_banner_help_center_topic", "privacy_tour");
        x = cdag.h(cdag.b, "defer_background_from_broadcast", true);
        y = cdag.h(cdag.b, "actions_use_work_manager", false);
        z = cdag.h(cdag.b, "enable_verbose_bug_reports", false);
        A = cdag.h(cdag.b, "enable_clearcut_throttled_logging", true);
        B = cdag.h(cdag.b, "enable_new_image_compression", false);
        C = cdag.h(cdag.b, "skip_signature_check_for_g1_restore", false);
        D = cdag.f(cdag.b, "orphan_raw_sms_expiration_age_ms", 0L);
        E = cdag.e(cdag.b, "icing_indexing_batch_size", 20);
        cdag.f(cdag.b, "icing_indexing_all_messages_window_size", 5000L);
        F = cdag.c(cdag.b, "icing_clearcut_log_sampling_rate", 0.01d);
        G = cdag.g(cdag.b, "expressive_stickers_metadata_version", "1000001");
        H = cdag.r(cdag.b, "expressive_stickers_market_config", new ejxr() { // from class: cczd
            @Override // defpackage.ejxr
            public final Object get() {
                cczi ccziVar = ccze.a;
                return etyr.a.toByteArray();
            }
        });
        I = cdag.e(cdag.b, "recent_expressive_stickers_limit", 12);
        cdag.e(cdag.b, "expressive_stickers_c2o_toggle_button_landing_page", 1);
        cdag.e(cdag.b, "expressive_stickers_c2o_overflow_button_landing_page", 1);
        cdag.h(cdag.b, "enable_expressive_stickers_c2o_my_stickers_button", true);
        J = cdag.e(cdag.b, "generic_worker_action_max_retries", 10);
        cdag.h(cdag.b, "enable_lg_default_sim_switch", false);
        K = cdag.h(cdag.b, "enable_non_dds_mms_popup", false);
        L = cdag.h(cdag.b, "enable_camera_gallery_roll", true);
        M = cdag.e(cdag.b, "compose_entry_point_icons_version", 0);
        N = cdag.h(cdag.b, "enable_draft_visual_state", false);
        O = cdag.f(cdag.b, "remote_instance_refresh_interval_ms", TimeUnit.HOURS.toMillis(24L));
        P = cdag.h(cdag.b, "huawei_mate20_upgrade_cleardata", true);
        Q = cdag.h(cdag.b, "enable_self_exclusive_worker", true);
        cdag.h(cdag.b, "enable_gif_staggered_grid_layout", false);
        R = cdag.h(cdag.b, "enabled_verified_sms", false);
        cdag.h(cdag.b, "enable_inbox_archive_animation", false);
        S = cdag.g(cdag.b, "verified_sms_privacy_tour_topic", "verified_sms_pt");
        T = cdag.g(cdag.b, "verified_sms_host_and_port", "verifiedsms-pa.googleapis.com:443");
        cdag.f(cdag.b, "verified_sms_verify_message_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        cdag.f(cdag.b, "verified_sms_key_rotation_frequency_ms", TimeUnit.DAYS.toMillis(14L));
        cdag.h(cdag.b, "enable_verified_sms_key_rotation", false);
        U = cdag.h(cdag.b, "force_show_rcs_upsell", false);
        V = cdag.h(cdag.b, "enable_message_status_logging", false);
        W = cdag.e(cdag.b, "message_status_logging_cleanup_for_messages_in_final_state_in_days", 2);
        X = cdag.e(cdag.b, "message_status_logging_cleanup_for_messages_in_non_final_state_in_days", 14);
        cdag.h(cdag.b, "enable_d26r_query_logger", true);
        cdag.c(cdag.b, "d26r_query_logger_uma_upload_ratio", 0.01d);
        cdag.c(cdag.b, "d26r_query_logger_unknown_query_uma_upload_ratio", 0.0d);
        cdag.h(cdag.b, "custom_conversation_scroll_animation", true);
        Y = cdag.h(cdag.b, "debug_menu_default_available", false);
        Z = cdag.h(cdag.b, "force_check_rcs_session_id", true);
        aa = cdag.h(cdag.b, "enable_overlapping_rendering_overriding_in_conversation_message_view", false);
        cdag.h(cdag.b, "enable_logging_send_failure_country_code", false);
        cdag.h(cdag.b, "enable_contact_picker_refactor_logging", false);
        cdag.e(cdag.b, "contact_picker_max_journey_history", -1);
        cdag.h(cdag.b, "enable_sent_timestamp_for_rcs_reports", false);
        ab = cdag.m(cdag.b, "use_system_font", false);
        ac = cdag.m(cdag.b, "enable_input_manager_refactor", false);
    }

    public static boolean a(Random random, cczv cczvVar) {
        double dDoubleValue = ((Double) cczvVar.e()).doubleValue();
        if (dDoubleValue <= 0.0d) {
            return false;
        }
        return dDoubleValue >= 1.0d || random.nextDouble() < dDoubleValue;
    }
}
