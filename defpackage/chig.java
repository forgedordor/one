package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chig extends chil {
    private final long a;
    private final UUID b;
    private final fhaz c;

    public chig(long j, UUID uuid, fhaz fhazVar) {
        this.a = j;
        this.b = uuid;
        this.c = fhazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chig)) {
            return false;
        }
        chig chigVar = (chig) obj;
        return this.a == chigVar.a && fdbq.f(this.b, chigVar.b) && fdbq.f(this.c, chigVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ClassZeroSms(xMessageId=" + this.a + ", persistenceId=" + this.b + ", traceId=" + this.c + ")";
    }
}
