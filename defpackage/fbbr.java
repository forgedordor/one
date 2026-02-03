package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbbr implements fbbq {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;
    public static final dzzh e;
    public static final dzzh f;
    public static final dzzh g;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.android.gms.icing.mdd")).c().b();
        a = dzzfVarB.m("api_logging_sample_interval", 100L);
        dzzfVarB.m("cleanup_log_logging_sample_interval", 1000L);
        b = dzzfVarB.m("group_stats_logging_sample_interval", 100L);
        c = dzzfVarB.m("mdd_android_sharing_sample_interval", 100L);
        d = dzzfVarB.m("mdd_default_sample_interval", 100L);
        dzzfVarB.m("mdd_download_events_sample_interval", 1L);
        dzzfVarB.m("mobstore_file_service_stats_sample_interval", 100L);
        e = dzzfVarB.m("network_stats_logging_sample_interval", 100L);
        f = dzzfVarB.m("pds_migration_compare_results_sample_interval", 10000L);
        dzzfVarB.m("silent_feedback_sample_interval", 100L);
        g = dzzfVarB.m("storage_stats_logging_sample_interval", 100L);
    }

    @Override // defpackage.fbbq
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long c() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long d() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.fbbq
    public final long g() {
        return ((Long) g.b()).longValue();
    }
}
