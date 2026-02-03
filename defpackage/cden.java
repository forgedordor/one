package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cden {
    public static final cczi a = cdag.h(cdag.b, "enable_silent_assert_feedback", false);
    public static final cczi b = cdag.h(cdag.b, "enable_silent_crash_issue_notification", false);
    public static final cczi c = cdag.f(cdag.b, "user_report_notification_backoff_ms", 2592000000L);

    eiju a(Throwable th);

    eiju b(Throwable th);

    void c(Throwable th);
}
