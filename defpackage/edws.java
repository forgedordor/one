package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edws extends edwx {
    public final String a;
    public final Object b;
    public final String c;
    public final String d;
    public final String e;
    private final String f;

    public edws(String str, Object obj, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edws)) {
            return false;
        }
        edws edwsVar = (edws) obj;
        return fdbq.f(this.a, edwsVar.a) && fdbq.f(this.b, edwsVar.b) && fdbq.f(this.c, edwsVar.c) && fdbq.f(this.d, edwsVar.d) && fdbq.f(this.f, edwsVar.f) && fdbq.f(this.e, edwsVar.e);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ProcessingPhoto(name=" + this.a + ", avatarGlideModel=" + this.b + ", mediaKey=" + this.c + ", photoUrl=" + this.d + ", accountName=" + this.f + ", photoSource=" + this.e + ")";
    }
}
