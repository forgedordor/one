package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqa {
    public final long a;
    public final basd b;
    public final basd c;
    public final MessageIdType d;
    public final boolean e;

    public ahqa(long j, basd basdVar, basd basdVar2, MessageIdType messageIdType, boolean z) {
        this.a = j;
        this.b = basdVar;
        this.c = basdVar2;
        this.d = messageIdType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahqa)) {
            return false;
        }
        ahqa ahqaVar = (ahqa) obj;
        return this.a == ahqaVar.a && fdbq.f(this.b, ahqaVar.b) && fdbq.f(this.c, ahqaVar.c) && fdbq.f(this.d, ahqaVar.d) && this.e == ahqaVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ReplyReceivedInfo(usageStatsLoggingId=" + this.a + ", rcsMessageId=" + this.b + ", inReplyToRcsMessageId=" + this.c + ", repliedToMessageId=" + this.d + ", hasGsmaHeaders=" + this.e + ")";
    }
}
