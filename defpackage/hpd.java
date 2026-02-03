package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpd {
    private final String a;

    public hpd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpd) && fdbq.f(this.a, ((hpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
