package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztm extends dztq {
    private final ejwi a;
    private final int b;

    public dztm(int i, ejwi ejwiVar) {
        this.b = i;
        this.a = ejwiVar;
    }

    @Override // defpackage.dztq, defpackage.dzjv
    public final fcsu b() {
        return null;
    }

    @Override // defpackage.dztq
    public final ejwi d() {
        return this.a;
    }

    @Override // defpackage.dztq
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dztq) {
            dztq dztqVar = (dztq) obj;
            if (this.b == dztqVar.e()) {
                dztqVar.f();
                if (this.a.equals(dztqVar.d())) {
                    dztqVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + dzjw.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    @Override // defpackage.dztq
    public final void f() {
    }
}
