package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcy {
    public final long a;
    public final Instant b;

    public avcy(long j, Instant instant) {
        this.a = j;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avcy)) {
            return false;
        }
        avcy avcyVar = (avcy) obj;
        return this.a == avcyVar.a && fdbq.f(this.b, avcyVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContactIdWithDeletedTimestamp(contactId=" + this.a + ", deletedTimestamp=" + this.b + ")";
    }
}
