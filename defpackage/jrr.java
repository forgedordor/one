package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrr {
    public final String a;
    public final fdae b;

    public jrr(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrr)) {
            return false;
        }
        jrr jrrVar = (jrr) obj;
        return fdbq.f(this.a, jrrVar.a) && this.b == jrrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
