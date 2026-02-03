package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwbt {
    public static final cczv A;
    private static final cdaf B;
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EtouffeeConfig");
    public static final cczv b;
    static final cczv c;
    public static final cczv d;
    static final cczv e;
    static final cczv f;
    public static final cczv g;
    public static final cczv h;
    public static final cczv i;
    public static final cczv j;
    public static final cczv k;
    public static final cczv l;
    static final cczv m;
    public static final cczv n;
    public static final cczv o;
    public static final cczv p;
    public static final cczv q;
    static final ejxr r;
    static final ejxr s;
    public static final cczv t;
    public static final cczv u;
    public static final ejxr v;
    public static final cczv w;
    public static final cczv x;
    public static final cczv y;
    public static final cczv z;

    static {
        dzzf dzzfVar = cdag.a;
        cdaf cdafVar = new cdaf(cdag.a, "Etouffee__");
        B = cdafVar;
        b = cdafVar.d("enable_etouffee", true);
        c = cdafVar.d("enable_e2ee_receive", true);
        d = cdafVar.a("prekey_count", 100);
        e = cdag.s(cdafVar.a, cdafVar.b.concat("scytale_experiment_config"), new byte[0]);
        f = cdafVar.d("use_official_mimetypes_for_outgoing", true);
        g = cdafVar.d("enable_etouffee_ui", true);
        h = cdafVar.d("enable_save_etouffee_to_telephony_setting", false);
        i = cdafVar.d("enable_user_toggle_for_etouffee", false);
        j = cdafVar.c("user_toggle_for_etouffee_learn_more_destination", "");
        k = cdafVar.d("enable_etouffee_security_key_ui", false);
        l = cdafVar.c("identity_details_learn_more_destination", "https://support.google.com/messages/answer/10252671#verify");
        m = cdafVar.d("add_message_prefix", true);
        n = cdafVar.c("message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        cdafVar.c("previous_message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        cdafVar.d("enable_open_etouffee_conversation_growthkit", true);
        o = cdafVar.c("etouffee_privacy_setting_learn_more_destination", "");
        p = cdafVar.d("enable_etouffee_message_failure_to_decrypt_ui", true);
        q = cdafVar.d("always_enable_etouffee_message_failure_to_decrypt_ui", false);
        cdafVar.a("etouffee_failure_to_decrypt_display_garbled_length", 25);
        cdafVar.c("etouffee_failure_to_decrypt_dialog_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        cdafVar.c("etouffee_tombstone_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        r = ejxx.a(new ejxr() { // from class: bwbr
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = bwbt.a;
                return cdag.e(cdag.b, "e2ee_overhead_constant", 410);
            }
        });
        s = ejxx.a(new ejxr() { // from class: bwbs
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = bwbt.a;
                return cdag.c(cdag.b, "e2ee_overhead_ratio", 1.36d);
            }
        });
        t = cdafVar.a("identity_verification_max_retry", 5);
        u = cdafVar.a("identity_verification_max_cache_size", 1000);
        v = cdag.y(186182985, "use_messaging_identity_in_identity_worker_parameters");
        w = cdafVar.a("id_fresh_buffer", 10000);
        x = cdafVar.b("rcs_group_sync_throttle_in_ms", 300000L);
        cdag.v("send_encrypted_display_imdn_with_control_message_source");
        y = cdafVar.a("max_conversations_to_update_when_reprovisions", 20);
        cdafVar.a("max_alpha_for_highlight_animation", 31);
        cdafVar.b("highlight_animation_duration_in_milli_seconds", 1000L);
        cdafVar.b("highlight_animation_delay_in_milli_seconds", 500L);
        z = cdafVar.d("enable_e2ee_one_to_one_ui_v2", false);
        A = cdafVar.d("enable_one_to_one_e2ee_details_page_section", false);
    }

    public static boolean a() {
        if (!cqbe.a.equals(elvg.WEAR_BUILD) && !cqbe.a.equals(elvg.WEAR_ENG_BUILD) && !cqbe.a.equals(elvg.WEAR_FISH_FOOD_BUILD) && !cqbe.a.equals(elvg.WEAR_DOG_FOOD_BUILD) && !cqbe.a.equals(elvg.WEAR_OPEN_BETA_BUILD) && !cqbe.a.equals(elvg.WEAR_RELEASE_BUILD)) {
            return ((Boolean) b.e()).booleanValue() && ((Boolean) cefs.d.e()).booleanValue();
        }
        eotp.a("bugle.enable_wear_standalone_rcs", "bugle");
        return false;
    }

    public static boolean b() {
        return ((Boolean) z.e()).booleanValue();
    }

    static boolean c() {
        return a() && ((Boolean) c.e()).booleanValue();
    }

    static boolean d() {
        return ((Boolean) q.e()).booleanValue();
    }

    public static boolean e() {
        return a() && ((Boolean) g.e()).booleanValue();
    }

    static boolean f() {
        return ((Boolean) f.e()).booleanValue();
    }
}
