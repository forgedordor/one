package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkg {
    public final String a;
    public final List b;

    public dnkg(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkg)) {
            return false;
        }
        dnkg dnkgVar = (dnkg) obj;
        return fdbq.f(this.a, dnkgVar.a) && fdbq.f(this.b, dnkgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiCategory(label=" + this.a + ", emojiSets=" + this.b + ")";
    }
}
