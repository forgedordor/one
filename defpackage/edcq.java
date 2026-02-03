package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edcq extends edcm {
    private final ekgb a;
    private final ekgb b;
    private final ekgb c;
    private final ejwi d;
    private final ekgb e;

    public edcq(ekgb ekgbVar, ekgb ekgbVar2, ekgb ekgbVar3, ejwi ejwiVar, ekgb ekgbVar4) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = ekgbVar3;
        this.d = ejwiVar;
        this.e = ekgbVar4;
    }

    @Override // defpackage.edcm
    public final ejwi a() {
        return this.d;
    }

    @Override // defpackage.edcm
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.edcm
    public final ekgb c() {
        return this.e;
    }

    @Override // defpackage.edcm
    public final ekgb d() {
        return this.c;
    }

    @Override // defpackage.edcm
    public final ekgb e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edcm) {
            edcm edcmVar = (edcm) obj;
            if (ekjz.h(this.a, edcmVar.e()) && ekjz.h(this.b, edcmVar.b()) && ekjz.h(this.c, edcmVar.d()) && this.d.equals(edcmVar.a()) && ekjz.h(this.e, edcmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.e;
        ejwi ejwiVar = this.d;
        ekgb ekgbVar2 = this.c;
        ekgb ekgbVar3 = this.b;
        return "ArtSearchResultsData{topResults=" + this.a.toString() + ", artCollections=" + ekgbVar3.toString() + ", moreResults=" + ekgbVar2.toString() + ", errorState=" + String.valueOf(ejwiVar) + ", events=" + ekgbVar.toString() + "}";
    }
}
