package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class iqd {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iqd) && this.a == ((iqd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a(i, 1) ? "Touch" : a(i, 2) ? "Keyboard" : "Error";
    }
}
