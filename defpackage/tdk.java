package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdk {
    public final String a;
    public final fdae b;

    public tdk(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdk)) {
            return false;
        }
        tdk tdkVar = (tdk) obj;
        return fdbq.f(this.a, tdkVar.a) && fdbq.f(this.b, tdkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerButton(text=" + this.a + ", callback=" + this.b + ")";
    }
}
