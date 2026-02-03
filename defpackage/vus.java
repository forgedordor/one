package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vus implements vur {
    public final djdi a;
    public final dpzj b;
    public final Duration c;

    public vus(djdi djdiVar, dpzj dpzjVar, Duration duration) {
        djdiVar.getClass();
        dpzjVar.getClass();
        this.a = djdiVar;
        this.b = dpzjVar;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vus)) {
            return false;
        }
        vus vusVar = (vus) obj;
        return this.a == vusVar.a && fdbq.f(this.b, vusVar.b) && fdbq.f(this.c, vusVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Duration duration = this.c;
        return (iHashCode * 31) + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        return "Success(input=" + this.a + ", resultingDisplay=" + this.b + ", loadingLatency=" + this.c + ")";
    }
}
