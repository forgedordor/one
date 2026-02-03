package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ainn {
    public final long a;
    public final long b;

    public ainn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static final long a(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ainn)) {
            return false;
        }
        ainn ainnVar = (ainn) obj;
        return this.a == ainnVar.a && this.b == ainnVar.b;
    }

    public final int hashCode() {
        return (ainl.a(this.a) * 31) + ainl.a(this.b);
    }

    public final String toString() {
        return "ClearcutLogTimestamp(millis=" + this.a + ", elapsedMillis=" + this.b + ")";
    }
}
