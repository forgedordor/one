package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdz {
    public final int a;
    public final int b;

    public rdz(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!rvk.o(i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!rvk.o(i2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdz)) {
            return false;
        }
        rdz rdzVar = (rdz) obj;
        return this.a == rdzVar.a && this.b == rdzVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
