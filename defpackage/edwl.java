package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwl implements edwq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Object e;
    public final etvj f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public edwl(String str, String str2, String str3, String str4, Object obj, etvj etvjVar, boolean z, boolean z2, boolean z3, String str5) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = obj;
        this.f = etvjVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edwl)) {
            return false;
        }
        edwl edwlVar = (edwl) obj;
        return fdbq.f(this.a, edwlVar.a) && fdbq.f(this.b, edwlVar.b) && fdbq.f(this.c, edwlVar.c) && fdbq.f(this.d, edwlVar.d) && fdbq.f(this.e, edwlVar.e) && this.f == edwlVar.f && this.g == edwlVar.g && this.h == edwlVar.h && this.i == edwlVar.i && fdbq.f(this.j, edwlVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        String str = this.j;
        boolean z = this.i;
        return (((((((iHashCode * 31) + edwk.a(this.g)) * 31) + edwk.a(this.h)) * 31) + edwk.a(z)) * 31) + str.hashCode();
    }

    public final String toString() {
        return "ProcessingPhoto(mediaKey=" + this.a + ", photoUrl=" + this.b + ", accountName=" + this.c + ", name=" + this.d + ", avatarGlideModel=" + this.e + ", infoMessage=" + this.f + ", hasAnyGooglePhotos=" + this.g + ", locked=" + this.h + ", isDefaultPhoto=" + this.i + ", photoSource=" + this.j + ")";
    }
}
