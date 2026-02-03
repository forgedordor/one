package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chps {
    public final chpr a;
    public final chpt b;

    public chps(chpr chprVar, chpt chptVar) {
        chprVar.getClass();
        this.a = chprVar;
        this.b = chptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chps)) {
            return false;
        }
        chps chpsVar = (chps) obj;
        return this.a == chpsVar.a && fdbq.f(this.b, chpsVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        chpt chptVar = this.b;
        return iHashCode + (chptVar == null ? 0 : chptVar.hashCode());
    }

    public final String toString() {
        return "SelfProfileSharingConstraints(sharingAbility=" + this.a + ", sharingData=" + this.b + ")";
    }
}
