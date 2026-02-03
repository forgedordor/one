package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbi implements afzv {
    public final alqm a;
    public final aisq b;

    public agbi(alqm alqmVar, aisq aisqVar) {
        this.a = alqmVar;
        this.b = aisqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbi)) {
            return false;
        }
        agbi agbiVar = (agbi) obj;
        return fdbq.f(this.a, agbiVar.a) && fdbq.f(this.b, agbiVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aisq aisqVar = this.b;
        return iHashCode + (aisqVar == null ? 0 : aisqVar.hashCode());
    }

    public final String toString() {
        return cqcv.b(super.toString()).toString();
    }
}
