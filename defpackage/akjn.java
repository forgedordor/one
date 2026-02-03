package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akjn {
    public final akkf a;
    public final int b;
    public final akke c;

    public akjn(akkf akkfVar, int i, akke akkeVar) {
        akkfVar.getClass();
        this.a = akkfVar;
        this.b = i;
        this.c = akkeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akjn)) {
            return false;
        }
        akjn akjnVar = (akjn) obj;
        return this.a == akjnVar.a && this.b == akjnVar.b && fdbq.f(this.c, akjnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        akke akkeVar = this.c;
        return ((iHashCode + this.b) * 31) + (akkeVar == null ? 0 : akkeVar.hashCode());
    }

    public final String toString() {
        return "EligibilityResult(upgradeEligibilityStatus=" + this.a + ", capabilitiesNetworkRequestCount=" + this.b + ", nonNormalizedParticipantInfo=" + this.c + ")";
    }

    public /* synthetic */ akjn(akkf akkfVar, int i, int i2) {
        this(akkfVar, i & ((i2 & 2) != 0 ? 0 : 1), (akke) null);
    }
}
