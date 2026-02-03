package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnug {
    public final dnkf a;
    public final dnmj b;

    public dnug(dnkf dnkfVar, dnmj dnmjVar) {
        dnkfVar.getClass();
        dnmjVar.getClass();
        this.a = dnkfVar;
        this.b = dnmjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnug)) {
            return false;
        }
        dnug dnugVar = (dnug) obj;
        return fdbq.f(this.a, dnugVar.a) && fdbq.f(this.b, dnugVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiWithEmojiSet(emoji=" + this.a + ", emojiSet=" + this.b + ")";
    }
}
