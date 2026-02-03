package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crfg {
    public static final cczv a = cdag.e(cdag.b, "p2p_suggestion_rewriter_max_number_of_rules_per_impression", 1);
    public static final cczv b = cdag.e(cdag.b, "smart_reply_lib_min_trim_level", 40);
    public static final cczv c = cdag.f(cdag.b, "smart_reply_lib_trim_throttle_seconds", TimeUnit.MINUTES.toSeconds(1));
    public static final cczv d;
    public static final ejxr e;

    static {
        cdag.h(cdag.b, "enable_p2p_smart_assistant_suggestions", false);
        d = cdag.h(cdag.b, "enable_smart_reply_lib_creation_memory_diff", false);
        ejxr ejxrVarV = cdag.v("log_srlib_exceptions_silent_feedback");
        ejxrVarV.getClass();
        e = ejxrVarV;
    }
}
