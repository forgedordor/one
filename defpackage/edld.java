package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edld extends edll {
    private final ekgb a;
    private final ejwi b;
    private final boolean c;
    private final ekgb d;

    public edld(ekgb ekgbVar, ejwi ejwiVar, boolean z, ekgb ekgbVar2) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null clusters");
        }
        this.a = ekgbVar;
        this.b = ejwiVar;
        this.c = z;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.d = ekgbVar2;
    }

    @Override // defpackage.edll
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edll
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edll
    public final ekgb c() {
        return this.d;
    }

    @Override // defpackage.edll
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edll) {
            edll edllVar = (edll) obj;
            if (ekjz.h(this.a, edllVar.b()) && this.b.equals(edllVar.a()) && this.c == edllVar.d() && ekjz.h(this.d, edllVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        ejwi ejwiVar = this.b;
        return "ClustersResource{clusters=" + this.a.toString() + ", errorState=" + ejwiVar.toString() + ", hasAdditionalResults=" + this.c + ", eventLogs=" + ekgbVar.toString() + "}";
    }
}
