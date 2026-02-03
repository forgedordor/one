package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtr {
    public static final ejxr A;
    public static final ejxr B;
    public static final ejxr C;
    public static final cczv D;
    public static final cczi E;
    public static final ejxr F;
    public static final cczv G;
    public static final ejxr H;
    public static final cczv I;
    public static final cczv J;
    public static final cczv K;
    public static final cczv L;
    public static final cczv M;
    public static final ejxr N;
    public static final ejxr O;
    public static final cczi P;
    public static final ejxr Q;
    public static final ejxr R;
    public static final cczi S;
    public static final ejxr T;
    public static final ejxr U;
    public static final ejxr V;
    public static final ejxr W;
    public static final ejxr X;
    public static final ejxr Y;
    private static final ejxr Z;
    private static final cczi aa;
    public static final cczi f;
    public static final cczv g;
    public static final cczv h;
    public static final ejxr i;
    public static final ejxr j;
    public static final cczi k;
    public static final cczi l;
    public static final cczi m;
    public static final cczi n;
    public static final cczi o;
    public static final ejxr p;
    public static final ejxr q;
    public static final cczi r;
    public static final ejxr s;
    public static final ejxr t;
    public static final ejxr u;
    public static final ejxr v;
    public static final ejxr w;
    public static final ejxr x;
    public static final ejxr y;
    public static final ejxr z;
    public static final cczi a = cdag.e(cdag.b, "cs_user_replies_threshold", 5);
    public static final ejxr b = cdag.w(191513431, "moirai_enable_spam_reporting");
    public static final cczi c = cdag.h(cdag.b, "disable_logging_spam_consent", false);
    public static final cczi d = cdag.h(cdag.b, "enable_on_device_stranger_danger", false);
    public static final ejxr e = cdag.v("spam_send_server_info_to_hades");

    static {
        cdag.v("spam_run_moirai_precheck_before_odsd");
        f = cdag.h(cdag.b, "enable_moirai_spam_protection", false);
        g = cdag.e(cdag.b, "tachyon_max_number_of_messages_to_send", 10);
        h = cdag.e(cdag.b, "spam_max_number_of_messages_to_send_to_carrier", 10);
        cdag.v("add_block_and_spam_action_for_one_on_one_conversations");
        i = cdag.x("enable_tartarus_v2");
        j = cdag.x("enable_tartarus_v2_text_classification");
        k = cdag.g(cdag.b, "moirai_text_classification_blob_id", "");
        l = cdag.g(cdag.b, "moirai_destination_classification_blob_id", "");
        m = cdag.f(cdag.b, "moirai_destination_classification_update_frequency_hours", 24L);
        n = cdag.g(cdag.b, "moirai_region", "");
        o = cdag.f(cdag.b, "spam_notification_delay_timeout_ms", 4000L);
        p = cdag.v("enable_safe_url_on_click_check");
        q = cdag.x("enable_show_dialog_on_stranger_link_click");
        r = cdag.m(cdag.b, "enable_show_dialog_on_all_spam", true);
        s = cdag.x("exempt_otp_from_spam_notification_delay");
        t = cdag.x("enable_delay_eligibility_check_all_participants_contact");
        u = cdag.x("enable_delay_eligibility_check_first_message_convo");
        v = cdag.x("spam_ignore_actions_from_short_codes");
        w = cdag.x("spam_hades_enable_westworld_logging");
        ejxr ejxrVarX = cdag.x("spam_hades_enable_event_started_logging");
        ejxrVarX.getClass();
        x = ejxrVarX;
        y = cdag.x("spam_hades_disable_migration_clearcut_logging");
        z = cdag.x("spam_use_message_wrapper_8");
        A = cdag.x("enable_spatula_classification");
        B = cdag.x("enable_managed_users_signed_out_fix");
        C = cdag.x("enable_spatula_video_classification");
        D = cdag.e(cdag.b, "safetycore_notification_interval_hours", 24);
        E = cdag.h(cdag.b, "enable_safetycore_missing_notification", true);
        F = cdag.x("enable_automation_detection_for_click_events");
        G = cdag.f(cdag.b, "automation_detection_snapshot_timeout_milliseconds", 3000L);
        H = cdag.x("enable_content_binding_v2_for_automation_detection");
        cdag.x("enable_account_name_in_spatula_settings_intent");
        I = cdag.g(cdag.b, "safetycore_appstore_link", "https://play.google.com/store/apps/details?id=com.google.android.safetycore");
        J = cdag.f(cdag.b, "spatula_settings_timeout_millis", 1000L);
        K = cdag.f(cdag.b, "spatula_classification_timeout_seconds", 30L);
        L = cdag.f(cdag.b, "spatula_pending_verdict_timeout_millis", 60000L);
        M = cdag.g(cdag.b, "spatula_test_image_digest", "");
        N = cdag.v("enable_sstoe");
        ejxr ejxrVarX2 = cdag.x("enable_spatula_delete_shortcut");
        ejxrVarX2.getClass();
        O = ejxrVarX2;
        P = cdag.h(cdag.b, "enable_spam_rcs_location_text_killswitch", true);
        Q = cdag.x("spam_close_hades_after_classification");
        R = cdag.x("spam_close_hades_on_memory_pressure");
        Z = cdag.x("spam_log_classifier_metadata");
        S = cdag.m(cdag.b, "disable_spatula_toolstone_logging", true);
        aa = cdag.m(cdag.b, "spatula_specify_api_unavailable", true);
        T = cdag.x("fix_block_dialog_type");
        U = cdag.x("spam_ignore_preview_for_speedbump");
        V = cdag.x("spatula_classify_on_forward");
        W = cdag.x("spam_send_participant_counts_to_tachyon");
        X = cdag.x("spam_use_protection_settings_in_search");
        Y = cdag.x("spam_log_rd_status");
    }

    public static final boolean a() {
        Object objE = ((cczi) F.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final boolean b() {
        Object objE = ((cczi) H.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final boolean c() {
        Object objE = ((cczi) B.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final boolean d() {
        return !((Boolean) c.e()).booleanValue();
    }

    public static final boolean e() {
        Object objE = ((cczi) A.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final boolean f() {
        Object objE = ((cczi) O.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final boolean g() {
        Object objE = ((cczi) C.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public static final Boolean h() {
        return (Boolean) ((cczi) Z.get()).e();
    }

    public static final Boolean i() {
        return (Boolean) aa.e();
    }
}
