package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hid {
    public final String a;
    public final char b;
    public final String c;

    public hid(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = fdgn.q(str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hid)) {
            return false;
        }
        hid hidVar = (hid) obj;
        return fdbq.f(this.a, hidVar.a) && this.b == hidVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
