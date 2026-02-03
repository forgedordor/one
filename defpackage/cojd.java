package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojd {
    private static final cczi b = cdag.e(cdag.b, "file_transfer_progress_threshold_bytes", 512);
    public static final cczi a = cdag.f(cdag.b, "file_transfer_progress_notifications_after_milliseconds", 0);
    private static final cczi c = cdag.e(cdag.b, "file_transfer_idle_timeout_seconds", 5);
    private static final cczi d = cdag.e(cdag.b, "file_transfer_max_retries_for_download", 7);

    public static int a() {
        return ((Integer) d.e()).intValue();
    }

    public static int b() {
        return ((Integer) b.e()).intValue();
    }

    public static evrj c() {
        return evwy.f(((Integer) c.e()).intValue());
    }
}
