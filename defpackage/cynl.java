package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynl extends cynm {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final int d;
    private final pzj e;

    public cynl(String str, Instant instant, pzj pzjVar, Instant instant2, int i) {
        this.a = str;
        this.b = instant;
        this.e = pzjVar;
        this.c = instant2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cynl)) {
            return false;
        }
        cynl cynlVar = (cynl) obj;
        return fdbq.f(this.a, cynlVar.a) && fdbq.f(this.b, cynlVar.b) && fdbq.f(this.e, cynlVar.e) && fdbq.f(this.c, cynlVar.c) && this.d == cynlVar.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
        Instant instant = this.c;
        return (((iHashCode * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        return "ScheduledWorkerUiData(queueName=" + this.a + ", scheduledAtTime=" + this.b + ", constraints=" + this.e + ", minimumStartTime=" + this.c + ", pendingJobReason=" + this.d + ")";
    }
}
