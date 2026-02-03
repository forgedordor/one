package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyq {
    private final doap a;

    public doyq(doap doapVar) {
        this.a = doapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doyq) && fdbq.f(this.a, ((doyq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Identifier(gifStickerMediaIdentifier=" + this.a + ")";
    }
}
