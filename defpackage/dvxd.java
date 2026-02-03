package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxd extends dvxj {
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final int e;

    public dvxd(int i, long j, long j2, double d, int i2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = i2;
    }

    @Override // defpackage.dvxj
    public final double a() {
        return this.d;
    }

    @Override // defpackage.dvxj
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dvxj
    public final int c() {
        return this.a;
    }

    @Override // defpackage.dvxj
    public final long d() {
        return this.c;
    }

    @Override // defpackage.dvxj
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvxj) {
            dvxj dvxjVar = (dvxj) obj;
            if (this.a == dvxjVar.c() && this.b == dvxjVar.e() && this.c == dvxjVar.d() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(dvxjVar.a()) && this.e == dvxjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.d;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        return ((((int) jDoubleToLongBits) ^ ((((((this.a ^ 1000003) * 1000003) ^ ((int) this.b)) * 1000003) ^ ((int) this.c)) * 1000003)) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "LighterRetryPolicy{maxRetries=" + this.a + ", maxDelayMs=" + this.b + ", initialDelayMs=" + this.c + ", backoff=" + this.d + ", jitterMs=" + this.e + "}";
    }
}
