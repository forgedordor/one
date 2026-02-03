package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class hbk {
    public final int a;

    public static String a(int i) {
        return b(i, 0) ? "Hour" : b(i, 1) ? "Minute" : "";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hbk) && this.a == ((hbk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
