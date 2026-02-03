package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eima extends eimr {
    public final dzfh a;
    public final feeg b;
    public final long c;
    public final long d;
    public final boolean e;
    public final fegm f;
    public final fejg g;

    public eima(dzfh dzfhVar, feeg feegVar, long j, long j2, boolean z, fegm fegmVar, fejg fejgVar) {
        this.a = dzfhVar;
        this.b = feegVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        if (fegmVar == null) {
            throw new NullPointerException("Null trace");
        }
        this.f = fegmVar;
        if (fejgVar == null) {
            throw new NullPointerException("Null traceMetadata");
        }
        this.g = fejgVar;
    }

    @Override // defpackage.eimr
    public final long a() {
        return this.d;
    }

    @Override // defpackage.eimr
    public final long b() {
        return this.c;
    }

    @Override // defpackage.eimr
    public final dzfh c() {
        return this.a;
    }

    @Override // defpackage.eimr
    public final feeg d() {
        return this.b;
    }

    @Override // defpackage.eimr
    public final fegm e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        feeg feegVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eimr) {
            eimr eimrVar = (eimr) obj;
            if (this.a.equals(eimrVar.c()) && ((feegVar = this.b) != null ? feegVar.equals(eimrVar.d()) : eimrVar.d() == null) && this.c == eimrVar.b() && this.d == eimrVar.a() && this.e == eimrVar.g() && this.f.equals(eimrVar.e()) && this.g.equals(eimrVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eimr
    public final fejg f() {
        return this.g;
    }

    @Override // defpackage.eimr
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        feeg feegVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (feegVar == null ? 0 : feegVar.hashCode())) * 1000003;
        long j = this.c;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return ((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "TraceData{eventName=" + this.a.a + ", metricExtension=" + String.valueOf(this.b) + ", startTime=" + this.c + ", endTime=" + this.d + ", empty=" + this.e + ", trace=" + this.f.toString() + ", traceMetadata=" + this.g.toString() + "}";
    }
}
