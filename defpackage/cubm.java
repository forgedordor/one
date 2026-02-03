package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cubm {
    public final String a;
    public final Pattern b;

    public cubm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cubm)) {
            return false;
        }
        cubm cubmVar = (cubm) obj;
        return fdbq.f(this.a, cubmVar.a) && fdbq.f(this.b, cubmVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Pattern pattern = this.b;
        return iHashCode + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "QueryWithHighlightPattern(query=" + this.a + ", highlightPattern=" + this.b + ")";
    }

    public cubm(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ cubm(byte[] bArr) {
        this("", null);
    }
}
