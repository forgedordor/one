package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsq {
    public final String a;
    public final String b;

    public djsq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djsq)) {
            return false;
        }
        djsq djsqVar = (djsq) obj;
        return fdbq.f(this.a, djsqVar.a) && fdbq.f(this.b, djsqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MddFile(fileId=" + this.a + ", fileGroup=" + this.b + ")";
    }
}
