package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drag extends drdm {
    public final ekhx a;
    public final ekhx b;
    public final ekgb c;
    public final ekgp d;

    public drag(ekhx ekhxVar, ekhx ekhxVar2, ekgb ekgbVar, ekgp ekgpVar) {
        this.a = ekhxVar;
        this.b = ekhxVar2;
        this.c = ekgbVar;
        this.d = ekgpVar;
    }

    @Override // defpackage.drdm
    public final drdl a() {
        return new draf(this);
    }

    @Override // defpackage.drdm
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.drdm
    public final ekgp c() {
        return this.d;
    }

    @Override // defpackage.drdm
    public final ekhx d() {
        return this.a;
    }

    @Override // defpackage.drdm
    public final ekhx e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drdm) {
            drdm drdmVar = (drdm) obj;
            if (this.a.equals(drdmVar.d()) && this.b.equals(drdmVar.e()) && ekjz.h(this.c, drdmVar.b()) && ekmi.m(this.d, drdmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.d;
        ekgb ekgbVar = this.c;
        ekhx ekhxVar = this.b;
        return "SyncResult{changedElementKeys=" + String.valueOf(this.a) + ", uploadedElementKeys=" + String.valueOf(ekhxVar) + ", failures=" + String.valueOf(ekgbVar) + ", idToErrorMap=" + String.valueOf(ekgpVar) + "}";
    }
}
