package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajfv {
    public static final cczv a = cdag.m(cdag.b, "enable_prime_jank_metrics", false);
    public static final cczv b = cdag.m(cdag.b, "primes_jank_monitor_all_activities", false);
    public static final cczv c = cdag.m(cdag.b, "enable_stall_metrics", false);
    public static final cczv d = cdag.j(cdag.b, "stalls_initial_monitoring_delay_ms", 250);
    public static final cczv e = cdag.j(cdag.b, "stalls_check_for_response_interval_ms", 250);
    public static final cczv f = cdag.j(cdag.b, "stalls_mid_stall_interval_ms", 250);
    public static final cczv g;
    public static final cczv h;
    public static final cczv i;
    public static final cczv j;
    static final cczv k;
    static final cczv l;
    public static final cczv m;
    public static final cczv n;
    public static final cczv o;
    public static final cczv p;
    public static final cczv q;

    static {
        dzzf dzzfVar = cdag.b;
        ewtl ewtlVar = (ewtl) ewtm.a.createBuilder();
        ewtlVar.a(1000);
        ewtlVar.a(2500);
        ewtlVar.a(5000);
        g = cdag.t(dzzfVar, "stalls_threshold_list_ms", (ewtm) ewtlVar.build(), new dzze() { // from class: ajfu
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewtm) evsn.parseFrom(ewtm.a, bArr);
            }
        });
        h = cdag.j(cdag.b, "stalls_post_to_main_interval_ms", 250);
        i = cdag.m(cdag.b, "enable_cpu_profiling_v2", false);
        j = cdag.m(cdag.b, "enable_native_crash_reporting", false);
        k = cdag.m(cdag.b, "enable_memory_monitoring", false);
        l = cdag.m(cdag.b, "enable_network_monitoring", false);
        m = cdag.m(cdag.b, "enable_auto_url_sanitization_for_network_monitoring", false);
        n = cdag.m(cdag.b, "enable_metric_extension_for_network_monitoring", false);
        o = cdag.m(cdag.b, "enable_latency_monitoring", false);
        p = cdag.m(cdag.b, "enable_package_monitoring", false);
        q = cdag.m(cdag.b, "enable_battery_monitoring", false);
    }

    public final boolean a() {
        return ((Boolean) k.e()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) l.e()).booleanValue();
    }
}
