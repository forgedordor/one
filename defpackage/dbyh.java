package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbyh extends dbzy {
    private final double f;
    private final int g;

    public dbyh(int i, double d) {
        this.g = i;
        this.f = d;
    }

    @Override // defpackage.dbzy
    public final double a() {
        return this.f;
    }

    @Override // defpackage.dbzy
    public final int b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbzy) {
            dbzy dbzyVar = (dbzy) obj;
            if (this.g == dbzyVar.b() && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(dbzyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.f;
        return ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((this.g ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.g;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.f + "}";
    }
}
