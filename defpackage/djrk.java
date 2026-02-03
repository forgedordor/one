package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrk implements djrl {
    private final Uri a;
    private final String b;
    private final Integer c;
    private final Integer d;
    private final fdae e;

    public djrk(Uri uri, String str, Integer num, Integer num2, fdae fdaeVar) {
        this.a = uri;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = fdaeVar;
    }

    @Override // defpackage.djrl
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.djrl
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.djrl
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.djrl
    public final String d() {
        return this.b;
    }

    @Override // defpackage.djrl
    public final fdae e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djrk)) {
            return false;
        }
        djrk djrkVar = (djrk) obj;
        return fdbq.f(this.a, djrkVar.a) && fdbq.f(this.b, djrkVar.b) && fdbq.f(this.c, djrkVar.c) && fdbq.f(this.d, djrkVar.d) && fdbq.f(this.e, djrkVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "GalleryImageUiData(uri=" + this.a + ", contentDescription=" + this.b + ", width=" + this.c + ", height=" + this.d + ", onClick=" + this.e + ")";
    }
}
