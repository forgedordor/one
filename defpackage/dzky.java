package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzky extends dzlw {
    public final long a;
    public final long b;

    public dzky(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.dzlw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dzlw
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzlw) {
            dzlw dzlwVar = (dzlw) obj;
            if (this.a == dzlwVar.a() && this.b == dzlwVar.b()) {
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
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }
}
