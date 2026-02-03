package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psu {
    public static final psu a = new psu(0);
    public static final psu b = new psu(1);
    public static final psu c = new psu(2);
    public static final psu d = new psu(3);
    public final int e;

    public psu(int i) {
        this.e = i;
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psu) && this.e == ((psu) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        int i = this.e;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.g(i, "unknown position:") : "bottom" : "right" : "top" : "left";
    }
}
