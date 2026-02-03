package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyu extends jys {
    public final String a;

    public jyu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyu) && fdbq.f(this.a, ((jyu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
