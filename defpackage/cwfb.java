package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfb {
    public final String a;
    public final fdap b;
    private final String c;

    public cwfb(String str, String str2, fdap fdapVar) {
        this.c = str;
        this.a = str2;
        this.b = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwfb)) {
            return false;
        }
        cwfb cwfbVar = (cwfb) obj;
        return fdbq.f(this.c, cwfbVar.c) && fdbq.f(this.a, cwfbVar.a) && fdbq.f(this.b, cwfbVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ButtonUiData(contentDescription=" + this.c + ", title=" + this.a + ", onClick=" + this.b + ")";
    }
}
