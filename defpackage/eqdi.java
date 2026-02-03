package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdi {
    public final eqdr a;
    public final eqed b;
    public final ekhx c;
    public final eqcz d;

    public eqdi(eqdr eqdrVar, eqed eqedVar, ekhx ekhxVar, eqcz eqczVar) {
        ekhxVar.getClass();
        this.a = eqdrVar;
        this.b = eqedVar;
        this.c = ekhxVar;
        this.d = eqczVar;
        if (eqef.a == eqedVar.b) {
            throw new IllegalStateException("Must specify a valid GroupType.");
        }
        if (ekhxVar.isEmpty()) {
            throw new IllegalStateException("Must specify at least 1 group member.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqdi)) {
            return false;
        }
        eqdi eqdiVar = (eqdi) obj;
        return fdbq.f(this.a, eqdiVar.a) && fdbq.f(this.b, eqdiVar.b) && fdbq.f(this.c, eqdiVar.c) && fdbq.f(this.d, eqdiVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        eqcz eqczVar = this.d;
        return (iHashCode * 31) + (eqczVar == null ? 0 : eqczVar.hashCode());
    }

    public final String toString() {
        return "CreateGroupRequest(id=" + this.a + ", properties=" + this.b + ", members=" + this.c + ", traceId=" + this.d + ")";
    }
}
