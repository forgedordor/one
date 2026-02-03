package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duol extends duon {
    private final dtrw a;
    private final dtqy b;

    public duol(dtrw dtrwVar, dtqy dtqyVar) {
        if (dtrwVar == null) {
            throw new NullPointerException("Null groupKey");
        }
        this.a = dtrwVar;
        if (dtqyVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = dtqyVar;
    }

    @Override // defpackage.duon
    public final dtqy a() {
        return this.b;
    }

    @Override // defpackage.duon
    public final dtrw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duon) {
            duon duonVar = (duon) obj;
            if (this.a.equals(duonVar.b()) && this.b.equals(duonVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dtqy dtqyVar = this.b;
        return "GroupKeyAndGroup{groupKey=" + this.a.toString() + ", dataFileGroup=" + dtqyVar.toString() + "}";
    }
}
