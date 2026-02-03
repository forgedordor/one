package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyoi extends dyol {
    public final lvv a;
    public final lvv b;

    public dyoi(lvv lvvVar, lvv lvvVar2) {
        this.a = lvvVar;
        this.b = lvvVar2;
    }

    @Override // defpackage.dyol
    public final lvv a() {
        return this.b;
    }

    @Override // defpackage.dyol
    public final lvv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyol) {
            dyol dyolVar = (dyol) obj;
            lvv lvvVar = this.a;
            if (lvvVar != null ? lvvVar.equals(dyolVar.b()) : dyolVar.b() == null) {
                lvv lvvVar2 = this.b;
                if (lvvVar2 != null ? lvvVar2.equals(dyolVar.a()) : dyolVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        lvv lvvVar = this.a;
        int iHashCode = lvvVar == null ? 0 : lvvVar.hashCode();
        lvv lvvVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (lvvVar2 != null ? lvvVar2.hashCode() : 0);
    }

    public final String toString() {
        lvv lvvVar = this.b;
        return "CardsLiveDatas{importantCards=" + String.valueOf(this.a) + ", commonActions=" + String.valueOf(lvvVar) + "}";
    }
}
