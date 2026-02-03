package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edko extends edjo {
    private final ekgb a;
    private final ejwi b;
    private final eure c;

    public edko(ekgb ekgbVar, ejwi ejwiVar, eure eureVar) {
        this.a = ekgbVar;
        this.b = ejwiVar;
        this.c = eureVar;
    }

    @Override // defpackage.edjo
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edjo
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edjo
    public final eure c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edjo) {
            edjo edjoVar = (edjo) obj;
            if (ekjz.h(this.a, edjoVar.b()) && this.b.equals(edjoVar.a()) && this.c.equals(edjoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eure eureVar = this.c;
        ejwi ejwiVar = this.b;
        return "ArtSearchSuggestions{suggestions=" + this.a.toString() + ", errorState=" + String.valueOf(ejwiVar) + ", eventLog=" + eureVar.toString() + "}";
    }
}
