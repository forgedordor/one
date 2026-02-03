package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfd {
    public static final cczv a = cdag.f(cdag.b, "gaia_pairing_verification_timeout_millis", TimeUnit.MINUTES.toMillis(5));
    public static final cczv b = cdag.f(cdag.b, "message_repush_time_mills_buffer", 1000);
    public static final cczv c = cdag.e(cdag.b, "ditto_max_messages_per_repush", 100);
    public static final cczi d = cdag.e(cdag.b, "ditto_max_messages_per_request", 100);
    public static final cczi e = cdag.e(cdag.b, "ditto_max_contacts_per_request", Alert.DURATION_SHOW_INDEFINITELY);
    public static final cczi f = cdag.e(cdag.b, "ditto_default_alarm_retry_interval_secs", 30);
    public static final cczi g = cdag.e(cdag.b, "ditto_max_conversations_per_request", 25);
    public static final cczi h = cdag.e(cdag.b, "ditto_blob_lifespan_days", 28);
    public static final cczi i = cdag.g(cdag.b, "ditto_display_url", "https://messages.google.com/web");
    public static final cczi j = cdag.g(cdag.b, "ditto_server_timestamp_url", "https://messages.google.com/web/timesource");
    public static final cczi k = cdag.e(cdag.b, "ditto_max_hours_before_challenge", 2);
    public static final cczi l = cdag.e(cdag.b, "ditto_max_minutes_after_challenge_cutoff", 10);
    public static final cczi m = cdag.e(cdag.b, "ditto_max_attachments_per_pre_upload_batch", 30);
    public static final ejxr n = cdag.v("enable_keychain_pairing_debug_menu");
    public static final ejxr o = cdag.v("only_get_conversation_populates_participant_group_e2ee");
    public static final ejxr p;

    static {
        cdag.v("enable_get_conversation_by_conversation_id");
        cdag.v("enable_keychain_pairing_lskf");
        p = cdag.v("limit_list_conversations_query");
    }
}
