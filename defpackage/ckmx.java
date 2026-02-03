package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmx {
    public static final ejxr a = cdag.v("enable_xms_reactions_sending");
    public static final cczi b;
    public static final cczi c;
    public static final cczi d;

    static {
        cdag.h(cdag.b, "enable_reactions_configurable_logging", false);
        cdag.g(cdag.b, "reactions_configurable_log_level", "FINEST");
        b = cdag.e(cdag.b, "reactions_xms_search_message_limit", 50);
        c = cdag.e(cdag.b, "reactions_xms_matched_result_limit", 2);
        d = cdag.e(cdag.b, "reactions_matcher_duplicate_distance_limit", 30);
        cdag.h(cdag.b, "disable_reactions_promo_for_hawkeye", false);
    }

    public static boolean a() {
        return ((Boolean) ((cczi) a.get()).e()).booleanValue();
    }
}
