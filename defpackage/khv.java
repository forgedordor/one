package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class khv {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof khv) && this.a == ((khv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a(i, 1) ? "Linearity.Linear" : a(i, 2) ? "Linearity.FontHinting" : a(i, 3) ? "Linearity.None" : "Invalid";
    }
}
