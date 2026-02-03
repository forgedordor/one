package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiy implements xjb {
    public final Exception a;

    public xiy(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xiy) && fdbq.f(this.a, ((xiy) obj).a);
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

    public xiy() {
        this(null);
    }
}
