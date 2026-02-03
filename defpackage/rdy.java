package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdy extends rdu {
    public final Object a;
    private final rea b;

    public rdy(rea reaVar, Object obj) {
        reaVar.getClass();
        this.b = reaVar;
        this.a = obj;
        int iOrdinal = reaVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new fctg();
        }
    }

    @Override // defpackage.rdu
    public final rea a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdy)) {
            return false;
        }
        rdy rdyVar = (rdy) obj;
        return this.b == rdyVar.b && fdbq.f(this.a, rdyVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ")";
    }
}
