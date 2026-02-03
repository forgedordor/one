package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eilw extends eimj {
    public final long a;
    public final long b;

    public eilw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.eimj
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eimj
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eimj) {
            eimj eimjVar = (eimj) obj;
            if (this.a == eimjVar.a() && this.b == eimjVar.b()) {
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
        return "AsyncInfo{dispatchMarkId=" + this.a + ", dispatchMarkTimeNanos=" + this.b + "}";
    }
}
