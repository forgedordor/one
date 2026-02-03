package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrt {
    public static final cczi a = cdag.e(cdag.b, "forward_sync_max_attempts_per_batch", 3);
    public static final ejxr b = cdag.v("skip_prior_messages_in_sync_check_before_sync_configured");
    public static final cczi c = cdag.k(cdag.b, "sync_batch_target_time_millis", 100);
    public static final cczi d = cdag.k(cdag.b, "sync_start_time_adjustment_millis", -1000);
    public static final cczi e = cdag.j(cdag.b, "forward_sync_max_messages_to_scan_per_batch", 4000);
    public static final cczi f = cdag.j(cdag.b, "forward_sync_max_messages_to_update_per_batch", 1000);
    public static final cczi g = cdag.j(cdag.b, "forward_sync_min_messages_to_update_per_batch", 80);
    public static final ejxr h = cdag.v("forward_sync_restores_rcs_as_rcs_not_mms");
    public static final cczi i = cdag.j(cdag.b, "forward_sync_keep_alive_strategy", 0);
    public static final cczi j = cdag.k(cdag.b, "forward_sync_engine_delay_millis", 60000);

    public static caze a() {
        int iIntValue = ((Integer) i.e()).intValue();
        if (iIntValue == 0) {
            return caze.FOREGROUND_SERVICE;
        }
        if (iIntValue == 1) {
            return caze.WAKELOCK;
        }
        if (iIntValue == 2) {
            return caze.WORKMANAGER_ONLY;
        }
        throw new AssertionError(a.g(iIntValue, "Unexpected forward sync keep alive strategy: "));
    }

    public static Duration b() {
        return Duration.ofMillis(((Long) d.e()).longValue());
    }
}
