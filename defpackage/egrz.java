package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrz extends egsk {
    public final egsl a;
    public final ejwi b;

    public egrz(egsl egslVar, ejwi ejwiVar) {
        if (egslVar == null) {
            throw new NullPointerException("Null repeatInterval");
        }
        this.a = egslVar;
        this.b = ejwiVar;
    }

    @Override // defpackage.egsk
    public final egsl a() {
        return this.a;
    }

    @Override // defpackage.egsk
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egsk) {
            egsk egskVar = (egsk) obj;
            if (this.a.equals(egskVar.a()) && this.b.equals(egskVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=" + ejwiVar.toString() + "}";
    }
}
