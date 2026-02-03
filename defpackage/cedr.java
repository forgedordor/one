package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cedr extends cekr {
    private final evqs a;
    private final long b;

    public cedr(evqs evqsVar, long j) {
        if (evqsVar == null) {
            throw new NullPointerException("Null authToken");
        }
        this.a = evqsVar;
        this.b = j;
    }

    @Override // defpackage.cekr
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cekr
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cekr) {
            cekr cekrVar = (cekr) obj;
            if (this.a.equals(cekrVar.b()) && this.b == cekrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AuthTokenWithExpiration{authToken=" + this.a.toString() + ", expirationTimeMillis=" + this.b + "}";
    }
}
