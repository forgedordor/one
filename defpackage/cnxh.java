package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnxh {
    public final Instant a;
    public final Duration b;
    public final int c;
    public final int d;
    public final int e;

    public cnxh(Instant instant, Duration duration, int i, int i2, int i3) {
        this.a = instant;
        this.b = duration;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnxh)) {
            return false;
        }
        cnxh cnxhVar = (cnxh) obj;
        return fdbq.f(this.a, cnxhVar.a) && fdbq.f(this.b, cnxhVar.b) && this.c == cnxhVar.c && this.d == cnxhVar.d && this.e == cnxhVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "SyncCursorPairResults(lastScannedMessageTimestamp=" + this.a + ", txnDurationMillis=" + this.b + ", messagesSyncedCount=" + this.c + ", localTotal=" + this.d + ", remoteTotal=" + this.e + ")";
    }
}
