package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvh implements djvm {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final djrr f = null;
    public final djse g;
    public final djvg h;
    private final fdae i;

    public djvh(String str, String str2, String str3, Uri uri, String str4, djse djseVar, djvg djvgVar, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.g = djseVar;
        this.h = djvgVar;
        this.i = fdaeVar;
    }

    @Override // defpackage.dlhu
    public final fdae a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djvh)) {
            return false;
        }
        djvh djvhVar = (djvh) obj;
        if (!fdbq.f(this.a, djvhVar.a) || !fdbq.f(this.b, djvhVar.b) || !fdbq.f(this.c, djvhVar.c) || !fdbq.f(this.d, djvhVar.d) || !fdbq.f(this.e, djvhVar.e)) {
            return false;
        }
        djrr djrrVar = djvhVar.f;
        return fdbq.f(this.g, djvhVar.g) && fdbq.f(this.h, djvhVar.h) && fdbq.f(this.i, djvhVar.i);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Loaded(name=" + this.a + ", description=" + this.b + ", source=" + this.c + ", imageUri=" + this.d + ", imageContentDescription=" + this.e + ", icon=null, requestListener=" + this.g + ", flags=" + this.h + ", onClick=" + this.i + ")";
    }
}
