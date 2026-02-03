package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyb implements zye {
    public final Exception a;

    public zyb(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyb) && fdbq.f(this.a, ((zyb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
