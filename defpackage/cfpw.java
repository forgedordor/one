package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpw {
    public final String a;
    public final ezol b;
    public final ezol c;
    public final Instant d;
    public final evqs e;

    public cfpw(String str, ezol ezolVar, ezol ezolVar2, Instant instant, evqs evqsVar) {
        ezolVar2.getClass();
        this.a = str;
        this.b = ezolVar;
        this.c = ezolVar2;
        this.d = instant;
        this.e = evqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfpw)) {
            return false;
        }
        cfpw cfpwVar = (cfpw) obj;
        return fdbq.f(this.a, cfpwVar.a) && fdbq.f(this.b, cfpwVar.b) && fdbq.f(this.c, cfpwVar.c) && fdbq.f(this.d, cfpwVar.d) && fdbq.f(this.e, cfpwVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ReflectedMessageParams(rcsMessageId=" + this.a + ", myIdentityTachyonId=" + this.b + ", destinationTachyonId=" + this.c + ", sentTimestamp=" + this.d + ", reflectedMessageContent=" + this.e + ")";
    }
}
