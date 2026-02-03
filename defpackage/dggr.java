package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes4.dex */
public final class dggr {
    public final int a;

    public static String a(int i) {
        return a.e(i, "SubscriptionId(idValue=", ")");
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dggr) && this.a == ((dggr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
