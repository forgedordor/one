package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class jyt implements jui {
    public final String a;

    public jyt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyt) && fdbq.f(this.a, ((jyt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
