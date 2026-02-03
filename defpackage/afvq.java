package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvq {
    public final String a;
    public final Pattern b;

    public afvq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvq)) {
            return false;
        }
        afvq afvqVar = (afvq) obj;
        return fdbq.f(this.a, afvqVar.a) && fdbq.f(this.b, afvqVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Pattern pattern = this.b;
        return iHashCode + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "QueryWithHighlightPattern(query=" + this.a + ", highlightPattern=" + this.b + ")";
    }

    public afvq(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ afvq(byte[] bArr) {
        this("", null);
    }
}
