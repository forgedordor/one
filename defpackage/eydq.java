package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydq {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public eydq(List list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eydq)) {
            return false;
        }
        eydq eydqVar = (eydq) obj;
        return fdbq.f(this.a, eydqVar.a) && fdbq.f(this.b, eydqVar.b) && fdbq.f(this.c, eydqVar.c) && fdbq.f(this.d, eydqVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LottieKeyPath(path=" + this.a + ", cl=" + this.b + ", clDark=" + this.c + ", type=" + this.d + ")";
    }

    public /* synthetic */ eydq(List list, String str, String str2) {
        this(list, str, null, str2);
    }
}
