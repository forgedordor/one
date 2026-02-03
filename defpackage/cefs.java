package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefs {
    public static final cczi a = cdag.g(cdag.b, "tachyon_media_path", "https://instantmessaging-pa.googleapis.com/upload");
    public static final cczi b = cdag.f(cdag.b, "tachyon_registration_timeout_slop_ms", TimeUnit.MINUTES.toMillis(10));
    public static final cczi c = cdag.g(cdag.b, "tachyon_registration_pin", "");

    @Deprecated
    public static final cczi d = cdag.h(cdag.b, "tachyon_phone_registration", true);
    public static final cczi e = cdag.g(cdag.b, "jibe_pcscf_regex", ".*telephony.goog$");
    public static final cczi f = cdag.e(cdag.b, "bind_retry_delay_scale_factor", 1);
    public static final cczi g = cdag.e(cdag.b, "phone_pong_watchdog_seconds", 15);
    public static final cczi h = cdag.e(cdag.b, "phone_idle_timeout_seconds", 65);
    public static final cczi i = cdag.e(cdag.b, "phone_bind_retry_times", 2);
    public static final cczi j = cdag.e(cdag.b, "ditto_pong_watchdog_seconds", 15);
    public static final cczi k = cdag.e(cdag.b, "ditto_idle_timeout_seconds", 65);
    public static final cczi l = cdag.e(cdag.b, "ditto_bind_retry_times", 3);
    public static final cczi m = cdag.e(cdag.b, "gditto_pong_watchdog_seconds", 15);
    public static final cczi n = cdag.e(cdag.b, "gditto_idle_timeout_seconds", 65);
    public static final cczi o = cdag.e(cdag.b, "gditto_bind_retry_times", 2);
    public static final cczi p = cdag.e(cdag.b, "cms_pong_watchdog_seconds", 15);
    public static final cczi q = cdag.e(cdag.b, "cms_idle_timeout_seconds", 65);
    public static final cczi r = cdag.e(cdag.b, "cms_bind_retry_times", 2);
    public static final cczi s = cdag.e(cdag.b, "bind_handler_pull_delay_seconds", 2);
}
