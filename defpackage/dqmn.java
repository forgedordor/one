package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmn extends dqmr {
    public final long a;
    public final long b;
    public final long c;

    public dqmn(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.dqmr
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dqmr
    public final long b() {
        return this.c;
    }

    @Override // defpackage.dqmr
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqmr) {
            dqmr dqmrVar = (dqmr) obj;
            if (this.a == dqmrVar.a() && this.b == dqmrVar.c() && this.c == dqmrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "SchedStat{cpuTimeNs=" + this.a + ", runDelayNs=" + this.b + ", runCount=" + this.c + "}";
    }
}
