package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaxn extends eayw {
    private final long a;
    private final ebba b;

    public eaxn(long j, ebba ebbaVar) {
        this.a = j;
        if (ebbaVar == null) {
            throw new NullPointerException("Null observations");
        }
        this.b = ebbaVar;
    }

    @Override // defpackage.eayw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eayw
    public final ebba b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayw) {
            eayw eaywVar = (eayw) obj;
            if (this.a == eaywVar.a() && this.b.equals(eaywVar.b())) {
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
        return "ObservationStoreData{observationStoreId=" + this.a + ", observations=" + this.b.toString() + "}";
    }
}
