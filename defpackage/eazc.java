package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eazc extends eazd {
    private final ekik a;

    public eazc(ekik ekikVar) {
        this.a = ekikVar;
    }

    @Override // defpackage.eazh
    public final int a() {
        return 1;
    }

    @Override // defpackage.eazd, defpackage.eazh
    public final ekik b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eazh) {
            eazh eazhVar = (eazh) obj;
            if (eazhVar.a() == 1 && this.a.equals(eazhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ekpg.a(this.a);
    }

    public final String toString() {
        return "ExperimentIdsOrError{experimentIds=" + this.a.toString() + "}";
    }
}
