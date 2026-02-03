package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esoq extends esov {
    public final ejwi a;
    public final ekhx b;

    public esoq(ejwi ejwiVar, ekhx ekhxVar) {
        this.a = ejwiVar;
        this.b = ekhxVar;
    }

    @Override // defpackage.esov
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.esov
    public final ekhx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esov) {
            esov esovVar = (esov) obj;
            if (this.a.equals(esovVar.a()) && this.b.equals(esovVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.b;
        return "Options{customScopes=" + String.valueOf(this.a) + ", fallbackOptions=" + String.valueOf(ekhxVar) + "}";
    }
}
