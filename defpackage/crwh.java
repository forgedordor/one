package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crwh {
    public final long a;
    public final crws b;
    public final crwi c;
    public final Instant d;

    public crwh(long j, crws crwsVar, crwi crwiVar, Instant instant) {
        crwsVar.getClass();
        crwiVar.getClass();
        this.a = j;
        this.b = crwsVar;
        this.c = crwiVar;
        this.d = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crwh)) {
            return false;
        }
        crwh crwhVar = (crwh) obj;
        return this.a == crwhVar.a && this.b == crwhVar.b && this.c == crwhVar.c && fdbq.f(this.d, crwhVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "A2pConversationSubscription(participantId=" + this.a + ", toolstoneState=" + this.b + ", subscriptionState=" + this.c + ", lastActionTimestamp=" + this.d + ")";
    }
}
