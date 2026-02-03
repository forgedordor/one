package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbu {
    public static final dbhd a = a("enable_log_saver", true);
    public static final dbhd b = a("enable_persistent_logging", true);
    public static final dbhd c = b("default_persistent_log_saver_rotation_set_size", 4);
    public static final dbhd d;
    public static final dbhd e;
    public static final dbhd f;
    public static final dbhd g;
    public static final dbhd h;
    public static final dbhd i;
    public static final dbhd j;

    static {
        a("enable_realtime_exceptional_logging", false);
        d = b("default_persistent_log_saver_file_limit_bytes", 262144);
        e = a("save_all_logs", false);
        f = c("log_level", "INFO");
        g = a("enable_sensitive_logging", false);
        a("enable_dtmf_tone_logging", false);
        a("should_crash_on_wtf", false);
        h = a("enable_debug_mode", false);
        i = c("tycho_package", "com.google.android.apps.tycho");
        a("enable_woodpecker_persistent_logging", false);
        j = c("bugle_testing_simulation_session_id", "");
    }

    private static dbhd a(String str, Boolean bool) {
        return dfbv.e("carrier_services_".concat(str), bool.booleanValue());
    }

    private static dbhd b(String str, Integer num) {
        return dfbv.c("carrier_services_".concat(str), num);
    }

    private static dbhd c(String str, String str2) {
        return dfbv.d("carrier_services_".concat(str), str2);
    }
}
