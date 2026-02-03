package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyy {
    private final doap a;

    public dnyy(doap doapVar) {
        this.a = doapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnyy) && fdbq.f(this.a, ((dnyy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Identifier(gifStickerMediaIdentifier=" + this.a + ")";
    }
}
