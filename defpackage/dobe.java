package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobe extends dobi {
    public static final dobd a = new dobd();
    private final String b;

    public dobe(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dobe) && fdbq.f(this.b, ((dobe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TENOR|".concat(this.b);
    }
}
