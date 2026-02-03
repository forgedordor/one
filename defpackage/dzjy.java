package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjy extends dzkd {
    private final dzke a;
    private final int b;

    public dzjy(int i, dzke dzkeVar) {
        this.b = i;
        this.a = dzkeVar;
    }

    @Override // defpackage.dzkd
    public final dzke d() {
        return this.a;
    }

    @Override // defpackage.dzkd
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzkd) {
            dzkd dzkdVar = (dzkd) obj;
            if (this.b == dzkdVar.e()) {
                dzkdVar.f();
                if (this.a.equals(dzkdVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + dzjw.a(this.b) + ", chargeCounterEnabled=false, metricExtensionProvider=" + this.a.toString() + "}";
    }

    @Override // defpackage.dzkd
    public final void f() {
    }
}
