package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egwz extends egxa {
    private final fctx a = fctx.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egwz) && fdbq.f(this.a, ((egwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Reading(unit=" + this.a + ")";
    }
}
