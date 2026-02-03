package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdp extends rdx {
    public final fdap a;

    public rdp(fdap fdapVar) {
        this.a = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdp) && fdbq.f(this.a, ((rdp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ")";
    }
}
