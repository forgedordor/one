package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdv {
    public final long a;
    public final MessageIdType b;
    public final Duration c;
    public final basd d;
    public final Instant e;
    public final boolean f;

    public ckdv(long j, MessageIdType messageIdType, Duration duration, basd basdVar, Instant instant, boolean z) {
        this.a = j;
        this.b = messageIdType;
        this.c = duration;
        this.d = basdVar;
        this.e = instant;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckdv)) {
            return false;
        }
        ckdv ckdvVar = (ckdv) obj;
        return this.a == ckdvVar.a && fdbq.f(this.b, ckdvVar.b) && fdbq.f(this.c, ckdvVar.c) && fdbq.f(this.d, ckdvVar.d) && fdbq.f(this.e, ckdvVar.e) && this.f == ckdvVar.f;
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.b;
        int iHashCode = messageIdType == null ? 0 : messageIdType.hashCode();
        long j = this.a;
        int iHashCode2 = (((((int) (j ^ (j >>> 32))) * 31) + iHashCode) * 31) + this.c.hashCode();
        basd basdVar = this.d;
        int iHashCode3 = ((iHashCode2 * 31) + (basdVar == null ? 0 : basdVar.hashCode())) * 31;
        Instant instant = this.e;
        return ((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "EditReceivedInfo(usageStatsLoggingId=" + this.a + ", editedMessageId=" + this.b + ", elapsedTimeFromMessageSent=" + this.c + ", editedMessageIdInHeader=" + this.d + ", editedTimestampInHeader=" + this.e + ", hasGsmaHeaders=" + this.f + ")";
    }
}
