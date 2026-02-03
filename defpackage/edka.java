package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edka extends edic {
    private final ekgb a;
    private final ejwi b;
    private final ekgb c;

    public edka(ekgb ekgbVar, ejwi ejwiVar, ekgb ekgbVar2) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null collectionPhotos");
        }
        this.a = ekgbVar;
        this.b = ejwiVar;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.c = ekgbVar2;
    }

    @Override // defpackage.edic
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edic
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edic
    public final ekgb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edic) {
            edic edicVar = (edic) obj;
            if (ekjz.h(this.a, edicVar.b()) && this.b.equals(edicVar.a()) && ekjz.h(this.c, edicVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        ejwi ejwiVar = this.b;
        return "ArtCollectionPhotosResource{collectionPhotos=" + this.a.toString() + ", errorState=" + ejwiVar.toString() + ", eventLogs=" + ekgbVar.toString() + "}";
    }
}
