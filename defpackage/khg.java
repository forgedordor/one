package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class khg {
    public final int a;

    public static String a(int i) {
        return "Mode(value=" + i + ')';
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof khg) && this.a == ((khg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
