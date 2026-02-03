package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbbj implements fbbi {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;
    public static final dzzh e;
    public static final dzzh f;
    public static final dzzh g;
    public static final dzzh h;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.android.gms.icing.mdd")).c().b();
        a = dzzfVarB.m("abs_free_space_after_download", 524288000L);
        b = dzzfVarB.m("abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        c = dzzfVarB.m("abs_free_space_after_download_low_storage_allowed", 104857600L);
        d = dzzfVarB.o("downloader_enforce_https", true);
        e = dzzfVarB.m("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = dzzfVarB.m("downloader_max_threads", 2L);
        g = dzzfVarB.o("enforce_low_storage_behavior", true);
        h = dzzfVarB.l("fraction_free_space_after_download", 0.1d);
        dzzfVarB.m("time_to_wait_for_downloader", 120000L);
    }

    @Override // defpackage.fbbi
    public final double a() {
        return ((Double) h.b()).doubleValue();
    }

    @Override // defpackage.fbbi
    public final long b() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbbi
    public final long c() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbbi
    public final long d() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fbbi
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.fbbi
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.fbbi
    public final boolean g() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fbbi
    public final boolean h() {
        return ((Boolean) g.b()).booleanValue();
    }
}
