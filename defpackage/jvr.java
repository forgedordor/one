package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvr {
    public static final jvr a = new jvr(false);
    public final boolean b;
    public final int c;

    public jvr(boolean z) {
        this.b = z;
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvr)) {
            return false;
        }
        jvr jvrVar = (jvr) obj;
        if (this.b != jvrVar.b) {
            return false;
        }
        int i = jvrVar.c;
        return juv.a(0);
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.b + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public jvr(byte[] bArr) {
        this.b = false;
        this.c = 0;
    }

    public jvr() {
        this(false);
    }
}
