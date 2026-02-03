package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edcu extends edcs {
    private final ekgb a;
    private final ekgb b;
    private final ejwi c;
    private final ekgb d;
    private final int e;

    public edcu(ekgb ekgbVar, ekgb ekgbVar2, int i, ejwi ejwiVar, ekgb ekgbVar3) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.e = i;
        this.c = ejwiVar;
        this.d = ekgbVar3;
    }

    @Override // defpackage.edcs
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.edcs
    public final ekgb b() {
        return this.d;
    }

    @Override // defpackage.edcs
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.edcs
    public final ekgb d() {
        return this.b;
    }

    @Override // defpackage.edcs
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edcs) {
            edcs edcsVar = (edcs) obj;
            if (ekjz.h(this.a, edcsVar.c()) && ekjz.h(this.b, edcsVar.d()) && this.e == edcsVar.e() && this.c.equals(edcsVar.a()) && ekjz.h(this.d, edcsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        ekgb ekgbVar = this.b;
        String string = this.a.toString();
        String string2 = ekgbVar.toString();
        String str = i != 1 ? i != 2 ? "ERROR" : "SUGGESTIONS" : "ZERO_STATE";
        ejwi ejwiVar = this.c;
        ekgb ekgbVar2 = this.d;
        return "ArtSearchData{searchInterests=" + string + ", searchSuggestions=" + string2 + ", searchState=" + str + ", errorState=" + String.valueOf(ejwiVar) + ", events=" + ekgbVar2.toString() + "}";
    }
}
