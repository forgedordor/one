package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwj implements edwq {
    private final Throwable a;

    public edwj(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edwj) && fdbq.f(this.a, ((edwj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ")";
    }
}
