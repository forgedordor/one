package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnif {
    public final dnnp a;

    public dnif(dnnp dnnpVar) {
        this.a = dnnpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnif) && fdbq.f(this.a, ((dnif) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeEmojiSpan(emojiUsage=" + this.a + ")";
    }
}
