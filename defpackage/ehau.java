package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehau extends ehcj {
    private final Throwable a;

    public ehau(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.a = th;
    }

    @Override // defpackage.ehcj, defpackage.ehcl
    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehcj) {
            return this.a.equals(((ehcj) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Failure{error=" + this.a.toString() + "}";
    }
}
