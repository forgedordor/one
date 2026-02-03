package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyva extends dyvg {
    public final dyvi a;
    public final dyvi b;
    public final ekgb c;
    private final dyvc d;

    public dyva(dyvi dyviVar, dyvi dyviVar2, dyvc dyvcVar, ekgb ekgbVar) {
        this.a = dyviVar;
        this.b = dyviVar2;
        this.d = dyvcVar;
        this.c = ekgbVar;
    }

    @Override // defpackage.dyvg
    public final dyvi a() {
        return this.a;
    }

    @Override // defpackage.dyvg
    public final dyvi b() {
        return this.b;
    }

    @Override // defpackage.dyvg
    public final ekgb c() {
        return this.c;
    }

    @Override // defpackage.dyvg
    public final dyvc d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyvg) {
            dyvg dyvgVar = (dyvg) obj;
            if (this.a.equals(dyvgVar.a()) && this.b.equals(dyvgVar.b()) && this.d.equals(dyvgVar.d()) && ((ekgbVar = this.c) != null ? ekjz.h(ekgbVar, dyvgVar.c()) : dyvgVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        ekgb ekgbVar = this.c;
        return (iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode());
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        dyvc dyvcVar = this.d;
        dyvi dyviVar = this.b;
        return "ImageModelLoader{imageRetriever=" + this.a.toString() + ", secondaryImageRetriever=" + dyviVar.toString() + ", defaultImageRetriever=" + dyvcVar.toString() + ", postProcessors=" + String.valueOf(ekgbVar) + "}";
    }
}
