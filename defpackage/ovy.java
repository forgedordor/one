package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovy extends owc {
    public final Throwable a;

    public ovy(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovy) && fdbq.f(this.a, ((ovy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fdgn.c("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ", "|");
    }
}
