package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaou extends easx {
    public final eatv a;
    public final eatv b;

    public eaou(eatv eatvVar, eatv eatvVar2) {
        this.a = eatvVar;
        this.b = eatvVar2;
    }

    @Override // defpackage.easx
    public final eatv a() {
        return this.b;
    }

    @Override // defpackage.easx
    public final eatv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof easx) {
            easx easxVar = (easx) obj;
            eatv eatvVar = this.a;
            if (eatvVar != null ? eatvVar.equals(easxVar.b()) : easxVar.b() == null) {
                eatv eatvVar2 = this.b;
                if (eatvVar2 != null ? eatvVar2.equals(easxVar.a()) : easxVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eatv eatvVar = this.a;
        int iHashCode = eatvVar == null ? 0 : eatvVar.hashCode();
        eatv eatvVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (eatvVar2 != null ? eatvVar2.hashCode() : 0);
    }

    public final String toString() {
        eatv eatvVar = this.b;
        return "Period{open=" + String.valueOf(this.a) + ", close=" + String.valueOf(eatvVar) + "}";
    }
}
