package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyj implements djyu {
    public final dkri a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    public final fdap g;
    public final djyo h;
    private final fdae i;

    public djyj(dkri dkriVar, String str, List list, String str2, List list2, String str3, fdap fdapVar, djyo djyoVar) {
        list.getClass();
        this.a = dkriVar;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = list2;
        this.f = str3;
        this.i = null;
        this.g = fdapVar;
        this.h = djyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djyj)) {
            return false;
        }
        djyj djyjVar = (djyj) obj;
        if (!fdbq.f(this.a, djyjVar.a) || !fdbq.f(this.b, djyjVar.b) || !fdbq.f(this.c, djyjVar.c) || !fdbq.f(this.d, djyjVar.d) || !fdbq.f(this.e, djyjVar.e) || !fdbq.f(this.f, djyjVar.f)) {
            return false;
        }
        fdae fdaeVar = djyjVar.i;
        return fdbq.f(null, null) && fdbq.f(this.g, djyjVar.g) && fdbq.f(this.h, djyjVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + 1) * 31;
        String str2 = this.f;
        int iHashCode3 = iHashCode2 + (str2 == null ? 0 : str2.hashCode());
        fdap fdapVar = this.g;
        return (((iHashCode3 * 961) + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Actionable(monogram=" + this.a + ", title=" + this.b + ", actions=" + this.c + ", subtitle=" + this.d + ", annotations=" + this.e + ", tertiaryText=" + this.f + ", onClick=null, onClickWithPosition=" + this.g + ", flags=" + this.h + ")";
    }
}
