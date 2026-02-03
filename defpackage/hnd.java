package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnd implements ibh {
    private final hna a;

    public hnd(hna hnaVar) {
        this.a = hnaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hnd) && fdbq.f(this.a, ((hnd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
