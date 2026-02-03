package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqe extends dvqr {
    private final long a;
    private final int b;

    public dvqe(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.dvqr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dvqr
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqr) {
            dvqr dvqrVar = (dvqr) obj;
            if (this.a == dvqrVar.b() && this.b == dvqrVar.a()) {
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
        return "LighterCheckBootstrapRequiredResult{earliestCloudMessageTimestampUs=" + this.a + ", resultType=" + this.b + "}";
    }
}
