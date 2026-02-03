package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdp {
    public static final eqdp a = new eqdp("");
    public final String b;

    public eqdp(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean a() {
        return fdbq.f(this, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqdp) && fdbq.f(this.b, ((eqdp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GroupIcon(url=" + this.b + ")";
    }
}
