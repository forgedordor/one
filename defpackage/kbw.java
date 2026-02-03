package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kbw {
    public final int a;

    public static String a(int i) {
        return b(i, 0) ? "Normal" : b(i, 1) ? "Italic" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kbw) && this.a == ((kbw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
