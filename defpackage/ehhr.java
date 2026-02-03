package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhr {
    public final String a;
    public final evqs b;
    public final long c;
    public final dzzs d;

    public ehhr(String str, evqs evqsVar, long j, dzzs dzzsVar) {
        this.a = str;
        this.b = evqsVar;
        this.c = j;
        this.d = dzzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehhr)) {
            return false;
        }
        ehhr ehhrVar = (ehhr) obj;
        return fdbq.f(this.a, ehhrVar.a) && fdbq.f(this.b, ehhrVar.b) && this.c == ehhrVar.c && fdbq.f(this.d, ehhrVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        evqs evqsVar = this.b;
        int iHashCode2 = (iHashCode + (evqsVar == null ? 0 : evqsVar.hashCode())) * 31;
        long j = this.c;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Metadata(serverToken=" + this.a + ", experimentToken=" + this.b + ", lastUpdateEpochMillis=" + this.c + ", commitProperties=" + this.d + ")";
    }
}
