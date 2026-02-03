package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class giy {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof giy) && this.a == ((giy) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a(i, 0) ? "Picker" : a(i, 1) ? "Input" : "Unknown";
    }
}
