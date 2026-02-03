package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaxm extends eayt {
    private final long a;
    private final ekgb b;

    public eaxm(long j, ekgb ekgbVar) {
        this.a = j;
        if (ekgbVar == null) {
            throw new NullPointerException("Null reportIds");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.eayt
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eayt
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayt) {
            eayt eaytVar = (eayt) obj;
            if (this.a == eaytVar.a() && ekjz.h(this.b, eaytVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MetricAndReportIds{metricId=" + this.a + ", reportIds=" + this.b.toString() + "}";
    }
}
