package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwc {
    public static final cczi a = cdag.h(cdag.b, "enable_message_reminder", false);
    public static final ejxr b = cdag.x("enable_updated_message_reminder_feature");
    public static final ejxr c = cdag.x("enable_reminder_expiration");
    public static final cczi d = cdag.f(cdag.b, "reminder_expiration_millis", 259200000);
    public static final cczi e = cdag.h(cdag.b, "enable_incoming_message_notification_reminder", false);
    public static final cczi f = cdag.f(cdag.b, "debug_reminder_snooze_override_in_seconds", -1);
    public static final cczi g = cdag.f(cdag.b, "debug_reminder_override_expiration_in_seconds", -1);
    public static final cczi h;

    static {
        cdag.h(cdag.b, "reminder_scroll_flash", false);
        cdag.e(cdag.b, "reminder_scroll_flash_delay", 400);
        cdag.e(cdag.b, "reminder_scroll_flash_duration", 300);
        cdag.e(cdag.b, "reminder_scroll_flash_fade_out_duration", 5);
        h = cdag.h(cdag.b, "enable_one_hour_default_smart_action_reminder", false);
    }

    public static boolean a() {
        if (eotp.a("bugle.disable_reminders_with_conversation_2", "bugle")) {
            return false;
        }
        return ((Boolean) a.e()).booleanValue() || b();
    }

    public static boolean b() {
        return ((Boolean) ((cczi) b.get()).e()).booleanValue();
    }
}
