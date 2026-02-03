package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldp {
    public final String a;

    public eldp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eldp) {
            return this.a.equals(((eldp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.a + "}";
    }
}
