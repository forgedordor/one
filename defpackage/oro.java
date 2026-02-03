package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oro extends orp {
    public static final oro a = new oro(true);
    public static final oro b = new oro(false);

    public oro(boolean z) {
        super(z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oro) && this.c == ((oro) obj).c;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.c + ')';
    }
}
