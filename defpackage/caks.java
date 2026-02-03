package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caks implements cakt {
    public final Exception a;

    public caks(Exception exc) {
        exc.getClass();
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caks) && fdbq.f(this.a, ((caks) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetryThisPage(failure=" + this.a + ")";
    }
}
