package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esme extends esmt {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final double e;
    public final ekgb f;

    public esme(boolean z, int i, float f, float f2, double d, ekgb ekgbVar) {
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = d;
        this.f = ekgbVar;
    }

    @Override // defpackage.esmt
    public final double a() {
        return this.e;
    }

    @Override // defpackage.esmt
    public final float b() {
        return this.c;
    }

    @Override // defpackage.esmt
    public final float c() {
        return this.d;
    }

    @Override // defpackage.esmt
    public final int d() {
        return this.b;
    }

    @Override // defpackage.esmt
    public final ekgb e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esmt) {
            esmt esmtVar = (esmt) obj;
            if (this.a == esmtVar.f() && this.b == esmtVar.d() && Float.floatToIntBits(this.c) == Float.floatToIntBits(esmtVar.b()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(esmtVar.c()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(esmtVar.a()) && ekjz.h(this.f, esmtVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.esmt
    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
        double d = this.e;
        return (((iFloatToIntBits * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "GrpcRetryConfig{enabled=" + this.a + ", maxAttempts=" + this.b + ", initialBackoffSeconds=" + this.c + ", maxBackoffSeconds=" + this.d + ", backoffMultiplier=" + this.e + ", retryableStatusCodes=" + this.f.toString() + "}";
    }
}
