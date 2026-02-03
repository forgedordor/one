package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edle extends edlw {
    private final ekgb a;
    private final ejwi b;
    private final boolean c;
    private final ekgb d;

    public edle(ekgb ekgbVar, ejwi ejwiVar, boolean z, ekgb ekgbVar2) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null photos");
        }
        this.a = ekgbVar;
        this.b = ejwiVar;
        this.c = z;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.d = ekgbVar2;
    }

    @Override // defpackage.edlw
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edlw
    public final ekgb b() {
        return this.d;
    }

    @Override // defpackage.edlw
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.edlw
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edlw) {
            edlw edlwVar = (edlw) obj;
            if (ekjz.h(this.a, edlwVar.c()) && this.b.equals(edlwVar.a()) && this.c == edlwVar.d() && ekjz.h(this.d, edlwVar.b())) {
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
        return "SuggestedPhotosResource{photos=" + this.a.toString() + ", errorState=" + ejwiVar.toString() + ", hasAdditionalResults=" + this.c + ", eventLogs=" + ekgbVar.toString() + "}";
    }
}
