package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecib extends ecjx {
    private final ecjw a;

    public ecib(ecjw ecjwVar) {
        if (ecjwVar == null) {
            throw new NullPointerException("Null service");
        }
        this.a = ecjwVar;
    }

    @Override // defpackage.ecjx
    public final ecjw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecjx) {
            return this.a.equals(((ecjx) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }
}
