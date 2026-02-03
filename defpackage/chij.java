package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chij extends chil {
    public final long a;
    public final UUID b;
    public final fhaz c;
    public final chic d;

    public chij(long j, UUID uuid, fhaz fhazVar, chic chicVar) {
        fhazVar.getClass();
        this.a = j;
        this.b = uuid;
        this.c = fhazVar;
        this.d = chicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chij)) {
            return false;
        }
        chij chijVar = (chij) obj;
        return this.a == chijVar.a && fdbq.f(this.b, chijVar.b) && fdbq.f(this.c, chijVar.c) && fdbq.f(this.d, chijVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "IncomingSms(xMessageId=" + this.a + ", persistenceId=" + this.b + ", traceId=" + this.c + ", rawSmsData=" + this.d + ")";
    }
}
