package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbn {
    private final long a;
    private final long b;

    public qbn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fdbq.f(getClass(), obj.getClass())) {
            qbn qbnVar = (qbn) obj;
            if (qbnVar.a == this.a && qbnVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (qbm.a(this.a) * 31) + qbm.a(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
