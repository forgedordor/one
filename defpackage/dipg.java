package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipg {
    public final Duration a;
    public final Duration b;

    public dipg() {
        this(eoob.g(0), eoob.g(120));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dipg)) {
            return false;
        }
        dipg dipgVar = (dipg) obj;
        return fdbq.f(this.a, dipgVar.a) && fdbq.f(this.b, dipgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TimerUiData(elapsedTime=" + this.a + ", maxDuration=" + this.b + ")";
    }

    public dipg(Duration duration, Duration duration2) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
    }
}
