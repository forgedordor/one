package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckcw {
    public final long a;
    public final MessageIdType b;
    public final Duration c;
    public final basd d;

    public ckcw(long j, MessageIdType messageIdType, Duration duration, basd basdVar) {
        this.a = j;
        this.b = messageIdType;
        this.c = duration;
        this.d = basdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckcw)) {
            return false;
        }
        ckcw ckcwVar = (ckcw) obj;
        return this.a == ckcwVar.a && fdbq.f(this.b, ckcwVar.b) && fdbq.f(this.c, ckcwVar.c) && fdbq.f(this.d, ckcwVar.d);
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.b;
        int iHashCode = messageIdType == null ? 0 : messageIdType.hashCode();
        long j = this.a;
        int iHashCode2 = (((((int) (j ^ (j >>> 32))) * 31) + iHashCode) * 31) + this.c.hashCode();
        basd basdVar = this.d;
        return (iHashCode2 * 31) + (basdVar != null ? basdVar.hashCode() : 0);
    }

    public final String toString() {
        return "DeleteReceivedInfo(usageStatsLoggingId=" + this.a + ", deletedMessageId=" + this.b + ", elapsedTimeFromMessageSent=" + this.c + ", deletedMessageIdInHeader=" + this.d + ")";
    }
}
