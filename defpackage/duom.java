package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duom extends duoo {
    private final dtqy a;
    private final dtqy b;

    public duom(dtqy dtqyVar, dtqy dtqyVar2) {
        this.a = dtqyVar;
        this.b = dtqyVar2;
    }

    @Override // defpackage.duoo
    public final dtqy a() {
        return this.b;
    }

    @Override // defpackage.duoo
    public final dtqy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duoo) {
            duoo duooVar = (duoo) obj;
            dtqy dtqyVar = this.a;
            if (dtqyVar != null ? dtqyVar.equals(duooVar.b()) : duooVar.b() == null) {
                dtqy dtqyVar2 = this.b;
                if (dtqyVar2 != null ? dtqyVar2.equals(duooVar.a()) : duooVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dtqy dtqyVar = this.a;
        int iHashCode = dtqyVar == null ? 0 : dtqyVar.hashCode();
        dtqy dtqyVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (dtqyVar2 != null ? dtqyVar2.hashCode() : 0);
    }

    public final String toString() {
        dtqy dtqyVar = this.b;
        return "GroupPair{pendingGroup=" + String.valueOf(this.a) + ", downloadedGroup=" + String.valueOf(dtqyVar) + "}";
    }
}
