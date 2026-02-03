package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakq implements cakt {
    public final Exception a;

    public cakq(Exception exc) {
        exc.getClass();
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cakq) && fdbq.f(this.a, ((cakq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HaltRestore(failure=" + this.a + ")";
    }
}
