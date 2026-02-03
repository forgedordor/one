package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmm extends cmoo {
    public final long a;
    public final long b;

    public cmmm(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.cmoo
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cmoo
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmoo) {
            cmoo cmooVar = (cmoo) obj;
            if (this.a == cmooVar.b() && this.b == cmooVar.a()) {
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
        return "MessageLimitResult{requiredSize=" + this.a + ", maxMessageSize=" + this.b + "}";
    }
}
