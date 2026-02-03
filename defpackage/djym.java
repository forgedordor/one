package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djym implements djyu {
    public final dkri a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final List g;
    public final djyi h;
    public final fdae i;
    private final djyo j;

    public djym(dkri dkriVar, String str, String str2, String str3, List list, boolean z, List list2, djyi djyiVar, fdae fdaeVar, djyo djyoVar) {
        list2.getClass();
        djyiVar.getClass();
        this.a = dkriVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = z;
        this.g = list2;
        this.h = djyiVar;
        this.i = fdaeVar;
        this.j = djyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djym)) {
            return false;
        }
        djym djymVar = (djym) obj;
        return fdbq.f(this.a, djymVar.a) && fdbq.f(this.b, djymVar.b) && fdbq.f(this.c, djymVar.c) && fdbq.f(this.d, djymVar.d) && fdbq.f(this.e, djymVar.e) && this.f == djymVar.f && fdbq.f(this.g, djymVar.g) && this.h == djymVar.h && fdbq.f(this.i, djymVar.i) && fdbq.f(this.j, djymVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return ((((((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "Dynamic(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", tertiaryText=" + this.d + ", dropdownItems=" + this.e + ", isSelected=" + this.f + ", annotations=" + this.g + ", style=" + this.h + ", onClick=" + this.i + ", flags=" + this.j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ djym(dkri dkriVar, String str, String str2, String str3, boolean z, List list, djyi djyiVar, fdae fdaeVar, djyo djyoVar, int i) {
        List list2 = (i & 64) != 0 ? fcvo.a : list;
        int i2 = i & 8;
        this(dkriVar, str, str2, i2 != 0 ? null : str3, (List) null, ((i & 32) == 0) & z, list2, djyiVar, fdaeVar, djyoVar);
    }
}
