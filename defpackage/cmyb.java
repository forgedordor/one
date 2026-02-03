package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmyb {
    public final int a;
    public final int b;

    public cmyb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmyb)) {
            return false;
        }
        cmyb cmybVar = (cmyb) obj;
        return this.a == cmybVar.a && this.b == cmybVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SuggestionCombinationBounds(min=" + this.a + ", max=" + this.b + ")";
    }
}
