package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egan extends egaq {
    public final boolean a;
    public final ekgb b;
    public final ekgb c;

    public egan(boolean z, ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = z;
        this.b = ekgbVar;
        this.c = ekgbVar2;
    }

    @Override // defpackage.egaq
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.egaq
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.egaq
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof egaq) {
            egaq egaqVar = (egaq) obj;
            if (this.a == egaqVar.c() && ekjz.h(this.b, egaqVar.a()) && ((ekgbVar = this.c) != null ? ekjz.h(ekgbVar, egaqVar.b()) : egaqVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
        ekgb ekgbVar = this.c;
        return (iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode());
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        return "Config{canSwitchAccounts=" + this.a + ", initialSelectors=" + String.valueOf(this.b) + ", overrideRequirements=" + String.valueOf(ekgbVar) + "}";
    }
}
