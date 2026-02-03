package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqj extends edqx {
    private final ekgb a;
    private final ejwi b;
    private final int c;

    public edqj(ekgb ekgbVar, int i, ejwi ejwiVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null sections");
        }
        this.a = ekgbVar;
        this.c = i;
        this.b = ejwiVar;
    }

    @Override // defpackage.edqx
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edqx
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edqx
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqx) {
            edqx edqxVar = (edqx) obj;
            if (ekjz.h(this.a, edqxVar.b()) && this.c == edqxVar.c() && this.b.equals(edqxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "GooglePhotosResult{sections=" + this.a.toString() + ", state=" + edhn.a(this.c) + ", errorState=" + ejwiVar.toString() + "}";
    }
}
