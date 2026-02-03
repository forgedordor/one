package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chik extends chil {
    public final long a;
    public final UUID b;
    public final fhaz c;
    public final chia d;

    public chik(long j, UUID uuid, fhaz fhazVar, chia chiaVar) {
        this.a = j;
        this.b = uuid;
        this.c = fhazVar;
        this.d = chiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chik)) {
            return false;
        }
        chik chikVar = (chik) obj;
        return this.a == chikVar.a && fdbq.f(this.b, chikVar.b) && fdbq.f(this.c, chikVar.c) && fdbq.f(this.d, chikVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParseSms(xMessageId=" + this.a + ", persistenceId=" + this.b + ", traceId=" + this.c + ", parsedSmsData=" + this.d + ")";
    }
}
