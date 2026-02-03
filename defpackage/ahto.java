package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahto {
    public final UUID a;
    public final aiba b;
    public final aiaf c;
    public final Instant d;
    public final Instant e;
    public final aiaa f;
    public final long g;
    public final Instant h;
    public final Instant i;
    public final aiay j;
    public final boolean k;

    public ahto(UUID uuid, aiba aibaVar, aiaf aiafVar, Instant instant, Instant instant2, aiaa aiaaVar, long j, Instant instant3, Instant instant4, aiay aiayVar, boolean z) {
        aiayVar.getClass();
        this.a = uuid;
        this.b = aibaVar;
        this.c = aiafVar;
        this.d = instant;
        this.e = instant2;
        this.f = aiaaVar;
        this.g = j;
        this.h = instant3;
        this.i = instant4;
        this.j = aiayVar;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahto)) {
            return false;
        }
        ahto ahtoVar = (ahto) obj;
        return fdbq.f(this.a, ahtoVar.a) && this.b == ahtoVar.b && this.c == ahtoVar.c && fdbq.f(this.d, ahtoVar.d) && fdbq.f(this.e, ahtoVar.e) && fdbq.f(this.f, ahtoVar.f) && this.g == ahtoVar.g && fdbq.f(this.h, ahtoVar.h) && fdbq.f(this.i, ahtoVar.i) && fdbq.f(this.j, ahtoVar.j) && this.k == ahtoVar.k;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Instant instant = this.e;
        int iHashCode2 = ((iHashCode * 31) + (instant == null ? 0 : instant.hashCode())) * 31;
        aiaa aiaaVar = this.f;
        int iHashCode3 = aiaaVar != null ? aiaaVar.hashCode() : 0;
        long j = this.g;
        return ((((((((((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + (true != this.k ? 1237 : 1231);
    }

    public final String toString() {
        return "RestoreExecution(sessionId=" + this.a + ", feature=" + this.b + ", status=" + this.c + ", startTime=" + this.d + ", finishTime=" + this.e + ", backupDatabaseMetadata=" + this.f + ", initialMessagesVersion=" + this.g + ", statusTimestamp=" + this.h + ", lastAttachmentRequestTimestamp=" + this.i + ", persistedConfig=" + this.j + ", cleanedUp=" + this.k + ")";
    }
}
