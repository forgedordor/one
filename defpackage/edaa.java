package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edaa extends eczz {
    public final ejwi a;
    public final ejwi b;

    public edaa(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.eczz
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.eczz
    public final ejwi b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eczz) {
            eczz eczzVar = (eczz) obj;
            if (this.a.equals(eczzVar.b()) && this.b.equals(eczzVar.a())) {
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
        return "ArtEditActivityParams{imageIdOrUri=" + this.a.toString() + ", imageDisplayName=" + ejwiVar.toString() + "}";
    }
}
