package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdph extends cdpv {
    public final long a;
    public final long b;

    public cdph(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.cdpv
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cdpv
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdpv) {
            cdpv cdpvVar = (cdpv) obj;
            if (this.a == cdpvVar.a() && this.b == cdpvVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EntryPointInfo{entryPointId=" + this.a + ", entryPointTrackingId=" + this.b + "}";
    }
}
