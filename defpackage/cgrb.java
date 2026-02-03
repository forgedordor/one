package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrb {
    public final cgra a;
    public final Instant b;
    private final cgrc c;

    public cgrb(cgra cgraVar, Instant instant, cgrc cgrcVar) {
        cgraVar.getClass();
        instant.getClass();
        cgrcVar.getClass();
        this.a = cgraVar;
        this.b = instant;
        this.c = cgrcVar;
    }

    public final cgrc a(Instant instant) {
        instant.getClass();
        return (this.a == cgra.e || instant.isBefore(this.b)) ? this.c : cgrc.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgrb)) {
            return false;
        }
        cgrb cgrbVar = (cgrb) obj;
        return this.a == cgrbVar.a && fdbq.f(this.b, cgrbVar.b) && this.c == cgrbVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConversationMuteStatus(muteDuration=" + this.a + ", mutedUntilTimestamp=" + this.b + ", muteThreshold=" + this.c + ")";
    }
}
