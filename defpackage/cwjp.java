package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjp {
    private final dihq a;

    public cwjp(dihq dihqVar) {
        this.a = dihqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwjp) && fdbq.f(this.a, ((cwjp) obj).a);
    }

    public final int hashCode() {
        dihq dihqVar = this.a;
        if (dihqVar == null) {
            return 0;
        }
        return dihqVar.hashCode();
    }

    public final String toString() {
        return "TopbarUiData(goBackAction=" + this.a + ")";
    }
}
