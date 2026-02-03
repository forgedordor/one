package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edhd extends edhm {
    public final ejwi a;
    public final int b;
    private final ejwi c;
    private final ekgb d;

    public edhd(int i, ejwi ejwiVar, ejwi ejwiVar2, ekgb ekgbVar) {
        this.b = i;
        this.a = ejwiVar;
        this.c = ejwiVar2;
        if (ekgbVar == null) {
            throw new NullPointerException("Null events");
        }
        this.d = ekgbVar;
    }

    @Override // defpackage.edhm
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.edhm
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.edhm
    public final ekgb c() {
        return this.d;
    }

    @Override // defpackage.edhm
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhm) {
            edhm edhmVar = (edhm) obj;
            if (this.b == edhmVar.d() && this.a.equals(edhmVar.b()) && this.c.equals(edhmVar.a()) && ekjz.h(this.d, edhmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        ejwi ejwiVar = this.c;
        return "Resource{state=" + edhn.a(this.b) + ", resource=" + this.a.toString() + ", errorState=" + ejwiVar.toString() + ", events=" + ekgbVar.toString() + "}";
    }
}
