package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqiw implements dqix {
    public final Duration a;
    public final Duration b;
    public final dqgj c;

    public dqiw() {
        this(Duration.ZERO, dqgn.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqiw)) {
            return false;
        }
        dqiw dqiwVar = (dqiw) obj;
        return fdbq.f(this.a, dqiwVar.a) && fdbq.f(this.b, dqiwVar.b) && fdbq.f(this.c, dqiwVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dqgj dqgjVar = this.c;
        return (iHashCode * 31) + (dqgjVar == null ? 0 : dqgjVar.hashCode());
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ", maxDuration=" + this.b + ", noiseCancellationUiData=" + this.c + ")";
    }

    public dqiw(Duration duration, Duration duration2, dqgj dqgjVar) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
        this.c = dqgjVar;
    }
}
