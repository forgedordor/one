package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlz extends dzma {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzma) {
            dzma dzmaVar = (dzma) obj;
            dzmaVar.d();
            dzmaVar.e();
            dzmaVar.f();
            dzmaVar.g();
            dzmaVar.h();
            long jDoubleToLongBits = Double.doubleToLongBits(5.0d);
            dzmaVar.i();
            if (jDoubleToLongBits == Double.doubleToLongBits(5.0d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (Double.doubleToLongBits(5.0d) ^ (Double.doubleToLongBits(5.0d) >>> 32))) ^ 388790310;
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=DEFAULT, maxBufferSizeBytes=2097152, sampleDurationMs=30000, sampleDurationSkewMs=5000, sampleFrequencyMicro=1000, samplesPerEpoch=5.0}";
    }

    @Override // defpackage.dzma
    public final void d() {
    }

    @Override // defpackage.dzma
    public final void e() {
    }

    @Override // defpackage.dzma
    public final void f() {
    }

    @Override // defpackage.dzma
    public final void g() {
    }

    @Override // defpackage.dzma
    public final void h() {
    }

    @Override // defpackage.dzma
    public final void i() {
    }
}
