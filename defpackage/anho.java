package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anho {
    public final anhj a;
    public final angn b;

    public anho(anhj anhjVar, angn angnVar) {
        this.a = anhjVar;
        this.b = angnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anho)) {
            return false;
        }
        anho anhoVar = (anho) obj;
        return fdbq.f(this.a, anhoVar.a) && fdbq.f(this.b, anhoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        angn angnVar = this.b;
        return iHashCode + (angnVar == null ? 0 : angnVar.hashCode());
    }

    public final String toString() {
        return "ReactionWithMetadata(reaction=" + this.a + ", metadata=" + this.b + ")";
    }
}
