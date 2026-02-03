package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksk {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final dksj i;

    public dksk(String str, Integer num, Integer num2, String str2, String str3, String str4, List list, List list2, dksj dksjVar) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = list2;
        this.i = dksjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dksk)) {
            return false;
        }
        dksk dkskVar = (dksk) obj;
        return fdbq.f(this.a, dkskVar.a) && fdbq.f(this.b, dkskVar.b) && fdbq.f(this.c, dkskVar.c) && fdbq.f(this.d, dkskVar.d) && fdbq.f(this.e, dkskVar.e) && fdbq.f(this.f, dkskVar.f) && fdbq.f(this.g, dkskVar.g) && fdbq.f(this.h, dkskVar.h) && fdbq.f(this.i, dkskVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "GaiaSellPageUiData(title=" + this.a + ", titleHighlightStart=" + this.b + ", titleHighlightEnd=" + this.c + ", accountName=" + this.d + ", accountAvatarUri=" + this.e + ", headerIconUri=" + this.f + ", items=" + this.g + ", itemsV2=" + this.h + ", flags=" + this.i + ")";
    }
}
