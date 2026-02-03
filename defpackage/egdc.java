package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdc extends egbv {
    public final efwo a;
    public final egbs b;

    public egdc(efwo efwoVar, egbs egbsVar) {
        if (efwoVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = efwoVar;
        this.b = egbsVar;
    }

    @Override // defpackage.egbv
    public final efwo a() {
        return this.a;
    }

    @Override // defpackage.egbv
    public final egbs b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egbv) {
            egbv egbvVar = (egbv) obj;
            if (this.a.equals(egbvVar.a()) && this.b.equals(egbvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        egbs egbsVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + egbsVar.toString() + "}";
    }
}
