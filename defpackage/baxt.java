package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baxt {
    public final String a;

    public baxt(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baxt) && fdbq.f(this.a, ((baxt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Caption(content=" + this.a + ")";
    }
}
