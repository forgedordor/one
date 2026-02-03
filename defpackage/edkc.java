package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkc extends ediu {
    private final ekgb a;
    private final ekgb b;
    private final ejwi c;
    private final eure d;

    public edkc(ekgb ekgbVar, ekgb ekgbVar2, ejwi ejwiVar, eure eureVar) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = ejwiVar;
        this.d = eureVar;
    }

    @Override // defpackage.ediu
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.ediu
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.ediu
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.ediu
    public final eure d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ediu) {
            ediu ediuVar = (ediu) obj;
            if (ekjz.h(this.a, ediuVar.c()) && ekjz.h(this.b, ediuVar.b()) && this.c.equals(ediuVar.a()) && this.d.equals(ediuVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eure eureVar = this.d;
        ejwi ejwiVar = this.c;
        ekgb ekgbVar = this.b;
        return "ArtHomeSuggestions{images=" + this.a.toString() + ", collections=" + ekgbVar.toString() + ", errorState=" + String.valueOf(ejwiVar) + ", eventLog=" + eureVar.toString() + "}";
    }
}
