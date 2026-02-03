package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edbp extends edbl {
    private final ekgb a;
    private final ekgb b;
    private final ekgb c;
    private final ejwi d;
    private final ekgb e;

    public edbp(ekgb ekgbVar, ekgb ekgbVar2, ekgb ekgbVar3, ejwi ejwiVar, ekgb ekgbVar4) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = ekgbVar3;
        this.d = ejwiVar;
        this.e = ekgbVar4;
    }

    @Override // defpackage.edbl
    public final ejwi a() {
        return this.d;
    }

    @Override // defpackage.edbl
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.edbl
    public final ekgb c() {
        return this.e;
    }

    @Override // defpackage.edbl
    public final ekgb d() {
        return this.b;
    }

    @Override // defpackage.edbl
    public final ekgb e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edbl) {
            edbl edblVar = (edbl) obj;
            if (ekjz.h(this.a, edblVar.e()) && ekjz.h(this.b, edblVar.d()) && ekjz.h(this.c, edblVar.b()) && this.d.equals(edblVar.a()) && ekjz.h(this.e, edblVar.c())) {
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
        return "ArtHomeData{suggestedImages=" + this.a.toString() + ", suggestedCollections=" + ekgbVar3.toString() + ", categories=" + ekgbVar2.toString() + ", errorState=" + ejwiVar.toString() + ", events=" + ekgbVar.toString() + "}";
    }
}
