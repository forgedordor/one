package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxb {
    public static final cczi a;
    public static final ejxr b;

    static {
        cdag.h(cdag.b, "fix_item_disappearing_and_crashing_when_clicking_archive_or_spam", false);
        a = cdag.m(cdag.b, "gaia_hide_option_to_switch_to_work_profile", false);
        b = cdag.x("log_silent_feedback_on_account_error");
        cdag.x("show_search_icon_in_gaia_search_bar");
    }

    public static boolean a() {
        return !elvg.GO_BUILD.equals(cqbe.a);
    }

    public static boolean b() {
        return a() && ((Boolean) cdip.a.e()).booleanValue();
    }
}
