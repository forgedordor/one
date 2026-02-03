package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxc extends egxh {
    private final fctx a = fctx.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egxc) && fdbq.f(this.a, ((egxc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Idle(unit=" + this.a + ")";
    }
}
