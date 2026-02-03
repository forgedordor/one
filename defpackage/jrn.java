package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrn {
    public final String a;
    public final fcsy b;

    public jrn(String str, fcsy fcsyVar) {
        this.a = str;
        this.b = fcsyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrn)) {
            return false;
        }
        jrn jrnVar = (jrn) obj;
        return fdbq.f(this.a, jrnVar.a) && fdbq.f(this.b, jrnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
