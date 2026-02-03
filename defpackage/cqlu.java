package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqlu {
    private final String a;
    private final boolean b;

    public cqlu(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqlu)) {
            return false;
        }
        cqlu cqluVar = (cqlu) obj;
        return fdbq.f(this.a, cqluVar.a) && this.b == cqluVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EmojiStatusCacheKey(messageText=" + this.a + ", stopAtFirstNonEmoji=" + this.b + ")";
    }
}
