package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrp implements djrl {
    public final String a;
    private final Uri b;
    private final String c;
    private final Integer d;
    private final Integer e;
    private final fdae f;
    private final djro g;

    public djrp(Uri uri, String str, Integer num, Integer num2, fdae fdaeVar, String str2, djro djroVar) {
        this.b = uri;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = fdaeVar;
        this.a = str2;
        this.g = djroVar;
    }

    @Override // defpackage.djrl
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.djrl
    public final Integer b() {
        return this.e;
    }

    @Override // defpackage.djrl
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.djrl
    public final String d() {
        return this.c;
    }

    @Override // defpackage.djrl
    public final fdae e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djrp)) {
            return false;
        }
        djrp djrpVar = (djrp) obj;
        return fdbq.f(this.b, djrpVar.b) && fdbq.f(this.c, djrpVar.c) && fdbq.f(this.d, djrpVar.d) && fdbq.f(this.e, djrpVar.e) && fdbq.f(this.f, djrpVar.f) && fdbq.f(this.a, djrpVar.a) && fdbq.f(this.g, djrpVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        Integer num = this.d;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str = this.a;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "GalleryVideoUiData(uri=" + this.b + ", contentDescription=" + this.c + ", width=" + this.d + ", height=" + this.e + ", onClick=" + this.f + ", formattedTimeString=" + this.a + ", flags=" + this.g + ")";
    }
}
