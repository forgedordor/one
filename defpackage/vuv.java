package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuv implements vur {
    public final xhh a;
    public final Duration b;

    public vuv(xhh xhhVar, Duration duration) {
        this.a = xhhVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuv)) {
            return false;
        }
        vuv vuvVar = (vuv) obj;
        return fdbq.f(this.a, vuvVar.a) && fdbq.f(this.b, vuvVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Duration duration = this.b;
        return iHashCode + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        return "Success(shortcut=" + this.a + ", loadingLatency=" + this.b + ")";
    }
}
