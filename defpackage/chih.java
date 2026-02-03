package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chih extends chii {
    private final long a;
    private final UUID b;
    private final fhaz c;

    public chih(long j, UUID uuid, fhaz fhazVar) {
        this.a = j;
        this.b = uuid;
        this.c = fhazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chih)) {
            return false;
        }
        chih chihVar = (chih) obj;
        return this.a == chihVar.a && fdbq.f(this.b, chihVar.b) && fdbq.f(this.c, chihVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SaveToTelephonyFailure(xMessageId=" + this.a + ", persistenceId=" + this.b + ", traceId=" + this.c + ")";
    }
}
