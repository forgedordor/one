package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfv {
    public final double a;
    public final double b;
    public final Duration c;
    private final double d;
    private final double e;

    public dnfv() {
        this(31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnfv)) {
            return false;
        }
        dnfv dnfvVar = (dnfv) obj;
        if (Double.compare(this.a, dnfvVar.a) != 0 || Double.compare(this.b, dnfvVar.b) != 0) {
            return false;
        }
        double d = dnfvVar.d;
        if (Double.compare(5.0d, 5.0d) != 0 || !fdbq.f(this.c, dnfvVar.c)) {
            return false;
        }
        double d2 = dnfvVar.e;
        return Double.compare(0.95d, 0.95d) == 0;
    }

    public final int hashCode() {
        return (((((((dnfu.a(this.a) * 31) + dnfu.a(this.b)) * 31) + dnfu.a(5.0d)) * 31) + this.c.hashCode()) * 31) + dnfu.a(0.95d);
    }

    public final String toString() {
        return "UsageFrecencyFactors(inContextScore=" + this.a + ", offContextScore=" + this.b + ", recencyScore=5.0, recencyDecreaseDuration=" + this.c + ", recencyDecrease=0.95)";
    }

    public /* synthetic */ dnfv(int i) {
        Duration durationOfDays = Duration.ofDays(1L);
        durationOfDays.getClass();
        this.a = 1 != (i & 1) ? 0.0d : 10.0d;
        this.b = (i & 2) != 0 ? 1.0d : 0.0d;
        this.d = 5.0d;
        this.c = durationOfDays;
        this.e = 0.95d;
    }
}
