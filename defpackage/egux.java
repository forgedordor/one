package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egux extends eguz {
    public final Throwable a;

    public egux(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egux) && fdbq.f(this.a, ((egux) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
