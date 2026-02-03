package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxlz {
    public final String a;
    public final long b;
    public final Long c;

    public dxlz(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxlz)) {
            return false;
        }
        dxlz dxlzVar = (dxlz) obj;
        return fdbq.f(this.a, dxlzVar.a) && this.b == dxlzVar.b && fdbq.f(this.c, dxlzVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.c;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2;
    }

    public final String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ")";
    }
}
