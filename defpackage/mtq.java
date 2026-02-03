package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtq {
    public static final mtq a;
    public static final mtq b;
    public final long c;
    public final long d;

    static {
        mtq mtqVar = new mtq(0L, 0L);
        a = mtqVar;
        new mtq(Long.MAX_VALUE, Long.MAX_VALUE);
        new mtq(Long.MAX_VALUE, 0L);
        new mtq(0L, Long.MAX_VALUE);
        b = mtqVar;
    }

    public mtq(long j, long j2) {
        mee.a(j >= 0);
        mee.a(j2 >= 0);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mtq mtqVar = (mtq) obj;
            if (this.c == mtqVar.c && this.d == mtqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
