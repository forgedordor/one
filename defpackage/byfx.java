package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byfx extends byqf {
    public final long a;
    public final int b;

    public byfx(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.byqf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.byqf
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byqf) {
            byqf byqfVar = (byqf) obj;
            if (this.a == byqfVar.b() && this.b == byqfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "EntitySchedulingResult{lastScheduledId=" + this.a + ", remainingQuota=" + this.b + "}";
    }
}
