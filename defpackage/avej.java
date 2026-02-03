package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avej {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final Long h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    public final Integer p;
    public final long q;

    public avej(long j, long j2, String str, String str2, String str3, long j3, String str4, Long l, String str5, String str6, String str7, int i, String str8, String str9, String str10, Integer num, long j4) {
        str2.getClass();
        str4.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j3;
        this.g = str4;
        this.h = l;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = i;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = num;
        this.q = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avej)) {
            return false;
        }
        avej avejVar = (avej) obj;
        return this.a == avejVar.a && this.b == avejVar.b && fdbq.f(this.c, avejVar.c) && fdbq.f(this.d, avejVar.d) && fdbq.f(this.e, avejVar.e) && this.f == avejVar.f && fdbq.f(this.g, avejVar.g) && fdbq.f(this.h, avejVar.h) && fdbq.f(this.i, avejVar.i) && fdbq.f(this.j, avejVar.j) && fdbq.f(this.k, avejVar.k) && this.l == avejVar.l && fdbq.f(this.m, avejVar.m) && fdbq.f(this.n, avejVar.n) && fdbq.f(this.o, avejVar.o) && fdbq.f(this.p, avejVar.p) && this.q == avejVar.q;
    }

    public final int hashCode() {
        int iA = (((((((((((avei.a(this.a) * 31) + avei.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + avei.a(this.f)) * 31) + this.g.hashCode();
        Long l = this.h;
        int iHashCode = ((iA * 31) + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.l) * 31;
        String str4 = this.m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.p;
        return ((iHashCode7 + (num != null ? num.hashCode() : 0)) * 31) + avei.a(this.q);
    }

    public final String toString() {
        return "RawContact(_id=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", sortKey=" + this.d + ", phonebookLabel=" + this.e + ", phonebookBucket=" + this.f + ", displayName=" + this.g + ", nameRawContactId=" + this.h + ", number=" + this.i + ", normalizedNumber=" + this.j + ", emailAddress=" + this.k + ", contactType=" + this.l + ", contactTypeLabel=" + this.m + ", photoUri=" + this.n + ", photoThumbnailUri=" + this.o + ", photoFileId=" + this.p + ", lastUpdatedTimestamp=" + this.q + ")";
    }
}
