package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbek implements fbej {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.o("capability_reporting_enabled", false);
        b = dzzfVarB.m("register_capabilities_check_change_interval_millis", 86400000L);
        c = dzzfVarB.m("register_capabilities_refresh_jitter_ms", 7200000L);
        d = dzzfVarB.m("register_capabilities_report_anyway_interval_millis", 2592000000L);
    }

    @Override // defpackage.fbej
    public final long a() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbej
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fbej
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fbej
    public final boolean d() {
        return ((Boolean) a.b()).booleanValue();
    }
}
