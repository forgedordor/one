package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkj {
    private final boolean a;

    public dnkj(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkj)) {
            return false;
        }
        boolean z = ((dnkj) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "EmojiDataConfiguration(useGboardDefinitionsAndPreferences=false)";
    }

    public dnkj() {
        this(null);
    }
}
