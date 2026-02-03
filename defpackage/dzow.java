package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzow extends dzpj {
    public final String a;
    public final dzfh b;
    public final feeg c;
    public final ejwi d;
    public final ejwi e;

    public dzow(String str, dzfh dzfhVar, feeg feegVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = str;
        this.b = dzfhVar;
        this.c = feegVar;
        this.d = ejwiVar;
        this.e = ejwiVar2;
    }

    @Override // defpackage.dzpj
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.dzpj
    public final ejwi b() {
        return this.e;
    }

    @Override // defpackage.dzpj
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dzpj
    public final String d() {
        return this.a;
    }

    @Override // defpackage.dzpj
    public final feeg e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dzfh dzfhVar;
        feeg feegVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpj) {
            dzpj dzpjVar = (dzpj) obj;
            if (this.a.equals(dzpjVar.d()) && ((dzfhVar = this.b) != null ? dzfhVar.equals(dzpjVar.a()) : dzpjVar.a() == null) && ((feegVar = this.c) != null ? feegVar.equals(dzpjVar.e()) : dzpjVar.e() == null)) {
                dzpjVar.f();
                if (this.d.equals(dzpjVar.c()) && this.e.equals(dzpjVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        dzfh dzfhVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (dzfhVar == null ? 0 : dzfhVar.hashCode())) * 1000003;
        feeg feegVar = this.c;
        return ((((((iHashCode2 ^ (feegVar != null ? feegVar.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "JankEventCollectionParameters{eventName=" + this.a + ", noPiiEventName=" + String.valueOf(this.b) + ", metricExtension=" + String.valueOf(this.c) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}";
    }

    @Override // defpackage.dzpj
    public final void f() {
    }
}
