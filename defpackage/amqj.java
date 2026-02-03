package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqj {
    public final String a;
    public final amrb b;
    public final long c;
    public final Instant d;
    public final Instant e;

    public amqj(String str, amrb amrbVar, long j, Instant instant, Instant instant2) {
        amrbVar.getClass();
        this.a = str;
        this.b = amrbVar;
        this.c = j;
        this.d = instant;
        this.e = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amqj)) {
            return false;
        }
        amqj amqjVar = (amqj) obj;
        return fdbq.f(this.a, amqjVar.a) && this.b == amqjVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmergencySession(emergencyDestination=" + this.a + ", sessionType=" + this.b + ", refillDurationMs=" + this.c + ", startTime=" + this.d + ", endTime=" + this.e + ")";
    }
}
