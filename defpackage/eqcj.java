package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqcj extends eqdb {
    private final evqs a;
    private final eqcn b;

    public eqcj(evqs evqsVar, eqcn eqcnVar) {
        this.a = evqsVar;
        this.b = eqcnVar;
    }

    @Override // defpackage.eqdb
    public final eqcn a() {
        return this.b;
    }

    @Override // defpackage.eqdb
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqdb) {
            eqdb eqdbVar = (eqdb) obj;
            if (this.a.equals(eqdbVar.b()) && this.b.equals(eqdbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eqcn eqcnVar = this.b;
        return "TransportMessage{content=" + this.a.toString() + ", contentType=" + eqcnVar.toString() + "}";
    }
}
