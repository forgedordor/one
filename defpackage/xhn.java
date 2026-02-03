package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhn implements xhq {
    private final Exception a;

    public xhn(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhn) && fdbq.f(this.a, ((xhn) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        return "Failed(exception=" + this.a + ")";
    }

    public xhn() {
        this(null);
    }
}
