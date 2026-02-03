package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzqa extends dzqf {
    private final int a;
    private final boolean b;
    private final ejwi c;
    private final boolean d;
    private final boolean e;
    private final int f;

    public dzqa(int i, int i2, boolean z, ejwi ejwiVar, boolean z2, boolean z3) {
        this.f = i;
        this.a = i2;
        this.b = z;
        this.c = ejwiVar;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.dzqf, defpackage.dzjv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzqf
    public final ejwi d() {
        return this.c;
    }

    @Override // defpackage.dzqf
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqf) {
            dzqf dzqfVar = (dzqf) obj;
            if (this.f == dzqfVar.h() && this.a == dzqfVar.a() && this.b == dzqfVar.g() && this.c.equals(dzqfVar.d()) && this.d == dzqfVar.f()) {
                dzqfVar.i();
                if (this.e == dzqfVar.e()) {
                    dzqfVar.k();
                    dzqfVar.j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dzqf
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dzqf
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.dzqf
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        int i2 = this.f;
        return ((((((((((((i ^ ((((i2 ^ 1000003) * 1000003) ^ this.a) * 1000003)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + dzjw.a(this.f) + ", rateLimitPerSecond=" + this.a + ", recordMetricPerProcess=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + ", forceGcBeforeRecordMemory=" + this.d + ", captureDebugMetrics=false, captureMemoryInfo=" + this.e + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    @Override // defpackage.dzqf
    public final void i() {
    }

    @Override // defpackage.dzqf
    public final void j() {
    }

    @Override // defpackage.dzqf
    public final void k() {
    }
}
