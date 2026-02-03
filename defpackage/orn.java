package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orn extends orp {
    public static final orn a = new orn();

    private orn() {
        super(false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof orn) && this.c == ((orn) obj).c;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.c + ')';
    }
}
