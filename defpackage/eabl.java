package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eabl extends eaex {
    public final eaar a;
    public final eaey b;

    public eabl(eaar eaarVar, eaey eaeyVar) {
        this.a = eaarVar;
        this.b = eaeyVar;
    }

    @Override // defpackage.eaex
    public final eaar a() {
        return this.a;
    }

    @Override // defpackage.eaex
    public final eaey b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaex) {
            eaex eaexVar = (eaex) obj;
            eaar eaarVar = this.a;
            if (eaarVar != null ? eaarVar.equals(eaexVar.a()) : eaexVar.a() == null) {
                if (this.b.equals(eaexVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eaar eaarVar = this.a;
        return (((eaarVar == null ? 0 : eaarVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eaey eaeyVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + eaeyVar.toString() + "}";
    }
}
