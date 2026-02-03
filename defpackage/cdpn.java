package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpn {
    public static final ejxr a = cdag.x("lighter_enable_lighter");
    public static final ejxr b = cdag.x("lighter_enable_component_check");
    public static final cczi c;

    static {
        cdag.x("lighter_trigger_intent_filter_on_account_change");
        c = cdag.g(cdag.b, "lighter_learn_more_url", "https://support.google.com/messages/answer/9836003?ref_topic=7501205");
        cdag.x("enable_info_icon_tooltip_auto_popup");
        cdag.f(cdag.b, "lighter_photos_images_ttl_millis", 2592000000L);
        cdag.x("enable_lighter_logging");
        cdag.f(cdag.b, "lighter_home_action_timeout_millis", 30000L);
    }

    public static final boolean a() {
        if (abxb.a()) {
            return ((Boolean) ((cczi) a.get()).e()).booleanValue() || apvj.a();
        }
        return false;
    }
}
