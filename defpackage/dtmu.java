package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmu extends dtvn {
    public final ejwi a;
    public final ejwi b;

    public dtmu(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dtvn
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dtvn
    public final ejwi b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtvn) {
            dtvn dtvnVar = (dtvn) obj;
            if (this.a.equals(dtvnVar.b()) && this.b.equals(dtvnVar.a())) {
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
        return "RemoveFileGroupsByFilterRequest{sourceOptional=" + this.a.toString() + ", accountOptional=" + ejwiVar.toString() + "}";
    }
}
