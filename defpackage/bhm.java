package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhm extends bmo {
    private final Throwable a;

    public bhm(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.bmo
    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmo) {
            return this.a.equals(((bmo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
