package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaph extends eats {
    public final easi a;
    public final boolean b;

    public eaph(easi easiVar, boolean z) {
        if (easiVar == null) {
            throw new NullPointerException("Null date");
        }
        this.a = easiVar;
        this.b = z;
    }

    @Override // defpackage.eats
    public final easi a() {
        return this.a;
    }

    @Override // defpackage.eats
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eats) {
            eats eatsVar = (eats) obj;
            if (this.a.equals(eatsVar.a()) && this.b == eatsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "SpecialDay{date=" + this.a.toString() + ", exceptional=" + this.b + "}";
    }
}
