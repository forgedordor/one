package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyr implements djyu {
    public final dkri a;
    public final String b;
    public final String c;
    public final List d;
    public final fdae e;
    public final djyo f;

    public djyr(dkri dkriVar, String str, String str2, List list, fdae fdaeVar, djyo djyoVar) {
        this.a = dkriVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = fdaeVar;
        this.f = djyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djyr)) {
            return false;
        }
        djyr djyrVar = (djyr) obj;
        return fdbq.f(this.a, djyrVar.a) && fdbq.f(this.b, djyrVar.b) && fdbq.f(this.c, djyrVar.c) && fdbq.f(this.d, djyrVar.d) && fdbq.f(this.e, djyrVar.e) && fdbq.f(this.f, djyrVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Redirecting(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", annotations=" + this.d + ", onClick=" + this.e + ", flags=" + this.f + ")";
    }
}
