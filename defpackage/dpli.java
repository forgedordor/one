package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpli extends dplj {
    private final int a;
    private final int b;

    public dpli(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpli)) {
            return false;
        }
        dpli dpliVar = (dpli) obj;
        return this.a == dpliVar.a && this.b == dpliVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Opening(currentHeight=" + this.a + ", finalHeight=" + this.b + ")";
    }
}
