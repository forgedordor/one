package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdd extends egcf {
    private final String a;
    private final egce b;

    public egdd(String str, egce egceVar) {
        this.a = str;
        this.b = egceVar;
    }

    @Override // defpackage.egcf
    public final egce a() {
        return this.b;
    }

    @Override // defpackage.egcf
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egcf) {
            egcf egcfVar = (egcf) obj;
            if (this.a.equals(egcfVar.b()) && this.b.equals(egcfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + this.b.toString() + "}";
    }
}
