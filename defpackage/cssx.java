package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cssx {
    public static final cczv a;
    public static final cczv b;

    static {
        cdag.f(cdag.b, "verified_sms_c11n_check_interval", TimeUnit.DAYS.toMillis(7L));
        cdag.f(cdag.b, "verified_sms_valid_key_duration_ms", 1382400000L);
        a = cdag.m(cdag.b, "vsms_suppress_unverified_ui", false);
        b = cdag.h(cdag.b, "enable_vsms_diagnostic_rpc", false);
        cdag.g(cdag.b, "allowed_senders_diagnostic_rpc_regex", ".^");
        cdag.g(cdag.b, "verified_sms_report_diagnostic_link", "https://goto.corp.google.com/vsms-diagnostic-information");
    }

    eiju a();

    boolean b();

    boolean c();
}
