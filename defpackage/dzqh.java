package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzqh {
    static final dzqh a = new dzqh(0, null);
    public final long b;
    private final feep c;

    public dzqh(long j, feep feepVar) {
        this.b = j;
        this.c = feepVar;
    }

    final feep a() {
        if (this != a) {
            return this.c;
        }
        ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryEvent", "getMemoryUsageMetric", 39, "MemoryEvent.java")).q("metric requested for EMPTY_SNAPSHOT");
        return null;
    }
}
