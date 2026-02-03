package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvp implements dkvr {
    private final dkvz a;

    public dkvp(dkvz dkvzVar) {
        this.a = dkvzVar;
    }

    @Override // defpackage.dkvr
    public final dkvz a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkvp) && fdbq.f(this.a, ((dkvp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalRichCardMedia(media=" + this.a + ")";
    }
}
