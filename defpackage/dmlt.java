package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmlt implements dmlx {
    public final Throwable a;

    public dmlt(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmlt) && fdbq.f(this.a, ((dmlt) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
