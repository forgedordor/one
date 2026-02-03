package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajjp {
    private static final cqce a = cqce.g("BugleUsageStatistics", "UsageStatisticsStatus");
    private final fcsu b;

    public ajjp(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    public final void a() {
        a.m("Clearcut loggings are disabled.");
    }

    public final boolean b() {
        return ((cqpz) this.b.b()).i("bugle_enable_analytics", true);
    }
}
