package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuq {
    public final int a;
    public final int b;

    public dkuq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkuq)) {
            return false;
        }
        dkuq dkuqVar = (dkuq) obj;
        return this.a == dkuqVar.a && this.b == dkuqVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SizeConfigurations(cardWidthDp=" + this.a + ", cardMaxHeightDp=" + this.b + ")";
    }
}
