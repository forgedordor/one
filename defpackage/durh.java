package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class durh extends durj {
    private final eojh a;
    private final eoir b;

    public durh(eojh eojhVar, eoir eoirVar) {
        if (eojhVar == null) {
            throw new NullPointerException("Null fileGroupStatus");
        }
        this.a = eojhVar;
        if (eoirVar == null) {
            throw new NullPointerException("Null fileGroupDetails");
        }
        this.b = eoirVar;
    }

    @Override // defpackage.durj
    public final eoir a() {
        return this.b;
    }

    @Override // defpackage.durj
    public final eojh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof durj) {
            durj durjVar = (durj) obj;
            if (this.a.equals(durjVar.b()) && this.b.equals(durjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eoir eoirVar = this.b;
        return "FileGroupStatusWithDetails{fileGroupStatus=" + this.a.toString() + ", fileGroupDetails=" + eoirVar.toString() + "}";
    }
}
