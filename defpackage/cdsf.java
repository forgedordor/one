package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsf {
    public final String a;
    public final String b;
    public final String c;
    public final URL d;

    public cdsf(String str, String str2, String str3, URL url) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        url.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdsf)) {
            return false;
        }
        cdsf cdsfVar = (cdsf) obj;
        return fdbq.f(this.a, cdsfVar.a) && fdbq.f(this.b, cdsfVar.b) && fdbq.f(this.c, cdsfVar.c) && fdbq.f(this.d, cdsfVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LinkMetadata(title=" + this.a + ", description=" + this.b + ", imageUrl=" + this.c + ", canonicalUrl=" + this.d + ")";
    }

    public /* synthetic */ cdsf(String str, URL url, int i) {
        this(1 != (i & 1) ? null : "", (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : str, url);
    }
}
