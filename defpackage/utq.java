package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utq extends uts {
    private final baim a;

    public utq(baim baimVar) {
        if (baimVar == null) {
            throw new NullPointerException("Null sim");
        }
        this.a = baimVar;
    }

    @Override // defpackage.uts
    public final baim a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uts) {
            return this.a.equals(((uts) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SimPickedEvent{sim=" + this.a.toString() + "}";
    }
}
