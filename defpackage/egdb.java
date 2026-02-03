package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdb extends egbe {
    public final egbs a;
    private final efwo b;
    private final int c;

    public egdb(efwo efwoVar, egbs egbsVar, int i) {
        this.b = efwoVar;
        if (egbsVar == null) {
            throw new NullPointerException("Null info");
        }
        this.a = egbsVar;
        this.c = i;
    }

    @Override // defpackage.egbe
    public final efwo a() {
        return this.b;
    }

    @Override // defpackage.egbe
    public final egbs b() {
        return this.a;
    }

    @Override // defpackage.egbe
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egbe) {
            egbe egbeVar = (egbe) obj;
            if (this.b.equals(egbeVar.a()) && this.a.equals(egbeVar.b()) && this.c == egbeVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.c;
        egbs egbsVar = this.a;
        return "Account{id=" + this.b.toString() + ", info=" + egbsVar.toString() + ", state=" + Integer.toString(i - 1) + "}";
    }
}
