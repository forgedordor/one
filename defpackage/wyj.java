package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyj implements wzb {
    public final ajlx a;
    public final Instant b;
    public final wyi c;

    public wyj(ajlx ajlxVar, Instant instant, wyi wyiVar) {
        this.a = ajlxVar;
        this.b = instant;
        this.c = wyiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyj)) {
            return false;
        }
        wyj wyjVar = (wyj) obj;
        return fdbq.f(this.a, wyjVar.a) && fdbq.f(this.b, wyjVar.b) && fdbq.f(this.c, wyjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MapiPreparedMessage(envelope=" + this.a + ", scheduledTime=" + this.b + ", loggingEnvelope=" + this.c + ")";
    }
}
