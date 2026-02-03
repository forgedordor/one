package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edjw extends edhq {
    private final ekgb a;
    private final ejwi b;
    private final eure c;

    public edjw(ekgb ekgbVar, ejwi ejwiVar, eure eureVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null categories");
        }
        this.a = ekgbVar;
        this.b = ejwiVar;
        if (eureVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.c = eureVar;
    }

    @Override // defpackage.edhq
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edhq
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edhq
    public final eure c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhq) {
            edhq edhqVar = (edhq) obj;
            if (ekjz.h(this.a, edhqVar.b()) && this.b.equals(edhqVar.a()) && this.c.equals(edhqVar.c())) {
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
        return "ArtCategoriesResource{categories=" + this.a.toString() + ", errorState=" + ejwiVar.toString() + ", eventLog=" + eureVar.toString() + "}";
    }
}
