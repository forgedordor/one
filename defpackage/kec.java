package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kec {
    public final int a;

    public static String a(int i) {
        return b(i, -1) ? "Unspecified" : b(i, 0) ? "None" : b(i, 1) ? "Characters" : b(i, 2) ? "Words" : b(i, 3) ? "Sentences" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kec) && this.a == ((kec) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
