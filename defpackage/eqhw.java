package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhw {
    public final Iterable a;
    public final Iterable b;
    private final evqs c;
    private final ezpb d;
    private final long e;

    public eqhw(evqs evqsVar, ezpb ezpbVar, long j, Iterable iterable, Iterable iterable2) {
        this.c = evqsVar;
        this.d = ezpbVar;
        this.e = j;
        this.a = iterable;
        this.b = iterable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqhw)) {
            return false;
        }
        eqhw eqhwVar = (eqhw) obj;
        return fdbq.f(this.c, eqhwVar.c) && fdbq.f(this.d, eqhwVar.d) && this.e == eqhwVar.e && fdbq.f(this.a, eqhwVar.a) && fdbq.f(this.b, eqhwVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        long j = this.e;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DeviceRegistration(registrationId=" + this.c + ", identityKey=" + this.d + ", registrationHash=" + this.e + ", capabilities=" + this.a + ", features=" + this.b + ")";
    }
}
