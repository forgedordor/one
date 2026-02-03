package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzos extends dzpf {
    public final dzpp a;
    public final feeg b;
    public final ejwi c;
    public final ejwi d;

    public dzos(dzpp dzppVar, feeg feegVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = dzppVar;
        this.b = feegVar;
        this.c = ejwiVar;
        this.d = ejwiVar2;
    }

    @Override // defpackage.dzpf
    public final dzpp a() {
        return this.a;
    }

    @Override // defpackage.dzpf
    public final ejwi b() {
        return this.d;
    }

    @Override // defpackage.dzpf
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.dzpf
    public final feeg d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        feeg feegVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpf) {
            dzpf dzpfVar = (dzpf) obj;
            if (this.a.equals(dzpfVar.a()) && ((feegVar = this.b) != null ? feegVar.equals(dzpfVar.d()) : dzpfVar.d() == null)) {
                dzpfVar.e();
                if (this.c.equals(dzpfVar.c()) && this.d.equals(dzpfVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        feeg feegVar = this.b;
        return (((((((iHashCode * 1000003) ^ (feegVar == null ? 0 : feegVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=" + String.valueOf(this.b) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}";
    }

    @Override // defpackage.dzpf
    public final void e() {
    }
}
