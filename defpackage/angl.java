package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angl implements anhj {
    public final String a;

    public angl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof angl) && fdbq.f(this.a, ((angl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmojiReaction(emoji=" + this.a + ")";
    }
}
