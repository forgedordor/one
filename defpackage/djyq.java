package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyq {
    public final int a;
    public final int b;

    public djyq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djyq)) {
            return false;
        }
        djyq djyqVar = (djyq) obj;
        return this.a == djyqVar.a && this.b == djyqVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Position(x=" + this.a + ", y=" + this.b + ")";
    }
}
